package leetcode_algorithm;

/**
 * @program: leetcode
 * @className: SearchInsert
 * @description:
 * @author:
 * @create: 2022-11-23 09:43
 * @Version 1.0
 **/
public class SearchInsert {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
        int i = searchInsert(nums, 4);
        System.out.println(i);
    }

    public static int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                return i;
            } else if(nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }
}
