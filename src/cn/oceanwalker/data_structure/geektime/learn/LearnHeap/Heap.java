package cn.oceanwalker.data_structure.geektime.learn.LearnHeap;

public class Heap {
    private int[] a;
    private int capacity;
    private int count;

    public Heap(int n) {
        this.count = 0;
        this.capacity = n + 1;
        this.a = new int[n + 1];
    }

    public void insert(int data) {
        if (count == capacity - 1) {
            return;
        }
        count++;
        a[count] = data;
        int i = count;
        while (i / 2 > 0 && a[i / 2] > a[i]) {
            swap(a, i / 2, i);
            i = i / 2;
        }
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
        int i = 1;
        while (true) {
            int minIndex = i;
            if (i * 2 <= count && a[i * 2] < a[i]) {
                minIndex = i * 2;
            }
            if (i * 2 + 1 <= count && a[i * 2 + 1] < a[minIndex]) {
                minIndex = i * 2 + 1;
            }
            if (minIndex == i) {
                break;
            } else {
                swap(a, i, minIndex);
                i = minIndex;
            }
        }
        return result;
    }
}
