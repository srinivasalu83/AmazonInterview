package leetcode;

public class LC280WiggleSort {
	
	public static void main(String[] args) {
		int input[]={1,2,3,4,5,6,7};
		wiggleSort(input);
		for(int i=0;i<input.length;i++)
			System.out.print(input[i]+" ");
	}
	
	public static void wiggleSort(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
         
        for (int i = 0; i < nums.length - 1; i++) {
            if (i % 2 == 0) {
                if (nums[i] > nums[i + 1]) {
                    swap(nums, i, i + 1);
                }
            } else {
                if (nums[i] < nums[i + 1]) {
                    swap(nums, i, i + 1);
                }
            }
        }
    } 
	
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
