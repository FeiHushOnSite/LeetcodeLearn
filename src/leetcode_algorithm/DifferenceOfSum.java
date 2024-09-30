package leetcode_algorithm;

import java.util.Arrays;

/**
 * @program: LeetcodeLearn
 * @className: DifferenceOfSum
 * @description:
 * @author:
 * @create: 2024-09-26 09:34
 * @Version 1.0
 **/
public class DifferenceOfSum {

    public int differenceOfSum(int[] nums) {
        return Math.abs(Arrays.stream(nums).sum() - Arrays.stream(nums).map(this::sumDigits).sum());
    }

    private int sumDigits(int nums) {
        if (nums == 0) {
            return 0;
        }
        return nums % 10 + sumDigits(nums / 10);
    }
}
