package test.cn.oceanwalker.data_structure.geektime.learn.LearnSort;

import cn.oceanwalker.data_structure.geektime.learn.LearnSort.QuickSort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TestQuickSort {
    @Test
    public void TestQuickSort1(){
        int[] a=new int[]{3,2,1};
        QuickSort.sort(a);
        assertEquals(true,Arrays.equals(new int[]{1,2,3},a));
    }
}
