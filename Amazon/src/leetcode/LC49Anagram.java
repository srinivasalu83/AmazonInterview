package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC49Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs ={"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> result =groupAnagrams(strs);
		for(List<String> l:result){
			for(String s:l){
				System.out.print(s+" ");
			}
			System.out.println();
		}
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
	    List<List<String>> result = new ArrayList<List<String>>();
	 
	    HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
	    for(String str: strs){
	        char[] arr = str.toCharArray();
	        Arrays.sort(arr);
	        String ns = new String(arr);
	 
	        if(map.containsKey(ns)){
	            map.get(ns).add(str);
	        }else{
	            ArrayList<String> al = new ArrayList<String>();
	            al.add(str);
	            map.put(ns, al);
	        }
	    }
	 
	    /*for(Map.Entry<String, ArrayList<String>> entry: map.entrySet()){
	        Collections.sort(entry.getValue());
	    }*/
	 
	    result.addAll(map.values());
	 
	    return result;
	}
}
