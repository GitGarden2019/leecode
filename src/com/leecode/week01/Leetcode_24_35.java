package com.leecode.week01;

import com.leecode.ListNode;

/**
 * 交换两个相邻节点
 * https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 */
public class Leetcode_24_35 {

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
        Leetcode_24_35 lc=new Leetcode_24_35();

        ListNode l0= lc.swapPairs(lc.build(new int[]{1,2,3,4}));
        lc.print(l0);

        ListNode l1= lc.swapPairs(lc.build(new int[]{1,2,3,4,5,6,7,8,9}));
        lc.print(l1);
        ListNode l3= lc.swapPairs(lc.build(new int[]{1,2}));
        lc.print(l3);

    }

    public ListNode swapPairs(ListNode head) {


        ListNode dummpy=new ListNode(Integer.MIN_VALUE);

        dummpy.next=head;

        //指针每次偏移两位，每次进行交换指针,注意边界值的判断
        if(dummpy.next==null||dummpy.next.next==null){
            return head;
        }

        ListNode curNode0=dummpy;
        ListNode curNode1=curNode0.next;
        ListNode curNode2=curNode1.next;


        if(curNode2.next==null){ //只有两个元素的情况,直接交换
            curNode1.next=curNode2.next;
            curNode0.next= curNode2;
            curNode2.next=curNode1;
            return dummpy.next;
        }

        int moveFlag=0;
        while(curNode0!=null&&curNode0.next!=null&&curNode0.next.next!=null){

            if(moveFlag%2==0){
                curNode1.next=curNode2.next;
                curNode0.next= curNode2;
                curNode2.next=curNode1;
            }

            curNode0=curNode0.next;//第一个指针往后移动一个
            curNode1=curNode0.next;
            curNode2=curNode1.next;
            moveFlag++;

        }
        return  dummpy.next;
    }


}
