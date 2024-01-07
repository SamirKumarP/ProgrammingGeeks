package hackerrank.book.bigo;

// O(2^n) exponential runtime
public class Fibonacci {

	public static void main(String[] args) {
		allFib(25);
	}
	
	static void allFib(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(i + ": " + fib(i));
		}
	}

	private static int fib(int n) {
		if (n <= 0) return 0;
		else if (n == 1) return 1;
		return fib(n - 1) + fib(n - 2);
	}

}
