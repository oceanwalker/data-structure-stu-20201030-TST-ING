package cn.oceanwalker.data_structure.leetcode.linked_list;

public class LinkedListCycle {
    public static boolean myFind20201013(ListNode head) {
        if(null==head)return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while (null != fast && null != fast.next) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
