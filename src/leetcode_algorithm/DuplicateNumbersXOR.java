package leetcode_algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @program: LeetcodeLearn
 * @className: DuplicateNumbersXOR
 * @description:
 * @author:
 * @create: 2024-10-12 10:00
 * @Version 1.0
 **/
public class DuplicateNumbersXOR {

    public int duplicateNumberXOR(int[] nums) {
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int i : nums) {
            cnt.putIfAbsent(i , 0);
            cnt.computeIfPresent(i, (k, v) -> v + 1);
        }
        Integer i = cnt.entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet()).stream().reduce(0, (a, b) -> a ^ b);
        cnt.forEach((k, v) -> System.out.println("key:" + k + ": value:" + v));
        return i;
    }

    public static void main(String[] args) {
        DuplicateNumbersXOR target = new DuplicateNumbersXOR();
        int i = target.duplicateNumberXOR(new int[]{1, 2, 1, 3});
        System.out.println(i);
    }
}
