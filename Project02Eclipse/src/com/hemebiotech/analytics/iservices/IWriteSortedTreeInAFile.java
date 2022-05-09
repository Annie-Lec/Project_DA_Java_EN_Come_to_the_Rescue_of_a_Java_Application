package com.hemebiotech.analytics.iservices;

import java.io.IOException;
import java.util.TreeMap;

/**
 * Interface which has to be implemented to Create a file with the data of a sorted TreeMap
 * @author aNewL
 *
 */

public interface IWriteSortedTreeInAFile {
	
	public void createFile(TreeMap<String, Integer> tree, String outputFile) throws IOException;

}
