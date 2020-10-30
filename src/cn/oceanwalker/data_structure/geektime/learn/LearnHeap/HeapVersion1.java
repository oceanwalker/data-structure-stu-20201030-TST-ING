package cn.oceanwalker.data_structure.geektime.learn.LearnHeap;

import java.util.Arrays;

public class HeapVersion1 {
    int capacity;
    int[] a;
    int count;

    public HeapVersion1(int n) {
        capacity = n + 1;
        a = new int[n + 1];
        count = 0;
    }

    public void insert(int data) {
        if (count == capacity - 1) {
            return;
        }
        count++;
        a[count] = data;
        int i = count;
        while (true) {
            if (i / 2 > 0 && a[i / 2] > a[i]) {
                swap(a, i / 2, i);
                i = i / 2;
            } else {
                break;
            }
        }
        System.out.println("insert "+data+" "+Arrays.toString(a));
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public int poll() {
        if (count == 0) {
            return -1;
        }
        int result = a[1];
        a[1] = a[count];
        count--;
        int minPoint = 1;
        while (true) {
            int i = minPoint;
            if (i * 2 <= count && a[i * 2] < a[i]) {
                minPoint = i * 2;
            }
            if (i * 2 + 1 <= count && a[i * 2 + 1] < a[minPoint]) {
                minPoint = i * 2 + 1;
            }
            if (i == minPoint) {
                break;
            }
            swap(a, i, minPoint);
            i=minPoint;
        }
        return result;
    }
}
