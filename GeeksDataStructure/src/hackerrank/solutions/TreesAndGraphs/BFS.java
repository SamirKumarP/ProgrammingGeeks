package hackerrank.solutions.TreesAndGraphs;

import hackerrank.algorithms.Graph.Node;
import hackerrank.datastructures.Queue;

public class BFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	void search(Node root) {
		Queue queue = new Queue(); 
		root.visited = true;
		queue.add(root.id); // enqueue Add to the end of the queue
		while(!queue.isEmpty()) {
			Node r = new Node(queue.remove()); // dequeue Remove from the front of the queue
			System.out.println(r.id);
			for (Node n : root.adjacent) {
				if (n.visited == false) {
					n.visited = true;
					queue.add(root.id);
				}
			}
		}
	}

}
