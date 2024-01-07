package hackerrank.solutions.TreesAndGraphs.exercise;

import java.util.ArrayList;
import java.util.LinkedList;

import hackerrank.codelibrary.TreeNode;

// Both O(N)
public class ListOfDepths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
//	Space O(N) + O(log N)(extra for recursive stack) = almost O(N)
//	DFS
	void createLevelLinkedList(TreeNode root, ArrayList<LinkedList<TreeNode>> lists,
			int level) {
		if (root == null) return; // base case
		LinkedList<TreeNode> list = null;
		if (lists.size() == level) { // Level not contained in list
			list = new LinkedList<TreeNode>();
			/*
			 * Levels are always traversed in order. So, if this is the first time we've
			 * visited level i, we must have seen levels 0 through i - 1. We can
			 * therefore safely add the level at the end.
			 */
			lists.add(list);
		} else {
			list = lists.get(level);
		}
		list.add(root);
		createLevelLinkedList(root.left, lists, level + 1);
		createLevelLinkedList(root.right, lists, level + 1);
	}
	
	ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root) {
		ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();
		createLevelLinkedList(root, lists, 0);
		return lists;
	}
	
//	O(N) space
//	BFS
	ArrayList<LinkedList<TreeNode>> createLevelLinkedListBFS(TreeNode root) {
		ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
		/*
		 * "Visit" the root
		 */
		LinkedList<TreeNode> current = new LinkedList<TreeNode>();
		if (root != null) {
			current.add(root);
		}
		while (current.size() > 0) {
			result.add(current); // Add previous level
			LinkedList<TreeNode> parents = current; // Go to next level
			current = new LinkedList<TreeNode>();
			for (TreeNode parent : parents) {
				/*
				 * Visit the children
				 */
				if (parent.left != null) {
					current.add(parent.left);
				}
				if (parent.right != null) {
					current.add(parent.right);
				}
			}
			
		}
		return result;
	}
	
	

}
