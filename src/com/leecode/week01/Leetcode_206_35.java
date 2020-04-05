package com.leecode.week01;


import java.util.HashSet;
import java.util.Set;

/**
 * 链表反转
 * https://leetcode-cn.com/problems/reverse-linked-list/
 *
 */
public class Leetcode_206_35 {

    public static void main(String[] args) {
        Leetcode_206_35 lc=new Leetcode_206_35();
        //ListNode listNode=new ListNode();
        //lc.reverseList();
        int[] arr={1,2,3,4,5};
        ListNode listNode=  lc.buildListNode(arr);
        lc.print(listNode);
        ListNode reverseList=lc.reverseList(listNode);
         System.out.println();
        lc.print(reverseList);
    }


    /**
     * 反转链表
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
      //定义一个reverseNode，等于头结点
      //不断在原来的链表中摘结点，插在  定义一个reverseNode 之后 第二个结点之前
      //再把head.next指向 定义一个reverseNode
        ListNode reverseNode=new ListNode(-1);
        ListNode currentNode=head;//当前节点
        while(currentNode!=null){
            ListNode next=currentNode.next;//保留当前节点
            currentNode.next=reverseNode.next;
            reverseNode.next=currentNode;
            currentNode=next;
        }

        return reverseNode.next;
    }

    public void print(ListNode listNode){
        ListNode index=listNode;
       //Set<Integer>  cache=new HashSet<>();
        while (index!=null){
            System.out.print(index.val+"->");
           // cache.add(index.val);
            index=index.next;
        }

    }
    public ListNode buildListNode(int[] arr){
        ListNode index=null;
        ListNode head=null;//头结点就是第一个元素
        //基于数组去构造一个list
        for(int i=0;i<arr.length;i++){
            ListNode listNode=new ListNode(arr[i]);
            if(i==0){
                head=listNode;
                index=listNode;
            }else{
                index.next=listNode;
                index=listNode;
            }
        }
        return head;
    }




    static class ListNode{
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }




}
