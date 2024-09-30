package leetcode_algorithm;

/**
 * @program: LeetcodeLearn
 * @className: MaxStrength
 * @description: 给定一个下标从0开始的整数数组nums, 它表示一个班级中所有学生在一次考试中的成绩。老师想选出一部分同学组成一个非空小组，且这个小组的实力值最大
 * 如果这个小组里的学生下标为 i0, i1, i2 .....ik, 那么这个小组的实力值定义为nums[i0] * nums[i1] * nums[i2] * ... * nums[ik]
 * 返回老师创建的小组能得到的最大实力值是多少
 * 输入 nums = [3, -1, -5, 2, 5, -9]
 * 输出 1350
 * 解释：一种构成最大实力值小组的方案是选择下标为[0, 2, 3, 4, 5]的学生。实力值为 3 * (-5) * 2 * 5 * (-9) 这是可以得到的最大实力值
 * @author:
 * @create: 2024-09-03 09:36
 * @Version 1.0
 **/
public class MaxStrength {
//    public long maxStrength(int[] nums) {
//        int n = nums.length;
//        long[][] f = new long[n][2];
//        f[0][0] = nums[0];
//        f[0][1] = nums[0];
//        // 0 -> min[]
//        // 1 -> max[]
//        for (int i = 1; i < n; i++) {
//            long x = nums[i];
//            f[i][0] = Math.min(Math.min(x, f[i - 1][0]), Math.min(f[i - 1][0] * x, f[i - 1][1] * x));
//            f[i][1] = Math.max(Math.max(x, f[i - 1][1]), Math.max(f[i - 1][0] * x, f[i - 1][1] * x));
//        }
//        return f[n - 1][1];
//    }

    public long maxStrength(int[] nums) {
        int n = nums.length;
        long mn = nums[0];
        long mx = mn;
        for (int i = 1; i < n; i++) {
            long x = nums[i];
            long tmp = mn;
            mn = Math.min(Math.min(mn, x), Math.min(mn * x, mx * x));
            mx = Math.max(Math.max(mx, x), Math.max(mx * x, tmp * x));
        }
        return mx;
    }
}
