package hackerrank.datastructures;

import java.util.EmptyStackException;

public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static class Node {
//		Additional two nodes for other class
		public Node below;
		public Node above;
		public int data;
//		private int data; // change for another class to be reverted
		public Node next;
//		private Node next; // change for another class to be reverted
//		private Node(int data) { // change for another class to be reverted
		public Node(int data) {
			this.data = data;
		}
	}
	
	private Node top;
	public boolean isEmpty() {
		return top == null;
	}
	public int peek() {
		if (top == null) throw new EmptyStackException();
		return top.data;
	}
	public void push(int data) {
		Node node = new Node(data);
		node.next = top;
		top = node;
	}
	public int pop() {
		if (top == null) throw new EmptyStackException();
		int data = top.data;
		top = top.next;
		return data;
	}

}
