package hackerrank.solutions.TreesAndGraphs;


import hackerrank.algorithms.Graph.Node;

public class DFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	void search(Node root) {
		if (root == null) return;
		System.out.println(root.id);
		root.visited = true;
		for (Node n : root.adjacent) {
			if (n.visited = false) {
				search(n);
			}
		}
	}

}
