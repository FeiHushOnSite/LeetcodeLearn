package leetcode_ListNode;

/**
 * @program: leetcode
 * @className: MiddleListNode
 * @description: 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
 * 如果有两个中间结点，则返回第二个中间结点。
 * 输入: [1, 2, 3, 4, 5]
 * 此列表中的结点 3 (序列化形式：[3,4,5])
 * 返回的结点值为 3 。 (测评系统对该结点序列化表述是 [3,4,5])。
 * 注意，我们返回了一个 ListNode 类型的对象 ans，这样：
 * ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, 以及 ans.next.next.next = NULL.
 * @author:
 * @create: 2022-11-02 09:14
 * @Version 1.0
 **/
public class MiddleListNode {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.add(2);
        listNode.add(3);
        listNode.add(4);
        listNode.add(5);
        listNode.add(6);
        ListNode result = middleNode(listNode);
        result.print();
    }

    public static ListNode middleNode(ListNode head) {
        if(head == null) {
            throw new IllegalArgumentException("list node can not be empty");
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
