package com.zyixh.code.algorithm.recur;

/**
 * @Author: zyixh<zyixh18@gmail.com>
 * @Created: 2025/12/3
 * @Description: 尾递归
 */
public class TailRecur {
    public static void main(String[] args) {
        TailRecur tailRecur = new TailRecur();
        int res = tailRecur.tailRecur(5, 0);
        System.out.println(res);
    }

    int tailRecur(int n, int res) {
        if (n == 0) {
            return res;
        }
        return tailRecur(n - 1, n + res);
    }
}
