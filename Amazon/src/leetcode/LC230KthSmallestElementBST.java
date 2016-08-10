package leetcode;

public class LC230KthSmallestElementBST {

	public static void main(String[] args) {
		TreeNode root = TreeNode.createBinarySearchTree();
		TreeNode.print(root);
	    System.out.println(kthSmallest(root, 3));
	}

	public static int kthSmallest(TreeNode root, int k) {
        int count = countNodes(root.left)+1;
        if(k==count) return root.value;
        if(k<count) return kthSmallest(root.left,k);
        else return kthSmallest(root.right,k-count);
    }
	
    public static int countNodes(TreeNode node){
        if(node==null) return 0;
        return 1+countNodes(node.left)+countNodes(node.right);
    }
}
