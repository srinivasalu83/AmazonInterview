package leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class LC103BinaryTreeZigzagLevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   // List<Integer> result = new ArrayList<Integer>();
	    TreeNode head = new TreeNode(7);
	    TreeNode left = new TreeNode(1);
	    TreeNode right = new TreeNode(13);
	    head.left=left;
	    head.right=right;
	    TreeNode leftRight = new TreeNode(3);
	    left.right=leftRight;
	    TreeNode rightLeft = new TreeNode(11);
	    TreeNode rightRight = new TreeNode(17);
	    right.left=rightLeft;
	    right.right=rightRight;
	    TreeNode rightRightRight = new TreeNode(19);
	    right.right.right=rightRightRight;
	    TreeNode.print(head);
	    ArrayList<ArrayList<Integer>> result =zigzagLevelOrder(head);
	    for(ArrayList<Integer> level: result){
	    	for(Integer current: level)
	    		System.out.print(current+"	");
	    	System.out.println();
	    }
	    
	}

	public static ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<TreeNode> current=new ArrayList();
		ArrayList<Integer> level = new ArrayList();
		if(root!=null){
			current.add(root);
			level.add(root.value);
			result.add(level);
		}
		boolean flag =true;
		while(current.size()>0){
			ArrayList<TreeNode> tmp=new ArrayList();
			level = new ArrayList();
			//if(flag)
			for(int i=current.size()-1;i>=0;i--){
				TreeNode treeNode = current.get(i);
				if(flag){
					if(treeNode.right!=null){
						tmp.add(treeNode.right);
						level.add(treeNode.right.value);
					}
					if(treeNode.left!=null){
						tmp.add(treeNode.left);
						level.add(treeNode.left.value);
						}
				}else{
					if(treeNode.left!=null)
					{
						tmp.add(treeNode.left);
						level.add(treeNode.left.value);
						}
					if(treeNode.right!=null)
					{
						tmp.add(treeNode.right);
						level.add(treeNode.right.value);
					}				
				}	
			}
			flag=!flag;
			current=tmp;
			if(level.size()>0)
				result.add(level);
		}
		return result;
	}
}
