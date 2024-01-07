package hackerrank.techqns;

public class SwapMinMaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	void swapMinMax(int[] array) {
		int minIndex = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[minIndex]) {
				minIndex = i;
			}
		}
		int maxIndex = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > array[maxIndex]) {
				maxIndex = i;
			}
		}
		int temp = array[minIndex];
		array[minIndex] = array[maxIndex];
		array[maxIndex] = temp;
	}
	
	void swapMinMaxBetter(int[] array) {
		int minIndex = getMinIndex(array);
		int maxIndex = getMaxIndex(array);
		swap(array, minIndex, maxIndex);
	}

	int getMinIndex(int[] array) {
		// TODO Auto-generated method stub
		return 0;
	}
	int getMaxIndex(int[] array) {
		// TODO Auto-generated method stub
		return 0;
	}
	void swap(int[] array, int minIndex, int maxIndex) {
		// TODO Auto-generated method stub
		
	}
}
