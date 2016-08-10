package leetcode;

public class LC98ValidateBinarySearchTree {

	public static void main(String[] args) {
		TreeNode root=TreeNode.createBinarySearchTree();
		TreeNode.print(root);
		System.out.println(validate(root, Integer.MAX_VALUE, Integer.MIN_VALUE));
	}

	public static boolean validate(TreeNode current, Integer max, Integer min){
		if(current.value>max || current.value<min)
			return false;
		boolean left =true;
		if(current.left!=null)
			left=validate(current.left,current.value,min);
		boolean right =true;
		if(current.right!=null)
			right=validate(current.right,max, current.value);
		return left&&right;
	}
}
