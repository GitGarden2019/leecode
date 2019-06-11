package com.leecode.week01;

import java.util.*;

/**
 * 求三个数之和
 * https://leetcode-cn.com/problems/3sum/
 *
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 *
 *
 *
 */
public class Leetcode_15_35 {
    public static void main(String[] args) {
        //分解问题:
        //1.假设确定了一个数,问题会转换为寻找两个数,两数之和等于某个固定的值
        //2.如果确定了两个数的话,那么问题转换成在剩下的数中寻找某个数
        int[] nums={-1,0,1,2,-1,-4};
        Leetcode_15_35 lc=new Leetcode_15_35();
        List<List<Integer>> ls=lc.threeSum(nums);
        System.out.println(ls);
    }


    public List<List<Integer>> threeSum(int[] nums)
    {
        List<List<Integer>> finalList=new ArrayList<>();
        Map<Integer,int[]> resHash=new HashMap<>();
        for(int i=0;i<nums.length;i++){


            for(int j=i+1;j<nums.length;j++){

                //如果剩下的元素在后面可以拿到,则这就是一组合法值
                int other=0-nums[i]-nums[j];

                int[] arr=resHash.get(nums[j]);
                if(arr!=null){
                    //强匹配
                  List<Integer> resultList= new ArrayList(3);
                  resultList.add(0,arr[0]);
                  resultList.add(1,arr[1]);
                  resultList.add(2,arr[2]);
                  finalList.add(resultList);

                  resHash.remove(nums[j]);
                }else{

                    int[] arrt=new int[3];
                    arrt[0]=nums[i];
                    arrt[1]=nums[j];
                    arrt[2]=other;
                    Arrays.sort(arrt);

                    resHash.put(other,arrt);
                }


            }
        }


        return finalList;
    }

    /**
     * 暴力求解，超时了..
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum_v0(int[] nums) {
        Set<String> resSet=new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            int x=nums[i];
            for(int j=i+1;j<nums.length-1;j++){
                int y=nums[j];
                for (int k=j+1;k<nums.length;k++){
                    int z=nums[k];
                    if(x+y+z==0){
                        int min= Math.min(Math.min(x,y),z);
                        int max= Math.max(Math.max(x,y),z);
                        String res=String.join(",",String.valueOf(min),String.valueOf(max),String.valueOf(0-min-max));
                        if(!resSet.contains(res)){
                            resSet.add(res);
                        }
                    }
                }
            }
        }

        List<List<Integer>> finalList=new ArrayList<>(resSet.size());

        for(String s:resSet){
            String[] sArr=s.split(",");
            List<Integer> ss=new ArrayList<>(sArr.length);
            for(int i=0;i<sArr.length;i++){
                ss.add(Integer.valueOf(sArr[i]));
            }
            finalList.add(ss);


        }
        return finalList;
    }


}

