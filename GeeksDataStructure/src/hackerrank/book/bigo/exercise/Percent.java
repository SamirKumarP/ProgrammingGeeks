package hackerrank.book.bigo.exercise;

// a % b
// O(1) constant amount of work
public class Percent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int mod(int a, int b) {
		if (b <= 0) {
			return -1;
		}
		int div = a / b;
		return a - div * b;
	}

}
