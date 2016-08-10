package leetcode;

public class LC101SymmetricTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode head =TreeNode.createSymTree();
		TreeNode.print(head);
		System.out.println(isSymmetric(head));
		head = TreeNode.createBinarySearchTree();
		TreeNode.print(head);
		System.out.println(isSymmetric(head));

	}

	static boolean isSymmetric(TreeNode tn){
		if(tn==null)
			return true;
		return recursive(tn.left, tn.right);
	}
	
	static boolean recursive(TreeNode tn1, TreeNode tn2){
		if(tn1==null && tn2==null)
			return true;
		if(tn1!=null && tn2==null)
			return false;
		if(tn1==null && tn2!=null)
			return false;
		if(tn1.value!=tn2.value)
			return false;
		return recursive(tn1.left,tn2.right) && recursive(tn1.right,tn2.left);
	}
}

