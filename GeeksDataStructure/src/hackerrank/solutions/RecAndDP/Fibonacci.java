package hackerrank.solutions.RecAndDP;

// O(n) runtime? 
public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(fibonacci(25));

	}
	
//	Top-Down DP (Memoization)
	static int fibonacci(int n) {
		return fibonacci(n, new int[n + 1]);
	}
	
	
	private static int fibonacci(int i, int[] memo) {
		if (i == 0 || i == 1) return i;
		if (memo[i] == 0) {
			memo[i] = fibonacci(i - 1, memo) + fibonacci(i - 2, memo);
		}
		return memo[i];
	}
	
//	Bottom-Up DP
	int fibonacci2(int n) {
		if (n == 0) return 0;
		else if (n == 1) return 1;
		int[] memo = new int[n];
		memo[0] = 0;
		memo[1] = 1;
		for (int i = 2; i < n; i++) {
			memo[i] = memo[i - 1] +  memo[i - 2];
		}
		return memo[n - 1] +  memo[n - 2];
	}
	
	int fibonacci3(int n) {
		if (n == 0) return 0;
		int a = 0;
		int b = 1;
		for (int i = 2; i < n; i++) {
			int c = a + b;
			a = b;
			b = c;
		}
		return a + b;
	}
	
	
	
//	Recursive
	int fibonacci0(int i) {
		if (i == 0) return 0;
		if (i == 1) return 1;
		return fibonacci0(i - 1) + fibonacci0(i - 2);
	}
	

}
