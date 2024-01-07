package hackerrank.book.bigo.exercise;

import java.util.Arrays;

import hackerrank.algorithms.MergeSort;

// O(b log b + a log b)
public class IntersectionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int intersection(int[] a, int[] b) {
		MergeSort.mergesort(b);
		int intersect = 0;
		for (int x : a) {
			if (Arrays.binarySearch(b, x) >= 0) {
				intersect ++;
			}
		}
		return intersect;
	}

}
