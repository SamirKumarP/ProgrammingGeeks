package hackerrank.book.bigo.exercise;

// O(log n)
public class SumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int sumDigits(int n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

}
