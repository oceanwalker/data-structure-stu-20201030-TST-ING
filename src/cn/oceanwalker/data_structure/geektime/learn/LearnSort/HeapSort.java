package cn.oceanwalker.data_structure.geektime.learn.LearnSort;

import java.util.Arrays;

public class HeapSort {

    public static int[] sort(int[] a) {
        int n = a.length;
        for (int i = n / 2; i >= 0; i--) {
            heapify(a, i, n);
        }
        System.out.println("after heapify:" + Arrays.toString(a));
        int j = n - 1;
        while (j > 0) {
            swap(a, 0, j);
            heapify(a, 0, j);
            j--;
        }
        System.out.println(Arrays.toString(a));
        return a;
    }

    private static void heapify(int[] a, int i, int n) {
        int j = i;
        while (true) {
            int maxPoint = j;
            if ((j + 1) * 2 - 1 < n && a[(j + 1) * 2 - 1] > a[j]) {
                maxPoint = (j + 1) * 2 - 1;
            }
            if ((j + 1) * 2 < n && a[(j + 1) * 2] > a[maxPoint]) {
                maxPoint = (j + 1) * 2;
            }
            if (maxPoint == j) {
                break;
            } else {
                swap(a, maxPoint, j);
                j = maxPoint;
            }
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
