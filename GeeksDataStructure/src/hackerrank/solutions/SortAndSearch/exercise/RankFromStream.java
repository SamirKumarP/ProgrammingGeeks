package hackerrank.solutions.SortAndSearch.exercise;


public class RankFromStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/*
	 * int getRank(Node node, int x) { if x is node.data, return node.leftSize() if
	 * x is left of node, return getRank(node.left, x) if x is on right of node,
	 * return node.leftSize() + 1 + getRank(node.right, x) }
	 */
	
	RankNode root = null;
//	O(log N) balanced tree, O(N) unbalanced tree
	void track(int number) {
		if (root == null) {
			root = new RankNode(number);
		} else {
			root.insert(number);
		}
	}
	
//	O(log N) balanced tree, O(N) unbalanced tree
	int getRankOfNumber(int number) {
		return root.getRank(number);
	}

}
