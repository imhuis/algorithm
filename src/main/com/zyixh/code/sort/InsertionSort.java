package com.zyixh.code.sort;

import java.util.Arrays;

/**
 * <p>插入排序(Insertion Sort)</p>
 * <p>Time Complexity: O(n) - O(n2)</p>
 * <p>Auxiliary Space: O(1)</p>
 *
 * @author: imhuis
 * @date: 2022/8/15
 * @description:
 */
public class InsertionSort implements ISort {

    public static void main(String[] args) {
        ISort as = new InsertionSort();

        int[] arr = new int[]{5, 4, 3, 2, 1};
        int[] result = insertionSort(arr);

        System.out.printf("after sort %s", Arrays.toString(result));
    }

    public static int[] insertionSort(int[] arr) {
        System.out.printf("初始化::: \t %s\n", Arrays.toString(arr));
        int len = arr.length;
        int preIndex, current;
        for (int i = 1; i < len; i++) {
            preIndex = i - 1;
            current = arr[i];
            while (preIndex >= 0 && arr[preIndex] > current) {
                // 从已排序列表反向遍历，如果需要插入的值小于当前元素，则当前元素大了，需要往后移动
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
                System.out.printf("\t 内部 %s\n", Arrays.toString(arr));
            }
            if (preIndex != i) {
                arr[preIndex + 1] = current;
            }
            System.out.printf("外循环: \t %s\n\n", Arrays.toString(arr));
        }
        return arr;
    }

    @Override
    public int[] sort(int[] sourceArray) {
        int arr[] = sourceArray;
        int len = arr.length;
        // 元素==1，不需要排序
        if (len == 1) return arr;
        // 遍历未排序集合，i=0默认有序
        for (int i = 1; i < len; i++) {
            int temp = arr[i];
            // j代表有序队列索引
            int j = i - 1;
            for (; j >= 0; --j) {
                if (arr[j] > temp) {// 待排序值小于已排序值
                    arr[j+1] = arr[j];// 数据移动
                }else {
                    break;
                }
            }
            arr[j + 1] = temp;// 插入数据
        }
        return arr;
    }

}
