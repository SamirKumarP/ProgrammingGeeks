package hackerrank.book.bigo.exercise;

// O(b)
public class Power {

	public static void main(String[] args) {
		System.out.println(power(5, 4));

	}
	static int power(int a, int b) {
		if (b < 0) {
			return 0; // error
		} else if (b == 0) {
			return 1;
		} else {
			return a * power(a, b - 1);
		}
	}

}
