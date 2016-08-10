package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC78Subset {

	public static void main(String[] args) {
		int input[]={1,2,3};
		List<List<Integer>> sets= subsets2(input);
		for(List<Integer> set: sets){	
			System.out.println(set.toString());
		}
	}

	public ArrayList<ArrayList<Integer>> subsets(int[] input) {
		ArrayList<ArrayList<Integer>> sets= new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<input.length;i++){
			ArrayList<ArrayList<Integer>> temp= new ArrayList<ArrayList<Integer>>();
			for(ArrayList<Integer> set: sets){	
				ArrayList<Integer> newSet = (ArrayList<Integer>) set.clone();
				newSet.add(input[i]);
			    temp.add(newSet);
			}
			//for(ArrayList<Integer> set: temp){
		    sets.addAll(temp);
			//}
			ArrayList<Integer> current = new ArrayList<Integer>();
			current.add(input[i]);
			sets.add(current);
		}
		
		return sets;
	}
	
	public static List<List<Integer>> subsets2(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        list.add(new ArrayList<Integer>());
        for(int n : nums){
            int size = list.size();
            for(int i=0;i<size;i++){
                List<Integer> temp = new ArrayList<Integer>(list.get(i));
                temp.add(n);
                System.out.println(temp);
                list.add(temp);
            }
        }
        return list;
    }
}
