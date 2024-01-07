package javabrains.leetcode;

public class PowerOfFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isPowerOfFour(int num) {
		return Math.log(num) / Math.log(4) % 1 == 0;
	}

}
