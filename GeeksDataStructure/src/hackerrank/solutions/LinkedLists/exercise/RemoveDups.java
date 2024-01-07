package hackerrank.solutions.LinkedLists.exercise;

import java.util.HashSet;

import hackerrank.codelibrary.LinkedListNode;

// O(N) N is the number of elements in the linked list
public class RemoveDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	void deleteDups(LinkedListNode n) {
		HashSet<Integer> set = new HashSet<Integer>();
		LinkedListNode previous = null;
		while (n != null) {
			if (set.contains(n.data)) {
				previous.next = n.next;
			} else {
				set.add(n.data);
				previous = n;
			}
			n = n.next;
		}
	}
//	O(1) space O(N²) time
	
//	No Buffer Allowed
	void deleteDups2(LinkedListNode head) {
		LinkedListNode current = head;
		while (current != null) {
			/*
			 * Remove all future nodes that have the same value
			 */
			LinkedListNode runner = current;
			while (runner.next != null) {
				if (runner.next.data == current.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
	}

}
