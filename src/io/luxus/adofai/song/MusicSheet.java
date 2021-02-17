package io.luxus.adofai.song;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import io.luxus.adofai.song.action.Melody;
import io.luxus.adofai.song.action.SetBPM;
import io.luxus.adofai.song.action.SongAction;
import io.luxus.adofai.song.type.SongActionType;

public class MusicSheet {

	private List<SongAction> songActionList;

	public MusicSheet() {
		this.songActionList = new ArrayList<>();
	}
	
	public void load(String path) throws NumberFormatException, IOException {
		load(new File(path));
	}
	
	public void load(File file) throws NumberFormatException, IOException {
		BufferedReader inFile = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
		String sLine = null;
		while ((sLine = inFile.readLine()) != null) {
			sLine = sLine.trim();
			//System.out.println(sLine);
			
			if (sLine.isEmpty())
				continue;
			if (sLine.startsWith("#") || sLine.startsWith("//"))
				continue;

			int idx = sLine.indexOf(' ');
			if (idx == -1)
				continue;

			String before = sLine.substring(0, idx);
			String after = sLine.substring(idx + 1).trim();
			if (before.equalsIgnoreCase("bpm")) {
				double bpm = Double.parseDouble(after);
				songActionList.add(new SetBPM(bpm));
			} else {

				int octave = 0;
				int scale = 0;
				
				if(before.equalsIgnoreCase("none")) {
					octave = -1;
					scale = -1;
				}
				else {
					int scaleOffset = 0;
	
					char c = before.charAt(before.length() - 1);
					if (c == '#') {
						scaleOffset = 1;
					} else if (c == 'b') {
						scaleOffset = -1;
					}
	
					String scaleString = before.substring(1, scaleOffset == 0 ? before.length() : before.length() - 1);
					switch (scaleString) {
					case "도":
						scale = 0;
						break;
					case "레":
						scale = 2;
						break;
					case "미":
						scale = 4;
						break;
					case "파":
						scale = 5;
						break;
					case "솔":
						scale = 7;
						break;
					case "라":
						scale = 9;
						break;
					case "시":
						scale = 11;
						break;
					}
					
					octave = Integer.parseInt(before.substring(0, 1));
	
					scale += scaleOffset;
					if (scale >= 12) {
						scale -= 12;
						octave++;
					} else if (scale < 0) {
						scale += 12;
						octave--;
					}
				}
				String durationStr = after;
				char c = after.charAt(0);
				boolean isRaw = false;
				if (c == 'r' || c == 'R') {
					isRaw = true;
					durationStr = after.substring(1);
				}

				double duration;
				idx = durationStr.indexOf('/');
				if (idx != -1) {
					duration = Double.parseDouble(durationStr.substring(0, idx))
							/ Double.parseDouble(durationStr.substring(idx + 1));
				} else {
					duration = Double.parseDouble(durationStr);
				}
				

				songActionList.add(new Melody(isRaw ? SongActionType.MELODY_RAW : SongActionType.MELODY_RELATIVE,
						octave, scale, duration));

			}

		}

		inFile.close();
	}
	
	
	
	public List<SongAction> getSongActionList() {
		return this.songActionList;
	}

}
