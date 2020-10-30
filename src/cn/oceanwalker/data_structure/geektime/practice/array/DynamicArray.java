package cn.oceanwalker.data_structure.geektime.practice.array;

import java.util.Arrays;

public class DynamicArray<T> {
    private int size;
    private T[] data;

    public DynamicArray(int capacity) {
        this.size = 0;
        this.data = (T[]) new Object[capacity];
    }

    public DynamicArray() {
        this(10);
    }

    public int getCapacity() {
        return data.length;
    }

    public void set(int index, T value) {
        checkIndex(index);
        data[index] = value;
    }

    public T get(int index) {
        checkIndex(index);
        return data[index];
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int index, T value) {
        checkIndexAdd(index);
        if (size == getCapacity()) {
            resize(getCapacity() * 2);
        }
        for (int i = getCapacity() - 1; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = value;
        size++;
    }

    private void resize(int capacity) {
//            T[] newData = (T[]) new Object[capacity];
//            for (int i = 0; i < (capacity > getCapacity() ? getCapacity() : capacity); i++) {
//                newData[i] = data[i];
//            }
//            data = newData;
        data = Arrays.copyOf(data, capacity);
    }

    public T remove(int index) {
        checkIndex(index);
        T remove = data[index];
        for (int i = index; i < getCapacity() - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
        data[size] = null;
        if (size == getCapacity() / 4 && getCapacity() / 2 != 0) {
            resize(getCapacity() / 2);
        }
        return remove;
    }

    private void checkIndex(int index) {
        if (index >= size || index < 0) {
            throw new IllegalArgumentException("Require : 0 <= index < size");
        }
    }

    private void checkIndexAdd(int index) {
        if (index > size || index < 0) {
            throw new IllegalArgumentException("Require : 0 <= index <= size");
        }
    }

    public T[] getRawArray() {
        return data;
    }

    public void addFirst(T e) {
        add(0, e);
    }

    public void addLast(T e) {
        add(getCapacity(), e);
    }

    public void removeFirst() {
        remove(0);
    }

    public void removeLast() {
        remove(size - 1);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Array size is %d,capacity is %d \n", size, getCapacity()));
        result.append("[");
        for (int i = 0; i < size; i++) {
            result.append(data[i]);
            if (i != size - 1) {
                result.append(",");
            }
        }
        result.append("]");
        return result.toString();
    }

    public boolean contains(T e) {
        for (T datum : data) {
            if (e.equals(datum)) {
                return true;
            }
        }
        return false;
    }

    public int find(T e) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }
}
