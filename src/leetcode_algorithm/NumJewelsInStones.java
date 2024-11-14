package leetcode_algorithm;

/**
 * @program: LeetcodeLearn
 * @className: NumJewelsInStones
 * @description:
 * @author:
 * @create: 2024-11-14 09:54
 * @Version 1.0
 **/
public class NumJewelsInStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        NumJewelsInStones numJewelsInStones = new NumJewelsInStones();
        int i = numJewelsInStones.numJewelsInStones(jewels, stones);
        System.out.println(i);
    }

    public int numJewelsInStones(String jewels, String stones) {
        int res = 0;
        char[] jArray = jewels.toCharArray();
        char[] sArray = stones.toCharArray();
        for (char value : jArray) {
            for (char c : sArray) {
                if (value == c) {
                    res++;
                }
            }
        }
        return res;
    }
}
