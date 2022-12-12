package leetcode_algorithm;

/**
 * @program: leetcode
 * @className: RemoveElement
 * @description: 给定一个数组nums和一个值val,需要原地移除所有数值等于val的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，必须仅使用O（1）额外空间并原地 修改输入数组
 * 元素的顺序可以改变，不需要考虑数组中超出新长度后面的元素。
 * @author:
 * @create: 2022-11-29 09:54
 * @Version 1.0
 **/
public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 2, 3};
        int i = removeElement(nums, 3);
        System.out.println(i);
    }

    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                len--;
            } else {
                nums[index] = nums[i];
                index++;
            }
        }
        return len;
    }
}
