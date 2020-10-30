package test.cn.oceanwalker.data_structure.geektime.learn.LearnBackTracking;

import cn.oceanwalker.data_structure.geektime.learn.LearnBackTracking.BagBackTracking;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test01Bag {
    @Test
    public void testBag(){

        int[] items = new int[]{2, 2, 4, 6, 3};
        int n=items.length;
        int w=9;
        BagBackTracking.init(n,w);
        BagBackTracking.f(0,0,items,n,w);
        assertEquals(9, BagBackTracking.maxW);
    }
}
