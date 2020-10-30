package test.cn.oceanwalker.data_structure.geektime.practice.linkedList;

import cn.oceanwalker.data_structure.geektime.practice.linkedList.SinglyLinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSinglyLinkedList {
    @Test
    public void test() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(0, 1);
        assertEquals(1, list.getSize());
        assertEquals("->1", list.toString());
        list.add(0, 2);
        assertEquals("->2->1", list.toString());
        list.add(1, 3);
        assertEquals("->2->3->1", list.toString());
        list.add(2, 3);
        assertEquals("->2->3->3->1", list.toString());
        list.add(4, 3);
        assertEquals("->2->3->3->1->3", list.toString());
        assertEquals(5, list.getSize());
        assertEquals(3, list.remove(4));
        assertEquals("->2->3->3->1", list.toString());
        assertEquals(4, list.getSize());
        assertEquals(2, list.remove(0));
        assertEquals("->3->3->1", list.toString());
        assertEquals(3, list.remove(1));
        assertEquals("->3->1", list.toString());
        assertEquals(1, list.remove(1));
        assertEquals("->3", list.toString());
        assertEquals(3, list.remove(0));
        assertEquals("", list.toString());
        System.out.println(list);
    }
}