package hackerrank.datastructures;

public class BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class Node {
		int data;
		Node left;
		Node right;
	}
	
	boolean checkBST(Node root, int min, int max) { /* inclusive ranges */
		if (root == null) {
			return true;
		}
		if (root.data < min || root.data > max) {
			return false;
		}
		return checkBST(root.left, min, root.data - 1) && checkBST(root.right, root.data + 1, max);
	}
	boolean checkBST(Node root) {
		return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

}
