package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC102BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(7);
	    TreeNode left = new TreeNode(1);
	    TreeNode right = new TreeNode(13);
	    root.left=left;
	    root.right=right;
	    TreeNode leftRight = new TreeNode(3);
	    left.right=leftRight;
	    TreeNode rightLeft = new TreeNode(11);
	    TreeNode rightRight = new TreeNode(17);
	    right.left=rightLeft;
	    right.right=rightRight;
	    TreeNode rightRightRight = new TreeNode(19);
	    right.right.right=rightRightRight;
	    List<List<Integer>> result = levelOrder(root);
	    for(List<Integer> current:result){
	    	for(Integer data:current)
	    		System.out.print(data+" ");
	    	System.out.println();
	    }
	}

	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result =new ArrayList();
		List<TreeNode> current =new ArrayList();
		if(root !=null){
			current.add(root);
		}
		while(!current.isEmpty()){
			List<TreeNode> next = new ArrayList();
			ArrayList<Integer> nodeValues = new ArrayList<Integer>();
			for(TreeNode tn:current){
				nodeValues.add(tn.value);
				if(tn.left!=null)
					next.add(tn.left);
				if(tn.right!=null)
					next.add(tn.right);
			}
			result.add(nodeValues);
			current=next;
		}
		return result;
	}
}
