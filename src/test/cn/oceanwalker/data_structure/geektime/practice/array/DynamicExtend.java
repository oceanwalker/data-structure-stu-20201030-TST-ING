package test.cn.oceanwalker.data_structure.geektime.practice.array;

import cn.oceanwalker.data_structure.geektime.practice.array.DynamicArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DynamicExtend {
    @Test
    public void test() {
        int capacity = 1;
        int value = 1;
        assertEquals(10, new DynamicArray().getCapacity());
        DynamicArray array = new DynamicArray(1);
        assertEquals(capacity, array.getCapacity());
        assertEquals(true, array.isEmpty());
        assertEquals(0, array.getSize());
        array.add(0, value);
        assertEquals(value, array.get(0));
        array.add(0, value);
        assertEquals(2, array.getSize());
        assertEquals(2, array.getCapacity());
        assertEquals(false, array.isEmpty());
        array.add(0, value);
        assertEquals(3, array.getSize());
        array.add(0, value);
        assertEquals(4, array.getSize());
        array.add(0, value);
        assertEquals(5, array.getSize());
        assertEquals(8, array.getCapacity());
        assertEquals(value, array.remove(0));
        assertEquals(4, array.getSize());
        assertEquals(value, array.remove(0));
        assertEquals(3, array.getSize());
        assertEquals(value, array.remove(0));
        assertEquals(2, array.getSize());
        assertEquals(4, array.getCapacity());
    }

    @Test
    public void testHeadTailHandle() {
        DynamicArray array = new DynamicArray(1);
        array.addFirst(1);
        array.addLast(2);
        assertEquals(1, array.get(0));
        assertEquals(2, array.get(1));
        assertEquals(2, array.getCapacity());
        assertEquals("Array size is 2,capacity is 2 \n[1,2]", array.toString());
        array.removeFirst();
        assertEquals(2, array.get(0));
        assertEquals(2, array.getCapacity());
        array.removeLast();
        assertEquals(0, array.getSize());
        assertEquals(1, array.getCapacity());
    }

    @Test
    public void testFindAndContains(){
        DynamicArray array = new DynamicArray(1);
        array.addFirst(1);
        array.addLast(2);
        assertEquals(true,array.contains(1));
        assertEquals(false,array.contains(3));
        assertEquals(0,array.find(1));
        assertEquals(1,array.find(2));
        assertEquals(-1,array.find(3));
    }

    @Test
    public void test1() {
        int capacity = 1;
        String value = "1";
        DynamicArray array = new DynamicArray(1);
        assertEquals(capacity, array.getCapacity());
        assertEquals(true, array.isEmpty());
        assertEquals(0, array.getSize());
        array.add(0, value);
        assertEquals(value, array.get(0));
        array.add(0, value);
        assertEquals(2, array.getSize());
        assertEquals(2, array.getCapacity());
        assertEquals(false, array.isEmpty());
        array.add(0, value);
        assertEquals(3, array.getSize());
        array.add(0, value);
        assertEquals(4, array.getSize());
        array.add(0, value);
        assertEquals(5, array.getSize());
        assertEquals(8, array.getCapacity());
        assertEquals(value, array.remove(0));
        assertEquals(4, array.getSize());
        assertEquals(value, array.remove(0));
        assertEquals(3, array.getSize());
        assertEquals(value, array.remove(0));
        assertEquals(2, array.getSize());
        assertEquals(4, array.getCapacity());
    }

}
