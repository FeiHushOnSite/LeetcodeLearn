package leetcode_algorithm;

import java.util.PriorityQueue;
import java.util.stream.IntStream;

/**
 * @program: LeetcodeLearn
 * @className: SeatManager
 * @description:
 * @author:
 * @create: 2024-09-30 09:56
 * @Version 1.0
 **/
public class SeatManager {

    /**
     * 维护可预约的座位
     * 我们需要一个数据结构维护可预约的座位。
     * reserve: 查找并删除最小值
     * unreserve: 添加元素
     * 最小堆完美符合上述要求
     * 初始化： 把1，2，3....,n全部入堆
     * reserve: 弹出并返回堆顶
     * unreserve: 把seatNumber 入堆
     */
    private final PriorityQueue<Integer> available = new PriorityQueue<>();

    public SeatManager(int n) {
        IntStream.rangeClosed(1, n).forEach(available::add);
    }

    public int reserve() {
        return available.poll();
    }

    public void unreserve(int seatNumber) {
        available.add(seatNumber);
    }

    public static void main(String[] args) {
        SeatManager seatManager = new SeatManager(9);

    }
}
