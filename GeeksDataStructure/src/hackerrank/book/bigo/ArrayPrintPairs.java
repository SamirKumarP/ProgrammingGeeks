package hackerrank.book.bigo;

public class ArrayPrintPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
//	O(N^2)
	void printPairs(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.println(array[i] + "," + array[j]);
			}
		}
	}
	
//	O(AB)
	void printUnorderedPairs(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 1 + 1; j < array.length; j++) {
				System.out.println(array[i] + "," + array[j]);
			}
		}
	}
	
//	
	void printUnorderedPairs(int[] arrayA, int[] arrayB) {
		for (int i = 0; i < arrayA.length; i++) {
			for (int j = 0; j < arrayB.length; j++) {
				if(arrayA[i] < arrayB[j]) {
					System.out.println(arrayA[i] + "," + arrayB[j]);
				}
			}
		}
	}
	
//	O(AB)
	void printUnorderedPairsStrange(int[] arrayA, int[] arrayB) {
		for (int i = 0; i < arrayA.length; i++) {
			for (int j = 1 + 1; j < arrayB.length; j++) {
				for (int k = 0; k < 100000; k++) {
					System.out.println(arrayA[i] + "," + arrayB[j]);
				}
			}
		}
	}

}
