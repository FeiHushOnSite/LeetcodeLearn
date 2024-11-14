package leetcode_algorithm;

/**
 * @program: LeetcodeLearn
 * @className: CountKConstraintSubstrings
 * @description:
 * @author:
 * @create: 2024-11-12 11:16
 * @Version 1.0
 **/
public class CountKConstraintSubstrings {

    public int countKConstraintSubstrings(String s, int k) {
        int res = 0;
        int n = s.length();
        int[] cnt = new int[2];
        int right = 0;
        for (int i = 0; i < n; i++) {
            ++cnt[s.charAt(i) - '0'];
            while(cnt[0] > k && cnt[1] > k) {
                cnt[s.charAt(right++) - '0']--;
            }
            res += i - right + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        CountKConstraintSubstrings c = new CountKConstraintSubstrings();
        int i = c.countKConstraintSubstrings("10101", 1);
        System.out.println(i);
    }
}
