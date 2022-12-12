package leetcode_ListNode;

/**
 * @program: leetcode
 * @className: MergeLists
 * @description: 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * @author:
 * @create: 2022-11-10 09:18
 * @Version 1.0
 **/
public class MergeLists {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.add(2);
        list1.add(4);

        ListNode list2 = new ListNode(1);
        list2.add(3);
        list2.add(4);

        ListNode listNode = mergeTwoLists(list1, list2);
        listNode.print();
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null || list2 == null) {
            return list2 == null ? list1 : list2;
        }
        ListNode first = (list1.val > list2.val) ? list2 : list1;
        first.next = mergeTwoLists(first.next, first == list1 ? list2 : list1);
        return first;
        //只要有一个为空，就返回另一个
//        if (list1 == null || list2 == null)
//            return list2 == null ? list1 : list2;
//        //把小的赋值给first
//        ListNode first = (list2.val < list1.val) ? list2 : list1;
//        first.next = mergeTwoLists(first.next, first == list1 ? list2 : list1);
//        return first;
    }
}
