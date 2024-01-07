package hackerrank.solutions.StacksNQueues.exercise;

import java.util.EmptyStackException;

public class FixedMultiStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private int numberOfStacks = 3;
	private int stackCapacity;
	private int[] values;
	private int[] sizes;
	public FixedMultiStack(int stackSize) {
		stackCapacity = stackSize;
		values = new int[stackSize * numberOfStacks];
		sizes = new int[numberOfStacks];
	}
	/*
	 * Push value onto stack.
	 */
	public void push(int stackNum, int value) throws FullStackException {
		/*
		 * Check that we have space for the next element
		 */
		if (isFull(stackNum)) {
			throw new FullStackException();
		}
		
		/*
		 * Increment stack pointer and then update top value.
		 */
		sizes[stackNum]++;
		values[indexOfTop(stackNum)] = value;
	}
	
	/*
	 * Returns index of the top if the stack.
	 */
	int indexOfTop(int stackNum) {
		// TODO Auto-generated method stub
		return 0;
	}
	/*
	 * Pop item from stack.
	 */
	public int pop(int stackNum) {
		if (isEmpty(stackNum)) {
			throw new EmptyStackException();
		}
		int topIndex = indexOfTop(stackNum);
		int value = values[topIndex]; // Get top
		values[topIndex] = 0; // Clear
		sizes[stackNum]--; // Shrink
		return value;
	}
	
	/*
	 * Return top element.
	 */
	public int peek(int stackNum) {
		if (isEmpty(stackNum)) {
			throw new EmptyStackException();
		}
		return values[indexOfTop(stackNum)];
	}
	
	/*
	 * Return if stack is empty.
	 */
	public boolean isEmpty(int stackNum) {
		return sizes[stackNum] == 0;
	}
	/*
	 * Return if stack is full.
	 */
	public boolean isFull(int stackNum) {
		return sizes[stackNum] == 0;
	}
	
	class FullStackException extends RuntimeException{

		/**
		 * 
		 */
		private static final long serialVersionUID = 3744609007184028961L;
		public FullStackException() {
			
		}
		
	}

}
