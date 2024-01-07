package hackerrank.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class BFSShortReach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static class Graph {
		private HashMap<Integer, Node> nodeLookUp = new HashMap<Integer, Node>();
		private Node[] nodes;
		private static int EDGE_DISTANCE = 6;
		public Graph(int size) {
			
		}
		private class Node {
//			 TBD
//			public int[] neighbors;
			public Node(int id) {
				this.id = id;
			}
//			public boolean visited;
			public int id;
			public LinkedList<Node> adjacent = new LinkedList<Node>();
			HashSet<Integer> neighbors = new HashSet<Integer>();
		}
//		TBD
		private Node getNode(int id) {
			return nodeLookUp.get(id); 
		}
		public void addEdge(int first, int second) {
			Node s = getNode(first);
			Node d = getNode(second);
			s.adjacent.add(d);
		}
		public int[] shortestReach(int startId) {
			LinkedList<Integer> queue = new LinkedList<Integer>();
			queue.add(startId);
			int[] distances = new int[nodes.length];
			Arrays.fill(distances, -1);
			distances[startId] = 0;
			while(!queue.isEmpty()) {
				int node = queue.poll();
				for (int neighbor: nodes[node].neighbors) {
					if (distances[neighbor] == -1) {
						distances[neighbor] = distances[node] + EDGE_DISTANCE;
						queue.add(neighbor);
					}
				}
			}
			return distances;
		}
	}

}
