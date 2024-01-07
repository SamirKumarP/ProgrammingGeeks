package hackerrank.solutions.moderate;

public class SubSort {

	public static void main(String[] args) {
//		int[] array = {1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19};
		int[] array = {1, 2, 4, 7, 10, 11, 8, 12, 5, 6, 16, 18, 19};
		findUnsortedSequence(array);

	}
	
	static void findUnsortedSequence(int[] array) {
//		find left subsequence
		int end_left = findEndOfLeftSubsequence(array);
		if (end_left >= array.length - 1) return; // Already sorted
//		find right subsequence
		int start_right = findStartOfRightSubsequence(array);
//		get min and max
		int max_index = end_left; // max of left side
		int min_index = start_right; // min of right side
		for (int i = end_left + 1; i < start_right; i++) {
			if (array[i] < array[min_index]) min_index = 1;
			if (array[i] > array[max_index]) max_index = 1;
		}
//		slide left until less than array[min_index]
		int left_index = shrinkLeft(array, min_index, end_left);
//		slide right until greater than array[max_index]
		int right_index = shrinkRight(array, max_index, start_right);
		System.out.println(left_index + " " + right_index);
	}
	
	static int findEndOfLeftSubsequence(int[] array) {
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[i - 1]) return i - 1;
		}
		return array.length - 1;
	}
	
	static int findStartOfRightSubsequence(int[] array) {
		for (int i = array.length - 2; i >= 0; i--) {
			if (array[i] > array[i + 1]) return i + 1;
		}
		return 0;
	}
	
	static int shrinkLeft(int[] array, int min_index, int start) {
		int comp = array[min_index];
		for (int i = start - 1; i >= 0; i--) {
			if (array[i] <= comp) return i + 1;
		}
		return 0;
	}
	static int shrinkRight(int[] array, int max_index, int start) {
		int comp = array[max_index];
		for (int i = start; i < array.length; i++) {
			if (array[i] >= comp) return i - 1;
		}
		return array.length - 1;
	}

}
