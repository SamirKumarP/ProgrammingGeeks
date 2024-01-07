package hackerrank.book.bigo.exercise;

// Integer Square Root
public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// O(log n) its essentially a binary search
	int sqrt(int n) {
		return sqrt_helper(n, 1, n);
	}
	private int sqrt_helper(int n, int min, int max) {
		if (max < min) return -1; // no square root
		int guess = (min + max) / 2;
		if (guess * guess == n) { // found it!
			return guess;
		} else if (guess * guess < n) { // too low
			return sqrt_helper(n, guess + 1, max); // try higher
		} else { // too high
			return sqrt_helper(n, min, guess - 1); // try lower
		}
	}
	// O(sqrt(n))
	int sqrt2(int n) {
		for (int guess = 1; guess * guess <= n; guess++) {
			if (guess * guess == n) {
				return guess;
			}
		}
		return -1;
	}

}
