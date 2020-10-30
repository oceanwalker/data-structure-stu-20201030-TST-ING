package test.cn.oceanwalker.data_structure.geektime.practice.linkedList;

import cn.oceanwalker.data_structure.geektime.practice.linkedList.SinglyLinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSinglyLinkedListMiddle {
    @Test
    public void test() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(0, 0);
        list.add(1, 1);
        list.add(2, 2);
        list.add(3, 3);
        list.add(4, 4);
        assertEquals(2,list.getMiddle());
    }@Test
    public void test1() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(0, 0);
        assertEquals(0,list.getMiddle());
    }@Test
    public void test2() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(0, 0);
        list.add(1, 1);
        assertEquals(1,list.getMiddle());
    }@Test
    public void test3() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(0, 0);
        list.add(1, 1);
        list.add(2, 2);
        assertEquals(1,list.getMiddle());
    }@Test
    public void test4() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(0, 0);
        list.add(1, 1);
        list.add(2, 2);
        list.add(3, 3);
        assertEquals(2,list.getMiddle());
    }
}
