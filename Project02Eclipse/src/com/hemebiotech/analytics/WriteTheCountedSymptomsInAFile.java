/**
 * 
 */
package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author aNewL
 *
 */
public class WriteTheCountedSymptomsInAFile implements IWriteSortedTreeInAFile {
	
	private String outputFile;
	private TreeMap<String, Integer> tree;
	
	public WriteTheCountedSymptomsInAFile() {
		
		super();
	}


//	public WriteTheCountedSymptomsInAFile(String outputFile, TreeMap<String, Integer> tree) {
//		super();
//		this.setOutputFile( outputFile);
//		this.setTree ( tree);
//	}
	
	
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
	public void createFile(TreeMap<String, Integer> tree, String outputFile) {
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(outputFile, true);

			// Création d un bufferedWriter qui utilise le fileWriter
			BufferedWriter theWriter = new BufferedWriter(fileWriter);

			Set<String> symptomes = tree.keySet();

			// System.out.println(symptomes);

			for (String sympto : symptomes) {
				// System.out.println(sympto + ";" + tree.get(sympto));
				if (sympto != null) {
					theWriter.write(sympto + " - " + tree.get(sympto));
					theWriter.newLine();
				}

			}
			theWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
