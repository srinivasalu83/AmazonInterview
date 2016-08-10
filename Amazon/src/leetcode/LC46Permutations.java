package leetcode;

import java.util.ArrayList;

public class LC46Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LC46Permutations permuation=new LC46Permutations();
		int input[]={1,2,3};
		ArrayList<ArrayList<Integer>> result= permuation.permute2(input);
		for(ArrayList<Integer> set: result){	
			System.out.println(set.toString());
		}
	}

	public ArrayList<ArrayList<Integer>> permute2(int input[]){
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		result.add(new ArrayList<Integer>());
		for(int i=0;i<input.length;i++){
            ArrayList<ArrayList<Integer>> newresult = new ArrayList<ArrayList<Integer>>();
    		for(ArrayList<Integer> r:result){
					for(int j=0;j<r.size()+1;j++){
						ArrayList<Integer> cr= (ArrayList<Integer>)r.clone();
						cr.add(j,input[i]);
						newresult.add(cr);
					}
    		}
		    result = newresult;
		}
		return result;
	}
	
	public ArrayList<ArrayList<Integer>> permute(int[] num) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if(num.length==0)
			return result;
		ArrayList<Integer> first = new ArrayList<Integer>();
		first.add(num[0]);
		result.add(first);
		for(int i=1;i<num.length;i++){
			ArrayList<ArrayList<Integer>> newresult = new ArrayList<ArrayList<Integer>>();

			for(ArrayList<Integer> current:result){
				for(int k=0;k<current.size();k++){
					ArrayList<Integer> next=  (ArrayList<Integer>) current.clone();
					next.add(0, num[i]);
					newresult.add(next);
				}
				current.add(num[i]);
				newresult.add(current);
			}
			result =new ArrayList<ArrayList<Integer>>();
			result.addAll(newresult);
		}
        return result;
	}
}
