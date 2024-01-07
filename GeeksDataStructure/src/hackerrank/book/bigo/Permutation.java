package hackerrank.book.bigo;

// O(N^2 * N!)
public class Permutation {

	public static void main(String[] args) {
		permutation("abcd");

	}
	
	static void permutation(String str) {
		permutation(str, "");
	}

	static private void permutation(String str, String prefix) {
		if (str.length() == 0) {
			System.out.println(prefix);
		} else {
			for (int i = 0; i < str.length(); i++) {
				// Rest of the string after excluding the ith character (by me)
				String rem = str.substring(0, i) + str.substring(i + 1);
				permutation(rem, prefix + str.charAt(i));
			}
		}
		
	}

}
