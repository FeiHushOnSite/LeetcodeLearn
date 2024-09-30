package leetcode_algorithm;

/**
 * @program: LeetcodeLearn
 * @className: SumDigitDiff
 * @description: 有一个数组，只包含 正整数 所有正整数的数位长度都相同
 * 两个整数的数位不同 指的是两个整数相同 位置上不同数字的数目
 * 返回 nums 中所有整数对里， 数位不同之和
 * @author:
 * @create: 2024-08-30 09:45
 * @Version 1.0
 **/
public class SumDigitDiff {

    public static void main(String[] args) {
//        int[] nums = new int[]{13, 23, 12};
//        int[] nums = new int[]{10, 10, 10, 10};
        int[] nums = new int[]{50, 28, 48};
        System.out.println(sumDigitDifferences(nums));
        for (int num : nums) {
            num /= 10;
            System.out.println(num);
        }

    }

    public static long sumDigitDifferences(int[] nums) {
        long res = 0;
        int n = nums.length;
        while (nums[0] > 0) {
            int[] cnt = new int[10];
            for (int i = 0; i < n; i++) {
                cnt[nums[i] % 10]++;
                nums[i] /= 10;
            }
            for (int j = 0; j < 10; j++) {
                res += (long) (n - cnt[j]) * cnt[j];
            }
        }
        return res / 2;
    }
}
