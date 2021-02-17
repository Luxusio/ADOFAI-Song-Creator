package io.luxus.adofai;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import io.luxus.adofai.song.MusicSheet;

public class SongCreator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			program(scanner);
			System.out.println("계속하시려면 엔터키를 눌러주세요.");
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		} catch (Throwable t) {
			t.printStackTrace();
		} finally {
			scanner.close();
		}
	}

	private static void program(Scanner scanner) throws IOException, IllegalArgumentException, IllegalAccessException {
		System.out.println("A Dance of Fire and Ice Song Creator");
		System.out.println("ver 1.0.0");
		System.out.println("개발자 : Luxus io");
		System.out.println("YouTube : https://www.youtube.com/channel/UCkznd9aLn0GXIP5VjDKo_nQ");
		System.out.println("Github : https://github.com/Luxusio/ADOFAI-Song-Creator");
		System.out.println();

		System.out.print("파일경로 : ");
		String path = scanner.nextLine();

		System.out.println("start");
		
		logic(path);
	}
	
	public static void logic(String path) throws IOException, IllegalArgumentException, IllegalAccessException {
		File file = new File(path);
		if (!file.exists()) {
			System.out.println("E> File not exists: " + path);
			return;
		}

		MusicSheet musicSheet = new MusicSheet();
		musicSheet.load(file);
		
		String outPath;
		int idx = path.lastIndexOf('.');
		if (idx != -1) {
			outPath = path.substring(0, idx) + ".adofai";
		} else {
			outPath = path + ".adofai";
		}

		System.out.println("outPath:" + outPath);
		Maker.make(musicSheet, false, outPath);
	}

}
