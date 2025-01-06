package leetcode_algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TwoOutOfThree {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2, 3};
        int[] nums3 = new int[]{1, 2};

        List<Integer> list = twoOutOfThree(nums1, nums2, nums3);
        list.forEach(System.out::println);
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        List<Integer> list = twoOutOfThree(nums1, nums2);
        List<Integer> list1 = twoOutOfThree(nums2, nums3);
        List<Integer> list2 = twoOutOfThree(nums1, nums3);

        list.addAll(list1);
        list.addAll(list2);

        return new ArrayList<>(new HashSet<>(list));
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        for (int i : nums1) {
            for (int i2 : nums2) {
                if (i == i2) {
                    result.add(i);
                }
            }
        }
        return result;
    }
}
