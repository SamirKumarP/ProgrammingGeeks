package hackerrank.algorithms;

public class BitManLonelyInt {
	
	private static int lonelyInteger(int[] array) {
		int result = 0;
		for (int value: array) {
			result ^= value;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
