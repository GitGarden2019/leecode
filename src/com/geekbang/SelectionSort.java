package com.geekbang;

import java.util.Arrays;

/**
 * 选择排序,还是从小到大排序为例
 * 选择要排到位置的元素为最大值，遍历全部元素，若碰到更大的，则替换变量中的最大值
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] nums=new int[]{3,42,34,5,1};
        test(nums);

        test(new int[]{2,3,4,5,6,6,8,-1});
    }

    public static void test(int[] nums){

        selectSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void selectSort(int[] nums){

        for(int i=0;i<nums.length;i++){
            int lastIndex=nums.length-i;
            int maxVal=nums[lastIndex-1];
            for(int j=0;j<lastIndex;j++){
                if(nums[j]>maxVal){
                    maxVal=nums[j];
                    nums[j]=nums[lastIndex-1];
                    nums[lastIndex-1]=maxVal;
                }
            }

        }
    }


}
