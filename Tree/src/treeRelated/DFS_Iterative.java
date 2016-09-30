package treeRelated;

import java.util.*;

public class DFS_Iterative {
	
	public void DFS(TreeNode node) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.add(node);
		while(!stack.isEmpty()) {
			TreeNode x = stack.pop();
			if (x.right!=null) {
				stack.push(x.right);
			}
			if(x.left!=null) {
				stack.push(x.left);
			}
			System.out.print(" " + x.data);
		}
	}
}
