package hackerrank.book.bigo;

public class ArraySumAndProd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
//	O(N)
	void foo(int[] array) {
		int sum = 0;
		int product = 1;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		for (int i = 0; i < array.length; i++) {
			product *= array[i];
		}
		System.out.println(sum + ", " + product);
	}

}
