package test.cn.oceanwalker.data_structure.leetcode.array;

import cn.oceanwalker.data_structure.leetcode.array.FirstMissingPositive;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFirstMissingPositive {
    @Test
    public void testBit() {
        assertEquals(3, FirstMissingPositive.bitFind(new int[]{1, 2, 0}));
        assertEquals(2, FirstMissingPositive.bitFind(new int[]{3, 4, -1, 1}));
        assertEquals(1, FirstMissingPositive.bitFind(new int[]{7, 8, 9, 11, 12}));
        assertEquals(3, FirstMissingPositive.bitFind(new int[]{0,2,2,1,1}));
    }@Test
    public void testReplacement() {
        assertEquals(3, FirstMissingPositive.replaceFind(new int[]{1, 2, 0}));
        assertEquals(2, FirstMissingPositive.replaceFind(new int[]{3, 4, -1, 1}));
        assertEquals(1, FirstMissingPositive.replaceFind(new int[]{7, 8, 9, 11, 12}));
        assertEquals(3, FirstMissingPositive.replaceFind(new int[]{0,2,2,1,1}));
    }@Test
    public void testHash() {
        assertEquals(3, FirstMissingPositive.hashFind(new int[]{1, 2, 0}));
        assertEquals(2, FirstMissingPositive.hashFind(new int[]{3, 4, -1, 1}));
        assertEquals(1, FirstMissingPositive.hashFind(new int[]{7, 8, 9, 11, 12}));
        assertEquals(3, FirstMissingPositive.hashFind(new int[]{0,2,2,1,1}));
    }
    @Test
    public void testSort() {
        assertEquals(3, FirstMissingPositive.sortFind(new int[]{1, 2, 0}));
        assertEquals(2, FirstMissingPositive.sortFind(new int[]{3, 4, -1, 1}));
        assertEquals(1, FirstMissingPositive.sortFind(new int[]{7, 8, 9, 11, 12}));
        assertEquals(3, FirstMissingPositive.sortFind(new int[]{0,2,2,1,1}));
    }
}
