package com.hemebiotech.analytics.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import com.hemebiotech.analytics.iservices.ICountandSortSymptoms;

/**
 * 
 * Count Item from a non ordered List in an ordered Collection
 * @implNote ICountandSortSymptoms
 * @author aNewL
 *
 */
public class CountAndSortSymptoms implements ICountandSortSymptoms {

	private List<String> liste = new ArrayList<String>();

	public CountAndSortSymptoms(List<String> liste) {
		this.liste = liste;
	}

	public List<String> getListe() {
		return liste;
	}

	public void setListe(List<String> liste) {
		this.liste = liste;
	}
/**
 * @implNote ICountandSortSymptoms
 * groups and counts by Item (Key) each record of a non ordered List in a TreeMap 
 * Count records from a List in a TreeMap
 */
	@Override
	public TreeMap<String, Integer> count() throws IOException {
		TreeMap<String, Integer> treeMapSymptoms = new TreeMap<>();
		//group by and count 
		for (String record : liste) {
			//If item already exists then the value is incremented
			if (treeMapSymptoms.containsKey(record)) {
				treeMapSymptoms.put(record, treeMapSymptoms.get(record) + 1);
				//If the record is a new Item non already included in the TreeeMap then, we initialize the value with 1
			} else {
				treeMapSymptoms.put(record, 1);
			}
		}

		return treeMapSymptoms;
	}

}
