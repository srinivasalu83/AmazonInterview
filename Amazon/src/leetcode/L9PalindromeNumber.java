package leetcode;

public class L9PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(isPalindrome(323));
		System.out.println(isPalindrome(13231));
	}

    public static boolean isPalindrome(int x) {
    	int divide =1;
    	while(x/divide>9)
    		divide=divide*10;
    	while(x>0){
    		int head  = x/divide;
    		int tail = x%10;
    		if(head !=tail)
    			return false;
    		x=x-divide*head;
    		x=x/10;
    		divide=divide/100;
    	}
    	return true;
    }
}
