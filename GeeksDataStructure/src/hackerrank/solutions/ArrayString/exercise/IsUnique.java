package hackerrank.solutions.ArrayString.exercise;

/**
 * Implement an algorithm to determine if a string has all unique characters
 * TC = O(n)
 * SC = O(1)
 * @author padhi
 *
 */

public class IsUnique {
	
	static boolean isUniqueChars(String str) {
		if(str.length() > 128) return false;
		boolean[] char_set = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) { // Already found this char in string
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}
	
	
	static boolean isUniqueCharsBitVector(String str) {
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			if((checker & (1 << val)) > 0) {
				return false;
			}
			checker |= (1 << val);
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isUniqueChars("jitu"));
//		System.out.println(isUniqueCharsBitVector("jitu"));

	}

}
