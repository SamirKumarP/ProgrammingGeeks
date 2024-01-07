package javabrains.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private final int MAX_VALUE = 1000000;
	private final int ARRAY_SIZE = 100;
	private List<List<Integer>> parentList;
	public MyHashSet() {
		parentList = new ArrayList<>(ARRAY_SIZE);
		for (int i = 0; i < ARRAY_SIZE; i++) {
			parentList.add(null);
		}
	}
	
	public void add(int key) {
		int index = key % ARRAY_SIZE;
		List<Integer> childList = parentList.get(index);
		if (childList == null) {
			List<Integer> list = new LinkedList<>();
			list.add(key);
			parentList.set(index, list);
		}
	}
	
	public void remove(int key) {
		int index = key % ARRAY_SIZE;
		List<Integer> childList = parentList.get(index);
		if (childList != null) {
			childList.remove(Integer.valueOf(key));
		}
	}
	
	public boolean contains(int key) {
		int index = key % ARRAY_SIZE;
		List<Integer> childList = parentList.get(index);
		return childList != null && childList.contains(key);
	}
	
}
