package leetcode_algorithm;

/**
 * @program: LeetcodeLearn
 * @className: MaxConsecutiveAnswers
 * @description: 给定一个字符串 answerKey, 其中answerKey[i]是第 i 个问题的正确结果。除此之外，还给一个整数 k，表示能进行一下操作的最多次数
 * - 每次操作中，把问题的正确答案改为 'T' 或者 ‘F’ (也就是将answerKey[i] 改为 ‘T’ 或者 'F')
 * 问：返回在不超过k次情况下，最大连续 'T' 或 ‘F’ 的数目
 * @author:
 * @create: 2024-09-02 09:59
 * @Version 1.0
 **/
public class MaxConsecutiveAnswers {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(maxConsecutiveChar(answerKey, k, 'T'), maxConsecutiveChar(answerKey, k , 'F'));
    }
    private int maxConsecutiveChar(String answerKey, int k, char ch) {
        int len = answerKey.length();
        int res = 0;
        for(int left = 0, right = 0, sum = 0; right < len; right++) {
            sum += answerKey.charAt(right) != ch ? 1 : 0;
            while(sum > k) {
                sum -= answerKey.charAt(left++) != ch ? 1 : 0;
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}
