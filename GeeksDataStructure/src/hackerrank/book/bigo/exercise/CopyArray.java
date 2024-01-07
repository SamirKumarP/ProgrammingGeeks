package hackerrank.book.bigo.exercise;

// O(n^2)
public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int[] copyArray(int[] array) {
		int[] copy = new int[0];
		for (int value : array) {
			copy = appendToNew(copy, value);
		}
		return copy;
	}
	int[] appendToNew(int[] array, int value) {
//		copy all elements over to new array
		int[] bigger = new int[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			bigger[i] = array[i];
		}
//		add new element
		bigger[bigger.length - 1] = value;
		return bigger;
	}
}
