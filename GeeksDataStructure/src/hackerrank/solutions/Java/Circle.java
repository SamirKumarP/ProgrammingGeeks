package hackerrank.solutions.Java;

public class Circle extends Shape {
	private double rad = 5;
	public void printMe() {
		System.out.println("I am a circle.");
	}

	public Circle() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public double computeArea() {
		return rad * rad * 3.15;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
