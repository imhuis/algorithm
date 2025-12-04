package com.zyixh.code.algorithm.stack;

/**
 * @author: imhuis
 * @date: 2023/9/10
 * @description: 栈接口定义
 */
public interface Stack<T> {
    /*
     * 栈：LIFO表
     * 分类：顺序栈
     *      链式栈
     */

    void push(T t);

    T pop();

    T peek();
}
