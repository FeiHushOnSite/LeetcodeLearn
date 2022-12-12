package leetcode_TreeNode;

/**
 * @program: IdeaProjects
 * @className: SortArrayToBST
 * @description:
 * 给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。
 * 高度平衡 二叉树是一棵满足「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树。
 * @author:
 * @create: 2022-12-08 10:02
 * @Version 1.0
 **/
public class SortArrayToBST {

    public static void main(String[] args) {
        int[] nums = new int[]{-10, -3, 0 ,5, 9};
        TreeNode treeNode = sortedArrayToBST(nums);
        System.out.println(TreeNode.treeToString(treeNode));
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) {
            return null;
        }
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    public static TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if(start > end)
            return null;
        int mid = (start + end) >> 1;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, start, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, end);
        return root;
    }
}
