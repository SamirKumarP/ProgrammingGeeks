package hackerrank.solutions.SysDesAndScale.exercise;

import java.util.HashMap;

public class Cache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int MAX_SIZE = 10;
	public Node head, tail;
	public HashMap<String, Node> map;
	public int size = 0;
	public Cache() {
		map = new HashMap<String, Node>();
	}
	/*
	 * Moves node to the front of linked list
	 */
	public void moveToFront(Node node) {
		
	}
	public void moveToFront(String query) {
		
	}
	/*
	 * Removes node from linked list
	 */
	public void removeFromLinkedList(Node node) {
		
	}
	/*
	 * Get results from cache, and updates linked list
	 */
	public String[] getResults(String query) {
		if (!map.containsKey(query)) return null;
		Node node = map.get(query);
		moveToFront(node); // update freshness
		return node.results;
	}
	/*
	 * Inserts results into linked list and hash
	 */
	public void insertResults(String query, String[] results) {
		if (map.containsKey(query)) { // update values
			Node node = map.get(query);
			node.results = results;
			moveToFront(node); // update freshness
			return;
		}
		Node node= new Node(query, results);
		moveToFront(node);
		map.put(query, node);
		if (size > MAX_SIZE) {
			map.remove(tail.query);
			removeFromLinkedList(tail);
		}
		
	}
	
	class Node {

		public Node(String query2, String[] results2) {
			// TODO Auto-generated constructor stub
		}
		public Object query;
		public String[] results;
		
	}
	
}
