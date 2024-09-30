package leetcode_algorithm;

import java.util.Arrays;

/**
 * @program: LeetcodeLearn
 * @className: LatestTimeCatchTheBus
 * @description: 给定一个下标从0 开始长度为n 的整数数组 buses, buses[i]表示第 i 辆公交车的出发时间。同时给定一个下标从0开始长度为 m 的整数数组
 * passengers, 其中 passengers[j] 表示第 j 位乘客的到达时间，所有公交车出发的时间互不相同，所有乘客到达的时间也互不相同。
 * 给定一个整数 capacity 表示每辆公交车最多能容纳的乘客数目。
 * 每位乘客都会搭乘下一辆有座位的公交车，如果在y 时刻到达，公交在 x 时刻出发， 满足 y <= x 且公交没有满，那么可以搭乘这一辆公交，最早到达的乘客优先上车。
 * 返回可以搭乘公交车的最晚到达公交站时间。不能和别的成功同时刻到达
 * 注意！！！ buses和passenger 不一定有序的
 * @author:
 * @create: 2024-09-18 10:03
 * @Version 1.0
 **/
public class LatestTimeCatchTheBus {

    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        Arrays.sort(buses);
        Arrays.sort(passengers);

        //模拟乘客上车
        int j = 0;
        int c = 0;
        for (int bus : buses) {
            for (c = capacity; c > 0 && j < passengers.length && passengers[j] <= bus; c--) {
                j++;
            }
        }

        // 寻找插队时机
        j--;
        int res = c > 0 ? buses[buses.length - 1] : passengers[j];
        while (j >= 0 && res == passengers[j]) {
            res--; // 往前找没人到达的时刻
            j--;
        }
        return res;
    }
}
