package test.cn.oceanwalker.data_structure.geektime.learn.LearnBackTracking;

import cn.oceanwalker.data_structure.geektime.learn.LearnBackTracking.BagOptimizeBackTracking;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test01BagOptimize {
    @Test
    public void testNotOptimize() {

        int[] items = new int[]{2, 2, 4, 6, 3};
        int[] values = new int[]{3, 4, 8, 9, 6};
        int n = items.length;
        int w = 9;
        BagOptimizeBackTracking.run(0, 0, 0, items, values, n, w);
        assertEquals(18, BagOptimizeBackTracking.maxValue);
//        System.out.println(BagOptimizeBackTracking.maxValue);
    }

//    @Test
//    public void testOptimizeArray() {
//
//        int[] items = new int[]{2, 2, 4, 6, 3};
//        int[] values = new int[]{3, 4, 8, 9, 6};
//        int n = items.length;
//        int w = 9;
//        BagOptimizeBackTracking.runOptimizeArray(0, 0, 0, items, values, n, w);
//        assertEquals(18, BagOptimizeBackTracking.maxValue);
////        System.out.println(BagOptimizeBackTracking.maxValue);
//    }

    @Test
    public void testOptimizeArrayAndValue() {

        int[] items = new int[]{2, 2, 4, 6, 3};
        int[] values = new int[]{3, 4, 8, 9, 6};
        int n = items.length;
        int w = 9;
        BagOptimizeBackTracking.runOptimizeArrayAndValue(0, 0, 0, items, values, n, w);
        assertEquals(18, BagOptimizeBackTracking.maxValue);
//        System.out.println(BagOptimizeBackTracking.maxValue);
    }

}
