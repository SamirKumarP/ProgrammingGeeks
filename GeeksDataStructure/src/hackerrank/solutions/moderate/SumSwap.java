package hackerrank.solutions.moderate;

import java.util.HashSet;

public class SumSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
//	Naive approach
	int[] findSwapValues(int[] array1, int[] array2) {
		int sum1 = sum(array1);
		int sum2 = sum(array2);
		for (int one : array1) {
			for (int two : array2) {
				int newSum1 = sum1 - one + two;
				int newSum2 = sum2 - two + one;
				if (newSum1 == newSum2) {
					int[] values = {one, two};
					return values;
				}
			}
		}
		return null;
	}

//	implemented myself
	private int sum(int[] array1) {
		 int sum = 0;
         for (int i = 0; i < array1.length; i++)
            sum +=  array1[i];
         return sum;
	}
	
//	Target approach O(AB)
	int[] findSwapValues2(int[] array1, int[] array2) {
		Integer target = getTarget(array1, array2);
		if (target == null) return null;
		for (int one : array1) {
			for (int two : array2) {
				if (one - two == target) {
					int[] values = {one, two};
					return values;
				}
			}
		}
		return null;
	}

	Integer getTarget(int[] array1, int[] array2) {
		int sum1 = sum(array1);
		int sum2 = sum(array2);
		if ((sum1 - sum2) % 2 != 0) return null;
		return (sum1 - sum2) / 2;
	}
	
//	Optimal solution O(A +B)
	int[] findSwapValues3(int[] array1, int[] array2) {
		Integer target = getTarget(array1, array2);
		if (target == null) return null;
		return findDifference(array1, array2, target);
	}

	/*
	 * Find a pair of with a specific difference.
	 */
	int[] findDifference(int[] array1, int[] array2, int target) {
		HashSet<Integer> contents2 = getContents(array2);
		for (int one : array1) {
			int two = one - target;
			if (contents2.contains(two)) {
				int[] values = {one, two};
				return values;	
			}
		}
		return null;
	}

	/*
	 * Put contents of array into hash set.
	 */
	HashSet<Integer> getContents(int[] array) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int a: array) {
			set.add(a);
		}
		return set;
	}
	
//	Sorted Array O(A + B) not sorted O(A log A + B log B)
	int[] findSwapValues4(int[] array1, int[] array2) {
		Integer target = getTarget(array1, array2);
		if (target == null) return null;
		return findDifference2(array1, array2, target);
	}

	int[] findDifference2(int[] array1, int[] array2, Integer target) {
		int a = 0;
		int b = 0;
		while (a < array1.length && b < array2.length) {
			int difference = array1[a] - array2[b];
			/*
			 * Compare difference to target. If difference is too small, then make it
			 * bigger by moving a to a bigger value. If it is too big, then make it
			 * smaller by moving b to a bigger value. If it's just right, return this
			 * pair.
			 */
			if (difference == target) {
				int[] values = {array1[a], array2[b]};
				return values;
			} else if (difference < target) {
				a++;
			} else {
				b++;
			}
		}
		return null;
	}

}
