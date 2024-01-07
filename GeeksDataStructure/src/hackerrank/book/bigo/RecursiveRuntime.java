package hackerrank.book.bigo;

//O(2^N), O(N)
public class RecursiveRuntime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	int f(int n) {
		if (n <= 1) {
			return 1;
		}
		return f(n - 1) + f(n - 1);	
	}
}
