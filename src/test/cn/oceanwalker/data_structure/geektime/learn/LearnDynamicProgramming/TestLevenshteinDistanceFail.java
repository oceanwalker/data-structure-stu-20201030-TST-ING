package test.cn.oceanwalker.data_structure.geektime.learn.LearnDynamicProgramming;

import cn.oceanwalker.data_structure.geektime.learn.LearnDynamicProgramming.LevenshteinDistanceFail;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLevenshteinDistanceFail {
    @Test
    public void test() {
        char[] a = "mitcmu".toCharArray();
        char[] b = "mtacnu".toCharArray();
        assertEquals(3, LevenshteinDistanceFail.minEdit(a, b));
    }
    @Test
    public void test1() {
        char[] a = "Saturday".toCharArray();
        char[] b = "Sundaysasdf".toCharArray();
        assertEquals(8, LevenshteinDistanceFail.minEdit(a, b));
    }
    @Test
    public void test2() {
        char[] a = "mitcmu".toCharArray();
        char[] b = "mtacnuasdf".toCharArray();
        assertEquals(7, LevenshteinDistanceFail.minEdit(a, b));
    }
    @Test
    public void test3() {
        char[] a = "mitcmu".toCharArray();
        char[] b = "mitcmu".toCharArray();
        assertEquals(0, LevenshteinDistanceFail.minEdit(a, b));
    }
}
