package leetcode;

import java.util.ArrayList;

public class LC297SerializeDeserializeBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode head=TreeNode.createSymTree();
		ArrayList<Integer> result=serialize(head);
		System.out.println(result.toString());
		head=TreeNode.createBinarySearchTree();
		TreeNode.print(head);
		result=serialize(head);
		System.out.println(result.toString());

	}
	
	public static ArrayList<Integer> serialize(TreeNode root){
		boolean flag = true;
		if(root==null)
			flag=false;
		ArrayList<TreeNode> current = new ArrayList();
		current.add(root);
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(flag){
			flag = false;
			ArrayList<TreeNode> step= new ArrayList();
			for(TreeNode c:current){
				if(c==null){
					list.add(null);
					step.add(null);
					step.add(null);
				}else{
					list.add(c.value);
					step.add(c.left);
					step.add(c.right);
					if(c.left!=null || c.right!=null)
						flag=true;
				}
			}
			current=step;
		}
		return list;
	}

}
