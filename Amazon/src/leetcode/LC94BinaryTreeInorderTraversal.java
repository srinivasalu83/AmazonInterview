package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class LC94BinaryTreeInorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    List<Integer> result = new ArrayList<Integer>();
	    TreeNode head = TreeNode.createBinarySearchTree();
	    TreeNode.print(head);
	   // result = inorderTraversal(head);
	    inorderTraversal(result, head);
	    for(int i=0;i<result.size();i++)
	    	System.out.print(result.get(i)+" ");
	}

	public static void inorderTraversal(List<Integer> result, TreeNode head){
		if(head==null)
			return;
		inorderTraversal(result, head.left);
		result.add(head.value);
		inorderTraversal(result, head.right);
	}
	
	public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root==null) return list;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(root!=null||!stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            list.add(root.value);
            root = root.right;
        }
        return list;
    }
	
	public static List<Integer> inorderTraversal2(List<Integer> result, TreeNode head){//7
		if(head==null)
			return result;
		Stack<TreeNode> stack = new Stack();
		Set<TreeNode> trace= new HashSet();
		while (stack.size()>0||head!=null)
		{
           while(head.left!=null && !trace.contains(head.left)){
        	   stack.add(head);
        	   head=head.left;
           }
           result.add(head.value);
           trace.add(head);
           if(head.right!=null)
        	   head=head.right;
           else if(stack.size()>0)
        	   head=stack.pop();
           else
        	   break;
		}
		return result;
	}
}
