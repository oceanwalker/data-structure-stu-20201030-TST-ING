package test.cn.oceanwalker.data_structure.geektime.learn.LearnDynamicProgramming;

import cn.oceanwalker.data_structure.geektime.learn.LearnDynamicProgramming.LevenshteinDistanceBySelf;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLevenshteinDistanceBySelf {
    @Test
    public void test(){
        char[] a = "mitcmu".toCharArray();
        char[] a1 = "mitcmu".toCharArray();
        char[] b = "mtacnu".toCharArray();
        char[] c = "mtacnuasdf".toCharArray();

        assertEquals(3, LevenshteinDistanceBySelf.lwstDP(a,a.length,b,b.length));
        assertEquals(0, LevenshteinDistanceBySelf.lwstDP(a,a.length,a1,a1.length));
        assertEquals(7, LevenshteinDistanceBySelf.lwstDP(a,a.length,c,c.length));
    }
}
