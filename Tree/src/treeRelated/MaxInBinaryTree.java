package treeRelated;

public class MaxInBinaryTree {
	
	public int getMax(TreeNode node) {
		if(node!=null) {
			return Math.max(node.data, Math.max(getMax(node.left), getMax(node.right)));
		}
		return 0;
	}

}
