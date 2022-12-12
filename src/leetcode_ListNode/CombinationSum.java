package leetcode_ListNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @program: IdeaProjects
 * @className: CombinationSum
 * @description: 给你一个 无重复元素 的整数数组candidates 和一个目标整数target，
 * 找出candidates中可以使数字和为目标数target 的 所有不同组合 ，并以列表形式返回。你可以按 任意顺序 返回这些组合。
 * candidates 中的 同一个 数字可以 无限制重复被选取 。如果至少一个数字的被选数量不同，则两种组合是不同的。
 * 对于给定的输入，保证和为target 的不同组合数少于 150 个。
 * 输入: candidates = [2, 3, 6, 7], target = 7
 * 输出: [[2, 2, 3], [7]]
 * 解释: 2 和 3 可以形成组候选， 2 + 2 + 3 = 7 注意 2可以使用多次
 * 7也是个候选 7 = 7
 * @author:
 * @create: 2022-11-30 09:27
 * @Version 1.0
 **/
public class CombinationSum {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 6, 7};
        System.out.println(combinationSum(nums, 7));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        //定义一个返回结果的集合
        List<List<Integer>> res = new ArrayList<>();
        //定义一个存储树路径上的节点值 Deque双端队列
        Deque<Integer> path = new ArrayDeque<>();
        //定义一个表示数组长度的变量
        int len = candidates.length;
        //深度搜索
        dfs(candidates, len, 0, target, path, res);
        return res;
    }

    public static void dfs(int[] candidates, int len, int begin, int target, Deque<Integer> path, List<List<Integer>> res) {
        //如果此时目标元素经过几次深度递归，减值
        //就说明，数组中不存在能相加等于目标数组的元素集合
        if(target < 0) {
            return;
        }
        //如果刚好减到0，说明此时路径上的元素，相加等于目标元素。
        //此时路径上的元素就符合条件，将它们加入返回结果中，并退出此次递归
        if(target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        //遍历元素，这里的i必须要跟递归层数保持一致，要不要剪枝时，会照成重复元素
        for(int i = begin; i < len; i++) {
            //将路径上的元素加入结果集合中
            path.add(candidates[i]);
            //在进行一轮减枝到根节点的时候，下一轮的搜索的启点就不能包括上一次的搜索的下标了
            //此时再拼接重复元素的时候，起点只能是大于等于当前元素的下标
            dfs(candidates, len, i, target - candidates[i], path, res);
            //将元素进行删除，也叫剪枝
            //必须从队列的尾部开始删除，这样才能达到从底层逐层删除
            path.removeLast();
        }
    }
}
