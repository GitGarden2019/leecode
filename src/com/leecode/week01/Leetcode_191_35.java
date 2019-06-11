package com.leecode.week01;

/**
 * 191. Number of 1 Bits
 */
public class Leetcode_191_35 {
    public static void main(String[] args) {
        Leetcode_191_35 lc=new Leetcode_191_35();
       System.out.println(lc.hammingWeight(-1));
        System.out.println(lc.hammingWeight(2));
        System.out.println(lc.hammingWeight(3));
        System.out.println(lc.hammingWeight(4));
        System.out.println(lc.hammingWeight(5));
        System.out.println(lc.hammingWeight(6));
        System.out.println(lc.hammingWeight(7));
        System.out.println(lc.hammingWeight(Integer.MAX_VALUE));
        int n=0b11111111111111111111111111111101;
        System.out.println(n);

        int x=0b10000000000000000000000000000000;
        System.out.println(x);

        System.out.println(lc.hammingWeight(-3));



    }


    public int hammingWeight(int n) {

        int count=0;
        while (n!=0){
            count++;
            //每次回消掉一个1
            n&=n-1;//it switch bit 1 to 0 of first right most bit e.x.: 01100 => 01000

        }
        return count;
    }


    /**
     * 查看二进制位的第一位，不断右移，直到数据变成0为止
     * @param n
     * @return
     */
    public int hammingWeight_v1(int n) {
        int x=0b10000000000000000000000000000000;

        int count=0;

        while (n!=0){
           if((n&x)==x){
                count++;
           }
           n=n<<1;
        }
        return count;
    }


}

