package leetcode_algorithm;

/**
 * @program: IdeaProjects
 * @className: MinOperations
 * @description: 有n个盒子，给你一个长度为n的二进制字符串boxes，其中boxes[i]的值为'0'表示第i个盒子是空的，而boxes[i]的值表示盒子里有一个小球。
 * 在一步操作中，你可以将一个小球从某个盒子移动到一个与之相邻的盒子中。第i个盒子和第j个盒子相邻需满足abs(i - j) == 1。注意，操作执行后，某些盒子中可能会存在不止一个小球
 * 返回一个长度为n的数组answer,其中answer[i]是将所有小球移动到
 * @author:
 * @create: 2022-12-02 10:04
 * @Version 1.0
 **/
public class MinOperations {

    public static void main(String[] args) {
        int[] ints = minOperations("001011");
        for (int anInt : ints) {
            System.out.print(anInt + ",");
        }
    }

    public static int[] minOperations(String boxes) {
        int length = boxes.length();
        int[] res = new int[length];
        for (int i = 0; i < length; i++) {
            int sm = 0;
            for (int j = 0; j < length; j++) {
                if(boxes.charAt(j) == '1') {
                    sm += Math.abs(j - i);
                }
            }
            res[i] = sm;
        }
        return res;
    }
}
