package hackerrank.solutions.hard;

import java.util.HashMap;

import hackerrank.codelibrary.Graph;

public class BabyNames2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	HashMap<String, Integer> trulyMostPopular(HashMap<String, Integer> names,
			String[][] synonyms) {
		/*
		 * Create data.
		 */
		Graph graph = constructGraph(names);
		connectEdges(graph, synonyms);
		
		/*
		 * Find components.
		 */
		HashMap<String, Integer> rootNames = getTrueFrequencies(graph);
		return rootNames;
	}

}
