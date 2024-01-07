package hackerrank.algorithms;

// O(n^2) memory O(1)
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void bubblesort(int[] array) {
		boolean isSorted = false;
		int lastUnsorted = array.length - 1;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < lastUnsorted; i++) {
				if (array[i] > array[i + 1]) {
					swap(array, i, i + 1);
					isSorted = false;
				}
			}
			lastUnsorted--;
		}
	}
	
	public static void swap(int[] array, int i, int j) {
		int tmp = array[i];	
		array[i] = array[j];
		array[j] = tmp;
	}

}
