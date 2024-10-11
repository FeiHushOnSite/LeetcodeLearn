package leetcode_algorithm;

/**
 * @program: LeetcodeLearn
 * @className: MidSearchAlgorithm
 * @description:
 * @author:
 * @create: 2024-10-10 15:54
 * @Version 1.0
 **/
public class MidSearchAlgorithm {

    public static void main(String[] args) {
        MidSearchAlgorithm midSearchAlgorithm = new MidSearchAlgorithm();
        int i = midSearchAlgorithm.BinarySearch(new int[]{11, 22, 33, 44, 55, 66, 77}, 22);
        //返回下标位置
        System.out.println(i);
    }

    public int BinarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        // 在搜索范围内进行二分查找
        while(low <= high) {
            int mid = (low + high) / 2;

            //目标元素等于中间位置的元素
            if(arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) { //目标元素小于中间位置元素，缩小搜索范围为左半部分
                high = mid - 1;
            }
            //目标元素大于中间位置元素，缩小搜索范围为右半部分
            else {
                low = mid + 1;
            }
        }
        //没有找到目标元素
        return -1;
    }
}
