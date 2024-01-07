package hackerrank.book.bigo;

public class CheckPrime {

	public static void main(String[] args) {
		System.out.println(isPrime(4));

	}
	
//	O(SQRTN)
	static boolean isPrime(int n) {
		for (int x = 2; x * x <= n; x++) {
			if (n % x == 0) {
				return false;
			}
		}
		return true;
	}

}
