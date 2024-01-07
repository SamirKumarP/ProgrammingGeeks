package interview.Test;

/*
 * Implement an algorithm to find the nth to last element of a singly linked list. 
 */
public class NthToLast {
	
//	This takes O(N) time O(1) space
//	There are two iterations involved one for loop and while loop but they are not nested 
//	so N + N = 2N and since we always drop the constants the while evaluating Time complexity 
//	dropping 2 it comes down to O(N) complexity
	
	LinkedListNode nthToLast(LinkedListNode head, int n) {
		LinkedListNode p1 = head;
		LinkedListNode p2 = head;
		/*
		 * Move p1 n nodes into the list
		 */
		for (int i = 0; i < n; i++) {
			if (p1 == null) return null; // Out of bounds
			p1 = p1.next;
		}
		/*
		 * Move them at the same pace. When p1 hits the end, p2 will be at the right element.
		 */
		while (p1 != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
	}
	
	public static class LinkedListNode {
		
		public LinkedListNode next;
		public int data;
		public LinkedListNode(int d) {
			data = d;
		}
}

}
