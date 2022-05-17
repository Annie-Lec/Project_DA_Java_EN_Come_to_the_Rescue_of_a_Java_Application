package com.hemebiotech.analytics;

/**
 * Class creating a new instance of AnalyticsCounter and launching the analysis
 * method
 * 
 * @author aNewL
 *
 */
public class Main {
	/**
	 * main method of the class Main calling the 3 methods : read / count and sort /
	 * write allowing to generate the expected file of the number of symptoms sorted
	 * in alphabetical order
	 * 
	 * @param args The command line arguments
	 */
	public static void main(String[] args) {

		AnalyticsCounter analyse = new AnalyticsCounter();
		analyse.analysis();

	}

}
