package com.learn;

/**
 * 位运算
 */
public class Bitwise {
    public static void main(String[] args) {
        //and();
        //xor();
        //inverse();
        //moveLeft();
        moveRight();
    }

    public static void moveRight() {

            System.out.println(-1>>1);
            System.out.println(-2>>2);
            System.out.println(Integer.toBinaryString(-4>>2));

    }

    public static void moveLeft(){
        System.out.println(1<<1);
        System.out.println(1<<2);
        System.out.println(Integer.toBinaryString(4<<2));
    }

    public static void inverse(){
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(~1));
        System.out.println(~1);

        //System.out.println(~3);
       // System.out.println(~1);
    }
    public static void xor(){
            System.out.println(1^1);//1^1
            System.out.println(1^3);//01^11
            System.out.println(2^3);//10^11

    }
    public static void or(){
        System.out.println(1|1);//1|1
        System.out.println(1|3);//01|11
        System.out.println(2|3);//10|11
    }

    public static void and() {
        System.out.println(1&1);//1&1
        System.out.println(1&3);//01&11
        System.out.println(2&3);//10&11
    }


}
