package hackerrank.solutions.Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class CollectionFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> myArr = new ArrayList<String>();
		myArr.add("one");
		myArr.add("two");
		System.out.println(myArr.get(0)); // prints <one>
		
//		Synchronized ArrayList
		Vector<String> myVect = new Vector<String>();
		myVect.add("one");
		myVect.add("two");
		System.out.println(myVect.get(0));
		
		LinkedList<String> myLinkedlist = new LinkedList<String>();
		myLinkedlist.add("two");
		myLinkedlist.addFirst("one");
		Iterator<String> iter = myLinkedlist.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("one", "uno");
		map.put("two", "dos");
		System.out.println(map.get("one"));
	}

}
