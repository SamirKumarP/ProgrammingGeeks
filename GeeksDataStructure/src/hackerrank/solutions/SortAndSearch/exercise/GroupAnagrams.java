package hackerrank.solutions.SortAndSearch.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import hackerrank.codelibrary.HashMapList;

public class GroupAnagrams {

	public static void main(String[] args) {
		String[] array = {"care", "acre", "new", "array", "race"};
//		O(n log n)
		Arrays.sort(array, new AnagaramComparator());
		System.out.println(Arrays.toString(array));

	}
	
	public static class AnagaramComparator implements Comparator<String> {
		
		public String sortChars(String s) {
			char[] content = s.toCharArray();
			Arrays.sort(content);
			return new String(content);
		}

		@Override
		public int compare(String s1, String s2) {
			return sortChars(s1).compareTo(sortChars(s2));
		}
		
	}

	void sort(String[] array) {
		/*
		 * HashMapList<String, Integer> is a HashMap that maps from Strings to ArrayList<Integer>. See appendix for implementation.
		 */
		HashMapList<String, String> mapList = new HashMapList<String, String>();
		/*
		 * Group words by anagram
		 */
		for (String s : array) {
			String key = sortChars(s);
			mapList.put(key, s);
		}
		/*
		 * Convert hash table to array
		 */
		int index = 0;
		for (String key : mapList.keySet()) {
			ArrayList<String> list = mapList.get(key);
			for (String t :list) {
				array[index] = t;
				index++;
			}
		}
	}

	String sortChars(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
}
