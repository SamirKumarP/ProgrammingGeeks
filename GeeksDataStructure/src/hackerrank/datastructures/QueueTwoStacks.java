package hackerrank.datastructures;

import java.util.Stack;

public class QueueTwoStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static class MyQueue<T> {
		private java.util.Stack<T> stackNewestOnTop = new Stack<T>();
		private java.util.Stack<T> stackOldestOnTop = new Stack<T>();
		
		public void enqueue(T value) { // Add item
			stackNewestOnTop.push(value);
		}
		public T peek() { // Get "oldest" item
//			move elements from stackNewest to stackOldest
			shiftStacks();
			return stackOldestOnTop.peek();
		}
		public T dequeue() { // Get "oldest" item and remove it
//			move elements from stackNewest to stackOldest
			shiftStacks();
			return stackOldestOnTop.pop();
		}
		private void shiftStacks() {
			if (stackOldestOnTop.isEmpty()) {
				while (!stackNewestOnTop.isEmpty()) {
					stackOldestOnTop.push(stackNewestOnTop.pop());
				}
			}
			
		}
	}

}
