package leetcode_TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @program: leetcode
 * @className: MaxDepth
 * @description: 给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * 说明: 叶子节点是指没有子节点的节点。
 * 给定二叉树 [3,9,20,null,null,15,7]
 * @author:
 * @create: 2022-11-17 09:59
 * @Version 1.0
 **/
public class MaxDepth {
    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.convertArrToTree(new Integer[]{3, 9, 20, null, null, 15, 7});
//        int i = maxDepth(treeNode);
//        System.out.println(i);
    }

//    public static int maxDepth(TreeNode root) {
//        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
//    }

//    public static int maxDepth(TreeNode root) {
//        if(root == null) {
//            return 0;
//        }
//
//        //创建一个队列
//        Deque<TreeNode> deque = new LinkedList<>();
//    }
}
