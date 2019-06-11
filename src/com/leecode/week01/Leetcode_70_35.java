package com.leecode.week01;

import java.util.HashMap;
import java.util.Map;

/**
 * 70. Climbing Stairs
 * ou are climbing a stair case. It takes n steps to reach to the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Note: Given n will be a positive integer.
 */
public class Leetcode_70_35 {
    public static  void main(String[] args){
        Leetcode_70_35 lc=new Leetcode_70_35();
        System.out.println(lc.climbStairs(1));
        System.out.println(lc.climbStairs(2));
        System.out.println(lc.climbStairs(3));
        System.out.println(lc.climbStairs(4));
        System.out.println(lc.climbStairs(5));
        System.out.println(lc.climbStairs(6));
        System.out.println(lc.climbStairs(10));
        System.out.println(lc.climbStairs(20));
        System.out.println(lc.climbStairs(30));
       // System.out.println(lc.climbStairs(100));

    }
    Map<Integer, Integer> cache=new HashMap<>();
    public Integer climbStairs_v2(int n) {

        Integer val=0;
        if(n==1){
            return 1;
        }

        if(n==2){
           return  2;
        }

        if(cache.get(n)!=null){
            val= cache.get(n);
        }else{
            val= climbStairs_v2(n-1)+climbStairs_v2(n-2);
            cache.put(n,val);
        }

        return val;
    }

    public int climbStairs(int n) {
        return climbStairs_v2(n).intValue();
    }


}
