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

    public void add(int newval) {
        ListNode newNode = new ListNode(newval);
        if(this.next == null) {
            this.next = newNode;
        } else {
            this.next.add(newval);
        }
    }

    public void print() {
        System.out.print(this.val);
        if(this.next != null) {
            System.out.print("-->");
            this.next.print();
        }
    }
}
class solution {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(4);
        listNode.add(5);
        listNode.add(1);
        listNode.add(9);
        deleteNode(listNode);
        listNode.print();
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}