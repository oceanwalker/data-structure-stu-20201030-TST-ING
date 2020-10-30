package test.cn.oceanwalker.data_structure.geektime.learn.LearnSort;

import cn.oceanwalker.data_structure.geektime.learn.LearnSort.InsertSort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TestInsertSort {
    @Test
    public void test1() {
        int[] array = new int[]{1};
        InsertSort.sort(array);
        assertEquals(true, Arrays.equals(new int[]{1}, array));
    }

    @Test
    public void test2() {
        int[] array = new int[]{3, 2, 1};
        InsertSort.sort(array);
        assertEquals(true, Arrays.equals(new int[]{1, 2, 3}, array));
    }

    @Test
    public void test() {
        int i = 1;
        for (; i >= 0; i--) {
        }
        System.out.println(i);
    }
}
