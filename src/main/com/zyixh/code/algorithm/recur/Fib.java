package com.zyixh.code.algorithm.recur;

/**
 * @Author: zyixh<zyixh18@gmail.com>
 * @Created: 2025/12/3
 * @Description: 递归树
 */
public class Fib {
    public static void main(String[] args) {
        Fib fib = new Fib();
        int res = fib.fib(6);
        System.out.println(res);
    }

    int fib(int n) {
        if (n == 1 || n == 2) {
            return n - 1;
        }
        int res = fib(n - 1) + fib(n - 2);
        return res;
    }
}
