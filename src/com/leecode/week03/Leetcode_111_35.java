package com.leecode.week03;

import com.leecode.TreeNode;

/**
 * https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/
 * 给定一个二叉树，找出其最小深度
 */
public class Leetcode_111_35 {
    public static void main(String[] args) {
        Leetcode_111_35 lc=new Leetcode_111_35();
        //int[] arr={3,2,9,-1,-1,10,-1,-1,8,-1,11,-1};
        //[3,9,20,null,null,15,7]
       // int[] arr={3,9,20,-1,-1,-1,15,7};
       int[] arr={3,2};
        TreeNode treeNode=TreeNode.createBinaryV1(arr,arr.length);
       int minDept= lc.minDepth(treeNode);
        System.out.println("minDepth->"+minDept);
    }


    /**
     * 递归
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {
        return root == null ? 0 : (1 + Math.min(minDepth(root.left), minDepth(root.right)));
    }
}
