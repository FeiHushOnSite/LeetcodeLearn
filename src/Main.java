import leetcode_algorithm.ClearDigits;
import leetcode_algorithm.CountSpecialNumbers;
import leetcode_algorithm.CountWays;
import leetcode_algorithm.DifferenceOfSum;
import leetcode_algorithm.LatestTimeCatchTheBus;
import leetcode_algorithm.LongestContinuousSubstring;
import leetcode_algorithm.MaxConsecutiveAnswers;
import leetcode_algorithm.MaxStrength;
import leetcode_algorithm.RemoveStarts;

import java.util.Arrays;
import java.util.List;

/**
 * @program: LeetcodeLearn
 * @className: Main
 * @description:
 * @author:
 * @create: 2024-09-02 09:58
 * @Version 1.0
 **/
public class Main {

    public static void main(String[] args) {
//        MaxConsecutiveAnswers maxConsecutiveAnswers = new MaxConsecutiveAnswers();
//        int i = maxConsecutiveAnswers.maxConsecutiveAnswers("TTFF", 1);
//        System.out.println(i);

//        MaxStrength maxStrength = new MaxStrength();
//        long l = maxStrength.maxStrength(new int[]{3, -1, -5, 2, 5, -9});
//        System.out.println(l);

//        CountWays countWays = new CountWays();
//        List<Integer> nums = Arrays.asList(1, 1);
//        int i = countWays.countWays(nums);
//        System.out.println(i);
//        boolean result = countWays.checkTwoChessboards("a1", "h3");
//        System.out.println(result);

//        ClearDigits clearDigits = new ClearDigits();
//        String s = clearDigits.clearDigits("cb34");
//        System.out.println(s);

//        RemoveStarts removeStarts = new RemoveStarts();
////        String input = "leet**cod*e";
//        String input = "erase*****";
//        String s = removeStarts.removeStars(input);
//        System.out.println(s);

//        LatestTimeCatchTheBus latestTimeCatchTheBus = new LatestTimeCatchTheBus();
//        int res = latestTimeCatchTheBus.latestTimeCatchTheBus(new int[]{20,30,10}, new int[]{19,13,26,4,25,11,21}, 2);
//        System.out.println(res);

//        LongestContinuousSubstring longestContinuousSubstring = new LongestContinuousSubstring();
//        int res = longestContinuousSubstring.longestContinuousSubstring("abacaba");
//        System.out.println(res);

//        CountSpecialNumbers countSpecialNumbers = new CountSpecialNumbers();
//        int res = countSpecialNumbers.countSpecialNumbers(5);
//        System.out.println(res);

        DifferenceOfSum differenceOfSum = new DifferenceOfSum();
        int i = differenceOfSum.differenceOfSum(new int[]{1, 15, 3, 6});
        System.out.println(i);
    }
}
