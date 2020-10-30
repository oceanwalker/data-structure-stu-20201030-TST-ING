package cn.oceanwalker.data_structure.geektime.learn.LearnSort;

public class QuickSort {
    public static void sort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }

    private static void quickSort(int[] a, int p, int r) {
        if (p >= r) {
            return;
        }
        int q = partition(a, p, r);
        quickSort(a, p, q - 1);
        quickSort(a, q + 1, r);
    }

    private static int partition(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        int temp = 0;
        for (int j = p; j < r; j++) {
            if (a[j] < pivot) {
                temp = a[i];
                a[i++] = a[j];
                a[j] = temp;
            }
        }
        temp = a[i];
        a[i] = a[r];
        a[r] = temp;
        return i;
    }
}
