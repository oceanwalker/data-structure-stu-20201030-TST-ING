package test.cn.oceanwalker.data_structure.geektime.practice.linkedList;

import cn.oceanwalker.data_structure.geektime.practice.linkedList.SinglyLinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSinglyLinkedListMerge {
    @Test
    public void test0(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(0, 0);
        list.add(1, 1);
        list.add(2, 2);
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.add(0, 0);
        list1.add(1, 1);
        list1.add(2, 2);
        list.merge(list1);
        assertEquals("->0->0->1->1->2->2",list.toString());
    }
    @Test
    public void test(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(0, 0);
        list.add(1, 1);
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.add(0, 0);
        list1.add(1, 1);
        list.merge(list1);
        assertEquals("->0->0->1->1",list.toString());
    }
    @Test
    public void test1(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(0, 0);
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.add(0, 0);
        list.merge(list1);
        assertEquals("->0->0",list.toString());
    }@Test
    public void test2(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(0, 0);
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.add(0, 1);
        list.merge(list1);
        assertEquals("->0->1",list.toString());
    }@Test
    public void test3(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(0, 1);
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.add(0, 0);
        list.merge(list1);
        assertEquals("->0->1",list.toString());
    }
}
