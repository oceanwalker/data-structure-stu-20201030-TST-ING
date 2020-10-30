package cn.oceanwalker.data_structure.geektime.learn.LearnSort;

import java.util.Arrays;

public class MergeSort {
    private final int[] a;
    private final int length;

    public MergeSort(int[] a) {
        this.a = a;
        this.length = a.length;
    }

    public int[] sort() {
        if (length <= 1) {
            return a;
        }
        mergeSort(a, 0, length - 1);
        System.out.println(Arrays.toString(a));
        return a;
    }

    private void mergeSort(int[] a, int p, int r) {
        if (p >= r) {
            return;
        }
        int q = p + (r - p) / 2;
        mergeSort(a, p, q);
        mergeSort(a, q + 1, r);
        merge(a, p, q, r);
    }

    private void merge(int[] a, int p, int q, int r) {
        int[]temp=new int[r-p+1];
        int i = p;
        int j = q + 1;
        int k = 0;
        while (i <= q && j <= r) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }

        int start=i;
        int end=q;
        if(j<=r){
            start=j;
            end=r;
        }
        while (start<=end){
            temp[k++]=a[start++];
        }
        for (int l = 0; l <= (r-p); l++) {
            a[p+l]=temp[l];
        }
    }
}
