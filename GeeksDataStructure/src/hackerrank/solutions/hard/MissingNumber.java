package hackerrank.solutions.hard;

import java.util.ArrayList;

public class MissingNumber {
	
	
	int findMissing(ArrayList<BitInteger> array) {
		/*
		 * Start from the least significant bit, and 
		 */
		return findMissing(array, 0);
	}
	
	int findMissing(ArrayList<BitInteger> input, int column) {
		if (column >= BitInteger.INTEGER_SIZE) { // We're done!
			return 0;
		}
		ArrayList<BitInteger> oneBits = new ArrayList<BitInteger>(input.size()/2);
		ArrayList<BitInteger> zeroBits = new ArrayList<BitInteger>(input.size()/2);
		for (BitInteger t : input) {
			if (t.fetch(column) == 0) {
				zeroBits.add(t);
			} else {
				oneBits.add(t);
			}
		}
		if (zeroBits.size() <= oneBits.size()) {
			int v = findMissing(zeroBits, column + 1);
			return (v << 1) | 0;
		} else {
			int v = findMissing(oneBits, column + 1);
			return (v << 1) | 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
