package com.zyixh.code.sort;

import java.util.Arrays;

/**
 * @author: imhuis
 * @date: 2022/3/11
 * @description:
 */
public class SortTest {

    public static void main(String[] args) {
        ISort arraySort = new BubbleSort();

        int[] originalArray = new int[]{99, 88, 71, 52, 31, 22, 10, 1, 2};

        int[] result = arraySort.sort(originalArray);
        System.out.println(Arrays.toString(result));

//        int[] aa = new int[]{3, 10, 2, 4};
//        int[] bubbleSortArr = bubbleSort(originalArray);
//        int[] selectionSortArr = selectionSort(originalArray);
//        int[] insertionSortArr = insertionSort(aa);

    }


}
