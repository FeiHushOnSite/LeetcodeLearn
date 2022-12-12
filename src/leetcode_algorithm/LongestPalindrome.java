package leetcode_algorithm;

/**
 * @program: leetcode
 * @className: LongestPalindrome
 * @description: 给你一个字符串 s，找到 s 中最长的回文子串。
 * s = "babad"
 * 输出："bab"
 * @author:
 * @create: 2022-11-03 09:21
 * @Version 1.0
 **/
public class LongestPalindrome {

    private final static String TARGET = "ababa";

    public static void main(String[] args) {
        String result = longestPalindrome(TARGET);
    }

    public static String longestPalindrome(String s) {
        int len = s.length();
        if(len < 2) {
            return s;
        }
        return null;
    }
}
