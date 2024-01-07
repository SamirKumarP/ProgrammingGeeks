package hackerrank.algorithms;

public class Fibonacci {

	public static void main(String[] args) {
		fib(9);
	}

	private static void fib(int n) {
		int[] memo = new int[n + 1];
		for (int i = 0; i <= n - 1; i++) {
			System.out.println(i + ":" + fib(i, memo));
		}
		for (int i = 0; i <= n - 1; i++) {
			System.out.println(i + ":" + fibonacci(i));
		}
	}

	private static int fib(int i, int[] memo) {
		if (i == 0) return 0;
		else if (i == 1) return 1;
		else if (memo[i] > 0) return memo[i];
		memo[i] = fib(i - 1, memo) + fib(i - 2, memo);
		return memo[i];
	}
	
	private static int fibonacci(int i) {
		if (i == 0) return 0;
		else if (i == 1) return 1;
		else return fibonacci(i - 1) + fibonacci(i - 2);
	}
	
	

}
