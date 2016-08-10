package leetcode;

public class LC236LowestCommonAncestor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode head =TreeNode.createBinarySearchTree();
		TreeNode.print(head);
		TreeNode lca =lowestCommonAncestor(head, head.right.right.right, head.right.left);
		System.out.println(lca.value);
	}

	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	    if(root == null || root == p || root == q) 
	    	return root;
	    TreeNode left = lowestCommonAncestor(root.left, p, q);
	    TreeNode right = lowestCommonAncestor(root.right, p, q);
	    if(left!=null&&right!=null) 
	    	return root;
	    return left == null ? right : left;
	}
}
