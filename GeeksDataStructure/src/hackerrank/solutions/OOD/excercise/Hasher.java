package hackerrank.solutions.OOD.excercise;

import java.util.ArrayList;
import java.util.LinkedList;

// O(1) may be?
public class Hasher<K, V> {
	/*
	 * Linked list node class. Used only within hash table. No one else should get
	 * access to this. Implemented as doubly linked list.
	 */
	private static class LinkedListNode<K, V> {
		public LinkedListNode<K, V> next;
		public LinkedListNode<K, V> prev;
		public K key;
		public V value;
		public LinkedListNode(K k, V v) {
			key = k;
			value = v;
		}
	}
	private ArrayList<LinkedListNode<K, V>> arr;
	public Hasher(int capacity) {
		/*
		 * Create list of linked lists at a particular size. Fill list with null
		 * values, as it's the only way to make array the desired size.
		 */
		arr = new ArrayList<LinkedListNode<K,V>>();
		arr.ensureCapacity(capacity); // Optimal optimization
		for (int i = 0; i < capacity; i++) {
			arr.add(null);
		}
	}
	/*
	 * Insert key and value into hash table.
	 */
	public void put(K key, V value) {
		LinkedListNode<K, V> node = getNodeForKey(key);
		if (node != null) { // Already there
			node.value = value; // just update the value.
			return;
		}
		node = new LinkedListNode<K, V>(key, value);
		int index = getIndexForKey(key);
		if (arr.get(index) != null) {
			node.next = arr.get(index);
			node.next.prev = node;
		}
		arr.set(index, node);
	}
	/*
	 * 
	 */
	public void remove(K key) {
		LinkedListNode<K, V> node = getNodeForKey(key);
		if (node.prev != null) {
			node.prev.next = node.next;
		} else {
			/*
			 * Removing head - update.
			 */
			int hashKey = getIndexForKey(key);
			arr.set(hashKey, node.next);
		}
		if (node.next != null) {
			node.next.prev = node.prev;
		}
	}
	/*
	 * Get value for key.
	 */
	public V get(K key) {
		LinkedListNode<K, V> node = getNodeForKey(key);
		return node == null ? null : node.value;
	}
	/*
	 * Get linked list node associated with a given key.
	 */
	private LinkedListNode<K, V> getNodeForKey(K key) {
		int index = getIndexForKey(key);
		LinkedListNode<K, V> current = 	arr.get(index);
		while (current != null) {
			if (current.key == key) {
				return current;
			}
			current = current.next;
		}
		return null;
	}
	/*
	 * Really naive function to map a key to an index.
	 */
	private int getIndexForKey(K key) {
		return Math.abs(key.hashCode() % arr.size());
	}
	
//	class Hash<K, V> {
//		LinkedList<V>[] items;
//		public void put(K key, V value) {
//			
//		}
//		public V get(K key) {
//			return null; // TBD
//			
//		}
//		int hashCodeOfKey(K key) {
//			return key.toString().length() % items.length;
//		}
//	}

}
