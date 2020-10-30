package test.cn.oceanwalker.data_structure.leetcode.linked_list;

import cn.oceanwalker.data_structure.leetcode.linked_list.LinkedListCycle;
import cn.oceanwalker.data_structure.leetcode.linked_list.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestLinkedListCycle {
    @Test
    public void test() {
        ListNode node = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(4);
        node.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node);
        assertTrue(LinkedListCycle.myFind20201013(node));
    }@Test
    public void test1() {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        node.setNext(node1);
        node1.setNext(node);
        assertTrue(LinkedListCycle.myFind20201013(node));
    }@Test
    public void test2() {
        ListNode node = new ListNode(1);
        assertFalse(LinkedListCycle.myFind20201013(node));
    }
}
