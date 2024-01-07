package geeksforgeeks.interview;

import java.util.LinkedList;
import java.util.List;

public class ReverseTree {

	public static void main(String[] args) {
		TreeNode leaf1 = new TreeNode(1);
	    TreeNode leaf2 = new TreeNode(3);
	    TreeNode leaf3 = new TreeNode(6);
	    TreeNode leaf4 = new TreeNode(9);

	    TreeNode nodeRight = new TreeNode(7, leaf3, leaf4);
	    TreeNode nodeLeft = new TreeNode(2, leaf1, leaf2);

	    TreeNode root = new TreeNode(4, nodeLeft, nodeRight);
	}
	
/**
 * 
 * @param rootNode
 */
	public void reverseRecursive(TreeNode treeNode) {
	    if(treeNode == null) {
	        return;
	    }

	    TreeNode temp = treeNode.getLeftChild();
	    treeNode.setLeftChild(treeNode.getRightChild());
	    treeNode.setRightChild(temp);

	    reverseRecursive(treeNode.getLeftChild());
	    reverseRecursive(treeNode.getRightChild());
	}
	
	public void reverseIterative(TreeNode treeNode) {
		LinkedList<TreeNode> queue = new LinkedList<>();

	    if(treeNode != null) {
	        queue.add(treeNode);
	    }

	    while(!queue.isEmpty()) {
	        TreeNode node = queue.poll();
	        if(node.getLeftChild() != null){
	            queue.add(node.getLeftChild());
	        }
	        if(node.getRightChild() != null){
	            queue.add(node.getRightChild());
	        }

	        TreeNode temp = node.getLeftChild();
	        node.setLeftChild(node.getRightChild());
	        node.setRightChild(temp);
	    }
	}

}
