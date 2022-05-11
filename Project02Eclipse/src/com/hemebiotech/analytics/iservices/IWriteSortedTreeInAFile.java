package com.hemebiotech.analytics.iservices;

import java.io.IOException;
import java.util.TreeMap;

/**
 * Interface which has to be implemented to Create a file with the data of a sorted TreeMap
 * @author aNewL
 *
 */

public interface IWriteSortedTreeInAFile {
	/**
	 * 
	 * @param tree : treeMap containing the data to be saved in an external file 
	 * @param outputFile : external file that will contain the treeMap data
	 * @throws IOException : if we have problem with the resources 
	 */
	public void createFile(TreeMap<String, Integer> tree, String outputFile) throws IOException;

}
