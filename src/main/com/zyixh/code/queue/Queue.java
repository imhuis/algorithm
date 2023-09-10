package com.zyixh.code.queue;

/**
 * @author: imhuis
 * @date: 2023/9/10
 * @description: 队列接口定义
 */
public interface Queue<T> {

    /*
     * 队列：FIFO表
     * 分类：
     *      顺序队列
     *      循环队列
     */

    /**
     * 出队
     * @return
     */
    T dequeue();

    /**
     * 入队
     * @param entry
     */
    void enqueue(T entry);

    boolean isEmpty();

}
