package leetcode_algorithm;

import java.util.Stack;

/**
 * @program: LeetcodeLearn
 * @className: RemoveStarts
 * @description:
 * @author:
 * @create: 2024-09-14 10:00
 * @Version 1.0
 **/
public class RemoveStarts {

    public String removeStars(String s) {
        StringBuilder res = new StringBuilder();
        if(!s.contains("*")) {
            return s;
        }
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar == '*') {
                stack.pop();
            } else {
                stack.push(aChar);
            }
        }
        for (Character c : stack) {
            res.append(c);
        }
        return res.toString();
    }
}
