package leetcode;

import java.util.Arrays;

public class LC41FirstMissingPositive {

	public static void main(String[] args) {

		int input[]={1,2,0};
		System.out.println(find(input));
		int input2[]={3,4,-1,1};
		System.out.println(find(input2));
	}
	
	public static int find(int input[]){
		int occur[]=new int[input.length];
		Arrays.fill(occur, 0);
		for(int i=0;i<input.length;i++){
			if(input[i]>0 && input[i]<=input.length){
				occur[input[i]-1]=1;
			}
		}
		for(int i=0;i<occur.length;i++)
			if(occur[i]==0)
				return i+1;
		return occur.length+1;
	}
}
