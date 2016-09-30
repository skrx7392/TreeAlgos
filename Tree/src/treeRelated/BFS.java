package treeRelated;

import java.util.*;

public class BFS {
	public void bfs (TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		if(root == null) {
			return;
		}
		q.add(root);
		while(!q.isEmpty()) {
			TreeNode n = q.remove();
			System.out.print(" "+ n.data);
			if(n.left!=null) {
				q.add(n.left);
			}
			if(n.right!=null) {
				q.add(n.right);
			}
		}
	}
}
