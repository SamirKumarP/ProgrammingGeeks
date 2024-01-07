package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CapitalOne {

	public static void main(String[] args) {
		Integer[] array = {1, 2, 3, 4, 7, 8, 9, 10};
		List<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(array));
		LinkedList<Integer> linkedList = new LinkedList<>(arrayList);
		linkedList.addFirst(0);
		linkedList.addLast(11);
		linkedList.remove();
		linkedList.removeFirst();
		System.out.println(linkedList);
	}

}
