package leetcode_algorithm;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * @program: IdeaProjects
 * @className: BoxDelivering
 * @description: 有一辆货运卡车，需要车把箱子从仓库运送到码头。这辆车每次运输有箱子树木的限制和总重量的限制。
 * 给了一个箱子数组boxes和三个整数portsCount, maxBoxes和 maxWeight,其中boxes[i] = [ports,weight]
 * ports i 表示第i个箱子需要送达的码头，weights i 是第i个箱子的重量。
 * portsCount是码头数目。
 * maxBoxes和maxWeight分别是卡车每趟运输箱子数目和重量的限制
 * 箱子按照数组顺序运输，同时每次运输需要遵循以下步骤：
 * 卡车从boxesu队列中按顺序取出若干个箱子，但不能违反amxBoxes和maxWeight限制
 * 对于在卡车上的箱子，需要按照顺序去处理它们，卡车会通过一趟行程，将最前面的箱子送到目的地码头并卸货
 * 返回将所有箱子都被卸货后，卡车需要一趟形成回仓库，从箱子队列里再取出一些箱子。
 * @author:
 * @create: 2022-12-05 15:24
 * @Version 1.0
 **/
public class BoxDelivering {

    public static void main(String[] args) {
        int[][] boxes = {{1, 1}, {2, 1}, {1, 1}};

        int i = boxDelivering(boxes, 2, 3, 3);
        System.out.println(i);
    }

    public static int boxDelivering(int[][] boxes, int portsCount, int maxBoxes, int maxWeight) {
        int len = boxes.length;
        int[] dp = new int[len + 5];
        Arrays.fill(dp, 0x3f3f3f3f);
        dp[0] = 0;
        Deque<int[]> q = new ArrayDeque<int[]>(); //双端队列
        int dif = 0, wei = 0;
        for (int i = 1; i <= len; i++) {
            int cur = dp[i - 1] + 2;//cur为每次滑动窗口增加的值即dp[i - 1] + cost[i, i]
            dif += i >= 2 && boxes[i - 1][0] != boxes[i - 2][0] ? 1 : 0; //dif为运输累加值，由于无法直接在队列中进行修改，那么可以考虑增加一个累加值
            wei += boxes[i - 1][1]; //重量要加上当前箱子的重量
            while (!q.isEmpty() && q.peekLast()[1] + dif >= cur) q.pollLast(); //构造一个单调递增的队列
            q.add(new int[]{i, cur - dif, boxes[i - 1][1] - wei});
            //判断左端队头是否在窗口外，并且重量不能超过最大重量
            while(q.peekFirst()[0] <= i - maxBoxes || q.peekFirst()[2] + wei > maxWeight) q.pollFirst();
            dp[i] = q.peekFirst()[1] + dif;
        }
//        for (int i = 0; i < len; i++) {
//            int sum = 0;
//            for (int j = i; j >= 1 && j >= i - maxBoxes + 1; j--) {
//                sum += boxes[j - 1][1]; //累加箱子的种类之和
//                if (sum > maxWeight) break; //超过了最大重量
//                dp[i] = Math.min(dp[i], dp[j - 1] + cost(boxes, j ,i));
//            }
//        }
        return dp[len];
    }

//    public static int cost(int[][] boxes, int l, int r) {
//        int ans = 2, port = boxes[l - 1][0]; //初始化为2，因为返回仓库算一次行程
//        while (++l <= r) {
//            if (boxes[l - 1][0] == port) continue; // 只要相同，那么次数不会增加
//            ans++;
//            port = boxes[l - 1][0];
//        }
//        return ans;
//    }
//    public static int boxDelivering(int[][] boxes, int portsCount, int maxBoxes, int maxWeight) {
//        int len = boxes.length;
//        long[] ws = new long[len + 1];
//        int[] cs = new int[len];
//        for (int i = 0; i < len; ++i) {
//            int p = boxes[i][0], w = boxes[i][1];
//            ws[i + 1] = ws[i] + w;
//            if (i < len - 1) {
//                cs[i + 1] = cs[i] + (p != boxes[i + 1][0] ? 1 : 0);
//            }
//        }
//
//        int[] f = new int[len + 1];
//        Deque<Integer> q = new ArrayDeque<>();
//        q.offer(0);
//
//        for (int i = 1; i <= len; ++i) {
//            while (!q.isEmpty() && (i - q.peekFirst() > maxBoxes || ws[i] - ws[q.peekFirst()] > maxWeight)) {
//                q.pollFirst();
//            }
//            if (!q.isEmpty()) {
//                f[i] = cs[i - 1] + f[q.peekFirst()] - cs[q.peekFirst()] + 2;
//            }
//
//            if (i < len) {
//                while (!q.isEmpty() && f[q.peekLast()] - cs[q.peekLast()] >= f[i] - cs[i]) {
//                    q.pollLast();
//                }
//                q.offer(i);
//            }
//
//        }
//        return f[len];
//    }
}
