package hackerrank.algorithms;

import java.util.Arrays;

// Runtime average O(n log(n)) worst case O(n^2) Memory O(log (n))
public class QuickSort {
	
	public static void quicksort(int[] array) {
		quicksort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
	}
	
	public static void quicksort(int[] array, int left, int right) {
		if (left >= right) {
			return;
		}
		int pivot = array[(left + right) / 2]; // Pick pivot point
		int index = partition(array, left, right, pivot);
		quicksort(array, left, index - 1); // Sort left half
		quicksort(array, index, right); // Sort right half
	}
	
	private static int partition(int[] array, int left, int right, int pivot) {
		while (left <= right) {
//			Find element on left that should be on right
			while (array[left] < pivot) {
				left++;
			}
//			Find element on right that should be on left
			while (array[right] > pivot) {
				right--;
			}
//			Swap elements, and move left and right indices
			if (left <= right) {
				swap(array, left, right); // swaps elements
				left++;
				right--;
			}
		}
		return left;
	}
	
	public static void swap(int [] array, int left, int right){
		   int temp = 0;
		   temp= array[right];
		   array[right]= array[left];
		   array[left]= temp;
		  }

	public static void main(String[] args) {
		int[] arr = new int[] {5, 2, 3, 8, 6, 33, 11, 23};
		quicksort(arr);
	}

}
