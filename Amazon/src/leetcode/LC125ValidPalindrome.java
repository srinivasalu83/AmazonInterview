package leetcode;

public class LC125ValidPalindrome {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			String input = "A man, a plan, a eeanal: Panama";
			LC125ValidPalindrome vp = new LC125ValidPalindrome();
			System.out.println(vp.isPalindrome(input));
		    input = "race a car";
			System.out.println(vp.isPalindrome(input));
	}

	public boolean isPalindrome(String input){
		input=input.toLowerCase();
		int left=0;
		int right=input.length()-1;
		while(left<right){
			while(left<right&&!isValid(input.charAt(left)))
				left++;
			while(left<right&&!isValid(input.charAt(right)))
				right--;
			if(input.charAt(left)!=input.charAt(right))
				return false;
			else{
				left++;
			    right--;
			}
		}
		return true;
	}
	
	private boolean isValid(char c){
		if ('a'<=c && c<='z') 
			return true;
		if ('0'<=c && c<='9') 
			return true;
		return false;
	}
}
