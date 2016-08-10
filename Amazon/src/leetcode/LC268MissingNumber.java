package leetcode;

public class LC268MissingNumber {

	public static void main(String[] args) {
		int input[]= {0, 1, 3};
		System.out.println(missingNumber(input));
		int input1[]= {2, 3, 5};
		System.out.println(missingNumber1(input1));
	}

	public static int missingNumber(int[] nums) {
	    int sum=0;
	    for(int i=0; i<nums.length; i++){
	        sum+=nums[i];
	    }
	 
	    int n=nums.length;
	    return n*(n+1)/2-sum;
	}
	
	public static int missingNumber1(int[] nums) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0; i<nums.length; i++){
	        if(nums[i]>max)
	        	max=nums[i];
	        if(nums[i]<min)
	        	min=nums[i];
	    }
	    int sum=0;
	    for(int i=0; i<nums.length; i++){
	        sum+=nums[i];
	    }
	    int n=nums.length;
	    return (max+min)*(n+1)/2-sum;
	}
}
