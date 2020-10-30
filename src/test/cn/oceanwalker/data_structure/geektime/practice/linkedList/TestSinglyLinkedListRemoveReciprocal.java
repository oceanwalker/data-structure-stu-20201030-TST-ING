package test.cn.oceanwalker.data_structure.geektime.practice.linkedList;

import cn.oceanwalker.data_structure.geektime.practice.linkedList.SinglyLinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSinglyLinkedListRemoveReciprocal {
    @Test
    public void test(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(0, 1);
        assertEquals("->1", list.toString());
        list.add(0, 2);
        assertEquals("->2->1", list.toString());
        list.add(1, 3);
        assertEquals("->2->3->1", list.toString());
        list.add(2, 3);
        assertEquals("->2->3->3->1", list.toString());
        list.add(4, 3);
        assertEquals("->2->3->3->1->3", list.toString());
        list.removeReciprocal(2);
        assertEquals("->2->3->3->3", list.toString());
    }
    @Test
    public void test1(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(0, 1);
        assertEquals("->1", list.toString());
        list.removeReciprocal(1);
        assertEquals("", list.toString());
    }
    @Test
    public void test2(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(0, 1);
        list.add(1, 2);
        assertEquals("->1->2", list.toString());
        list.removeReciprocal(1);
        assertEquals("->1", list.toString());
    }
    @Test
    public void test3(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(0, 1);
        list.add(1, 2);
        assertEquals("->1->2", list.toString());
        list.removeReciprocal(2);
        assertEquals("->2", list.toString());
    }
}
