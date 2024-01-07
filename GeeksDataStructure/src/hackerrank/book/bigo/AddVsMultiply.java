package hackerrank.book.bigo;

public class AddVsMultiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
//	O(A + B)
	void addRuntime(int[] arrA, int[] arrB) {
		for (int a: arrA) {
			System.out.println(a);
		}
		for (int b: arrB) {
			System.out.println(b);
		}
	}
//	O(A * B)
	void multiplyRuntime(int[] arrA, int[] arrB) {
		for (int a : arrA) {
			for (int b : arrB) {
				System.out.println(a + "," + b);
			}
		}
	}

}
