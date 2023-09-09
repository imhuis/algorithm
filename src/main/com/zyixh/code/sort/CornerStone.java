package com.zyixh.code.sort;

import java.util.Arrays;

/**
 * @author: imhuis
 * @date: 2023/9/9
 * @description:
 */
public class CornerStone {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        System.out.printf("sorting:%s\n", Arrays.toString(arr));
    }
}
