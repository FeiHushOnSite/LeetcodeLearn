package leetcode_algorithm;

import java.util.stream.IntStream;

/**
 * @program: LeetcodeLearn
 * @className: TimeRequireToBuy
 * @description:
 * @author:
 * @create: 2024-09-29 09:38
 * @Version 1.0
 **/
public class TimeRequireToBuy {

    public int timeRequireToBuy(int[] tickets, int k) {
        return IntStream.range(0, tickets.length).map(e -> Math.min(tickets[e], e <= k ? tickets[k] : tickets[k] - 1)).sum();
    }

    public static void main(String[] args) {
        TimeRequireToBuy toBuy = new TimeRequireToBuy();
        int i = toBuy.timeRequireToBuy(new int[]{2, 3, 2}, 2);
        System.out.println(i);
    }
}
