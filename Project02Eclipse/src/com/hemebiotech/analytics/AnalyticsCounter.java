package com.hemebiotech.analytics;

import java.util.ArrayList;

public class AnalyticsCounter {
	
	private static String fileIn = "symptoms.txt";

	public static void main(String args[]) {
		
		ArrayList<String> listOfSymptoms = new ArrayList<String>();
		
		/*Read the file and create a non-ordered List within*/
		ReadSymptomDataFromFile readFile = new ReadSymptomDataFromFile(fileIn);
		listOfSymptoms = (ArrayList<String>) readFile.GetSymptoms();
		System.out.println(listOfSymptoms);
		
		

	}
}
