package hackerrank.solutions.moderate;

import java.util.HashSet;

public class DivingBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
//	O(2 ^ k)
	HashSet<Integer> allLengths(int k, int shorter, int longer) {
		HashSet<Integer> lengths = new HashSet<Integer>();
		getAllLengths(k, 0, shorter, longer, lengths);
		return lengths;
	}

	void getAllLengths(int k, int total, int shorter, int longer,
			HashSet<Integer> lengths) {
		if (k == 0) {
			lengths.add(total);
			return;
		}
		getAllLengths(k - 1, total + shorter, shorter, longer, lengths);
		getAllLengths(k - 1, total + longer, shorter, longer, lengths);
	}
	
	
//	O(K ^ 2 ) to O(K ^ 2 * LONGER)
	HashSet<Integer> allLengthsMemo(int k, int shorter, int longer) {
		HashSet<Integer> lengths = new HashSet<Integer>();
		HashSet<String> visited = new HashSet<String>();
		getAllLengths(k, 0, shorter, longer, lengths, visited);
		return lengths;
	}

	void getAllLengths(int k, int total, int shorter, int longer, HashSet<Integer> lengths,
			HashSet<String> visited) {
		if (k == 0) {
			lengths.add(total);
			return;
		}
		String key = k + " " + total;
		if (visited.contains(key)) {
			return;
		}
		getAllLengths(k - 1, total + shorter, shorter, longer, lengths, visited);
		getAllLengths(k - 1, total + longer, shorter, longer, lengths, visited);
		visited.add(key);
	}
	
	HashSet<Integer> allLengthsOptimal(int k, int shorter, int longer) {
		HashSet<Integer> lengths = new HashSet<Integer>();
		for (int nShorter = 0; nShorter <= k; nShorter++) {
			int nLonger = k - nShorter;
			int length = nShorter * shorter + nLonger * longer;
			lengths.add(length);
		}
		return lengths;
	}

	
}
