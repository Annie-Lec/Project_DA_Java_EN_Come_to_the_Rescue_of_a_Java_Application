package com.hemebiotech.analytics.iservices;


import java.io.IOException;
import java.util.TreeMap;


/**
 * Interface used to be implemented to count and sort Items like Symptoms 
 *  
 * IOException
 * @author aNewL
 *
 */
public interface ICountandSortSymptoms {
	/**
	 * @param String Item as Key, Number of Item
	 * @return a TreeMap 
	 * @throws IOException
	 */
	public TreeMap<String, Integer> count() throws IOException;

}
