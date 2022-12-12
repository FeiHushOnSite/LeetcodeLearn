package leetcode_TreeNode;

/**
 * @program: leetcode
 * @className: IsValidBST
 * @description:
 * @author:
 * @create: 2022-11-18 10:46
 * @Version 1.0
 **/
public class IsValidBST {

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.convertArrToTree(new Integer[]{2, 1, 3});
        boolean validBst = isValidBst(treeNode);
        System.out.println(validBst);
    }

    public static boolean isValidBst(TreeNode root) {
        return isValidBst(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }

    public static boolean isValidBst(TreeNode root, long maxValue, long minValue) {
        if(root == null) {
            return true;
        }

        if(root.val >= maxValue || root.val <= minValue) {
            return false;
        }
        /**
         * 这里再分别以左右两个子节点分别做判断
         * 左子树范围的最小值是minValue,最大值是当前节点的值，也就是root的值，因为左子树的值要比当前节点要小
         * 右子树范围的最大值是maxValue,最小值是当前节点的值，也就是root的值，因为右子树的值要比当前节点要大
         */
        return isValidBst(root.right, maxValue, root.val) && isValidBst(root.left, root.val, minValue);
    }
}
