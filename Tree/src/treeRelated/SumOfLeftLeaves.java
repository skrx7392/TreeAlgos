package treeRelated;

public class SumOfLeftLeaves {
	
	public int leftLeavesSum = 0;
	
	public void leftSum(TreeNode root, TreeNode parent) {
		if(root!=null) {
			leftSum(root.left, root);
			if(root.left==null && root.right==null && parent.left==root) {
				leftLeavesSum += root.data;
			}
			leftSum(root.right, root);
		}
	}
}
