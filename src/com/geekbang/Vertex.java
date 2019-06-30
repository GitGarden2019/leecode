package com.geekbang;

public class Vertex {
    private char lable;

    /**
     * 是否被访问过
     */
    public boolean wasVisted=false;

    public Vertex(char lable){
        this.lable=lable;
    }

    public char getLable(){
        return lable;
    }
}
