package treeRelated;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(10);
		root.right = new TreeNode(15);
		root.left.left = new TreeNode(20);
		root.left.right = new TreeNode(25);
		root.right.left = new TreeNode(20);
		root.right.right = new TreeNode(35);
		root.left.right.right = new TreeNode(45);
		
		BFS a = new BFS();
		System.out.print("BFS :");
		a.bfs(root);
		System.out.println();
		
		DFS_Iterative b = new DFS_Iterative();
		System.out.print("DFS: ");
		b.DFS(root);
		System.out.println();
		
		DistanceBetweenTwoNodes c = new DistanceBetweenTwoNodes();
		TreeNode n1 = new TreeNode(15);
		TreeNode n2 = new TreeNode(45);
		int x = c.findDistance(root, n1, n2);
		System.out.println("Distance between " + n1.data + " & " + n2.data + " is " + x);
		
		ExistPathSum d = new ExistPathSum();
		System.out.println("Path with sum 40: ");
		d.hasPath(root, 40, new String());
		
		LCA e = new LCA();
		TreeNode eNode = e.getLCA(root, n1, n2);
		System.out.println("Common Ancestor: " + eNode.data);
		
		MaxInBinaryTree f = new MaxInBinaryTree();
		int max = f.getMax(root);
		System.out.println("Max node is: " + max);
		
		System.out.print("In-order Traversal: ");
		root.inOrderTraversal(root);
		System.out.println();
		
		System.out.print("Pre-Order Traversal: ");
		root.preOrderTraversal(root);
		System.out.println();
		
		System.out.print("Post-Order Traversal: ");
		root.postOrderTraversal(root);
		System.out.println();
		
		SumOfLeftLeaves g = new SumOfLeftLeaves();
		g.leftSum(root, null);
		System.out.println("Sum of left leaves: " + g.leftLeavesSum);

	}

}
