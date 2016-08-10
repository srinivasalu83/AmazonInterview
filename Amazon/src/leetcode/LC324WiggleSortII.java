package leetcode;

public class LC324WiggleSortII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]={3, 5, 2, 1, 6, 4};
		wiggleSort(input);
		for(int i=0;i<input.length;i++)
			System.out.print(input[i]+" ");
	}

	public static void wiggleSort(int[] nums) {  
        if(nums==null || nums.length<2) return;  
          
        for(int i=1; i<nums.length; i++) {  
            if( (i%2==1 && (nums[i] < nums[i-1])) || (i%2==0) && (nums[i] > nums[i-1])) {  
                int temp = nums[i];  
                nums[i] = nums[i-1];  
                nums[i-1] = temp;  
            }  
        }  
          
    }  
}
