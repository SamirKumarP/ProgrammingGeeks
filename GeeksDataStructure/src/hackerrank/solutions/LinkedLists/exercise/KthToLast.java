package hackerrank.solutions.LinkedLists.exercise;

import hackerrank.codelibrary.LinkedListNode;

public class KthToLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
//	Recursive (stack my guess) O(n) space, n is number of elements
//	Don't Return the Element
	int printKthToLastRecursive(LinkedListNode head, int k) {
		if (head == null) {
			return 0;
		}
		int index = printKthToLastRecursive(head.next, k) + 1;
		if (index == k) {
			System.out.println(k + "th to last node is " + head.data);
		}
		return index;
	}
	
	class Index {
		public int value = 0;
	}
	LinkedListNode kthToLast(LinkedListNode head, int k) {
		Index idx = new Index();
		return kthToLast(head, k, idx);
	}

	LinkedListNode kthToLast(LinkedListNode head, int k, Index idx) {
		if (head == null) {
			return null;
		}
		LinkedListNode node = kthToLast(head.next, k, idx);
		idx.value = idx.value + 1;
		if (idx.value == k) {
			return head;
		}
		return node;
	}
	
//	O(N) time O(1) space
	LinkedListNode nthToLastIterative(LinkedListNode head, int k) {
		LinkedListNode p1 = head;
		LinkedListNode p2 = head;
		/*
		 * Move p1 k nodes into the list
		 */
		for (int i = 0; i < k; i++) {
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

}
