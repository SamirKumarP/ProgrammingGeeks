package hackerrank.book.bigo;

//Time O(N) Space O(1)
public class PairSumSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int pairSumSequence(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += pairSum(i, i + 1);
		}
		return sum;
	}
	
	int pairSum(int a, int b) {
		return a + b;
	}

}
