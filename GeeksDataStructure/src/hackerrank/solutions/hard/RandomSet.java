package hackerrank.solutions.hard;

public class RandomSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	int[] pickMRecursively(int[] original, int m, int i) {
		if (i + 1 == m) { // Base case
			/*
			 * return first m elements of original
			 */
//			int[] subset = new int[m];
//			for (int j = 0; j < m; j++) {
//				subset[j] = original[j];
//			}
//			return subset;
		} else if (i + 1 > m) {
			int[] subset = pickMRecursively(original, m, i - 1);
			int k = rand(0 , i); // random values between 0 and i, inclusive
			if (k < m) {
				subset[k] = original[i];
				return subset;
			}
		}
		return null;
	}
	
	int rand(int lower, int higher) {
		return lower + (int)(Math.random() * (higher - lower + 1));
	}
	
	int[] pickMIteratively(int[] original, int m) {
		int[] subset = new int[m];
		/*
		 * Fill in subset array with first part of original array
		 */
		for (int i = 0; i < m; i++) {
			subset[i] = original[i];
		}
		/*
		 * Go through rest of original array.
		 */
		for (int i = m; i < original.length; i++) {
			int k = rand(0, i); // Random # between 0 and i, inclusive
			if (k < m) {
				subset[k] = original[i];
			}
		}
		return subset;
	}
}
