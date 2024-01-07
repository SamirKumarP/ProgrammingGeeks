package hackerrank.book.bigo.exercise;

// O(a/b)
public class Divison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

//	assume a and b are both positive
	int div(int a, int b) {
		int count = 0;
		int sum = b;
		while (sum <= a) {
			sum += b;
			count++;
		}
		return count;
	}
}
