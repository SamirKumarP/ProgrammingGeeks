package hackerrank.algorithms;

import java.util.Arrays;

//O(n log(n)) space O(n)
public class MergeSort {
	
	public static void mergesort(int[] array) {
		int[] helper = new int[array.length]; 
		mergeSort(array, new int[array.length], 0, array.length - 1);
		System.out.println(Arrays.toString(array));
	}

	private static void mergeSort(int[] array, int[] temp, int leftStart, int rightEnd) {
		if (leftStart >= rightEnd) {
			return;
		}
		int middle = (leftStart + rightEnd) / 2;
		mergeSort(array, temp, leftStart, middle); // Sort left half
		mergeSort(array, temp, middle + 1, rightEnd); // Sort right half
		mergeHalves(array, temp, leftStart, rightEnd); // Merge them
//		merge(array, temp, leftStart, middle, rightEnd); // Merge them
	}

	private static void merge(int[] array, int[] helper, int low, int middle, int high) {
		/*
		 * Copy both halves into a helper array
		 */
		for (int i = low; i <= high; i++) {
			helper[i] = array[i];
		}
		int helperLeft = low;
		int helperRight = middle + 1;
		int current = low;
		/*
		 * Iterate through helper array. Compare the left and right half, copying back
		 * the smaller element from the two halves into the original array.
		 */
		while (helperLeft <= middle && helperRight <= high) {
			if (helper[helperLeft] <= helper[helperRight]) {
				array[current] = helper[helperLeft];
				helperLeft++;
			} else { // If right element is smaller than left element
				array[current] = helper[helperRight];
				helperRight++;
			}
			current++;
		}
		/*
		 * Copy the rest of the left side of the array into the target array
		 */
		int remaining = middle - helperLeft;
		for (int i = 0; i <= remaining; i++) {
			array[current + i] = helper[helperLeft + i];
		}
	}

	private static void mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd) {
		int leftEnd = (rightEnd + leftStart) / 2;
		int rightStart = leftEnd + 1;
		int size = rightEnd - leftStart + 1;
		
		int left = leftStart;
		int right = rightStart;
		int index = leftStart;
		
		while (left <= leftEnd && right <= rightEnd) {
			if (array[left] <= array[right]) {
				temp[index] = array[left];
				left++;
			} else {
				temp[index] = array[right];
				right++;
			}
			index++;
		}
		System.arraycopy(array, left, temp, index, leftEnd - left + 1);
		System.arraycopy(array, right, temp, index, rightEnd - right + 1);
		System.arraycopy(temp, leftStart, array, leftStart, size);
	}

	public static void main(String[] args) {
		int[] arr = new int[] {10, 5, 2, 7, 4, 9, 12, 1, 8, 6, 11, 3};
		mergesort(arr);

	}

}
