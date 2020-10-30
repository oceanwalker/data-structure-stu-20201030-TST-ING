package test.cn.oceanwalker.data_structure.geektime.learn.LearnDynamicProgramming;

import cn.oceanwalker.data_structure.geektime.learn.LearnDynamicProgramming.BagOptimizeDynamic;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test01BagOptimize {
    @Test
    public void testNotOptimize(){

        int[] items = new int[]{2, 2, 4, 6, 3};
        int[] values = new int[]{3, 4, 8, 9, 6};
        int n = items.length;
        int w = 9;

        assertEquals(18, BagOptimizeDynamic.run(n,w,items,values));
//        assertEquals(18, BagOptimizeDynamic.knapsack3(n,w,items,values));
    }

}
