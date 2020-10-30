package test.cn.oceanwalker.data_structure.geektime.learn.LearnBitMap;

import cn.oceanwalker.data_structure.geektime.learn.LearnBitMap.BitMap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBitMap {
    @Test
    public void test() {
        BitMap bitMap = new BitMap(10000);
        bitMap.set(9999);
        assertEquals(true, bitMap.get(9999));
    }
}
