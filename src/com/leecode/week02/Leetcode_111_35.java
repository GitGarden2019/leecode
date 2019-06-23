package com.leecode.week02;

import com.leecode.TreeNode;

/**
 * 111. 二叉树的最小深度
 *
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最小深度  2.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-depth-of-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
public class Leetcode_111_35 {
    public static void main(String[] args) {
        Leetcode_111_35 lc=new Leetcode_111_35();

    }

    /**
     * 首先考虑，每个叶子节点都对应一个深度，怎么求这个深度
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {

        return 0;
    }

    /**
     * 输出叶子节点的深度:最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
     * @param root
     * @return
     */
    int dept=0;
    public void depth(TreeNode root) {

        if(root==null){
            System.out.println("当前深度:"+dept);
            dept++;
        }else{
            depth(root.left);

            depth(root.right);
        }

    }
}
