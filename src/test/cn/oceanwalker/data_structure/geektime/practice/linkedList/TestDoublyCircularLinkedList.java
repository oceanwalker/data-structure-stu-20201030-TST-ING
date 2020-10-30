package test.cn.oceanwalker.data_structure.geektime.practice.linkedList;

import cn.oceanwalker.data_structure.geektime.practice.linkedList.DoublyCircularLinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDoublyCircularLinkedList {

    @Test
    public void test() {
        DoublyCircularLinkedList list = new DoublyCircularLinkedList();
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

    @Test
    public void testCircle() {
        DoublyCircularLinkedList list = new DoublyCircularLinkedList();
        list.add(0, 1);
        System.out.println(list.toDetail());
        assertEquals(1, list.getSize());
        assertEquals("->1", list.toString());
        assertEquals("->1(1,1)", list.toDetail());
        list.add(0, 2);
        System.out.println(list.toDetail());
        assertEquals("->2->1", list.toString());
        assertEquals("->2(1,1)->1(2,2)", list.toDetail());
        list.add(1, 3);
        System.out.println(list.toDetail());
        assertEquals("->2->3->1", list.toString());
        assertEquals("->2(1,3)->3(2,1)->1(3,2)", list.toDetail());
        list.add(2, 3);
        System.out.println(list.toDetail());
        assertEquals("->2->3->3->1", list.toString());
        list.add(4, 3);
        System.out.println(list.toDetail());
        assertEquals("->2->3->3->1->3", list.toString());
        assertEquals(5, list.getSize());
        assertEquals(3, list.remove(4));
        System.out.println(list.toDetail());
        assertEquals("->2(1,3)->3(2,3)->3(3,1)->1(3,2)", list.toDetail());
        assertEquals("->2->3->3->1", list.toString());
        assertEquals(4, list.getSize());
        assertEquals(2, list.remove(0));
        System.out.println(list.toDetail());
        assertEquals("->3->3->1", list.toString());
        assertEquals(3, list.remove(1));
        System.out.println(list.toDetail());
        assertEquals("->3->1", list.toString());
        assertEquals(1, list.remove(1));
        System.out.println(list.toDetail());
        assertEquals("->3", list.toString());
        assertEquals(3, list.remove(0));
        System.out.println(list.toDetail());
        assertEquals("", list.toString());
        System.out.println(list);
    }
}
