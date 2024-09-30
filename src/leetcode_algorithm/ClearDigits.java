package leetcode_algorithm;

import java.util.LinkedList;

/**
 * @program: LeetcodeLearn
 * @className: ClearDigits
 * @description: 给定一个字符串s
 * 重复操作删除操作 删除所有数字字符
 * 删除第一个数字字符 以及它左边最近的 非数字字符
 * @author:
 * @create: 2024-09-05 10:05
 * @Version 1.0
 **/
public class ClearDigits {

    public String clearDigits(String s) {
        StringBuilder res = new StringBuilder();
        LinkedList<Character> linkedList = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if(c >= '0' && c<= '9') {
                linkedList.pollLast();
            } else {
                linkedList.offer(c);
            }
        }
        while (!linkedList.isEmpty()) {
            res.append(linkedList.poll());
        }
        return res.toString();
    }
}
