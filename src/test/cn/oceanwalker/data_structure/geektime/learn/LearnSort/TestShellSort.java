package test.cn.oceanwalker.data_structure.geektime.learn.LearnSort;

import cn.oceanwalker.data_structure.geektime.learn.LearnSort.ShellSort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TestShellSort {
    @Test
    public void test() {

        int[] array = new int[]{ 1};
        ShellSort.sort(array);
        assertEquals(true, Arrays.equals(new int[]{1}, array));
    }
    @Test
    public void test2() {

        int[] array = new int[]{3, 2, 1};
        ShellSort.sort(array);
        assertEquals(true, Arrays.equals(new int[]{1, 2, 3}, array));
    }
}
