package test.cn.oceanwalker.data_structure.geektime.learn.LearnBackTracking;

import cn.oceanwalker.data_structure.geektime.learn.LearnBackTracking.MinDist;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMinDist {
    @Test
    public void test(){
        int[][] m = {{1,3,5,9}, {2,1,3,4},{5,2,6,7},{6,8,4,3}};
        int n=m[0].length;
        MinDist md=new MinDist();
//        md.minDist(0,0,0,m,n);
//        assertEquals(19, md.getMinV());
        assertEquals(19, md.minDist(0,0,m[0][0],m,n));


    }
}
