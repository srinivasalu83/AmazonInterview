package leetcode;

import java.util.Arrays;

public class LC322CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins={1,2,5};
		System.out.println(coinChange2(coins, 11));
	}

	public static int coinChange(int[] coins, int amount) {
	    if(amount==0) return 0;
	 
	    int[] dp = new int [amount+1];
	    dp[0]=0; // do not need any coin to get 0 amount
	    for(int i=1;i<=amount; i++)
	        dp[i]= Integer.MAX_VALUE;
	 
	    for(int i=0; i<=amount; i++){
	        for(int coin: coins){
	            if(i+coin <=amount && dp[i]!=Integer.MAX_VALUE){
	                    dp[i+coin] = Math.min(dp[i+coin], dp[i]+1);
	                //}
	            }
	        }
	    }
	 
	    if(dp[amount] >= Integer.MAX_VALUE)
	        return -1;
	 
	    return dp[amount];
	}
	
	public static int coinChange2(int[] coins,int n){
	    int[] nums = new int[n+1];
	    Arrays.fill(nums,Integer.MAX_VALUE);
	    for(int i : coins){
	        nums[i] = 1;
	    }
	    for(int i=1;i<=n;i++){
	        for(int coin : coins){
	            if(i-coin>=0&&nums[i-coin]!=Integer.MAX_VALUE)
	                nums[i] = Math.min(nums[i],nums[i-coin]+1);
	        }
	    }
	    return nums[n]==Integer.MAX_VALUE?-1:nums[n];
	}
}
