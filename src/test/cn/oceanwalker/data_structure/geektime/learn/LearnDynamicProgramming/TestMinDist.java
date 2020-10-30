package test.cn.oceanwalker.data_structure.geektime.learn.LearnDynamicProgramming;

import cn.oceanwalker.data_structure.geektime.learn.LearnDynamicProgramming.MinDist;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMinDist {
    @Test
    public void test(){
        int[][] m = {{1,3,5,9}, {2,1,3,4},{5,2,6,7},{6,8,4,3}};
        int n=m[0].length;
        assertEquals(19, MinDist.run(m,n));
    }
}
