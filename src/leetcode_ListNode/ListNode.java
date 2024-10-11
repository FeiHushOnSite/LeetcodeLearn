package leetcode_ListNode;

/**
 * @program: leetcode
 * @className: ListNode
 * @description:
 * @author: jerry
 * @create: 2022-10-29 07:48
 * @Version 1.0
 **/
public class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public void add(int newVal) {
        ListNode newNode = new ListNode(newVal);
        if(this.next == null) {
            this.next = newNode;
        } else {
            this.next.add(newVal);
        }
    }

    public void print() {
        System.out.print(this.val);
        if(this.next != null) {
            System.out.print("-->");
            this.next.print();
        }
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA, l2 = headB;
        while(l1 != l2) {
            l1 = (l1 == null) ? headB : l1.next;
            l2 = (l2 == null) ? headA : l2.next;
        }
        return l1;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(4);
        listNode.add(5);
        listNode.add(1);
        listNode.add(9);
        listNode.deleteNode(listNode);
        listNode.print();

        ListNode headA = new ListNode(1);
        headA.add(2);
        ListNode headB = new ListNode(1);
        headB.add(2);
        headB.add(3);
        ListNode intersectionNode = getIntersectionNode(headA, headB);
        intersectionNode.print();
    }
}
