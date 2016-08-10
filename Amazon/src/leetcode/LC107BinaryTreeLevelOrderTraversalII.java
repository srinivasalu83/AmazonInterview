package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LC107BinaryTreeLevelOrderTraversalII {

	public static void main(String[] args) {
		TreeNode root = TreeNode.createBinarySearchTree();
		TreeNode.print(root);
		List<List<Integer>> list = levelOrder(root);
		for(List<Integer> l:list){
			for(Integer i:l)
				System.out.print(i + " ");
			System.out.println();
		}
	}

	public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        addLevel(root,0,list);
        Collections.reverse(list);
        return list;
    }
	
    public static void addLevel(TreeNode node,int level,List<List<Integer>> list){
        if(node==null) return;
        if(list.size()<=level) list.add(new LinkedList<Integer>());
        list.get(level).add(node.value);
        addLevel(node.left,level+1,list);
        addLevel(node.right,level+1,list);
    }
}
