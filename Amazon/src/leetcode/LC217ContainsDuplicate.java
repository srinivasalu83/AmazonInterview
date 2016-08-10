package leetcode;

import java.util.HashSet;

public class LC217ContainsDuplicate {

	public static void main(String[] args) {
		int input[]={1,2,3,4,5};
		System.out.println(containsDuplicate(input));
		int input2[]={1,2,3,4,5,3};
		System.out.println(containsDuplicate(input2));
	}

	public static boolean containsDuplicate(int[] nums) {
	    if(nums==null || nums.length==0)
	        return false;
	 
	    HashSet<Integer> set = new HashSet<Integer>();
	    for(int i: nums){
	        if(!set.add(i)){
	            return true;
	        }
	    }
	 
	    return false;
	}
}
