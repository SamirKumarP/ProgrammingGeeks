package hackerrank.solutions.hard;

public class AddNoPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int addRecursively(int a, int b) {
		if (b == 0) return a;
		int sum = a ^ b; // add without carrying
		int carry = (a & b) << 1; // carry, but don't add
		return addRecursively(sum, carry); // recurse with sum + carry
	}
	
	int addIteratively(int a, int b) {
		while (b != 0) {
			int sum = a ^ b; // add without carrying
			int carry = (a & b) << 1; // carry, but don't add
			a = sum;
			b = carry;
		}
		return a;
	}

}
