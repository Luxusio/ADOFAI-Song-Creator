package io.luxus.adofai.song.action;

import io.luxus.adofai.song.type.SongActionType;

public class SetBPM extends SongAction {

	private double bpm;
	
	public SetBPM(double bpm) {
		super(SongActionType.SET_BPM);
		this.bpm = bpm;
	}

	public double getBPM() {
		return bpm;
	}

}
