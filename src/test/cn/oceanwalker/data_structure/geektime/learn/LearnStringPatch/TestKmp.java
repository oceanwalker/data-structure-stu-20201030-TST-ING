package test.cn.oceanwalker.data_structure.geektime.learn.LearnStringPatch;

import cn.oceanwalker.data_structure.geektime.learn.LearnStringPatch.Kmp;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestKmp {
    @Test
    public void testKmp(){

        String s = "abcdefg";
        String t = "cde";
        assertEquals(2, Kmp.index(s, t, 0));

        assertEquals(-1, Kmp.index(s, "dafgsadfa", 0));
        assertEquals(6, Kmp.index(s, "g", 0));
        assertEquals(-1, Kmp.index(s, "h", 0));
    }
}
