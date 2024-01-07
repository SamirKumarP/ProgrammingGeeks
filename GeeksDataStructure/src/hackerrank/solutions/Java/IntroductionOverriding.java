package hackerrank.solutions.Java;

public class IntroductionOverriding {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		Circle circle = new Circle();
		Ambigious ambigious = new Ambigious();
		shapes[0] = circle;
		shapes[1] = ambigious;
		for (Shape s: shapes) {
			s.printMe();
			System.out.println(s.computeArea());
		}

	}

}
