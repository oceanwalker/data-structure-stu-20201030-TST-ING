package test.cn.oceanwalker.data_structure.geektime.learn.LearnSort;

import cn.oceanwalker.data_structure.geektime.learn.LearnSort.BubbleSort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TestBubbleSort {
    @Test
    public void test1(){
        int[] array=new int[]{1};
        BubbleSort.sort(array);
        assertEquals(true, Arrays.equals(new int[]{1},array) );
    }
    @Test
    public void test2(){
        int[] array=new int[]{3,2,1};
        BubbleSort.sort(array);
        assertEquals(true, Arrays.equals(new int[]{1,2,3},array) );
    }
    @Test
    public void test3(){
        int[] array=new int[]{1,2,3,6,5,4};
        BubbleSort.sort(array);
        assertEquals(true, Arrays.equals(new int[]{1,2,3,4,5,6},array) );
    }
}
