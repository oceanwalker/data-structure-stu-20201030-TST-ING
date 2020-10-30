package test.cn.oceanwalker.data_structure.geektime.learn.LearnForeachArray;

import cn.oceanwalker.data_structure.geektime.learn.LearnForeachArray.HelixArray2Index;
import cn.oceanwalker.data_structure.geektime.learn.LearnForeachArray.HelixArray4Index;
import cn.oceanwalker.data_structure.geektime.learn.LearnForeachArray.HelixArrayTeacher;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHelixArray {
    @Test
    public void test4Index() {
        int[][] a = new int[][]{{1, 2}, {4, 3}};
        assertEquals("1234", HelixArray4Index.print(a));
        a = new int[][]{{1, 2, 3}, {6, 5, 4}};
        assertEquals("123456", HelixArray4Index.print(a));
        a = new int[][]{{1, 2}, {6, 3}, {5, 4}};
        assertEquals("123456", HelixArray4Index.print(a));
        a = new int[][]{{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
        assertEquals("123456789", HelixArray4Index.print(a));
    }
    @Test
    public void test2Index() {
        int[][] a = new int[][]{{1, 2}, {4, 3}};
        assertEquals("1234", HelixArray2Index.print(a));
        a = new int[][]{{1, 2, 3}, {6, 5, 4}};
        assertEquals("123456", HelixArray2Index.print(a));
        a = new int[][]{{1, 2}, {6, 3}, {5, 4}};
        assertEquals("123456", HelixArray2Index.print(a));
        a = new int[][]{{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
        assertEquals("123456789", HelixArray2Index.print(a));
    }
    @Test
    public void testTeacher() {
        int[][] a = new int[][]{{1, 2}, {4, 3}};
        assertEquals("1234", HelixArrayTeacher.print(a));
        a = new int[][]{{1, 2, 3}, {6, 5, 4}};
        assertEquals("123456", HelixArrayTeacher.print(a));
        a = new int[][]{{1, 2}, {6, 3}, {5, 4}};
        assertEquals("123456", HelixArrayTeacher.print(a));
        a = new int[][]{{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
        assertEquals("123456789", HelixArrayTeacher.print(a));
    }
}
