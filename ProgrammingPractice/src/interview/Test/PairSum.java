package interview.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Algorithm to find all pairs of integers within an array which sum to a specified value
public class PairSum {

	public static void main(String[] args) {
		int[] array = {1, 5, 5, 4, 6, 2, 3, 7};
		List<Pair> pairs = new ArrayList<Pair>();
		pairs = pairSumCombinations(array, 10);
		System.out.println(pairs);
		

	}
	
	static class Pair {
		int i;
		int j;
		public Pair(int i, int j) {
			this.i = i;
			this.j = j;
		}		
	}
	
//	This takes O(N) time, O(N) space and works without sort
/*
 * Solution without sorting and using HashMap, where the value in the hash map reflects the number of "unpaired"
instances of a key. We walk through the array. At each element x, check how many unpaired instances of
x's complement preceded it in the array. If the count is at least one, then there is an unpaired instance of x's
complement. We add this pair and decrement x's complement to signify that this element has been paired.
If the count is zero, then increment the value of x in the hash map to signify that x is unpaired.
This solution will return duplicate pairs, but will not reuse the same instance of an element.
 */
	static ArrayList<Pair> pairSumCombinations(int[] array, int sum) {
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

	static void adjustCounterBy(HashMap<Integer, Integer> counter, int key, int delta) {
		counter.put(key, counter.getOrDefault(key, 0) + delta);
	}

	
	
}
