package leetcode;

public class SumNumberString {

	public static void main(String[] args) {
		String s = "11aa22bb33dd44S";
		System.out.println("The string sum is "+stringSum(s));
	}
	
	public static int stringSum(String s){
		int sum = 0, curNumber = 0;
		for(int i=0; i<s.length();i++){
			if(Character.isDigit(s.charAt(i))){
				curNumber = curNumber*10 + (s.charAt(i)-'0');
			}else{
				sum += curNumber;
				curNumber = 0;
			}
		}
		return sum+curNumber;
	}

}
