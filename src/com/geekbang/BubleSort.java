package com.geekbang;

import java.util.Arrays;

/**
 * 冒泡排序:
 * 以从小到大排列顺序为例
 * 相邻元素之间两两进行比较，如果前一个元素比后面的元素大，则需要交换位置
 */
public class BubleSort {

    public static void main(String[] args) {
        int[] nums=new int[]{3,42,34,5,1};
        bubleSort(nums,true);
        System.out.println(Arrays.toString(nums));

        bubleSort(nums,false);
        System.out.println(Arrays.toString(nums));
    }

    public static void bubleSort(int[] nums,boolean sortType){

        for(int i=0;i<nums.length;i++){
            //把最大的放在最后
            int lastIndex=nums.length-i;//最后的那个元素
            for(int j=1;j<lastIndex;j++){
                if(sortType){
                    if(nums[j-1]<nums[j]){
                        swap(nums,j-1,j);
                    }
                }else{
                    if(nums[j-1]>=nums[j]){
                        swap(nums,j-1,j);
                    }
                }

            }
        }
    }

    public static void swap(int[] nums,int index1,int index2){
        nums[index1]=nums[index1]^nums[index2];
        nums[index2]=nums[index1]^nums[index2];
        nums[index1]=nums[index1]^nums[index2];
    }

}
