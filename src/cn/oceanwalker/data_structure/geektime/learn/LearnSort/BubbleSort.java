package cn.oceanwalker.data_structure.geektime.learn.LearnSort;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] a) {
        if (a.length <= 1) {
            return;
        }
        int length = a.length;
        for (int i = 0; i < length; i++) {
            boolean flag = false;
            for (int j = 0; j < length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                }
            }
            System.out.println(Arrays.toString(a));
            if (!flag) break;
        }
    }
}
