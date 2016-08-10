package leetcode;

public class CountAndSayIII {

	public static void main(String[] args) {
		System.out.println(countAndSay("abcca"));
	}

	public static String countAndSay(String input){
		StringBuilder build=new StringBuilder();
		if(input==null || input.length()==0)
			return build.toString();
		char current = input.charAt(0);
		int count = 1;
		for(int i=1;i<input.length();i++){
			if(input.charAt(i)==current)
				count++;
			else{
				build.append(count);
				build.append(current);
				current=input.charAt(i);
				count=1;
			}
		}
		build.append(count);
		build.append(current);
		return build.toString();
	}
}
