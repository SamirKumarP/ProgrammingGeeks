package hackerrank.solutions.bit;

public class ShiftOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int repeatedArithmeticShift(int x, int count) {
		for (int i = 0; i < count; i++) {
			x >>= 1; // Arithmetic shift by 1
		}
		return x;
	}
	
	int repeatedLogicalShift(int x, int count) {
		for (int i = 0; i < count; i++) {
			x >>>= 1; // Logical shift by 1
		}
		return x;
	}

}
