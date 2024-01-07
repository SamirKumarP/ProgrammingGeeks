package hackerrank.solutions.RecAndDP.exercise;

public class MagicIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
//	sorted array of distinct integers
	int magicSlow(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == i) {
				return i;
			}
		}
		return -1;
	}
	
	int magicFast(int[] array) {
		return magicFast(array, 0, array.length - 1);
//		return magicFastNonDistinct(array, 0, array.length - 1);
	}
	
	int magicFast(int[] array, int start, int end) {
		if(end < start) {
			return -1;
		}
		int mid = (start + end) / 2;
		if (array[mid] == mid) {
			return mid;
		} else if (array[mid] > mid) {
			return magicFast(array, start, mid - 1);
		} else {
			return magicFast(array, mid + 1, end);
		}
	}
	
//	non distinct integers
	int magicFastNonDistinct(int[] array, int start, int end) {
		if(end < start) return -1;
		int midIndex = (start + end) / 2;
		int midValue = array[midIndex];
		if (midValue == midIndex) {
			return midIndex;
		}
		/*
		 * Search left
		 */
		int leftIndex = Math.min(midIndex - 1, midValue);
		int left = magicFast(array, start, leftIndex);
		if (left >= 0) {
			return left;
		}
		/*
		 * Search right
		 */
		int rightIndex = Math.max(midIndex + 1, midValue);
		int right = magicFast(array, rightIndex, end);
		return right;
	}
	

}
