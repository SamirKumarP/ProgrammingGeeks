package hackerrank.solutions.moderate;

public class ContiguousSequence {

	public static void main(String[] args) {
		int[] array = {2, -8, 3, -2, 4, -10};
		System.out.println(getMaxSum(array));
	}
	
	static int getMaxSum(int[] a) {
		int maxsum = 0;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			if (maxsum < sum) {
				maxsum = sum;
			} else if (sum < 0) {
				sum = 0;
			}
		}
		return maxsum;
	}

}
