package com.hemebiotech.analytics.services;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import com.hemebiotech.analytics.iservices.ICountandSortSymptoms;

/**
 * 
 * Count Item from a non ordered List in an ordered Collection
 * 
 * @author aNewL
 *
 */
public class CountAndSortSymptoms implements ICountandSortSymptoms {

	private List<String> liste = new ArrayList<String>();

	/**
	 * Constructor of the CountAndSortSymptoms class
	 * 
	 * @param liste : a list of symptoms
	 */
	public CountAndSortSymptoms(List<String> liste) {
		this.liste = liste;
	}

	/**
	 * 
	 * @return : a list
	 */
	public List<String> getListe() {
		return liste;
	}

	/**
	 * Defines a list of Symptoms
	 * 
	 * @param liste : a list of strings
	 */
	public void setListe(List<String> liste) {
		this.liste = liste;
	}

	@Override
	public TreeMap<String, Integer> count() {
		TreeMap<String, Integer> treeMapSymptoms = new TreeMap<>();
		// group by and count
		for (String record : liste) {
			// If item already exists then the value is incremented
			if (treeMapSymptoms.containsKey(record)) {
				treeMapSymptoms.put(record, treeMapSymptoms.get(record) + 1);
				// If the record is a new Item non already included in the TreeeMap then, we
				// initialize the value with 1
			} else {
				treeMapSymptoms.put(record, 1);
			}
		}

		return treeMapSymptoms;
	}

}
