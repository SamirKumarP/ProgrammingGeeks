package hackerrank.solutions.hard;

import java.util.HashMap;

public class LettersAndNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
//	O(N^2)
	/*
	 * Return the largest subarray with equal number of 0s and 1s. Look at each
	 * subarray, starting from the longest. As soon as we find one that's equal, we
	 * return
	 */
	char[] findLongestSubarray(char[] array) {
		for (int len = array.length; len > 1; len --) {
			for (int i = 0; i < array.length - len; i++) {
				if (hasEqualLettersNumbers(array, i, i + len - 1)) {
					return extractSubarray(array, i, i + len - 1);
				}
			}
		}
		return null;
	}
	
	/*
	 * Return subarray of array between start and end (inclusive).
	 */
	private char[] extractSubarray(char[] array, int start, int end) {
		char[] subarray = new char[end - start + 1];
		for (int i = start; i <= end; i++) {
			subarray[i - start] = array[i];
		}
		return subarray;
	}

	/*
	 * Check if subarray has equal number of letters and numbers.
	 */
	boolean hasEqualLettersNumbers(char[] array, int start, int end) {
		int counter = 0;
		for (int i = start; i <= end; i ++) {
			if (Character.isLetter(array[i])) {
				counter++;
			} else if (Character.isDigit(array[i])) {
				counter--;
			}
		}
		return counter == 0;
	}
	
	char[] findLongestSubarray2(char[] array) {
		/*
		 * Compute delta between count of numbers and count of letters.
		 */
		int[] deltas = computeDeltaArray(array);
		/*
		 * Find pair in deltas with matching values and largest span.
		 */
		int[] match = findLongestMatch(deltas);
		/*
		 * Return the subarray. Note that it starts one *after* the initial occurence of
		 * this delta
		 */
		return extract(array, match[0] + 1, match[1]);
	}

	/*
	 * Compute the difference between the number of letters and numbers between the
	 * beginning of the array and each index.
	 */
	int[] computeDeltaArray(char[] array) {
		int[] deltas = new int[array.length];
		int delta = 0;
		for (int i = 0; i < array.length; i++) {
			if (Character.isLetter(array[i])) {
				delta++;
			} else if (Character.isDigit(array[i])) {
				delta --;
			}
			deltas[i] = delta;
		}
		return deltas;
	}

	/*
	 * Find the matching pair of values in the deltas array with the largest
	 * difference in indices.
	 */
	int[] findLongestMatch(int[] deltas) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, -1);
		int[] max = new int[2];
		for (int i = 0; i < deltas.length; i++) {
			if (!map.containsKey(deltas[i])) {
				map.put(deltas[i], i);
			} else {
				int match = map.get(deltas[i]);
				int distance = i - match;
				int longest = max[1] - max[0];
				if (distance > longest) {
					max[1] = i;
					max[0] = match;
				}
			}
		}
		return max;
	}

	private char[] extract(char[] array, int start, int end) {
		/*
		 * same as extractSubarray so copied
		 */
		char[] subarray = new char[end - start + 1];
		for (int i = start; i <= end; i++) {
			subarray[i - start] = array[i];
		}
		return subarray;
	}

}
