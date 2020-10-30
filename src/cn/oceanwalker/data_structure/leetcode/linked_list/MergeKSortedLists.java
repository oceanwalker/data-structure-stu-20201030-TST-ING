package cn.oceanwalker.data_structure.leetcode.linked_list;

public class MergeKSortedLists {
    public static ListNode myMerge20201013(ListNode[] lists) {
        if (null == lists || 0 == lists.length) return null;
        ListNode soldier = lists[0];
        for (int i = 1; i < lists.length; i++) {
            soldier = merge(soldier, lists[i]);
        }
        return soldier;
    }

    private static ListNode merge(ListNode a, ListNode b) {
        ListNode soldier = new ListNode(0);
        ListNode result = soldier;
        while (null != a && null != b) {
            if (a.val < b.val) {
                soldier.next = a;
                a = a.next;
            } else {
                soldier.next = b;
                b = b.next;
            }
            soldier = soldier.next;
        }
        if (null != a) soldier.next = a;
        if (null != b) soldier.next = b;
        return result.next;
    }
}
