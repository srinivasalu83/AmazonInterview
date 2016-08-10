package leetcode;

import java.util.HashMap;
import java.util.Set;

public class LC136FindSingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] input={1,1,2};
		System.out.println(findNum(input));
		int []  input1={1,2,1,2,3};
		System.out.println(findNum(input1));
	}

	public static Integer findNum(int input[]){
		HashMap<Integer, Integer> count= new HashMap<Integer, Integer>();
		for(int i:input)
		{
			Integer fre=count.get(i);
			if(fre==null)
				count.put(i,1);
			else if(fre==1)
				count.remove(i);
		}
		Object rest[] =count.keySet().toArray();
		return (Integer)rest[0];
	}
}
