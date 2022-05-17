package com.hemebiotech.analytics.iservices;

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
	 * Groups and counts by Item (Key) each record of a non ordered List in a TreeMap
	 * @return a TreeMap String Item as Key, Number of Item
	 */
	
	public TreeMap<String, Integer> count() ;

}
