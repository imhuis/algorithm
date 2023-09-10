package com.zyixh.code.stack;

/**
 * @author: imhuis
 * @date: 2023/9/10
 * @description: 基于链表实现栈,支持泛型
 */
public class StackBasedOnLinkedListV2<T> {
    private Node<T> top = null;

    public void push(T value) {
        Node newNode = new Node(value, null);
        // 判断是否栈空
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    /**
     * -1表示栈中没有数据
     */
    public T pop() {
        if (top == null) return null;
        T value = top.data;
        top = top.next;
        return value;
    }

    public void printAll() {
        Node p = top;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }

    private static class Node<T> {
        private T data;
        private Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }
    }

}