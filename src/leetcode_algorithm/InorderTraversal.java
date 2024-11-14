package leetcode_algorithm;

import leetcode_TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetcodeLearn
 * @className: InorderTraversal
 * @description:
 * @author:
 * @create: 2024-10-14 09:44
 * @Version 1.0
 **/
public class InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    public void inorder(TreeNode root, List<Integer> res) {
        if(root == null) {
            return;
        }

        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }

    public static void main(String[] args) {
        InorderTraversal inorderTraversal = new InorderTraversal();

    }
}

