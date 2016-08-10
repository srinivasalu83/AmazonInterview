package leetcode;

public class IncreaseAlphabet {

	public static void main(String[] args) {
		String input="aAa!";
		System.out.println(increase(input));
	}

	public static String increase(String input){
		StringBuilder result=new StringBuilder();
		for(int i=0;i<input.length();i++){
			Character current =  input.charAt(i);
			if(Character.isLetter(current)){
			   current=(char)(current+3);
			   }
			result.append(current);
		}
		return result.toString();
	}
}
