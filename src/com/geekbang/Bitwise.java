package com.geekbang;

import java.util.HashMap;
import java.util.Map;

/**
 * 位运算
 */
public class Bitwise {

    public static void main(String[] args) {
        int n = 0b10000000000000000000000000000001;
        System.out.println(n);
        System.out.println(toFullBinaryString(n));
         /*int n=0b11111111111111111111111111111111;
         System.out.println(n);*/
        //System.out.println(n>>1);
        //and();
        //xor();
        //inverse();
        // moveLeft();
        //moveRight();
        // group();
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

    //人群操作尝试
    public static void group() {
        int n = 0b00000000000000000000000000000101;
        //  BigInteger bg=BigInteger.
        //做个缓存做人群编码映射
        Map<String, Integer> groupCache = new HashMap<>();

        groupCache.put("ug0901", 0);
        groupCache.put("ug0902", 1);

        groupCache.put("ug0903", 5);

        boolean[] b = {true, false, true, false, true, false};

        System.out.println("ug0901:" + b[groupCache.get("ug0901")]);
        System.out.println("ug0902:" + b[groupCache.get("ug0902")]);
        System.out.println("ug0903:" + b[groupCache.get("ug0903")]);

        //spark编码之后直接推送b数组，总共就推送两列
        String s = String.valueOf(b);
        System.out.println(s);

    }

    public static void moveRight() {

        System.out.println(-1 >> 1);
        System.out.println(-2 >> 2);
        System.out.println(Integer.toBinaryString(-4 >> 2));

    }

    public static void moveLeft() {
        System.out.println(1 << 1);
        System.out.println(1 << 2);
        System.out.println(Integer.toBinaryString(4 << 2));
    }

    public static void inverse() {
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(~1));
        System.out.println(~1);

        //System.out.println(~3);
        // System.out.println(~1);
    }

    public static void xor() {
        System.out.println(1 ^ 1);//1^1
        System.out.println(1 ^ 3);//01^11
        System.out.println(2 ^ 3);//10^11

    }

    public static void or() {
        System.out.println(1 | 1);//1|1
        System.out.println(1 | 3);//01|11
        System.out.println(2 | 3);//10|11
    }

    public static void and() {
        System.out.println(1 & 1);//1&1
        System.out.println(1 & 3);//01&11
        System.out.println(2 & 3);//10&11
    }


}
