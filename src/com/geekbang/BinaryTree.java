package com.geekbang;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * 二叉树的基本操作
 */
public class BinaryTree {

  static  class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;

        }
    }

    public static void main(String[] args) {
        int[] arr={3,2,9,-1,-1,10,-1,-1,8,-1,11,-1};
        TreeNode treeNode= createBinaryV1(arr,arr.length);
       // System.out.println(treeNode.val);

        preOrderTraveral(treeNode);
        System.out.println();
        inOrderTraveral(treeNode);
        System.out.println();
        postOrderTraveral(treeNode);
        System.out.println();
        levelOrderTraveral(treeNode);
        System.out.println();
        traveralDfs(treeNode);

    }

    /**
     * 前序创建二叉树
     * @param arr
     * @param length
     * @param index
     * @return
     */
    static int index=0;
    static TreeNode createBinaryV1(int[] arr,int length){

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

    /**
     * 层序创建二叉树
     * @param arr
     * @param len
     * @param index
     * @return
     */
    TreeNode createBinaryV2(int arr,int len,int index){
        return null;
    }

    /**
     * 先序遍历二叉树,根节点->左边->右边
     * @param node
     */
    static void preOrderTraveral(TreeNode node){
        if(node==null){
            return;
        }

        System.out.print(node.val+" ");
        preOrderTraveral(node.left);
        preOrderTraveral(node.right);


    }

    /**
     * 中序遍历二叉树 左边->根节点->右边
     * @param node
     */
    static void inOrderTraveral(TreeNode node){
        if(node==null){
            return;
        }

        inOrderTraveral(node.left);
        System.out.print(node.val+" ");
        inOrderTraveral(node.right);
    }

    /**
     * 后序遍历二叉树
     * @param node
     */
    static  void postOrderTraveral(TreeNode node){
        if(node==null){
            return;
        }
        postOrderTraveral(node.left);
        postOrderTraveral(node.right);
        System.out.print(node.val+" ");


    }

    /**
     * 层序遍历二叉树,相当于广度优先搜索Breadth First Search
     * @param node
     */
    static void levelOrderTraveral(TreeNode node){

        Queue<TreeNode> queue=new ArrayDeque<>();

        if(node!=null){
            queue.offer(node);
        }

        while (!queue.isEmpty()){
            TreeNode curNode=queue.poll();
            System.out.print(curNode.val +" ");

            if(curNode.left!=null){
                queue.offer(curNode.left);
            }

            if(curNode.right!=null){
                queue.offer(curNode.right);
            }
        }

    }

    //Depth First Search

    static void traveralDfs(TreeNode node){
        Stack<TreeNode> stack=new Stack<>();

        stack.push(node);

        while (!stack.empty()){
            TreeNode tmpNode=stack.pop();
            System.out.print(tmpNode.val +" ");

            if(tmpNode.right!=null){
                stack.push(tmpNode.right);
            }
            if(tmpNode.left!=null){
                stack.push(tmpNode.left);
            }
        }
    }


    /**
     * 返回二叉树的深度
     * @param node
     * @return
     */
    int treeDepth(TreeNode node){
        return 0;
    }

}
