package com.zyixh.code.sort;

import java.util.Arrays;

/**
 * <p>选择排序(Selection Sort)</p>
 * <p>Time Complexity: O(n) - O(n2)</p>
 * <p>Auxiliary Space: O(1)</p>
 *
 * @author: imhuis
 * @date: 2022/8/15
 * @description:
 */
public class SelectionSort implements IArraySort {

    public static void main(String[] args) {

    }

    public static int[] selectionSort(int[] arr) {
        int len = arr.length;
        int minIndex, temp;
        for (int i = 0; i < len - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    @Override
    public int[] sort(int[] sourceArray) {
        return new int[0];
    }
}
