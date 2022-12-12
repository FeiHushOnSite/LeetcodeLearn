package leetcode_ListNode;

/**
 * @program: leetcode
 * @className: IsPalindrome
 * @description: 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
 * head = [1, 2, 2, 1]
 * 输出 true
 * @author:
 * @create: 2022-11-11 10:54
 * @Version 1.0
 **/
public class IsPalindrome {

    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.add(2);
        list.add(2);
        list.add(1);

        System.out.println(isPalindrome(list));
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        //通过快慢指针找到中点
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //如果fast不为空，说明链表的长度是奇数个
        if(fast != null) {
            slow = slow.next;
        }
        //反转后半部分链表
        slow = reverse(slow);

        fast = head;
        while(slow != null) {
            //然后比较，判断节点值是否相等
            if(fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    /**
     * 反转链表
     * @param head
     * @return
     */
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        while(head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
