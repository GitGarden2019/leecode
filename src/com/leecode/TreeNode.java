package com.leecode;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x){val=x;}


     public static int index=0;
     public static  TreeNode createBinaryV1(int[] arr,int length){

        TreeNode treeNode=null;
        if(index<length&&arr[index]!=-1){
            treeNode=new TreeNode(arr[index]);
            System.out.println("arr["+index+"]->"+arr[index]);

            index++;
            treeNode.left=createBinaryV1(arr,length);

            index++;
            treeNode.right=createBinaryV1(arr,length);


            return treeNode;
        }

        return treeNode;

    }

}
