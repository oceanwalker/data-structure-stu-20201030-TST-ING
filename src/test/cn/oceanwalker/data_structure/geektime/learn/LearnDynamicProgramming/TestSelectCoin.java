package test.cn.oceanwalker.data_structure.geektime.learn.LearnDynamicProgramming;

import cn.oceanwalker.data_structure.geektime.learn.LearnDynamicProgramming.SelectCoin;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSelectCoin {
    @Test
    public void test() {
        int[] v = new int[]{1, 3, 5};
        int w = 9;
        assertEquals(3, SelectCoin.select(v, w));
    }

    @Test
    public void test1() {
        int[] v = new int[]{1, 2, 4};
        int w = 13;
        assertEquals(4, SelectCoin.select(v, w));
    }
}
