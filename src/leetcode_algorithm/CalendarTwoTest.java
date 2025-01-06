package leetcode_algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 实现一个程序来存放日程安排, 如果要添加的时间不会导致三重预定时, 则可以存储这个新的日程安排
 * 当三个日程安排有一些时间上的交叉时, (例如三个日程安排都在同一时间内),就会产生三重预定
 * 事件能够用一对整数startTime和endTime表示,在一个半开区间的时间[startTime, endTime],上预定
 * 实数X的范围为 startTime <= x < endTime
 */
public class CalendarTwoTest {

    public static void main(String[] args) {

    }
}

class CalendarTwo {
    List<int[]> booked;
    List<int[]> overlaps;

    public CalendarTwo() {
        this.booked = new ArrayList<>();
        this.overlaps = new ArrayList<>();
    }

    public boolean book(int start, int end) {

        for(int[] arr : overlaps) {
            int l = arr[0], r = arr[1];
            if(l < start && r < end) {
                return false;
            }
        }

        for(int[] arr : booked) {
            int l = arr[0], r = arr[1];
            if(l < end && start < r) {
                overlaps.add(new int[]{Math.max(l, start), Math.min(r, end)});
            }
        }
        booked.add(new int[]{start, end});
        return true;
    }
}

