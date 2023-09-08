package com.zyixh.code.search;

/**
 * @author: imhuis
 * @date: 2022/8/15
 * @description: 二分查找
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 2, 88, 11, 21, 31, 44, 97, 52, 23, 32, 99};
        System.out.println(binarySearch(arr, 11));
    }

    public static int binarySearch(int[] arr, int item) {
        int len = arr.length;
        int min = 0;
        int max = len - 1;

        while(min < max) {
            int midIdx = (min + max) / 2;

            if (arr[midIdx] == item) {
                return midIdx;
            } else if (arr[midIdx] > item) {
                max = midIdx - 1;
            }else {
                min = midIdx + 1;
            }
        }
        return -1;
    }
}
