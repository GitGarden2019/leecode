package com.leecode;

public class P21 {


    public static ListNode buildNode(int[] nums){
        ListNode ln=new ListNode(nums[0]);
        for(int i=1;i<nums.length;i++){
            insertNode(ln,nums[i]);
        }
        return ln;
    }

    public static void main(String[] args) {

        //先试试插入一个节点的情况，链表需要有序的话
       // ListNode l0=buildNode(new int[]{1,2,3,4});



       // insertNode(l0,3);
       // insertNode(l0,2);
        //print(l0);



        //[1,2,4]
        //[1,3,4]

        ListNode l1=buildNode(new int[]{1,2,4});
        print(l1);

        ListNode l2=buildNode(new int[]{1,3,4});
        print(l2);
        mergeTwoLists(l1,l2);

        print(l1);

    }

    /**
     *  1.简单的方式，直接遍历第二个链表，插入第一个链表中就行
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        return null;
    } /*{
        ListNode finalListNode=null;

        if(l1.val>=l2.val){
            finalListNode=new ListNode(l2.val);
            l2=l2.next;
        }else{
            finalListNode=new ListNode(l1.val);
            l1=l1.next;
        }

        if(l1==null){
            finalListNode.next=l2;
            return finalListNode;
        }

        if(l2==null){
            finalListNode.next=l1;
            return finalListNode;
        }

        ListNode cuNode=l1.val>l2.val?l2:l1;
        while (l1!=null)



        return l1;
    }*/

    /**
     *插入元素，要求还是按顺序
     * @param targetNum
     */
    public static void insertNode(ListNode l0,int targetNum){
        ListNode curNode=l0;
        while(curNode!=null){
            //元素前面插,等于的情况前后都可以
            if(targetNum<=curNode.val){

            }else{
                //比当前元素大,肯定会在当前元素后面,当次不处理,指针后移
            }
        }

    }

    public static void print(ListNode l0){
        System.out.println("");
        ListNode ln=l0;
        while(ln!=null){
            if(ln.next!=null){
                System.out.print(ln.val+"->");
            }else{
                System.out.print(ln.val);
            }
            ln=ln.next;
        }
    }

}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
    }
}

