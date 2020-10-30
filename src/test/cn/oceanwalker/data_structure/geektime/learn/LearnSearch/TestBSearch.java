package test.cn.oceanwalker.data_structure.geektime.learn.LearnSearch;

import cn.oceanwalker.data_structure.geektime.learn.LearnSearch.BSearch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBSearch {
    @Test
    public void testBSearch1() {
        assertEquals(2, BSearch.search(new int[]{1, 2, 3, 4}, 3));
    }

    @Test
    public void testBSearchRecursion() {
        assertEquals(2, BSearch.searchRecursion(new int[]{1, 2, 3, 4}, 3));
    }

    @Test
    public void testSearchFirstValue() {
        assertEquals(1, BSearch.searchMyFirst(new int[]{1, 2, 2, 3, 4}, 2));
        assertEquals(1, BSearch.searchMyFirst(new int[]{1, 2, 2, 2, 2, 3, 4}, 2));
        assertEquals(0, BSearch.searchMyFirst(new int[]{1,1, 2, 2, 2, 2, 3, 4}, 1));
    }

    @Test
    public void testSearchLastValue() {
        assertEquals(2, BSearch.searchMyLast(new int[]{1, 2, 2, 3, 4}, 2));
        assertEquals(4, BSearch.searchMyLast(new int[]{1, 2, 2, 2, 2, 3, 4}, 2));
    }

    @Test
    public void testSearchLastLessThanValue() {
        assertEquals(2, BSearch.searchMyLastLessThan(new int[]{1, 2, 2, 3, 4}, 2));
        assertEquals(4, BSearch.searchMyLastLessThan(new int[]{1, 1, 1, 2, 2, 3, 4}, 2));
    }
    @Test
    public void testSearchFirstLargeThanValue() {
        assertEquals(1, BSearch.searchMyFirstLargeThan(new int[]{1, 2, 2, 3, 4}, 2));
        assertEquals(3, BSearch.searchMyFirstLargeThan(new int[]{1, 1, 1, 2, 2, 3, 4}, 2));
        assertEquals(0, BSearch.searchMyFirstLargeThan(new int[]{1, 1, 1, 2, 2, 3, 4}, 0));
    }
}
