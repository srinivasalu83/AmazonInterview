package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC47PermutationsII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LC47PermutationsII permuation=new LC47PermutationsII();
		int input[]={1,1,3};
		ArrayList<ArrayList<Integer>> result= permuation.permuteUnique(input);
		for(ArrayList<Integer> set: result){	
			System.out.println(set.toString());
		}
	}

	public static ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
		ArrayList<ArrayList<Integer>> returnList = new ArrayList<ArrayList<Integer>>();
		returnList.add(new ArrayList<Integer>());
	 
		for (int i = 0; i < num.length; i++) {
			Set<ArrayList<Integer>> currentSet = new HashSet<ArrayList<Integer>>();
			for (List<Integer> l : returnList) {
				for (int j = 0; j < l.size() + 1; j++) {
					l.add(j, num[i]);
					ArrayList<Integer> T = new ArrayList<Integer>(l);
					l.remove(j);
					currentSet.add(T);
				}
			}
			returnList = new ArrayList<ArrayList<Integer>>(currentSet);
		}
	 
		return returnList;
	}
		/*
	public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(num == null || num.length == 0)
            return result;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] visited = new int[num.length];
        
        Arrays.sort(num);
        helper(result, list, visited, num);
        return result;
    }
    
    public void helper(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list, int[] visited, int[] num) {
        if(list.size() == num.length) {
            result.add(new ArrayList<Integer>(list));
            return;
        }
        
        for(int i = 0; i < num.length; i++) {
            if (visited[i] == 1 || (i != 0 && num[i] == num[i - 1] && visited[i - 1] == 0)){
                continue;
        
            上面的判断其实并不影响最终结果，目的是为了让dfs能更快
            上面这一连串判断条件，重点在于要能理解!visited.contains(i-1)
            要理解这个，首先要明白i作为数组内序号，i是唯一的
            给出一个排好序的数组，[1,2,2]
            第一层递归            第二层递归            第三层递归
            [1]                    [1,2]                [1,2,2]
            序号:[0]                 [0,1]            [0,1,2]
            这种都是OK的，但当第二层递归i扫到的是第二个"2"，情况就不一样了
            [1]                    [1,2]                [1,2,2]            
            序号:[0]                [0,2]                [0,2,1]
            所以这边判断的时候!visited.contains(0)就变成了true，不会再继续递归下去，跳出循环
            步主要就是为了去除连续重复存在的，很神奇反正 = =||
        
            }
            visited[i] = 1;
            list.add(num[i]);
            helper(result, list, visited, num);
            list.remove(list.size() - 1);
            visited[i] = 0;
        }
    }    */
}
