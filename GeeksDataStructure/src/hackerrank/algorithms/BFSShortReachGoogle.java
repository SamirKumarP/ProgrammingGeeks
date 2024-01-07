package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class BFSShortReachGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static class Graph {
		
		
		List<List<Integer>> adjLst;
        int size;
		private static int EDGE_DISTANCE = 6;
		public Graph(int size) {
			adjLst = new ArrayList<>();
            this.size = size;
            while(size-- > 0)//Initialize the adjancency list.
                adjLst.add(new ArrayList<Integer>());
		}
		public void addEdge(int first, int second) {
			adjLst.get(first).add(second);
            adjLst.get(second).add(first); 
// 			For undirected graph, you gotta add edges from both sides.
		}
		public int[] shortestReach(int startId) { // 0 indexed
			LinkedList<Integer> queue = new LinkedList<Integer>();
			queue.add(startId); // Initialize queue
			int[] distances = new int[size];
			Arrays.fill(distances, -1); // O(n) space
			distances[startId] = 0;
			HashSet<Integer> seen = new HashSet<>(); // O(n) space
//			Could be further optimized. I leave it to you to optimize it.
			seen.add(startId);
			while(!queue.isEmpty()) { // Standard BFS loop.
				int node = queue.poll();
				for (int neighbor: adjLst.get(node)) {
					if (!seen.contains(node)) {
						queue.offer(node);
//						Right place to add the visited set.
						seen.add(node);
//			 			keep on increasing distance level by level.
						distances[neighbor] = distances[node] + EDGE_DISTANCE; 
					}
				}
			}
			return distances;
		}
	}

}
