package leetcode_ListNode;

/**
 * @program: leetcode
 * @className: reverseListNode
 * @description: 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 * head = [1, 2, 3, 4, 5]
 * 输出: [5, 4, 3, 2, 1]
 * @author:
 * @create: 2022-11-04 09:08
 * @Version 1.0
 **/
public class reverseListNode {

    public static void main(String[] args) {
        // 1 -> 2 -> 3 -> 4 -> 5 -> 6
        // 6 -> 5 -> 4 -> 3 -> 2 -> 1
        ListNode listNode = new ListNode(1);
        listNode.add(2);
        listNode.add(3);
        listNode.add(4);
        listNode.add(5);
        listNode.add(6);
//        ListNode result = reverseList(listNode);
//        result.print();

        ListNode res = reverseListLoop(listNode);
        res.print();
    }

    public static ListNode reverseList(ListNode head) {
        ListNode newNode = null;
        while(head != null) {
            //先保存访问的节点的下一个节点，保存起来
            //留着下一步访问的
            ListNode temp = head.next;
            //每次访问的原链表节点都会成为新链表的头结点，
            //其实就是把新链表挂到访问的原链表节点的
            //后面就行了
            head.next = newNode;
            //更新新链表
            newNode = head;
            //重新赋值，继续访问
            head = temp;
        }
        return newNode;
    }

    public static ListNode reverseListLoop(ListNode head) {
        //终止条件
        if (head == null || head.next == null)
            return head;
        //保存当前节点的下一个结点
        ListNode next = head.next;
        //从当前节点的下一个结点开始递归调用
        ListNode reverse = reverseListLoop(next);
        //reverse是反转之后的链表，因为函数reverseList
        // 表示的是对链表的反转，所以反转完之后next肯定
        // 是链表reverse的尾结点，然后我们再把当前节点
        //head挂到next节点的后面就完成了链表的反转。
        next.next = head;
        //这里head相当于变成了尾结点，尾结点都是为空的，
        //否则会构成环
        head.next = null;
        return reverse;
    }

}
