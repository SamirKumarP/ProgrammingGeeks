package hackerrank.solutions.TreesAndGraphs;

import hackerrank.codelibrary.TreeNode;

public class BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	void inOrderTraversal(TreeNode node) {
		if (node != null) {
			inOrderTraversal(node.left);
			System.out.println(node.data);
			inOrderTraversal(node.right);
		}
	}
	
	void preOrderTraversal(TreeNode node) {
		if (node != null) {
			System.out.println(node.data);
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
	}
	
	void postOrderTraversal(TreeNode node) {
		if (node != null) {
			postOrderTraversal(node.left);
			postOrderTraversal(node.right);
			System.out.println(node.data);
		}
	}

}
