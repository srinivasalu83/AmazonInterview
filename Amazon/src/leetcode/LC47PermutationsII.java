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
        
            ������ж���ʵ����Ӱ�����ս����Ŀ����Ϊ����dfs�ܸ���
            ������һ�����ж��������ص�����Ҫ�����!visited.contains(i-1)
            Ҫ������������Ҫ����i��Ϊ��������ţ�i��Ψһ��
            ����һ���ź�������飬[1,2,2]
            ��һ��ݹ�            �ڶ���ݹ�            ������ݹ�
            [1]                    [1,2]                [1,2,2]
            ���:[0]                 [0,1]            [0,1,2]
            ���ֶ���OK�ģ������ڶ���ݹ�iɨ�����ǵڶ���"2"������Ͳ�һ����
            [1]                    [1,2]                [1,2,2]            
            ���:[0]                [0,2]                [0,2,1]
            ��������жϵ�ʱ��!visited.contains(0)�ͱ����true�������ټ����ݹ���ȥ������ѭ��
            ����Ҫ����Ϊ��ȥ�������ظ����ڵģ������淴�� = =||
        
            }
            visited[i] = 1;
            list.add(num[i]);
            helper(result, list, visited, num);
            list.remove(list.size() - 1);
            visited[i] = 0;
        }
    }    */
}
