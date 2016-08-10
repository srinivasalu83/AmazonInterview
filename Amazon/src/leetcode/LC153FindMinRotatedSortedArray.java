package leetcode;

public class LC153FindMinRotatedSortedArray {
//http://bangbingsyb.blogspot.com/2014/11/leecode-find-minimum-in-rotated-sorted.html
	public static void main(String[] args) {
		int input[]={4, 5, 6, 7, 0, 1, 2};
		System.out.println(findMin(input));
		int input2[]={5, 6, 1, 2, 3, 4};
		System.out.println(findMin(input2));

	}

	public static int search(int[] input) {  
		return binarySearch(input, 0, input.length-1);
	}

	public static int binarySearch(int[] input, int left, int right){
		if(left>right)
			return -1;
		if(left==right)
			return input[right];
		else if(left+1==right)
			return Math.min(input[left], input[right]);
		int mid = (left+right)/2;
		if(input[mid]<input[right]) 
			return binarySearch(input, left, mid);
		else if(input[mid]>input[right])
			return binarySearch(input, mid+1,right);
		return -1;
	}
	
	//http://www.programcreek.com/2014/02/leetcode-find-minimum-in-rotated-sorted-array/
	public static int findMin(int[] nums) {
	    if(nums.length==1)
	        return nums[0];
	 
	    int left=0;
	    int right=nums.length-1;
	 
	    //not rotated
	    if(nums[left]<nums[right])
	        return nums[left];
	 
	    while(left <= right){
	        if(right-left==1){
	            return nums[right];
	        }
	 
	        int m = left + (right-left)/2;
	 
	        if(nums[m] > nums[right])
	            left = m;
	        else
	            right = m;
	    }
	 
	    return nums[left];
	}
}
