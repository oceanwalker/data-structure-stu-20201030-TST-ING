package test.cn.oceanwalker.data_structure.geektime.learn.LearnRecursion;

import cn.oceanwalker.data_structure.geektime.learn.LearnRecursion.TowersOfHanoi;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTowerOfHanoi {
    @Test
    public void test1Disk(){
        TowersOfHanoi towers=new TowersOfHanoi(1);
        towers.solve();
        assertEquals("1,3 ",towers.getResult());
    }
    @Test
    public void test2Disk(){
        TowersOfHanoi towers=new TowersOfHanoi(2);
        towers.solve();
        assertEquals("1,2 1,3 2,3 ",towers.getResult());
    }
    @Test
    public void test3Disk(){
        TowersOfHanoi towers=new TowersOfHanoi(3);
        towers.solve();
        assertEquals("1,3 1,2 3,2 1,3 2,1 2,3 1,3 ",towers.getResult());
    }
}
