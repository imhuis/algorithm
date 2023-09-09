package com.zyixh.code.sort;

/**
 * @author: imhuis
 * @date: 2023/9/9
 * @description: 基数排序
 */
public class RadixSort implements ISort {


    @Override
    public int[] sort(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // 从个位开始，对数组arr按"指数"进行排序
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
        return arr;
    }

    public static void countingSort(int[] arr, int exp) {
        if (arr.length <= 1) {
            return;
        }

        // 计算每个元素的个数
        int[] c = new int[10];
        for (int i = 0; i < arr.length; i++) {
            c[(arr[i] / exp) % 10]++;
        }

        // 计算排序后的位置
        for (int i = 1; i < c.length; i++) {
            c[i] += c[i - 1];
        }

        // 临时数组r，存储排序之后的结果
        int[] r = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            r[c[(arr[i] / exp) % 10] - 1] = arr[i];
            c[(arr[i] / exp) % 10]--;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r[i];
        }
    }
}
