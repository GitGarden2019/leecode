package com.leecode.week02;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/reverse-bits/solution/javajie-fa-by-sh1tge 190. Reverse Bits
 * 颠倒一个数的二进制位
 */
public class Leetcode_190_35 {

    public static Integer[] intToIntegerList(int ind) {
        List<Integer> list = new ArrayList<Integer>();
        int idx = 2;
        while (ind != 0) {
            int x = idx / 2;
            if (ind % idx != 0) {
                list.add(x);
                ind -= x;
            } else if (ind / idx == 1) {
                list.add(idx);
                ind = 0;
                break;
            }
            idx *= 2;
        }
        Integer[] a = new Integer[0];
        a = list.toArray(a);
        return a;
    }


    public static String toFullBinaryString(int num)//将整数num转化为32位的二进制数
    {
        char[] chs = new char[Integer.SIZE];
        for (int i = 0; i < Integer.SIZE; i++) {
            chs[Integer.SIZE - 1 - i] = (char) (((num >> i) & 1) + '0');
            //System.out.print(chs[Integer.SIZE - 1 - i]);
        }
        return new String(chs);
    }


    public static void main(String[] args) {
        // int x=9;
        // System.out.println(Integer.toBinaryString(x));

//        int n=0b11111111111111111111111111111101;
        int n = 0b00000000000000000000000000000101;
        // System.out.println(toFullBinaryString(n));
        Leetcode_190_35 lc = new Leetcode_190_35();

        //System.out.println(lc.reverseBits(n));
        System.out.println(toFullBinaryString(lc.reverseBits(n)));
    }

    /**
     * 思路：构造一个新的数，直接从n中提取每一个的位次，再写进去就行
     */
    public int reverseBits(int n) {

        //提取某一位的操作，先移动到最右端，然后和1进行&运算，得到的结果就是前面全部是0的，最后位是目标位的数据
        int result = 0;

        for (int i = 0; i < 32; i++) {
            int tmp = n >> i;
            tmp = tmp & 1;
            result = result | tmp << (31 - i);
          /*  System.out.println("第"+i+"次移动n->"+toFullBinaryString(n));
            System.out.println("第"+i+"次移动tmp->"+toFullBinaryString(tmp));
            System.out.println("第"+i+"次移动result->"+toFullBinaryString(result));*/
        }

        return result;
    }
}
