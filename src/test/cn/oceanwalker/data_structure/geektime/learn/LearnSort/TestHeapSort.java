package test.cn.oceanwalker.data_structure.geektime.learn.LearnSort;

import cn.oceanwalker.data_structure.geektime.learn.LearnSort.HeapSort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TestHeapSort {
    @Test
    public void test() {
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        int[] a1 = new int[]{4, 5, 6, 3, 1, 2};
        assertEquals(true, Arrays.equals(a, HeapSort.sort(a1)));
    }
}
