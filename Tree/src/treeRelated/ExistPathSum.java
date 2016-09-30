package treeRelated;

public class ExistPathSum {
	
	String path;
	public void hasPath(TreeNode n, int sum, String path) {
		if(n!=null) {
			if(n.data>sum) {
				return;
			}
			else {
				path+=" " + n.data;
				sum = sum-n.data;
				if(sum==0) {
					System.out.println(path);
				}
				hasPath(n.left, sum, path);
				hasPath(n.right, sum, path);
			}
		}
	}

}
