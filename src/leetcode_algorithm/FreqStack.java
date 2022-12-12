package leetcode_algorithm;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: IdeaProjects
 * @className: FreqStack
 * @description: 设计一个类似堆栈的数据结构，将元素推入堆栈，并从堆栈中弹出出现频率最高的元素
 * 实现FreqStacke类：
 * FreqStack()构造一个空的堆栈
 * void push(int val) 将一个整数val压入栈顶
 * int pop() 删除并返回堆栈中出现频率最高的元素
 * 如果出现频率最高的元素不只一个，则移除并返回最接近栈顶的元素
 * @author:
 * @create: 2022-12-01 09:46
 * @Version 1.0
 **/
public class FreqStack {
//    private Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//    private List<Deque<Integer>> stack = new ArrayList<>();

    private Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
    private Map<Integer, Deque<Integer>> group = new HashMap<Integer, Deque<Integer>>();
    private int maxFreq;

    public FreqStack() {
        freq = new HashMap<>();
        group = new HashMap<>();
        maxFreq = 0;
    }

    public void push(int val) {
        freq.put(val, freq.getOrDefault(val, 0) + 1);
        group.putIfAbsent(freq.get(val), new ArrayDeque<>());
        group.get(freq.get(val)).push(val);
        maxFreq = Math.max(maxFreq, freq.get(val));
        //--------------------------------------------
//        int cnt = map.getOrDefault(val, 0);
//        if(cnt == stack.size()) {
//            stack.add(new ArrayDeque<>());
//        }
//        stack.get(cnt).push(val);
//        map.put(val, cnt + 1);
    }

    public int pop() {
        int val = group.get(maxFreq).peek();
        freq.put(val, freq.get(val) - 1);
        group.get(maxFreq).pop();
        if(group.get(maxFreq).isEmpty()) {
            maxFreq--;
        }
        //--------------------------------------------
//        int cnt = stack.size() - 1;
//        int val = stack.get(cnt).pop();
//        if(stack.get(cnt).size() == 0) stack.remove(cnt);
//        map.put(val, cnt);
        return 0;
    }

    @Override
    public String toString() {
        return "FreqStack{" +
                "freq=" + freq +
                ", group=" + group +
                ", maxFreq=" + maxFreq +
                '}';
    }
}
