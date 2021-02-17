package io.luxus.adofai.song.action;

import io.luxus.adofai.song.type.SongActionType;

public class Melody extends SongAction {

	private int octave;
	private int scale;
	private double duration;

//	public Melody() {
//		super(null);
//	}

	public Melody(SongActionType songActionType, int octave, int scale, double duration) {
		super(songActionType);
		this.octave = octave;
		this.scale = scale;
		this.duration = duration;
	}

	public int getOctave() {
		return octave;
	}

	public void setOctave(int octave) {
		this.octave = octave;
	}

	public int getScale() {
		return scale;
	}

	public void setScale(int scale) {
		this.scale = scale;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

}
