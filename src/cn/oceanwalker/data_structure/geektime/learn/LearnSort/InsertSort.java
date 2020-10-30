package cn.oceanwalker.data_structure.geektime.learn.LearnSort;

import java.util.Arrays;

public class InsertSort {
    public static void sort(int[] a) {
        System.out.println("sort" + Arrays.toString(a));
        int length = a.length;
        if (length <= 1) return;
        for (int i = 1; i < length; i++) {
            int temp = a[i];
            int j = i - 1;
            while (j>=0 && a[j] > temp){
                a[j+1]=a[j];
                j-=1;
            }
//            for (; j >= 0; j--) {
//                if (a[j] > temp) {
//                    a[j + 1] = a[j];
//                } else {
//                    break;
//                }
//            }
            a[j + 1] = temp;
            System.out.println(Arrays.toString(a));
        }
    }
}
