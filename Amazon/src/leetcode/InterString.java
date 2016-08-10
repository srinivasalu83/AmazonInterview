package leetcode;

import java.util.ArrayList;

public class InterString {

	public static void main(String[] args) {
		String str1="abc";
		String str2="de";
		ArrayList<String> result = new ArrayList<String>();
		createString(str1, str2, 0, 0, "", result);
		for(String str: result)
			System.out.println(str);
	}

	public static void createString(String str1, String str2, int index1, int index2, String current, ArrayList<String> result){
		if(index1 == str1.length() && index2 == str2.length()){
			result.add(current.toString());
			return;
		}
		if(index1 < str1.length()){
			createString(str1,str2,index1+1,index2,current+str1.charAt(index1), result);
		}
		if(index2 < str2.length()){
			createString(str1,str2,index1,index2+1,current+str2.charAt(index2), result);
		}
	}
}
