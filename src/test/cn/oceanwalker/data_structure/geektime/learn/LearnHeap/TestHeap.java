package test.cn.oceanwalker.data_structure.geektime.learn.LearnHeap;

import cn.oceanwalker.data_structure.geektime.learn.LearnHeap.Heap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHeap {
    @Test
    public void testSmallHeap() {
        int n = 4;
        Heap heap = new Heap(n);
        int[] a = new int[]{3, 2, 1, 4};
        for (int i = 0; i < a.length; i++) {
            heap.insert(a[i]);
        }
        assertEquals(1, heap.poll());
        assertEquals(2, heap.poll());
        assertEquals(3, heap.poll());
        assertEquals(4, heap.poll());
        heap = new Heap(7);
        a = new int[]{3, 2, 6, 4, 1, 4, 6};
        for (int i = 0; i < a.length; i++) {
            heap.insert(a[i]);
        }
        assertEquals(1, heap.poll());
        assertEquals(2, heap.poll());
        assertEquals(3, heap.poll());
        assertEquals(4, heap.poll());
        assertEquals(4, heap.poll());
        assertEquals(6, heap.poll());
        assertEquals(6, heap.poll());
    }
}
