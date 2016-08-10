package leetcode;

public class SingleNumberII {

	public static void main(String[] args) {
		int input[]={1,1,1,2,3,3,3};
		System.out.println(singleNumber(input));
	}
	
	public static int singleNumber(int[] nums) {
        int a=0,b=0;
        for(int c : nums){
            int temp = (a&~b&~c)|(~a&b&c);
            b = (~a&b&~c)|(~a&~b&c);
            a = temp;
        }
        return b;
    }

}
