package com.zyixh.code.algorithm.list;

import java.util.Arrays;

/**
 * @Author: zyixh<zyixh18@gmail.com>
 * @Created: 2025/12/4
 * @Description:
 */
public class MyList {
    private int[] arr;
    private int capacity = 10;
    private int size;
    private final int extendRatio = 2;

    private MyList() {
        arr = new int[capacity];
    }

    public MyList(int size) {
        arr = new int[size];
        this.capacity = size;
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return capacity;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
    }

    public void insert(int index, int value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (size == capacity) {

        }
        for (int i = size -1; i >= index; i--) {
            arr[i+1] = arr[i];
        }
        arr[index] = value;
        size++;
    }

    public int remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        int num = arr[index];
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i+1];
        }
        size--;
        return num;
    }

    public void extendCapacity() {
        arr = Arrays.copyOf(arr, capacity() * extendRatio);
        this.capacity = arr.length;
    }

    public int[] toArray() {
        int size = size();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = arr[i];
        }
        return arr;
    }

}
