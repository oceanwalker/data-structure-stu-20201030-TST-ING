package test.cn.oceanwalker.data_structure.geektime.learn.LearnDynamicProgramming;

import cn.oceanwalker.data_structure.geektime.learn.LearnDynamicProgramming.DisCount;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDiscount {
    @Test
    public void test(){
        int[] prices=new int[]{12,24,62,23,46,71,23,74,21,54};
//        int[] prices=new int[]{11,24,62,23,46,71,23,74,21,54};
        int n=prices.length;
        int p=200;
        assertEquals(200, DisCount.buy(prices,n,p));
    }
    @Test
    public void testRange(){
        int[] prices=new int[]{12,24,62,23,46,71,23,74,21,54};
        int min=100;
        int max=300;
        assertEquals(true, DisCount.testRange(min,max,prices));
    }
}
