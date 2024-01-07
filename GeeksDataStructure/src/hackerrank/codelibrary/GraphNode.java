package hackerrank.codelibrary;

import java.util.ArrayList;
import java.util.HashMap;

public class GraphNode {
	private ArrayList<GraphNode> neighbours;
	private HashMap<String, GraphNode> map;
	private String name;
	private int frequency;
	private boolean visited = false;
	
	public GraphNode(String nm, int freq) {
		name = nm;
		frequency = freq;
		neighbours = new ArrayList<GraphNode>();
		map = new HashMap<String, GraphNode>();
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean v) {
		visited = v;
	}

	public String getName() {
		return name;
	}

	public int getFrequency() {
		return frequency;
	}
	
	public boolean addNeighbour(GraphNode node) {
		if (map.containsKey(node.getName())) {
			return false;
		}
		neighbours.add(node);
		map.put(node.getName(), node);
		return true;
	}

}
