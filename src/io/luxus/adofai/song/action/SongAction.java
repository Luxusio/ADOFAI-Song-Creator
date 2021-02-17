package io.luxus.adofai.song.action;

import io.luxus.adofai.song.type.SongActionType;

public abstract class SongAction {
	
	private SongActionType songActionType;
	
	protected SongAction(SongActionType songActionType) {
		this.songActionType = songActionType;
	}
	
	protected void setSongActionType(SongActionType songActionType) {
		this.songActionType = songActionType;
	}
	
	public SongActionType getSongActionType() {
		return this.songActionType;
	}
	
}
