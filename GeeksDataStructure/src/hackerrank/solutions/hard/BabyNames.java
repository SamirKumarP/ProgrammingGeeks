package hackerrank.solutions.hard;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class BabyNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	HashMap<String, Integer> trulyMostPopular(HashMap<String, Integer> names,
			String[][] synonyms) {
		/*
		 * Parse list and initialize equivalence classes.
		 */
		HashMap<String, NameSet> groups = constructGroups(names);
		
		/*
		 * Merge equivalence classes together.
		 */
		mergeClasses(groups, synonyms);
		
		/*
		 * Convert back to hash map.
		 */
		return convertToMap(groups);
	}

	/*
	 * This is the core of the algorithm. Read through each pair. Merge their
	 * equivalence classes and update the mapping of the secondary class to pint to
	 * the first set.
	 */
	void mergeClasses(HashMap<String, NameSet> groups, String[][] synonyms) {
		for (String[] entry : synonyms) {
			String name1 = entry[0];
			String name2 = entry[1];
			NameSet set1 = groups.get(name1);
			NameSet set2 = groups.get(name2);
			if (set1 != set2) {
				/*
				 * Always merge the smaller set into the bigger one.
				 */
				NameSet smaller = set2.size() < set1.size() ? set2 : set1;
				NameSet bigger = set2.size() < set1.size() ? set1 : set2;
				
				/*
				 * Merge lists
				 */
				Set<String> otherNames = smaller.getNames();
				int frequency = smaller.getFrequency();
				bigger.copyNamesWithFrequency(otherNames, frequency);
				
				/*
				 * Update mapping
				 */
				for (String name : otherNames) {
					groups.put(name, bigger);
				}
			}
		}
	}
	
	/*
	 * Read through (name, frequency) pairs and initialize a mapping of names to
	 * NameSets (equivalence classes).
	 */
	HashMap<String, NameSet> constructGroups(HashMap<String, Integer> names) {
		HashMap<String, NameSet> groups = new HashMap<String, NameSet>();
		for (Entry<String, Integer> entry: names.entrySet()) {
			String name = entry.getKey();
			int frequency = entry.getValue();
			NameSet group = new NameSet(name, frequency);
			groups.put(name, group);
		}
		return groups;
	}
	
	HashMap<String, Integer> convertToMap(HashMap<String, NameSet> groups) {
		HashMap<String, Integer> list = new HashMap<String, Integer>();
		for (NameSet group: groups.values()) {
			list.put(group.getRootName(), group.getFrequency());
		}
		return list;
	}

}
