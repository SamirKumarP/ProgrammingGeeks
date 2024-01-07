package leetcode;

public class LinkedListReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		while (head != null) {
			ListNode next_node = head.next;
			head.next = prev;
			prev = head;
			head = next_node;
		}
		return prev;
	}
}
