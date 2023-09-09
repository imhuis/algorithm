package com.zyixh.code.sort

import java.util.*

/**
 * @author: imhuis
 * @date: 2023/9/9
 * @description:
 */
fun swap(arr: IntArray, i: Int, j: Int) {
    val temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
    System.out.printf("sorting:%s\n", Arrays.toString(arr))
}