package io.luxus.adofai;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import io.luxus.adofai.song.MusicSheet;
import io.luxus.adofai.song.action.Melody;
import io.luxus.adofai.song.action.SetBPM;
import io.luxus.adofai.song.action.SongAction;
import io.luxus.adofai.song.type.SongActionType;
import io.luxus.api.adofai.MapData;
import io.luxus.api.adofai.MapSetting;
import io.luxus.api.adofai.TileData;
import io.luxus.api.adofai.action.MoveTrack;
import io.luxus.api.adofai.action.SetHitsound;
import io.luxus.api.adofai.action.SetSpeed;
import io.luxus.api.adofai.action.Twirl;
import io.luxus.api.adofai.type.EventType;
import io.luxus.api.adofai.type.TileAngle;

public class Maker {

	private final static double[][] tone_hz = {
			{ 32.7032, 34.6478, 36.7081, 38.8909, 41.2304, 43.6535, 46.2493, 48.9994, 51.913, 55.0, 58.2705, 61.7354, },
			{ 65.4064, 69.2957, 73.4162, 77.7817, 82.4069, 87.3071, 92.4986, 97.9989, 103.8262, 110.0, 116.5409,
					123.4708, },
			{ 130.8128, 138.5913, 146.8324, 155.5635, 164.8138, 174.6141, 184.9972, 195.9977, 207.6523, 220.0, 233.0819,
					246.9417, },
			{ 261.6256, 277.1826, 293.6648, 311.127, 329.6276, 349.2282, 369.9944, 391.9954, 415.3047, 440.0, 466.1638,
					493.8833, },
			{ 523.2511, 554.3653, 587.3295, 622.254, 659.2551, 698.4565, 739.9888, 783.9909, 830.6094, 880.0, 932.3275,
					987.7666, },
			{ 1046.502, 1108.731, 1174.659, 1244.508, 1318.51, 1396.913, 1479.978, 1567.982, 1661.219, 1760.0, 1864.655,
					1975.533, },
			{ 2093.005, 2217.461, 2349.318, 3489.01599, 2637.02, 2793.826, 2959.955, 3135.963, 3322.438, 3520.0,
					3729.31, 3951.066, },
			{ 4186.00899, 4434.922, 4698.63599, 4978.03199, 5274.04099, 5587.65199, 5919.91102, 6271.92701, 6644.87502,
					7039.99998, 7458.62001, 7902.13303, }, };

	private static int floor = 0;

	public static void make(MusicSheet musicSheet, boolean invisibleTiles, String outPath)
			throws IllegalArgumentException, IllegalAccessException, IOException {

		List<TileData> tileDataList = new ArrayList<>();
		Maker.floor = 0;
		TileData tileData = getTileData();
		if (invisibleTiles) {
			tileData.getActionList(EventType.MOVE_TRACK).add(getTransposeMoveTrack(0L));
		}
		tileDataList.add(tileData);

		double baseBPM = 0.0;
		for (SongAction songAction : musicSheet.getSongActionList()) {
			if (songAction.getSongActionType() == SongActionType.SET_BPM) {
				SetBPM setBPM = (SetBPM) songAction;
				baseBPM = setBPM.getBPM();
			} else {
				Melody melody = (Melody) songAction;

				int scale = melody.getScale();
				int octave = melody.getOctave();
				double duration = melody.getDuration();

				if (scale == -1) {
					
					// 1ºÐ À½Ç¥?
					// 500 -> 120bpm / 12
					// 1000 -> 60bpm / 12
					// 2000 -> 30bpm / 12
					double toBPM = 60000.0 / duration / 12.0;
					if (songAction.getSongActionType() == SongActionType.MELODY_RELATIVE) {
						toBPM = 60000.0 / (baseBPM * duration) / 12.0;
					}
					else {
						toBPM = 60000.0 / duration / 12.0;
					}
					
					tileData = getTileData();
					tileData.getActionList(EventType.SET_SPEED).add(new SetSpeed("Bpm", toBPM, 1.0));
					tileDataList.add(tileData);
					
					
				} else {

					double toBPM;
					int count;

					double hz = tone_hz[octave][scale];
					

					double perBlockDuration = 1000.0 / hz;
					toBPM = hz * 5;

					if (songAction.getSongActionType() == SongActionType.MELODY_RELATIVE) {
						count = (int) (60.0 / baseBPM * 1000.0 * duration / perBlockDuration);
						if (baseBPM == 0.0) {
							System.out.println("E> there is no initial BPM");
							return;
						}
					} else {
						count = (int) (duration / perBlockDuration);
					}

					if (count > 1) {
						count--;
						tileData = getTileData();
						tileData.getActionList(EventType.SET_SPEED).add(new SetSpeed("Bpm", toBPM, 1.0));
						if (scale == -1) {
							tileData.getActionList(EventType.SET_HITSOUND).add(new SetHitsound("None", 100L));
						} else {
							tileData.getActionList(EventType.SET_HITSOUND).add(new SetHitsound("Kick", 100L));
						}
						tileDataList.add(tileData);

						int silentCount = scale == -1 ? -1 : (int) (count * 0.95);
						for (int i = 0; i < count; i++) {
							tileData = getTileData();
							if (i == silentCount) {
								tileData.getActionList(EventType.SET_HITSOUND).add(new SetHitsound("None", 100L));
							}
							tileDataList.add(tileData);
						}
					}
				}
			}
		}
		System.out.println("save");
		new MapData(new MapSetting(), tileDataList).save(outPath);
	}

	private static TileData getTileData() {
		TileData tileData = new TileData(floor,
				floor == 0 ? TileAngle.NONE : floor % 2 == 0 ? TileAngle._165 : TileAngle._0);
		if (floor > 1) {
			tileData.getActionList(EventType.TWIRL).add(new Twirl());
		}
		floor++;

		return tileData;
	}

	private static MoveTrack getTransposeMoveTrack(long opacity) {
		List<Object> startTile = new ArrayList<>();
		List<Object> endTile = new ArrayList<>();
		List<Long> positionOffset = new ArrayList<>();

		startTile.add(0L);
		startTile.add("Start");

		endTile.add(0L);
		endTile.add("End");

		positionOffset.add(0L);
		positionOffset.add(0L);
		return new MoveTrack(startTile, endTile, 0.0, positionOffset, 0.0, 100L, opacity, 0.0, "Linear", "");
	}

}
