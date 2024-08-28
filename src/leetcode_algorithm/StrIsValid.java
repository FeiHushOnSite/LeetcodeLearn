package leetcode_algorithm;

import java.util.Stack;

/**
 * @program: LeetcodeLearn
 * @className: StrIsValid
 * @description: 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 * 1. 左括号必须用相同类型的右括号闭合。
 * 2. 左括号必须以正确的顺序闭合。
 * 3. 每个右括号都有一个对应的相同类型的左括号。
 * 题意解读
 * 什么情况下是有效字符串？
 * 可以从消消乐的角度理解，每次可以消除一对相邻的匹配括号，不断消除，如果可以把 s 变成空字符串，则 s 是有效字符串。
 * 比如 (), (()), [()], [()]{} 等等，都可以通过消除，把 s 变成空字符串。例如: [()] -> [] -> 空串
 *
 * @author:
 * @create: 2024-08-23 10:09
 * @Version 1.0
 **/
public class StrIsValid {
    public static void main(String[] args) {
        boolean res1 = isValid("()");
        System.out.println(res1);
        boolean res2 = isValid("()[]{}");
        System.out.println(res2);
        boolean res3 = isValid("(]");
        System.out.println(res3);
    }

    public static boolean isValid(String s) {
        Stack<Character> a = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // 临时创建一个c存放本次循环取出的字符
            if (c == '(' || c == '{' || c == '[') {
                a.push(c);
            } else { //如果不属于左边三种
                if (!a.isEmpty()) {
                    char b = a.pop();
                    if (b == '(' && c != ')') {
                        return false;
                    } else if (b == '{' && c != '}') {
                        return false;
                    } else if (b == '[' && c != ']') {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return a.isEmpty(); // 如果栈空了就是true，如果不空，例如剩下( 则为false
    }
}
