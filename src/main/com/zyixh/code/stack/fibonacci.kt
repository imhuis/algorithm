package com.zyixh.code.stack

/**
 * @author: imhuis
 * @date: 2023/9/10
 * @description:
 */

fun fib(n: Int): Int {
    if (n <= 1) {
        return n;
    }
    return fib(n - 1) + fib(n - 2);
}

fun main() {
    val b = fib(26)
    print(b)
}