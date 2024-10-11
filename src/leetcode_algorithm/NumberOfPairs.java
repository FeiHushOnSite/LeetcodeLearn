package leetcode_algorithm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: LeetcodeLearn
 * @className: NumberOfPairs
 * @description: 给定2个整数组nums1 和 nums2， 长度分别是n 和 m 同时给定一个正整数 k。
 * 如果nums1[i] 可以被 nums2[j] * k 整除，则称数对(i, j)为优质数对 (0 <= i <= n - 1, 0 <= j <= m - 1)
 * @author:
 * @create: 2024-10-10 09:27
 * @Version 1.0
 **/
public class NumberOfPairs {

    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;
        for (int j : nums1) {
            for (int value : nums2) {
                if (j % (value * k) == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * 哈希表 + 枚举倍数
     *
     * @param nums1 array 1
     * @param nums2 array2
     * @param k     k
     * @return long type result
     */
    public long numberOfPairsEnum(int[] nums1, int[] nums2, int k) {
        Map<Integer, Integer> cnt1 = new HashMap<>();
        for (int x : nums1) {
            if (x % k == 0) {
                cnt1.merge(x / k, 1, Integer::sum);
            }
        }
        if (cnt1.isEmpty()) {
            return 0;
        }
        Map<Integer, Integer> cnt2 = new HashMap<>();
        for (int x : nums2) {
            cnt2.merge(x, 1, Integer::sum);
        }
        long ans = 0;
        int mx = Collections.max(cnt1.keySet());
        for (Integer e : cnt2.keySet()) {
            int x = e, v = cnt2.get(e);
            int s = 0;
            for (int y = x; y <= mx; y += x) {
                if(cnt1.containsKey(y)) {
                    s += cnt1.get(y);
                }
            }
            ans += (long) s * v;
        }
        return ans;
    }

    public long numberOfPairsReLong(int[] nums1, int[] nums2, int k) {
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int x : nums1) {
            if (x % k != 0) {
                continue;
            }
            x /= k;
            for (int d = 1; d * d <= x; d++) {
                if (x % d > 0) {
                    continue;
                }
                cnt.merge(d, 1, Integer::sum);
                if (d * d < x) {
                    cnt.merge(x / d, 1, Integer::sum);
                }
            }
        }
        long ans = 0;
        for (int x : nums2) {
            ans += cnt.getOrDefault(x, 0);
        }
        return ans;
    }

    public static void main(String[] args) {
        NumberOfPairs target = new NumberOfPairs();
//        int i = target.numberOfPairs(new int[]{1, 3, 4}, new int[]{1, 3, 4}, 1);
//        System.out.println(i);
        long res = target.numberOfPairsEnum(new int[]{1, 2, 4, 12}, new int[]{2, 4}, 3);
        System.out.println("enum:" + res);
    }
}
