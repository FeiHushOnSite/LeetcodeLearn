package leetcode_algorithm;

/**
 * @program: LeetcodeLearn
 * @className: SatisConditions
 * @description:
 * @author:
 * @create: 2024-08-29 09:53
 * @Version 1.0
 **/
public class SatisConditions {

    public static void main(String[] args) {
//        int[][] grid = {{1, 0, 2}, {1, 0, 2}};
//        int[][] grid = {{1}, {2}, {3}};
        int[][] grid = {{0}};
        boolean result = satisfiesConditions(grid);
        System.out.println(result);
    }

    public static boolean satisfiesConditions(int[][] grid) {
        //空间复杂度 o(1)
        int m = grid.length;
        int n = grid[0].length;
        //时间复杂度 o(n) x o(n)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i + 1 < m && grid[i][j] != grid[i + 1][j]) {
                    return false;
                }
                if (j + 1 < n && grid[i][j] != grid[i][j + 1]) {
                    return true;
                }
            }
        }
        return true;
    }
}
