package hackerrank.solutions.RecAndDP.exercise;

public class RecursiveMultiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int minProduct(int a, int b) {
		int bigger = a < b ? b : a;
		int smaller = a < b ? a : b;
		return minProductHelper(smaller, bigger);
	}

	int minProductHelper(int smaller, int bigger) {
		if (smaller == 0) { // 0 x bigger = 0
			return 0;
		} else if (smaller == 1) { // 1 x bigger = bigger
			return bigger;
		}
		/*
		 * Compute half. if uneven, compute other half. If even, double it.
		 */
		int s = smaller >> 1; // Divide by 2
		int side1 = minProduct(s, bigger);
		int side2 = side1;
		if (smaller % 2 == 1) {
			side2 = minProductHelper(smaller - s, bigger);
		}
		return side1 + side2;
	}
	
	int minProductMemo(int a, int b) {
		int bigger = a < b ? b : a;
		int smaller = a < b ? a : b;
		int memo[] = new int[smaller + 1];
		return minProductMemo(smaller, bigger, memo);
	}

	int minProductMemo(int smaller, int bigger, int[] memo) {
		if (smaller == 0) { // 0 x bigger = 0
			return 0;
		} else if (smaller == 1) { // 1 x bigger = bigger
			return bigger;
		} else if (memo[smaller] > 0) {
			return memo[smaller];
		}
		/*
		 * Compute half. if uneven, compute other half. If even, double it.
		 */
		int s = smaller >> 1; // Divide by 2
		int side1 = minProduct(s, bigger);
		int side2 = side1;
		if (smaller % 2 == 1) {
			side2 = minProductMemo(smaller - s, bigger, memo);
		}
		/*
		 * Sum and cache.
		 */
		memo[smaller] = side1 + side2;
		return memo[smaller];
	}
	
//	O(log s)
	int minProduct3(int a, int b) {
		int bigger = a < b ? b : a;
		int smaller = a < b ? a : b;
		return minProductHelper3(smaller, bigger);
	}

	int minProductHelper3(int smaller, int bigger) {
		if (smaller == 0) return 0;
		else if (smaller == 1) return bigger;
		int s = smaller >> 1; // Divide by 2
		int halfProd = minProductHelper3(s, bigger);
		if (smaller % 2 == 0) {
			return halfProd + halfProd;
		} else {
			return halfProd + halfProd + bigger;
		}
	}
	
	
	

}
