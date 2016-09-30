package treeRelated;

public class TreeNode {
	public int data;
	public TreeNode left, right, parent;
	private int size=0;
	
	public TreeNode(int d) {
		data=d;
		size=1;
	}
	
	public void insertInOrder(int d) {
		if(d<=data) {
			if(left==null) {
				setLeftChild(new TreeNode(d));
			}
			else {
				left.insertInOrder(d);
			}
		}
		else {
			if(right==null) {
				setRightChild(new TreeNode(d));
			}
			else {
				right.insertInOrder(d);
			}
		}
		size++;
	}
	
	public int size() {
		return size;
	}
	
	public TreeNode find(int d) {
		if(d==data) {
			return this;
		}
		else if(d<=data) {
			return left != null ? left.find(d) : null;
		}
		else if(d>data) {
			return right!=null ? right.find(d) : null;
		}
		return null;
	}
	
	public void setLeftChild(TreeNode left) {
		this.left = left;
		if(left!=null) {
			left.parent = this;
		}
	}
	
	public void setRightChild(TreeNode right) {
		this.right = right;
		if(right!=null) {
			right.parent = this;
		}
	}
	
	public void inOrderTraversal(TreeNode node) {
		if(node!=null) {
			inOrderTraversal(node.left);
			System.out.print(" " + node.data);
			inOrderTraversal(node.right);
		}
	}
	
	public void preOrderTraversal(TreeNode node) {
		if(node!=null) {
			System.out.print(" " + node.data);
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
	}
	
	public void postOrderTraversal(TreeNode node) {
		if(node!=null) {
			postOrderTraversal(node.left);
			postOrderTraversal(node.right);
			System.out.print(" " + node.data);
		}
	}
}
