package com.leecode.week01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/group-anagrams/
 * 49. 字母异位词分组
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 * 参考:LeetCode_242_35
 */
public class Leetcode_49_35 {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupAnagrams=new ArrayList<>();
        List<String> ls= Arrays.asList(strs);

        for(String l:ls){

            findAnagram(l,ls);
        }

        return null;

    }

    /**
     * 从一个列表中找到异位词
     * @param curStr
     * @param source
     * @return
     */
    public List<String> findAnagram(String curStr,List<String> source){
        List<String> ls=new ArrayList<>();

        for(String s:source){
            if(isAnagram(curStr,s)){
                ls.add(s);
            }
        }
        return  ls;

    }

    public boolean isAnagram(String s, String t)
    {
        if(s==null||t==null||s.length()!=t.length()){
            return  false;
        }
        int[]  sArr=new int[128];
        int[]  tArr=new int[128];
        char[] sChs=s.toCharArray();
        char[] tChs=t.toCharArray();

        for(int i=0;i<sChs.length;i++){
            sArr[sChs[i]]++;
            tArr[tChs[i]]++;
        }


        return Arrays.equals(sArr,tArr);
    }
}
