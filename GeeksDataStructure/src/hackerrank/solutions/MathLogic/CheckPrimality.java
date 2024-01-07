package hackerrank.solutions.MathLogic;

public class CheckPrimality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	boolean primeNaive(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	boolean primeSlightlyBetter(int n) {
		if (n < 2) {
			return false;
		}
		int sqrt = (int) Math.sqrt(n);
		for (int i = 2; i < sqrt; i++) {
			if (n % i == 0) return false;
		}
		return true;
	}

}
