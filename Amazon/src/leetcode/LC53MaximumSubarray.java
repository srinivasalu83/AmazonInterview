package leetcode;

public class LC53MaximumSubarray {

	public static void main(String[] args) {
		int input [] ={-2,1,-3,4,-1,2,1,-5,4 };
		System.out.println(maxSubArray(input));
		
	}
	 public static Integer maxSubArray(int[] input) {
		 if(input==null || input.length==0)
			 return null;
		 int[] sum = new int[input.length];
		 int max = input[0];
		 sum[0] = input[0];
		 for (int i = 1; i < input.length; i++) {
			 sum[i] = Math.max(input[i], sum[i - 1] + input[i]);
			 max = Math.max(max, sum[i]);
		 }
		 return max;
	 }
}
