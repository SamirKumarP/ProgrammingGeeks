package hackerrank.book.bigo;

public class NthFibonacci {

	public static void main(String[] args) {
		System.out.println(fib(3));

	}
	
//	O(2^N)
	static int fib(int n) {
		if (n < 0) return 0;
		else if (n == 1) return 1;
		return fib(n -1) + fib(n -2);
	}

}
