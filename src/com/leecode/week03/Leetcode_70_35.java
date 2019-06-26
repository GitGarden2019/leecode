package com.leecode.week03;

/**
 * 爬楼梯问题，动态规划法求解
 */
public class Leetcode_70_35 {

    public static void main(String[] args) {
        Leetcode_70_35 lc = new Leetcode_70_35();
        System.out.println(lc.climbStairs(1));
        System.out.println(lc.climbStairs(2));
        System.out.println(lc.climbStairs(3));
        System.out.println(lc.climbStairs(4));
        System.out.println(lc.climbStairs(5));
        System.out.println(lc.climbStairs(6));
        System.out.println(lc.climbStairs(10));
        System.out.println(lc.climbStairs(20));
        System.out.println(lc.climbStairs(30));
        //System.out.println(lc.climbStairs(100));

    }

    public int climbStairs(int n) {
        int oneStep=1;
        int twoStep=2;
        if(n==1){
            return oneStep;
        }

        if(n==2){
            return twoStep;
        }


        int[] dp=new int[n];
        dp[0]=oneStep;

        dp[1]=twoStep;



        for(int i=2;i<n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }

       return dp[n-1];
    }
}
