package com.leecode.week02;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class LeetCode_03_35 {
    public static void main(String[] args) {
        LeetCode_03_35 lc=new LeetCode_03_35();
       System.out.println(lc.lengthOfLongestSubstring("abc         abcbb"));
        System.out.println(lc.lengthOfLongestSubstring("bb  bbb"));
        System.out.println(lc.lengthOfLongestSubstring(" "));
        System.out.println(lc.lengthOfLongestSubstring("au"));

        //1.给定一个字符串，先输出看子串都有哪些
        //暴力枚举
        //lc.printAllSubstring("abcabcbb");


    }

    public void printAllSubstring(String s){
        char[] chs=s.toCharArray();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }
    }

    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()){
            return 0;
        }

        if(s.length()==1){
            return 1;
        }

        int longest=0;

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(longest<j-i){    //太短的子串，也不用去看了
                    String sub=s.substring(i,j);
                    if(!hasRepeatingChar(sub)){
                        longest=sub.length();
                    }
                }

            }


        }
        return longest;
    }

    Map<String, Boolean> cache=new HashMap<>();
    public boolean hasRepeatingChar(String s){

        if(cache.containsKey(s)){
            return cache.get(s);
        }

        char[] chs=s.toCharArray();
        Set<Character>  characters=new HashSet<>();
        for (char ch:chs) {
            if(characters.contains(ch)){
                cache.put(s,true);
                return true;
            }else {
                characters.add(ch);
            }

        }
        cache.put(s,false);
        return false;
    }
}
