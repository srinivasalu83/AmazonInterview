package leetcode;

import java.util.TreeSet;

public class LC220ContainsDuplicateIII {

	public static void main(String[] args) {
		int input2[]={1,45,13,24,63,8};
		System.out.println(containsNearbyAlmostDuplicate(input2, 1, 5));
		System.out.println(containsNearbyAlmostDuplicate(input2, 3, 10));
	}

	public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (set.floor(n) != null && n <= t + set.floor(n) || 
                set.ceiling(n) != null && set.ceiling(n) <= t + n) {
                return true;
            }
            set.add(n);
            if (i >= k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
