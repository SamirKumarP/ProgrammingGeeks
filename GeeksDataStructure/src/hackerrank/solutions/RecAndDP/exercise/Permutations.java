package hackerrank.solutions.RecAndDP.exercise;

import java.util.ArrayList;
import java.util.HashMap;

public class Permutations {

	public static void main(String[] args) {
		ArrayList<String> getPerms = getPerms("abcd");
		System.out.println(getPerms);

	}
	
	static ArrayList<String> getPerms(String str) {
		if (str == null) return null;
		ArrayList<String> permutations = new ArrayList<String>();
		if (str.length() == 0) { // base case
			permutations.add("");
			return permutations;
		}
		char first = str.charAt(0); // get the first char
		String remainder = str.substring(1); // remove the first char
		ArrayList<String> words = getPerms(remainder);
		for (String word : words) {
			for (int j = 0; j <= word.length(); j++) {
				String s = insertCharAt(word, first, j);
				permutations.add(s);
			}
		}
		return permutations;
	}

	/*
	 * Insert char c at index i in word
	 */
	static String insertCharAt(String word, char c, int i) {
		String start = word.substring(0, i);
		String end = word.substring(i);
		return start + c + end;
	}
	
	ArrayList<String> getPerms2(String remainder) {
		int len = remainder.length();
		ArrayList<String> result = new ArrayList<String>();
		/*
		 * Base case
		 */
		if (len == 0) {
			result.add(""); // Be sure to return empty string!
			return result;
		}
		for (int i = 0; i < len; i++) {
			/*
			 * Remove char i and find permutations of remaining chars.
			 */
			String before = remainder.substring(0, 1);
			String after = remainder.substring(i + 1, len);
			ArrayList<String> partials = getPerms2(before + after);
			/*
			 * Prepend char i to each permutation.
			 */
			for (String s : partials) {
				result.add(remainder.charAt(i) + s);
			}
		}
		return result;
	}
	
	ArrayList<String> getPerms3(String str) {
		ArrayList<String> result = new ArrayList<String>();
		getPerms3("", str, result);
		return result;
	}

	void getPerms3(String prefix, String remainder, ArrayList<String> result) {
		if (remainder.length() == 0) result.add(prefix);
		int len = remainder.length();
		for (int i = 0; i < len; i++) {
			String before = remainder.substring(0, i);
			String after = remainder.substring(i + 1, len);
			char c = remainder.charAt(i);
			getPerms3(prefix + c, before + after, result);
		}
	}
	
	
//	Permutations with duplicates
	ArrayList<String> printPerms(String s) {
		ArrayList<String> result = new ArrayList<String>();
		HashMap<Character, Integer> map = buildFreqTable(s);
		printPerms(map, "", s.length(), result);
		return result;
	}

	HashMap<Character, Integer> buildFreqTable(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c: s.toCharArray()) {
			if (!map.containsKey(c)) {
				map.put(c, 0);
			}
			map.put(c, map.get(c) + 1);
		}
		return map;
	}
	
	
	void printPerms(HashMap<Character, Integer> map, String prefix, int remaining, ArrayList<String> result) {
		/*
		 * Base case. Permutation has been completed.
		 */
		if (remaining == 0) {
			result.add(prefix);
			return;
		}
		/*
		 * Try remaining letters for next char, and generate remaining permutations.
		 */
		for (Character c : map.keySet()) {
			int count = map.get(c);
			if (count > 0) {
				map.put(c, count - 1);
				printPerms(map, prefix + c, remaining - 1, result);
				map.put(c, count);
			}
		}
		
	}

}
