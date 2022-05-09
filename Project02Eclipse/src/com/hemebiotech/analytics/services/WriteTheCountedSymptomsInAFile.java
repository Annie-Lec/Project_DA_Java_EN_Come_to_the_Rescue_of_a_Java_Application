/**
 * 
 */
package com.hemebiotech.analytics.services;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.TreeMap;

import com.hemebiotech.analytics.iservices.IWriteSortedTreeInAFile;

/**
 * Write line of a TreeMap in an external file
 * @author aNewL
 *
 */
public class WriteTheCountedSymptomsInAFile implements IWriteSortedTreeInAFile {

	private String outputFile;
	private TreeMap<String, Integer> tree;

	public String getOutputFile() {
		return outputFile;
	}

	public void setOutputFile(String outputFile) {
		this.outputFile = outputFile;
	}

	public TreeMap<String, Integer> getTree() {
		return tree;
	}

	public void setTree(TreeMap<String, Integer> tree) {
		this.tree = tree;
	}

	@Override
	
	public void createFile(TreeMap<String, Integer> tree, String outputFile) throws IOException {
		FileWriter fileWriter;

		fileWriter = new FileWriter(outputFile, true);

		// Création d un bufferedWriter -utilise Mémoire tampon- qui utilise le fileWriter
		BufferedWriter theWriter = new BufferedWriter(fileWriter);

		Set<String> symptomes = tree.keySet();

		for (String sympto : symptomes) {
			//On écrit le symptome puis son volume (sa value) séparé par un espace
			if (sympto != null) {
				theWriter.write(sympto + " " + tree.get(sympto));
				theWriter.newLine();
			}

		}
		theWriter.close();

	}

}
