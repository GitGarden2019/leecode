package com.leecode.week01;

import com.leecode.ListNode;

/**
 * 合并两个有序列表
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 */
public class Leetcode_21_35 {

    public void insert(ListNode ls, int val){
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
        Leetcode_21_35 lc=new Leetcode_21_35();

        int[] l1Arr=new int[]{2};
        ListNode l1=lc.build(l1Arr);

        lc.print(l1);

        int[] l2Arr=new int[]{1};

        ListNode l2=lc.build(l2Arr);
        lc.print(l2);

        ListNode l12=lc.mergeTwoLists(l1,l2);
        lc.print(l12);


    }


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }

        //初始化新链表
        ListNode ls12=null;
        if(l1.val<=l2.val) {
            ls12=new ListNode(l1.val);
            l1=l1.next;
        }else{
            ls12=new ListNode(l2.val);
            l2=l2.next;
        }

        ListNode cur12=ls12;

        //指针分别去12中提取数据,提取规则是优先提取比较小的元素，直到最后为止，注意边界的判定

        while (cur12!=null){

            if(l1==null&&l2!=null){
                cur12.next=l2;
                break;
            }

            if(l2==null&&l1!=null){
                cur12.next=l1;
                break;
            }
            ListNode lsTmp=null;

            if(l1.val>l2.val){
                 lsTmp=new ListNode(l2.val);
                l2=l2.next;

            }else{
                lsTmp=new ListNode(l1.val);
                l1=l1.next;

            }
            cur12.next=lsTmp;
            cur12=cur12.next;

        }

        return ls12;
    }
}
