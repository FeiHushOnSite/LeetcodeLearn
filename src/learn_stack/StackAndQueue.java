package learn_stack;

import java.util.Stack;

/**
 * @program: LeetcodeLearn
 * @className: StackAndQueue
 * @description:
 * @author:
 * @create: 2024-10-10 16:46
 * @Version 1.0
 **/
public class StackAndQueue {

    private Stack<Integer> in = new Stack<>();
    private Stack<Integer> out = new Stack<>();

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        in2out();
        return out.pop();
    }

    public int peek() {
        in2out();
        return out.peek();
    }

    private void in2out() {
        if(out.isEmpty()) {
            while(!in.isEmpty()) {
                out.push(in.pop());
            }
        }
    }

    public boolean empty() {
        return in.empty() && out.empty();
    }
}
