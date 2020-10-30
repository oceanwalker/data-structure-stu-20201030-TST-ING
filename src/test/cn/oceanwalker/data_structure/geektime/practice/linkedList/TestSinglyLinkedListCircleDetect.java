package test.cn.oceanwalker.data_structure.geektime.practice.linkedList;

import cn.oceanwalker.data_structure.geektime.practice.linkedList.SinglyLinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSinglyLinkedListCircleDetect {
    @Test
    public void test() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(0, 0);
        list.addNode(1, list.getHead());
        assertEquals(true, list.hasCircle());
    }
    @Test
    public void test1() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(0, 0);
        list.add(0, 1);
        assertEquals(false, list.hasCircle());
    }
}
