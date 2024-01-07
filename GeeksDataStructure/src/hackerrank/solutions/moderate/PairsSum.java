package hackerrank.solutions.moderate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PairsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
//	Brute Force
	ArrayList<Pair> printPairSums(int[] array, int sum) {
		ArrayList<Pair> result = new ArrayList<Pair>();
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == sum) {
					result.add(new Pair(array[i], array[j]));
				}
			}
		}
		return result;
	}
	
	class Pair {
		int i;
		int j;
		public Pair(int i, int j) {
			this.i = i;
			this.j = j;
		}		
	}
	
//	O(N) time, O(N) space
	ArrayList<Pair> printPairSums2(int[] array, int sum) {
		ArrayList<Pair> result = new ArrayList<Pair>();
		HashMap<Integer, Integer> unpairedCount = new HashMap<Integer, Integer>();
		for (int x : array) {
			int complement = sum - x;
			if (unpairedCount.getOrDefault(complement, 0) > 0) {
				result.add(new Pair(x, complement));
				adjustCounterBy(unpairedCount, complement, -1); // decrement complement
			} else {
				adjustCounterBy(unpairedCount, x, 1); // increment count
			}
		}
		return result;
	}

	void adjustCounterBy(HashMap<Integer, Integer> counter, int key, int delta) {
		counter.put(key, counter.getOrDefault(key, 0) + delta);
	}
	
//	sorted array
//	O(N log N) time to sort, O(N) to find pairs
	void printPairSums3(int[] array, int sum) {
		Arrays.sort(array);
		int first = 0;
		int last = array.length - 1;
		while (first < last) {
			int s = array[first] + array[last];
			if (s == sum) {
				System.out.println(array[first] + " " + array[last]);
				first++;
				last--;				
			} else {
				if (s < sum) first++;
				else last--;
			}
		}
	}
	
//	Binary search approach twice O(N log N)

}
