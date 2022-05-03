package com.hemebiotech.analytics;

import java.util.TreeMap;

/**
 * Interface
 * Create a file with the data of a TreeMap
 * @author aNewL
 *
 */

public interface IWriteSortedTreeInAFile {
	
	public void createFile(TreeMap<String, Integer> tree, String outputFile);

}
