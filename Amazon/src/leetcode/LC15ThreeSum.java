package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC15ThreeSum {

	public static void main(String[] args) {
		int input[]={-1, 0, 1, 2, -1, -4};
		ArrayList<ArrayList<Integer>> result =threeSum(input);
		for(ArrayList<Integer> list:result)
		{
			for(Integer current:list)
				System.out.print(current+" ");
			System.out.println();
		}
	}

	public static ArrayList<ArrayList<Integer>> threeSum(int[] num) {  
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();  
  
        Arrays.sort(num);  
  
        for (int i = 0; i < num.length - 2; ++i) {  
            if (i > 0 && num[i] == num[i - 1]) {  
                continue;  
            }  
              
            int j = i + 1;  
            int k = num.length - 1;  
  
            while (j < k) {  
                if (num[i] + num[j] + num[k] > 0) {  
                    --k;  
                } else if (num[i] + num[j] + num[k] < 0) {  
                    ++j;  
                } else {  
                    ArrayList<Integer> tmp = new ArrayList<Integer>();  
                    tmp.add(num[i]);  
                    tmp.add(num[j]);  
                    tmp.add(num[k]);  
  
                    result.add(tmp);  
                      
                    --k;  
                    ++j;  
                      
                    while (j < k && num[j] == num[j - 1]) {  
                        ++j;  
                    }  
                    while (j < k && num[k] == num[k + 1]) {  
                        --k;  
                    }  
                }  
            }  
        }  
  
        return result;  
    }  
}
