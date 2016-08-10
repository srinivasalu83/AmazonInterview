package leetcode;

//http://blog.csdn.net/lilong_dream/article/details/21701775
public class LC50Powerxn {

	public static void main(String[] args) {
		LC50Powerxn powerxn = new LC50Powerxn();
		System.out.println(powerxn.power(3, 5));
	}
	
	public double power(double x, int n){
		if(n==0)
			return 1;
		double tmp = power(x, n/2);
		if(n%2>0)
			return tmp * tmp * x;
		else
			return tmp * tmp;
	}

}
