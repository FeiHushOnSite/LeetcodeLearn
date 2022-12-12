package leetcode_TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @className: ZigzagLevelOrder
 * @description: 给你二叉树的根节点 root ，返回其节点值的 锯齿形层序遍历 。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
 * 输入：root = [3, 9, 20, null, null, 15, 7]
 * 输出：[[3], [20, 9], [15, 7]]
 * @author:
 * @create: 2022-11-11 09:57
 * @Version 1.0
 **/
public class ZigzagLevelOrder {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        List<TreeNode> treeNodes = new ArrayList<>();
        treeNodes.add(new TreeNode(1));
        treeNodes.add(new TreeNode(2, new TreeNode(4), new TreeNode(5)));
        treeNodes.add(new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        treeNode.getStr(3, treeNodes);
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        return null;
    }
}
