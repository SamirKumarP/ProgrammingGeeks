package hackerrank.book.bigo;

import java.util.Arrays;

// O(N)
public class ArrayReverse {
	
	public static void main(String[] args) {
//		int[] myIntArray = new int[3];
//		int[] myIntArray = {1, 2, 3};
//		int[] myIntArray = new int[]{1, 2, 3};
		int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		reverse(array);
		System.out.println(Arrays.toString(array));

	}
	
	static void reverse(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int other = array.length - i - 1;
			int temp = array[i];
			array[i] = array[other];
			array[other] = temp;
		}
	}

}
