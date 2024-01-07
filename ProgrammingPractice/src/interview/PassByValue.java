package interview;

public class PassByValue {

	public static void main(String[] args) {
		Integer x = 20;
		int[] array = {1, 2, 3};
		passByValue(x, array);
		System.out.println(x);
		System.out.println(array[1]);

	}

	private static void passByValue(Integer x, int[] array) {
		x = 25;
		array[1] = 22;
	}

}
