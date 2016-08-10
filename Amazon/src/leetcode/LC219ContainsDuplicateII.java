package leetcode;

import java.util.HashMap;

public class LC219ContainsDuplicateII {

	public static void main(String[] args) {
		int input[]={1,2,3,4,5};
		System.out.println(containsNearbyDuplicate(input, 1));
		int input2[]={1,2,3,4,5,3};
		System.out.println(containsNearbyDuplicate(input2, 4));
		System.out.println(containsNearbyDuplicate(input2, 2));
	}
	
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (Math.abs(map.get(nums[i]) - i) <= k) {
                    return true;
                } else {
                    map.put(nums[i], i);
                }
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}


