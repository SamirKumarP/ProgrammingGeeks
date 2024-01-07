package hackerrank.solutions.ArrayString.exercise;

import java.util.Arrays;

/**
 * 
 * @author padhi
 * Check if one string is permutation to other
 *
 */
public class StringPermutationCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutation2("jituj", "jutij");
	}
	
	String sort(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	
	boolean permutation(String s, String t) { 
		if (s.length() != t.length()) {
			return false;
		}
		return sort(s).equals(sort(t));
	}
	
	static boolean permutation2(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] letters = new int[128]; // Assumption
		char[] s_array = s.toCharArray();
		for (char c : s_array) { // count number of each char in s.
			letters[c]++;
		}
		for (int i = 0; i < t.length(); i++) {
			int c = (int) t.charAt(i);
			letters[c]--;
			if (letters[c] < 0) {
				return false;
			}
		}
		return true;
	}

}
