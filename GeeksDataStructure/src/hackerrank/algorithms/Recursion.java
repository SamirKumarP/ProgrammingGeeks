package hackerrank.algorithms;

// fibonacci sum
public class Recursion {
	
	public static void main(String[] args) {
		System.out.println(fib(9));
	}
	
		public static int fib(int n) {
			if (n <= 0) {
				return 0;
			} else if (n == 1) {
				return 1;
			} else {
			return fib(n - 1) + fib(n - 2);
		}
	}

}
