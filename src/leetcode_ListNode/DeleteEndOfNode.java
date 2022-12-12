package leetcode_ListNode;

/**
 * @program: leetcode
 * @className: DeleteEndOfNode
 * @description: 删除链表的倒数第N个节点，并且返回链表的头节点。
 * @author:
 * @create: 2022-10-29 08:12
 * @Version 1.0
 **/
public class DeleteEndOfNode {

    public static void main(String[] args) {

        int n = 2;
        ListNode head = new ListNode(1);
        head.add(2);
        head.add(3);
        head.add(4);
        head.add(5);
        head.add(6);

        ListNode pre = head;
        int last = length(head) - n;

//        //如果last等于0表示删除的是头结点
//        if (last == 0)
//        //这里首先要找到要删除链表的前一个结点
//        for (int i = 0; i < last - 1; i++) {
//            pre = pre.next;
//        }
//        //然后让前一个结点的next指向要删除节点的next
//        pre.next = pre.next.next;
        System.out.println(last);

    }

    private static int length(ListNode head){
        int len = 0;

        while(head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
}
