package com.zyixh.code.array;

/**
 * @author: imhuis
 * @date: 2022/8/21
 * @description: 数组实现队列
 */
public class ArrayQueue {

    private int maxSize;
    // 指向队列头
    private int front;
    // 指向队列尾
    private int rear;

    private int[] arr;

    public ArrayQueue(int arrMaxSize) {
        maxSize = arrMaxSize;
        arr = new int[maxSize];
        front = -1;
        rear = -1;
    }

    public void addQueue(int element) {
        if (isFull()) {
            throw new RuntimeException("队列满");
        }
        arr[++rear] = element;
    }

    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列空");
        }
        return arr[++front];
    }

    public boolean isFull() {
        return rear == maxSize - 1;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public static void main(String[] args) {

    }
}
