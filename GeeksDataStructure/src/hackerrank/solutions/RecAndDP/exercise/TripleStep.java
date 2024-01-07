package hackerrank.solutions.RecAndDP.exercise;

import java.util.Arrays;

public class TripleStep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int countPathsMemo(int steps) {
		if (steps < 0) {
			return 0;
		}
		int[] memo = new int[steps + 1];
		Arrays.fill(memo, -1);
		return countPathsMemo(steps, memo);
	}
	
	public static int countPathsMemo(int steps, int[] memo) {
		if (steps < 0) {
			return 0;
		} else if (steps == 0) {
			return 1;
		}
		if (memo[steps] == -1) {
			memo[steps] = countPathsMemo(steps - 1, memo) + countPathsMemo(steps - 2, memo) + countPathsMemo(steps - 3, memo);
		}
		return memo[steps];
	}
}
