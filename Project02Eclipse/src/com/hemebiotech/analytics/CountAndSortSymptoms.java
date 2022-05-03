/**
 * 
 */
package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * @author aNewL
 *
 */
public class CountAndSortSymptoms implements ICountandSortSymptoms {

	private List<String> liste = new ArrayList<String>();

	public CountAndSortSymptoms(List<String> liste) throws IOException {

		this.setListe(liste);

	}

	public List<String> getListe() {
		return liste;
	}

	public void setListe(List<String> liste) throws IOException {
		if (liste == null) {
			throw new IOException("KO, Il faut renseigner une liste de Symptomes");
		}
		this.liste = liste;
	}

	@Override
	public TreeMap<String, Integer> count() {
		TreeMap<String, Integer> treeMapSymptoms = new TreeMap<>();

		for (String record : liste) {
			if (treeMapSymptoms.containsKey(record)) {
				treeMapSymptoms.put(record, treeMapSymptoms.get(record) + 1);
			} else {
				treeMapSymptoms.put(record, 1);
			}
		}

		return treeMapSymptoms;
	}

}
