package br.com.jp.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

	public static List<String> readLines(String filePath) {
		List<String> lines = new ArrayList<String>();
		
		try {
			BufferedReader in = new BufferedReader(new FileReader(filePath));

			String line = "";
			
			while ((line = in.readLine()) != null) {
				lines.add(line);
			}
			
			in.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		} catch (IOException e) {
			System.out.println("Error reading file.");
		}

		return lines;
	}
}
