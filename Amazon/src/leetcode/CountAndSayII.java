package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class CountAndSayII {

	public static void main(String[] args) {
		System.out.println(countAndSay("abcca"));
	}

	public static String countAndSay(String input){
		StringBuilder build=new StringBuilder();
		if(input==null || input.length()==0)
			return build.toString();
		HashMap<Character, Integer> map= new HashMap<Character, Integer>();
		ArrayList<Character> list=new ArrayList<Character>();
		for(int i=0;i<input.length();i++){
			Character current=input.charAt(i);
			Integer count=map.get(current);
			if(count==null){
				list.add(current);
				map.put(current, 1);
			}
			else
				map.put(current, count+1);
		}
		for(char current :list){
			build.append(map.get(current));
			build.append(current);
		}

		return build.toString();
	}
}
