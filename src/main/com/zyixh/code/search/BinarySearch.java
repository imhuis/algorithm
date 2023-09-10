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

    /**
     * return -1 not found
     */
    public static int binarySearch(int[] arr, int item) {
        int len = arr.length;
        int min = 0;
        int max = len - 1;

        while(min <= max) {
            int mid = (min + max) / 2;

            if (arr[mid] == item) {
                return mid;
            } else if (arr[mid] > item) {
                max = mid - 1;
            }else {
                min = mid + 1;
            }
        }
        return -1;
    }
}
