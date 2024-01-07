package hackerrank.datastructures;

import java.util.NoSuchElementException;

public class MyQueue<T> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static class QueueNode<T> {
		private T data;
		private QueueNode<T> next;
		private QueueNode(T data) {
			this.data = data;
		}
	}
	private QueueNode<T> head; // remove from the head
	private QueueNode<T> tail; // add things here
	public boolean isEmpty() {
		return head == null;
	}
	public T peek() {
		if (head == null) throw new NoSuchElementException();
		return head.data;
	}
	public void add(T data) {
		QueueNode<T> node = new QueueNode<T>(data);
		if (tail!= null) {
			tail.next = node;
		}
		tail = node;
		if (head == null) {
			head = node;
		}
	}
	public T remove() {
		if (head == null) throw new NoSuchElementException();
		T data = head.data;
		head = head.next;
		if (head == null) {
			tail = null;
		}
		return data;
	}

}
