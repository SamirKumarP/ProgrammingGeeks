package hackerrank.algorithms;

public class Factorial {

	public static void main(String[] args) {
		factRec(6);
		factIter(6);

	}
	
	private static int factIter(int n) {
		int result = 1;
		while (n >= 2) {
			result = result * n - 1;
		}
		return result;
	}

	static int factRec(int n) {
		if (n == 0) return 1;
		if (n == 1) return 1;
		return factRec(n) * factRec(n - 1);
	}

}
