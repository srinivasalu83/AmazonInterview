package leetcode;

public class Count1 {

	public static void main(String[] args) {
		System.out.println(count(3));
		System.out.println(count(2));
	}

	public static int count(int input){
	    int count = 0;
	    for(int i=0; i<32; i++){
	        if((input & 1)!=0) count++;
	        input >>= 1;
	    }
	    return count;
	}
}
