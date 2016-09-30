package treeRelated;

public class TreeToSumTree {
	
	///Display using inorder traversal
	public int SumTree(TreeNode root) {
		if(root!=null) {
			int left = SumTree(root.left);
			int right = SumTree(root.right);
			int retData = root.data + left + right;
			root.data = left+right;
			return retData;
		}
		return 0;
	}

}
