package leetcode;

import java.util.Arrays;

public class MaximumConsecutiveNumbers {

	public static void main(String[] args) {
		int array[]={1,94,93,1000,2,92,1001};
		int max = maxNumbers(array);
		System.out.println("max consecutive numbers : "+max);
	}

	public static int maxNumbers(int array[]){
		Arrays.sort(array);
		int last_ele=array[0];
		int i=1,count=1,max=1;
		
		while(i<array.length)
		{
			if(array[i]==last_ele+1)
			{
				count++;
			}
			else
			{
				if(max<count)
					max=count;
				count=1;
			}
			last_ele=array[i++];
		}

		return max;
	}
}
