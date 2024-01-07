package hackerrank.solutions.LinkedLists.exercise;

import hackerrank.codelibrary.LinkedListNode;

public class DeleteBetweenNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	boolean deleteNode(LinkedListNode n) {
		if (n == null || n.next == null) {
			return false; // Failure
		}
		LinkedListNode next = n.next;
		n.data = next.data;
		n.next = next.next;
		return true;
	}

}
