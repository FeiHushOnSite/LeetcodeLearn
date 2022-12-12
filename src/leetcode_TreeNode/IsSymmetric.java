package leetcode_TreeNode;

/**
 * @program: leetcode
 * @className: IsSymmetric
 * @description: 给定一个二叉树节点，检查是否对称
 * root = [1, 2, 2, 3, 4, 4, 3]
 * 输出：true
 * @author:
 * @create: 2022-11-21 09:20
 * @Version 1.0
 **/
public class IsSymmetric {

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.convertArrToTree(new Integer[]{1, 2, 2, 3, 4, 4, 3});
        boolean symmetric = isSymmetric(treeNode);
        System.out.println(symmetric);
    }

    public static boolean isSymmetric(TreeNode head) {
        if (head == null) {
            return true;
        }
        //从两个子节点开始判断
        return helper(head.left, head.right);
    }

    public static boolean helper(TreeNode left, TreeNode right) {
        //如果左右节点都为空，说明当前节点是叶子节点，返回true
        if (left == null && right == null) {
            return true;
        }
        //如果当前节点只有一个子节点或者有两个子节点，但两个子节点的值不相同，直接返回false
        if (left == null || right == null || left.val != right.val) {
            return false;
        }
        //然后左子节点的左子节点和右子节点的右子节点相比较，左子节点的右子节点和右子节点的左子节点相比较
        return helper(left.left, right.right) && helper(left.right, right.left);
    }
}
