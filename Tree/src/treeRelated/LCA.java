package treeRelated;

public class LCA {
	
	public TreeNode getLCA(TreeNode node, TreeNode n1, TreeNode n2) {
		if(node==null) {
			return null;
		}
		else {
			if(node.data==n1.data || node.data==n2.data) {
				return node;
			}
			TreeNode left = getLCA(node.left, n1, n2);
			TreeNode right = getLCA(node.right, n1, n2);
			
			if(left!=null) {
				if(right!=null) {
					return node;
				}
				else 
					return left;
			}
			else if(right!=null){
				return right;
			}
			return null;
		}
	}

}
