package leetcode;

public class ConvertBSTBinaryTree {

	public static void main(String[] args) {
		TreeNode head = TreeNode.createBinarySearchTree();
		TreeNode.print(head);
		convert(head);
		TreeNode.print(head);		
	}
	
	public static void convert(TreeNode head){
		int previous=recersive(head.right, 0);
		head.value=head.value+previous;
		recersive(head.left,head.value);
	}

	public static int recersive(TreeNode head, int previous){
		if(head==null)
			return previous;
		else{
			previous=recersive(head.right, previous);
			head.value=head.value+previous;
			previous=recersive(head.left, head.value);
			return previous;
		}
	}
}
