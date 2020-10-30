package cn.oceanwalker.data_structure.leetcode.linked_list;

public class ListNode {

    int val;
    ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }

    public void setNext(ListNode nextNode) {
        next = nextNode;
    }
}
