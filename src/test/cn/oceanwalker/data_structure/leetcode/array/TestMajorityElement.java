package test.cn.oceanwalker.data_structure.leetcode.array;

import cn.oceanwalker.data_structure.leetcode.array.MajorityElement;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMajorityElement {
    @Test
    public void test(){
        assertEquals(3, MajorityElement.find(new int[]{3,2,3}));
        assertEquals(1, MajorityElement.find(new int[]{1}));
        assertEquals(2, MajorityElement.find(new int[]{2,2,1,1,1,2,2}));
    }
}
