package test.cn.oceanwalker.data_structure.geektime.practice.linkedList;

import cn.oceanwalker.data_structure.geektime.practice.linkedList.SinglyLinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSinglyLinkedListReverse {
    @Test
    public void testPrint() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(0, 0);
        list.add(1, 1);
        list.add(2, 2);
        list.add(3, 3);
        list.add(4, 4);
        assertEquals("->4->3->2->1->0", reversePrint(list));
    }
    @Test
    public void testReverse(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(0, 0);
        list.add(1, 1);
        list.add(2, 2);
        list.add(3, 3);
        list.add(4, 4);
        list.reverse();
        assertEquals("->4->3->2->1->0",list.toString());
        list.reverse();
        assertEquals("->0->1->2->3->4",list.toString());
        list.reverse();
        assertEquals("->4->3->2->1->0",list.toString());
        list.reverse();
        assertEquals("->0->1->2->3->4",list.toString());
    }

    private String reversePrint(SinglyLinkedList list) {
        StringBuilder result = new StringBuilder();
        recursionPrint(list.getHead(), result);
        return result.toString();
    }

    private void recursionPrint(SinglyLinkedList.Node node, StringBuilder result) {
        if (node == null)
            return;
        recursionPrint(node.getNext(), result);
        result.append("->").append(node.getData());
    }
}
