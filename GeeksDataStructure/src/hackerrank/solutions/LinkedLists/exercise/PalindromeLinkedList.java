package hackerrank.solutions.LinkedLists.exercise;

import java.util.Stack;

import hackerrank.codelibrary.LinkedListNode;

public class PalindromeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	boolean isPalindrome(LinkedListNode head) {
		LinkedListNode reversed = reverseAndClone(head);
		return isEqual(head, reversed);
	}

	LinkedListNode reverseAndClone(LinkedListNode node) {
		LinkedListNode head = null;
		while (node!=null) {
			LinkedListNode n = new LinkedListNode(node.data); // Clone
			n.next = head;
			head = n;
			node = node.next;
		}
		return head;
	}
	
	boolean isEqual(LinkedListNode one, LinkedListNode two) {
		while (one != null && two != null) {
			if (one.data != two.data) {
				return false;
			}
			one = one.next;
			two = two.next;
		}
		return one == null && two == null;
	}
	
	// Iterative Approach
	boolean isPalindromeIterative(LinkedListNode head) {
		LinkedListNode fast = head;
		LinkedListNode slow = head;
		Stack<Integer> stack = new Stack<Integer>();
		/*
		 * Push elements from first half of linked list onto stack. When fast runner
		 * (which is moving at 2x speed) reaches the end of the linked list, then we
		 * know we're at the middle
		 */
		while (fast != null && fast.next != null) {
			stack.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		/*
		 * Has odd number of elements, so skip the middle element
		 */
		if (fast != null) {
			slow = slow.next;	
		}
		while (slow != null) {
			int top = stack.pop().intValue();
			/*
			 * If value are different, then it's not a palindrome
			 */
			if (top != slow.data) {
				return false;
			}
			slow = slow.next;
		}
		return true;
	}
	
//	recurse(Node n, int length) {
//		if (length == 0 || length == 1) {
//			return [something]; // At middle
//		}
//		recurse(n.next, length - 2)
//	}
	
	class Result {
		public LinkedListNode node;
		public boolean result;
		public Result(LinkedListNode node, boolean result) {
			this.node = node;
			this.result = result;
		}
	}
	
//	Recursive
	boolean isPalindromeRecursive(LinkedListNode head) {
		int length = lengthOfList(head);
		Result p = isPalindromeRecurse(head, length);
		return p.result;
	}

	Result isPalindromeRecurse(LinkedListNode head, int length) {
		if (head == null || length <= 0) { // Even number of node
			return new Result(head.next, true);
		} else if (length == 1) { // Odd number of nodes
			return new Result(head.next, true);
		}
		/*
		 * Recurse on sublist.
		 */
		Result res = isPalindromeRecurse(head.next, length - 2);
		/*
		 * If child calls are not a palindrome, pass back up
		 *  a failure.
		 */
		if (!res.result || res.node == null) {
			return res;
		}
		/*
		 * Check if matches corresponding node on other side.
		 */
		res.result = (head.data == res.node.data);
		/*
		 * Return corresponding node.
		 */
		res.node = res.node.next;
		return res;
	}

	int lengthOfList(LinkedListNode n) {
		int size = 0;
		while (n != null) {
			size++;
			n = n.next;
		}
		return size;
	}

}
