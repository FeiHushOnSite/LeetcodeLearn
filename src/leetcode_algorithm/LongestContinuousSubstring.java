package leetcode_algorithm;

/**
 * @program: LeetcodeLearn
 * @className: LongestContinuousSubstring
 * @description:
 * @author:
 * @create: 2024-09-19 10:04
 * @Version 1.0
 **/
public class LongestContinuousSubstring {

    public int longestContinuousSubstring(String s) {
        int count = 1;
        int res = 1;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] + 1 != charArray[i + 1]) {
                count = 1;
            } else {
                count++;
            }
            res = Math.max(res, count);
        }
        return res;
    }
}
