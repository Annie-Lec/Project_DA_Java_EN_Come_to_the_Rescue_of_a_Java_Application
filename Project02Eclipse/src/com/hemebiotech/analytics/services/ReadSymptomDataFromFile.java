package com.hemebiotech.analytics.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.hemebiotech.analytics.iservices.ISymptomReader;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;

	/**
	 * @return the filepath
	 */
	public String getFilepath() {
		return filepath;
	}

	/**
	 * @param filepath the filepath to set
	 */
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it,
	 *                 one per line
	 */
	public ReadSymptomDataFromFile(String filepath) {
		this.filepath = filepath;
	}

	@Override
	public List<String> getSymptoms() throws IOException {
		ArrayList<String> result = new ArrayList<String>();

		try (FileReader fileReader = new FileReader(filepath)) {

			BufferedReader reader = new BufferedReader(fileReader);
			String line = reader.readLine();

			while (line != null) {
				result.add(line);
				line = reader.readLine();
			}

			return result;
		}
	}

}
