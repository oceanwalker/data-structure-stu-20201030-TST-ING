package test.cn.oceanwalker.data_structure.geektime.learn.LearnStringPatch;

import cn.oceanwalker.data_structure.geektime.learn.LearnStringPatch.BruteForce;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBruteForce {
    @Test
    public void testBf() {
        String s = "abcdefg";
        String t = "cde";
        assertEquals(2, BruteForce.index(s, t, 0));
        assertEquals(-1, BruteForce.index(s, "dafgsadfa", 0));
        assertEquals(6, BruteForce.index(s, "g", 0));
        assertEquals(-1, BruteForce.index(s, "h", 0));
    }
}
