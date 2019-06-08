package com.leecode;

import java.util.List;

/**
 * 求三个数之和
 * https://leetcode-cn.com/problems/3sum/
 *
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 *
 *
 *
 */
public class LeetCode_15_35{
    public static void main(String[] args) {
        //分解问题:
        //1.假设确定了一个数,问题会转换为寻找两个数,两数之和等于某个固定的值
        //2.如果确定了两个数的话,那么问题转换成在剩下的数中寻找某个数
        int[] nums={-1,0,1,2,-1,-4};
          for(int i=0;i<nums.length;i++){
              int x=nums[i];
              for(int j=i;j<nums.length;j++){
                  int y=nums[j];
                  for (int k=j;k<nums.length;k++){
                      int z=nums[k];
                      if(x+y+z==0){
                          System.out.println("["+x+","+y+","+z+"]");
                      }
                  }
              }
          }

    }
    public List<List<Integer>> threeSum(int[] nums) {
        return null;
    }


}

