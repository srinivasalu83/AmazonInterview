package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC120Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List<Integer> first= new ArrayList();
         first.add(2);
         List<Integer> second= new ArrayList();
         second.add(3);
         second.add(4);
         List<Integer> third= new ArrayList();
         third.add(6);
         third.add(5);
         third.add(7);
         List<Integer> fouth = new ArrayList();
         fouth.add(4);
         fouth.add(1);
         fouth.add(8);
         fouth.add(3);
         List<List<Integer>> triangle = new ArrayList();
         triangle.add(first);
         triangle.add(second);
         triangle.add(third);
         triangle.add(fouth);
         System.out.println(new LC120Triangle().minimumTotal(triangle));
	}

	public int minimumTotal(List<List<Integer>> triangle) {
		int[] total = new int[triangle.size()];
		int l = triangle.size() - 1;
	 
		for (int i = 0; i < triangle.get(l).size(); i++) {
			total[i] = triangle.get(l).get(i);
		}
	 
		// iterate from last second row
		for (int i = triangle.size() - 2; i >= 0; i--) {
			for (int j = 0; j < triangle.get(i + 1).size() - 1; j++) {
				total[j] = triangle.get(i).get(j) + Math.min(total[j], total[j + 1]);
			}
		}
	 
		return total[0];
	}
}
