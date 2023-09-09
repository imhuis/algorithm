package com.zyixh.code.sort;

import java.util.Arrays;

import static com.zyixh.code.sort.CornerStone.swap;

/**
 * <p>快速排序(Quick Sort)</p>
 * <p>Time Complexity: O(nlog(n)) - O(n2)</p>
 * <p>Auxiliary Space: O(1)</p>
 *
 * @author: imhuis
 * @date: 2023/9/8
 * @description: 分治算法，大而化小
 */
public class QuickSort implements ISort {

    public static void main(String[] args) {
        int[] sourceArray = new int[]{5,8,7,6,9};
        ISort sort = new QuickSort();
        sort.sort(sourceArray);
        System.out.printf("after sorting%s", Arrays.toString(sourceArray));
    }

    @Override
    public int[] sort(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;
        quickSort(arr, low, high);
        return arr;
    }

    static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            System.out.printf("「partition partitionIndex」:%d\n", partitionIndex);
//            System.out.printf("「partition」:low: %d -- high: %d\n", low, high);

            System.out.printf("1. %d -- %d 2. %d -- %d\n", low, partitionIndex - 1, partitionIndex + 1, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }

    }

    static int partition(int[] arr, int low, int high) {
        // Choosing the pivot
        int pivot = arr[high];

        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller than the pivot
            if (arr[j] < pivot) {

                // Increment index of smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);

        return (i + 1);
    }

}
