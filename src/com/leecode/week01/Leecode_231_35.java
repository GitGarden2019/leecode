package com.leecode.week01;

/**
 * https://leetcode.com/problems/power-of-two/ Given an integer, write a function to determine if it
 * is a power of two.
 */

public class Leecode_231_35 {

    public static void main(String[] args) {
        Leecode_231_35 lc = new Leecode_231_35();
        System.out.println(lc.isPowerOfTwo(0));
        System.out.println(lc.isPowerOfTwo(1));
        System.out.println(lc.isPowerOfTwo(2));
        System.out.println(lc.isPowerOfTwo(3));
        System.out.println(lc.isPowerOfTwo(4));
        System.out.println(lc.isPowerOfTwo(5));
        System.out.println(lc.isPowerOfTwo(6));
        System.out.println(lc.isPowerOfTwo(7));
        System.out.println(lc.isPowerOfTwo(8));
        System.out.println(lc.isPowerOfTwo(9));
        System.out.println(lc.isPowerOfTwo(-2147483648));
    }

    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n &= n - 1) == 0;
    }
}
