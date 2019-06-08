package com.leecode;

/**
 * 合并两个有序列表
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 */
public class LeetCode_24_35 {

    public void insert(ListNode ls,int val){
        ListNode tNode=ls;
        while (tNode.next!=null){
            tNode=tNode.next;
        }
        ListNode newNode=new ListNode(val);
        tNode.next=newNode;
    }
    public ListNode build(int[] nums){
        ListNode ls=null;
        if(nums!=null&&nums.length>0){
                ls=new ListNode(nums[0]);
              if(nums.length>=2){
                  for(int i=1;i<nums.length;i++){
                      insert(ls,nums[i]);
                  }
              }
        }

        return ls;
    }

    public void print(ListNode ls){
        ListNode tNode=ls;
        StringBuffer s=new StringBuffer();
        while(tNode!=null){
            s.append(tNode.val+"->");
            tNode=tNode.next;
        }

        if(s.length()==0){
            System.out.println("空链表");
        }else{
            System.out.println(s.delete(s.length()-2,s.length()));

        }
    }

    public static void main(String[] args) {
        LeetCode_24_35 lc=new LeetCode_24_35();

        int[] l1Arr=new int[]{2};
        ListNode l1=lc.build(l1Arr);

        lc.print(l1);

        int[] l2Arr=new int[]{1};

        ListNode l2=lc.build(l2Arr);
        lc.print(l2);



    }

    public ListNode swapPairs(ListNode head) {
        return  null;
    }


}
