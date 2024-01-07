package hackerrank.datastructures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;

public class HeapMedian {

	public static void main(String[] args) {
		int[] array = {10, 15, 3, 5, 25, 20, 7};
		System.out.println(Arrays.toString(getMedians(array)));

	}
	
	public static double[] getMedians(int[] array) {
//		max heap
//		change comparison to put biggest elements on top
		PriorityQueue<Integer> lowers = new PriorityQueue<Integer>(new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return -1 * a.compareTo(b);
			}
		});
//		min heap
		PriorityQueue<Integer> highers = new PriorityQueue<Integer>();
		double[] medians = new double[array.length];
		for (int i = 0; i < array.length; i++) {
			int number = array[i];
			addNumber(number, lowers, highers);
			rebalance(lowers, highers);
			medians[i] = getMedian(lowers, highers);
		}
		return medians;
	}

	private static double getMedian(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
		PriorityQueue<Integer> biggerHeap = lowers.size() > highers.size() ? lowers	: highers;
		PriorityQueue<Integer> smallerHeap = lowers.size() > highers.size() ? highers : lowers;
//		if different sizes pull top element from larger heap 
//		if small size average their tops
		if (biggerHeap.size() == smallerHeap.size()) {
			return ((double)biggerHeap.peek() + smallerHeap.peek()) / 2;
		} else {
			return biggerHeap.peek();
		}
	}

	private static void rebalance(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
		PriorityQueue<Integer> biggerHeap = lowers.size() > highers.size() ? lowers	: highers;
		PriorityQueue<Integer> smallerHeap = lowers.size() > highers.size() ? highers : lowers;
		if (biggerHeap.size() - smallerHeap.size() >= 2) {
//			lower's max or higher's min
			smallerHeap.add(biggerHeap.poll());
		}
	}

	private static void addNumber(int number, PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
		if (lowers.size() == 0 || number < lowers.peek()) {
			lowers.add(number);
		} else {
			highers.add(number);
		}
		
	}

}
