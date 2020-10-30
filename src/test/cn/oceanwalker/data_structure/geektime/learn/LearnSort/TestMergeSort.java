package test.cn.oceanwalker.data_structure.geektime.learn.LearnSort;

import cn.oceanwalker.data_structure.geektime.learn.LearnSort.MergeSort;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestMergeSort {
    @Test
    public void testMergeSort1(){
        MergeSort sort=new MergeSort(new int[]{1});
        Assert.assertTrue(Arrays.equals(new int[]{1}, sort.sort()));
    }
    @Test
    public void testMergeSort2(){
        MergeSort sort=new MergeSort(new int[]{3,2,1});
        Assert.assertTrue(Arrays.equals(new int[]{1,2,3}, sort.sort()));
    }
}
