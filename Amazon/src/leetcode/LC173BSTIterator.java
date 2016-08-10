package leetcode;

import java.util.Stack;

public class LC173BSTIterator {

	public static void main(String[] args) {
		TreeNode root = TreeNode.createBinarySearchTree();
		TreeNode.print(root);
		LC173BSTIterator iterator = new LC173BSTIterator(root);
		while(iterator.hasNext())
			System.out.print(iterator.next()+" ");
	}

	 Stack<TreeNode> stack;  
	 
	 public LC173BSTIterator(TreeNode root) {  
	      stack = new Stack<TreeNode>();  
          while (root != null) {  
	          stack.push(root);  
	          root = root.left;  
	     }  
	   }  
 
       /** @return whether we have a next smallest number */  
	    public boolean hasNext() {  
	      return !stack.isEmpty();  
	   }  
  
        /** @return the next smallest number */  
	    public int next() {  
	         TreeNode node = stack.pop();  
	         int ret = node.value;  
	         if (node.right != null) {  
	                node = node.right;  
	                while (node != null) {  
	                   stack.push(node);  
	                   node = node.left;  
	             }  
	          }  
	           return ret;  
	   }  

}
