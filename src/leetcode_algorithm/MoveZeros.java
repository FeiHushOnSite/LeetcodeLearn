package leetcode_algorithm;

/**
 * @program: leetcode
 * @className: MoveZeros
 * @description:
 * @author:
 * @create: 2022-12-11 14:26
 * @Version 1.0
 **/
public class MoveZeros {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        int idx = 0;
        for (int num : nums) {
            if(num != 0) {
                nums[idx++] = num;
            }
        }
        while(idx < nums.length) {
            nums[idx++] = 0;
        }
//        moveZeros(nums);
        for (int num : nums) {
            System.out.println(num);
        }
        System.out.println(idx);
    }

    public static void moveZeros(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            //只要不是零就往前挪
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[count];
                nums[count] = temp;
                count++;
            }

        }
    }
}
