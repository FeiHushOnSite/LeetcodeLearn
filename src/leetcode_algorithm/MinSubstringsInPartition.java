package leetcode_algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: LeetcodeLearn
 * @className: MinSubstringsInPartition
 * @description: 给定一个字符串s，需要将其分割成一个或者多个平衡子字符串，比方说： s == "ababcc" 那么{"abab", "c", "c"},
 * {"ab", "abc", "c"} 和 {"ababcc"} 都是合法分割，但是{"a", "bab", "cc"}, {"aba", "bc", "c"} 和 {“ab”, "abcc"}不是
 * 不平衡的子串用粗体表示
 * 请你返回 s 最少 能分割成多少个平衡子字符串。
 * 注意：一个 平衡 字符串指的是字符串中所有字符出现的次数都相同。
 * @author:
 * @create: 2024-08-28 10:05
 * @Version 1.0
 **/
public class MinSubstringsInPartition {

    /**
     * 0x3f3f3f3f的十进制是1061109567，是10^9级别的，而一般场合下的数据都是小于10^9的，所以它可以作为无穷大使用而不致出现数据大于无穷大的情形。
     * 一个0x3f3f3f3f可以减少考虑的时间，一般情况下就可以当作是一个无穷大的数去用。
     * int型整数的最大值 int 型是4个字节，一个字节是8位，0x3f 是 00111111
     * 4个0x3f 也就是int型整数的无穷大 但并不是最大值
     */
    static final int INF = 0x3f3f3f3f;

    public static void main(String[] args) {
        String s = "fabccddg";
        System.out.println(partitionStr(s));
    }

    public static int partitionStr(String s) {
        int len = s.length();
        int[] d = new int[len + 1];
        Arrays.fill(d, INF);
        //为了方便编写代码，数组 d 下标从 1 开始，d[0] 初始化为 0，其余所有状态初始化为正无穷。最后答案为 d[n]。
        d[0] = 0;
        for (int i = 1; i <= len; i++) {
            Map<Character, Integer> occCnt = new HashMap<>();
            int maxCnt = 0;
            for (int j = i; j >= 1; j--) {
                occCnt.put(s.charAt(j - 1), occCnt.getOrDefault(s.charAt(j - 1), 0) + 1);
                // 直接判断子串是否为平衡字符串复杂度较高，并且有大量的重复计算。因此考虑每次枚举i之后，再从i开始倒序枚举j,过程中维护
                // 一个哈希表occ_cnt，用于存储每种字符出现的次数。另外，为了判断快速所有字符出现的次数是否相等
                maxCnt = Math.max(maxCnt, occCnt.get(s.charAt(j - 1)));
                if(maxCnt * occCnt.size() == (i - j + 1) && d[j - 1] != INF) {
                    // 动态规划 设置d[i]为将以i结尾的前缀字符串划分平衡字符串最少个数。那么每次判定s[j]至s[i]之间构成的子串为平衡字符串之后的转移方程
                    d[i]= Math.min(d[i], d[j - 1] + 1);
                }
            }
        }
        return d[len];
    }
}
