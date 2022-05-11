package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.hemebiotech.analytics.iservices.ICountandSortSymptoms;
import com.hemebiotech.analytics.iservices.ISymptomReader;
import com.hemebiotech.analytics.iservices.IWriteSortedTreeInAFile;
import com.hemebiotech.analytics.services.CountAndSortSymptoms;
import com.hemebiotech.analytics.services.ReadSymptomDataFromFile;
import com.hemebiotech.analytics.services.WriteTheCountedSymptomsInAFile;

/**
 * generate the expected file of the number of symptoms sorted in alphabetical order.
 * Read a file and create a non-ordered List within. Then count the record in a
 * treeMap : ordered list and finally write the result in a file
 * 
 * @see CountAndSortSymptoms
 * @see ReadSymptomDataFromFile
 * @see WriteTheCountedSymptomsInAFile
 * 
 * 
 * @author aNewL
 *
 */
public class AnalyticsCounter {

	private static String fileIn = "symptoms.txt";
	private static String fileOut = "result.out";

	/**
	 * main method of the class AnalyticsCounter calling the 3 methods : read / count and sort / write
	 * allowing to generate the expected file of the number of symptoms sorted in alphabetical order 
	 * @param args The command line arguments
	 */
	public static void main(String args[]) {

		List<String> listOfSymptoms = new ArrayList<String>();

		/* 1- Read the file and create a non-ordered List within */
		ISymptomReader readFile = new ReadSymptomDataFromFile(fileIn);
		try {
			listOfSymptoms = (ArrayList<String>) readFile.getSymptoms();
		} catch (IOException e) {
			System.out.println(fileIn + " - ioException : verify your ressources ! File or data not found");
			e.printStackTrace();
		}

		/* 2- Count in a treeMap : ordered list */
		ICountandSortSymptoms sortedListOfSymptoms;
		try {
			sortedListOfSymptoms = new CountAndSortSymptoms(listOfSymptoms);

			System.out.println(sortedListOfSymptoms.count());

			/* 3- Create the result file */
			IWriteSortedTreeInAFile result = new WriteTheCountedSymptomsInAFile();
			result.createFile(sortedListOfSymptoms.count(), fileOut);
		} catch (IOException e) {
			System.out.println("KO, the list of symptoms has to be defined in a directory with access rights");
			e.printStackTrace();
		}

	}
}
