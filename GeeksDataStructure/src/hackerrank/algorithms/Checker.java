package hackerrank.algorithms;

import java.util.Comparator;
// Write your Checker class here
public class Checker implements Comparator<Player> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

//	x.compareTo(y);
//	negative value: if x < y (x should appear first)
//	zero if x == y
//	positive value: if x > y (x should appear second)
	
	@Override
	public int compare(Player a, Player b) {
		if (a.score == b.score) {
//			use the names
			return a.name.compareTo(b.name);
		}
		/*
		 * if (a.score > b.score) { return -1; } else { return -1; }
		 */
		return b.score - a.score;
	}

}
