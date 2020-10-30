package test.cn.oceanwalker.data_structure.geektime.learn.LearnRecursion;

import cn.oceanwalker.data_structure.geektime.learn.LearnRecursion.MinDist;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMinDist {
    @Test
    public void test(){
        int[][] m = {{1,3,5,9}, {2,1,3,4},{5,2,6,7},{6,8,4,3}};
        int n=m[0].length;
        assertEquals(19, MinDist.minDist(n-1,n-1,m,new int[n][n],n));
    }
}
