package com.zyixh.code.algorithm.recur;

/**
 * @Author: zyixh<zyixh18@gmail.com>
 * @Created: 2025/12/3
 * @Description: 递归
 */
public class Recursion {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        int res = recursion.recur(5);
        System.out.println(res);
    }

    int recur(int n) {
        if (n == 1) {
            return 1;
        }
        int res = recur(n - 1);
        return n + res;
    }
}
