package geeksforgeeks.interview;

public class TreeNode {

	private int value;
    private TreeNode rightChild;
    private TreeNode leftChild;
 // Getters and setters
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public TreeNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}
	public TreeNode(int value) {
		super();
		this.value = value;
	}
	public TreeNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}
	public TreeNode(int value, TreeNode rightChild, TreeNode leftChild) {
		super();
		this.value = value;
		this.rightChild = rightChild;
		this.leftChild = leftChild;
	}
    
}
