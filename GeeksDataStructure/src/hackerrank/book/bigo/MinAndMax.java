package hackerrank.book.bigo;

public class MinAndMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
//	O(N)
	void minAndMax1(int[] array) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int x : array) {
			if (x < min) min = x;
			if (x > max) max = x;
		}
	}
//	O(N)
	void minAndMax2(int[] array) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int x : array) {
			if (x < min) min = x;
		}
		for (int x : array) {
			if (x > max) max = x;
		}
	}

}
