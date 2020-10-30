package test.cn.oceanwalker.data_structure.geektime.learn.LearnDynamicProgramming;

import cn.oceanwalker.data_structure.geektime.learn.LearnDynamicProgramming.BagDynamic;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test01Bag {
    @Test
    public void test(){
        int maxW = 9;
        int[] weights = new int[]{2, 2, 4, 6, 3};

        assertEquals("111111101", BagDynamic.run(maxW,weights));
    }
}
