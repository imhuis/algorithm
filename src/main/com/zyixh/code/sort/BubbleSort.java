package com.zyixh.code.sort;

import java.util.Arrays;

/**
 * <p> 冒泡排序(Bubble Sort)</p>
 * <p>Time Complexity: O(n2)</p>
 * <p>Auxiliary Space: O(1)</p>
 *
 * @author: imhuis
 * @date: 2022/3/12
 * @description:
 */
public class BubbleSort implements IArraySort {

    public static void main(String[] args) {
        int[] bad = new int[]{5, 4, 3, 2, 1};
        int[] best = new int[]{1, 2, 3, 4, 5};


        System.out.printf("Before: %s\n", Arrays.toString(bad));

        bubbleSortt(bad);

        System.out.printf("After: %s", Arrays.toString(bad));

    }

    public static int[] bubbleSort1(int[] arr) {
        int len = arr.length;
        // 不需要排序
        if (len <= 1) { return arr; }
        int counter = 0;
        int outer = 0;
        boolean flag = false;
        // 只有一个元素待排序的时候就是有序的
        for (int i = 0; i < len - 1; ++i) {
            System.out.printf("----外循环%d次----\n", ++outer);
            // -i 减少比较次数
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 相邻两个元素比较
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    // 有交换
                    flag = true;
                    System.out.printf("交换 %d 次 %s\n", ++counter,Arrays.toString(arr));
                }else {
                    System.out.printf("未交换 %d  %s\n", ++counter, Arrays.toString(arr));
                }
            }
            if (!flag) break;
        }
        return arr;
    }


    public static int[] bubbleSort2(int[] arr, int length) {
        int n = 0;
        for (int i = length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    n++;
                    System.out.println(Arrays.toString(arr) + " " + n);
                }
            }
        }
        return arr;
    }

    /**
     * 冒泡排序只会操作相邻的两个数据，每次冒泡操作都会对相邻的两个元素进行比较，
     * 看是否满足大小关系要求。如果不满足就让它俩互换。
     * @param sourceArray
     * @return
     */
    @Override
    public int[] sort(int[] sourceArray) {
        System.out.println("原始数组：" + Arrays.toString(sourceArray));
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        int len = sourceArray.length;
        // 外层循环1开始内层不需要-1
        for (int i = 1; i < len; i++) {
            // 前两个元素
            for (int j = 0; j < len - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.println("发生交换:" + Arrays.toString(arr));
                }
            }
        }

        System.out.println("排序后数组：" + Arrays.toString(arr));
        return new int[0];
    }

    public static void bubbleSortt(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


}
