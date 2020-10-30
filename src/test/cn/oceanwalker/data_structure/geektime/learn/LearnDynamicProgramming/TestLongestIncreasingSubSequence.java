package test.cn.oceanwalker.data_structure.geektime.learn.LearnDynamicProgramming;

import cn.oceanwalker.data_structure.geektime.learn.LearnDynamicProgramming.LongestIncreasingSubSequence;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLongestIncreasingSubSequence {
    @Test
    public void test() {
        int[] a = new int[]{2, 9, 3, 6, 5, 1, 7};
        int n = a.length;
        assertEquals(4, LongestIncreasingSubSequence.find(a, n, new int[n]));
        a = new int[]{10, 9, 2, 5, 3, 7, 101, 18};
        n = a.length;
        assertEquals(4, LongestIncreasingSubSequence.find(a, n, new int[n]));
        a = new int[]{};
        n = a.length;
        assertEquals(0, LongestIncreasingSubSequence.find(a, n, new int[n]));
        a = new int[]{0};
        n = a.length;
        assertEquals(1, LongestIncreasingSubSequence.find(a, n, new int[n]));
    a = new int[]{2,2};
        n = a.length;
        assertEquals(1, LongestIncreasingSubSequence.find(a, n, new int[n]));
    }
}
