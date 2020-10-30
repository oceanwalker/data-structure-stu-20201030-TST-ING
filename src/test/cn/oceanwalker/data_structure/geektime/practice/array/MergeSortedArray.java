package test.cn.oceanwalker.data_structure.geektime.practice.array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MergeSortedArray {
    @Test
    public void test() {
        int[] a = new int[]{1, 2};
        int[] b = new int[]{2, 3};
        int[] result = {1, 2, 2, 3};
        check(a, b, result);
        a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        b = new int[]{2, 3, 4, 6, 7, 8};
        result = new int[]{1, 2, 2, 3, 3, 4, 4, 5, 6, 6, 7, 7, 8, 8, 9};
        check(a, b, result);
        check(new int[]{}, new int[]{}, new int[]{});
        check(new int[]{1}, new int[]{}, new int[]{1});
        check(new int[]{}, new int[]{1}, new int[]{1});
    }

    private void check(int[] a, int[] b, int[] result) {
        assertEquals("result=" + Arrays.toString(merge(a, b)) + " expect=" + Arrays.toString(result), true, Arrays.equals(result, merge(a, b)));
    }

    private int[] merge(int[] a, int[] b) {
        final int m = a.length;
        final int n = b.length;
        int[] result = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
//        while (i != m || j != n) {
//            if (j == n || (i < m && a[i] < b[j])) {
//                result[k] = a[i];
//                i++;
//            } else {
//                result[k] = b[j];
//                j++;
//            }
//            k++;
//        }
        while (i != m && j != n) {
            if (a[i] < b[j]) {
                result[k] = a[i];
                i++;
            } else {
                result[k] = b[j];
                j++;
            }
            k++;
        }
        while (i != m) {
            result[k] = a[i];
            i++;
            k++;
        }
        while (j != n) {
            result[k] = b[j];
            j++;
            k++;
        }
        return result;
    }
}
