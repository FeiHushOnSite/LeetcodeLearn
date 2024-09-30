package leetcode_algorithm;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: LeetcodeLearn
 * @className: CountWays
 * @description: 让所有学生保持开心的分组方法数
 * 给定一个下标从0开始、长度为 n 的整数数组nums,其中 n 是班级中学生的总数。班主任希望能够在让所有学生保持开心的情况下选出一组学生:
 * 如果能满足下述两个条件之一，则认为第 i 位学生将会保持开心
 * - 这位学生被选中，并且被选中的学生人数严格大于 nums[i]
 * - 这位学生没有被选中，并且被选中的学生人数严格小于 nums[i]
 * 返回能够满足让所有学生保持开心的分组方法的数目
 * @author:
 * @create: 2024-09-04 09:13
 * @Version 1.0
 **/
public class CountWays {

    public int countWays(List<Integer> nums) {
        int size = nums.size();
        Collections.sort(nums);
        int res = 0;
        for (int i = 0; i <= size; i++) {
            // 前 k 个元素的最大值是否小于 k
            if (i > 0 && nums.get(i - 1) >= i) {
                continue;
            }
            // 后 n - k 个元素的最小值是否大于 k
            if (i < size && nums.get(i) <= i) {
                continue;
            }
            res++;
        }
        return res;
    }

    public boolean checkTwoChessboards(String s1, String s2) {
        // 0 is black, 1 is white
        Map<String, String> table = new HashMap<>();
        String[] letter = new String[]{"a", "b", "c", "d", "e", "f", "g", "h"};
//        String[] letter = new String[]{"a", "b"};
        for (int i = 0; i < letter.length; i++) {
            for (int j = 1; j <= 8; j++) {
                table.put(letter[i] + j, (((i + j) % 2) == 0) ? "w" : "b");
            }
        }
        table.forEach((k, v) -> System.out.println("key:" + k + ", value:" + v));
        return table.get(s1).equals(table.get(s2));
    }
}
