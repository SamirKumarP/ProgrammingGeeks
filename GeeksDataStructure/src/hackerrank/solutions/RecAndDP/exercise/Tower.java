package hackerrank.solutions.RecAndDP.exercise;

import java.util.Stack;

public class Tower {

	public static void main(String[] args) {
		int n = 3;
		Tower[] towers = new Tower[n];
		for (int i = 0; i < 3; i++) {
			towers[i] = new Tower(i);
		}
		for (int i = n - 1; i >= 0; i--) {
			towers[0].add(i);
		}
		towers[0].moveDisks(n, towers[2], towers[1]);
	}
	
	private Stack<Integer> disks;
	private int index;
	public Tower(int i) {
		disks = new Stack<Integer>();
		index = i;
	}
	public int index() {
		return index;
	}
	public void add(int d) {
		if (!disks.isEmpty() && disks.peek() <= d) {
			System.out.println("Error placing disk " + d);
		} else {
			disks.push(d);
		}
	}
	public void moveTopTo(Tower t) {
		int top = disks.pop();
		t.add(top);
	}
	public void moveDisks(int n, Tower destination, Tower buffer) {
		if (n > 0) {
			moveDisks(n - 1, buffer, destination);
			moveTopTo(destination);
			buffer.moveDisks(n - 1, destination, this);
		}
	}
	
//	Pseudocode
//	moveDisks(int n, Tower origin, Tower destination, Tower buffer) {
//		/*
//		 * Base case
//		 */
//		if (n < 0) return;
//		/*
//		 * move top n - 1 disks from origin to buffer, using destination as a buffer.
//		 */
//		moveDisks(n - 1, origin, buffer, destination);
//		/*
//		 * move top from origin to destination
//		 */
//		moveTop(origin, destination);
//		/*
//		 * move top n - 1 disks from buffer to destination, using origin as a buffer.
//		 */
//		moveDisks(n - 1, buffer, destination, origin);
//	}

}
