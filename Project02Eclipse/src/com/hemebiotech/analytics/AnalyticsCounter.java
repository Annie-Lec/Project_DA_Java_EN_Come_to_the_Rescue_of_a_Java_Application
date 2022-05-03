package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.ArrayList;

public class AnalyticsCounter {

	private static String fileIn = "symptoms.txt";

	public static void main(String args[]) throws IOException {

		ArrayList<String> listOfSymptoms = new ArrayList<String>();

		/* 1- Read the file and create a non-ordered List within */
		ReadSymptomDataFromFile readFile = new ReadSymptomDataFromFile(fileIn);
		listOfSymptoms = (ArrayList<String>) readFile.GetSymptoms();
		//System.out.println(listOfSymptoms);
		
		/* 2- Count in a treeMap : ordered list*/
		CountAndSortSymptoms sortedListOfSymptoms = new CountAndSortSymptoms(listOfSymptoms);
		System.out.println(sortedListOfSymptoms.count());
		
		

	}
}
