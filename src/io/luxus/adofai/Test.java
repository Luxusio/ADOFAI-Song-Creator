package io.luxus.adofai;

import java.io.IOException;
import java.util.List;

import io.luxus.adofai.song.MusicSheet;
import io.luxus.adofai.song.action.Melody;
import io.luxus.adofai.song.action.SetBPM;
import io.luxus.adofai.song.action.SongAction;
import io.luxus.adofai.song.type.SongActionType;

public class Test {

	public static final int DO = 0;
	public static final int DO_ = 1;
	public static final int RE = 2;
	public static final int RE_ = 3;
	public static final int MI = 4;
	public static final int PA = 5;
	public static final int PA_ = 6;
	public static final int SL = 7;
	public static final int SL_ = 8;
	public static final int LA = 9;
	public static final int LA_ = 10;
	public static final int SI = 11;

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, IOException {
		
		String path = "C:\\Users\\Luxus\\Desktop\\up.txt";
		SongCreator.logic(path);
		
		if(true) return;
		
		MusicSheet musicSheet = new MusicSheet();
		List<SongAction> songActionList = musicSheet.getSongActionList();
		
		double baseBPM = 150.0;
		
		songActionList.add(new SetBPM(baseBPM));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 2.0));

		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, PA_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, MI, 1.0 / 1.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 1, SI, 1.0 / 1.0));

		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 2.0));

		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, PA_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, MI, 1.0 / 1.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 1, SI, 1.0 / 1.0));

		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));

		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, PA_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, PA_, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, PA_, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 2.0));

		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 2.0));

		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, PA_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, MI, 1.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 1, SI, 1.0));

		// -----
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, RE, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, MI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, RE, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));

		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));

		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, RE, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, MI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, RE, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));

		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 1, SI, 1.0));

		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, RE, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, MI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, RE, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));

		// ----
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));

		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, RE, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, MI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, RE, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));

		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, PA_, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, MI, 1.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 1, SI, 1.0));

		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 2.0));
		// --------

		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, PA_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, MI, 1.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 1, SI, 1.0));

		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 2.0));

		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, PA_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, MI, 1.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 1, SI, 1.0));

		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));
		// -----

		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, PA_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, PA_, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, PA_, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 2.0));

		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 2.0));

		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, PA_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, MI, 1.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 1, SI, 1.0));

		songActionList.add(new SetBPM(baseBPM / 4.0 * 3.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, RE, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, RE_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));

		// ------
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, MI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, RE_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, RE, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, RE, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, PA_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, RE_, 1.0 / 4.0));

		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, MI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, PA_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, RE, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, RE_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));

		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, SL, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, PA_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, MI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, RE, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, PA_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 4.0));

		// ----
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, PA_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, MI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, PA_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, RE_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, PA_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, RE_, 1.0 / 4.0));

		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, MI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, PA_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, MI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, RE_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, RE, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));

		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, PA_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, RE_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, MI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, PA_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 4.0));

		// -----
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, MI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, SL, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, PA_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, MI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, RE, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, MI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, RE, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 4.0));

		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, PA_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, PA_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, MI, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, PA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, RE_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, RE_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, PA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, RE, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, RE, 1.0 / 4.0));

		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, PA_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, PA_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, PA_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, PA_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0 / 4.0));

		// ---
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, RE_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, RE_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, DO, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, PA_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, RE_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, RE_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, PA_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, RE_, 1.0 / 4.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, RE_, 1.0 / 4.0));

		songActionList.add(new SetBPM(baseBPM));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 3, MI, 1.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, -1, -1, 2.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, LA, 1.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, -1, -1, 2.0));

		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, 2, SL, 1.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, -1, -1, 1.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, -1, -1, 1.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, -1, -1, 1.0));

		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, -1, -1, 1.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, -1, -1, 1.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, -1, -1, 1.0));
		songActionList.add(new Melody(SongActionType.MELODY_RELATIVE, -1, -1, 1.0));

		Maker.make(musicSheet, false, "C:\\Users\\Luxus\\Desktop\\test2.adofai");
		System.out.println("end");
	}

}
