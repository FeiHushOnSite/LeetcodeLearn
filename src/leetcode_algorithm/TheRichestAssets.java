package leetcode_algorithm;

import java.util.Arrays;

/**
 * @program: leetcode
 * @className: TheRichestAssets
 * @description: 给你一个 m x n 的整数网格 accounts ，其中 accounts[i][j] 是第 i 位客户在第 j 家银行托管的资产数量。返回最富有客户所拥有的 资产总量 。
 * 客户的资产总量就是他们在各家银行托管的资产数量之和。最富有的客户就是资产总量最大的客户
 * @author:
 * @create: 2022-11-01 09:03
 * @Version 1.0
 **/
public class TheRichestAssets {
    static int[][] account = {{2, 8, 7}, {3, 2, 1}, {10, 7 ,9}};

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int res = setAccount(account);
        System.out.println("最大资产是:" + res);
        long end = System.currentTimeMillis();
        System.out.println("运行时间=>>>>>>" + (end - start));
    }

    public static int setAccount(int[][] account) {
        int max = 0;
        for (int[] ints : account) {
            int sum = Arrays.stream(ints).sum();
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
