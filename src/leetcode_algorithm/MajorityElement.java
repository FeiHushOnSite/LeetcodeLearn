package leetcode_algorithm;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @program: LeetcodeLearn
 * @className: MajorityElement
 * @description:
 * @author:
 * @create: 2024-08-27 09:40
 * @Version 1.0
 **/
public class MajorityElement {
    public static void main(String[] args) {
        int[] tar = new int[]{3, 2, 3};
        int i = majorElement(tar);
        System.out.println(i);
    }

    public static int majorElement(int[] nums) {
        int maxValue = 0;
        int maxKey = 0;
        //先找出出现最多次数的元素
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.computeIfPresent(num, (k, v) -> v + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxKey = entry.getKey();
                maxValue = entry.getValue();
            }
        }
        return maxKey;
    }
}
