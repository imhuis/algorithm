package com.zyixh.code.sort;

import java.awt.image.RasterOp;
import java.util.Arrays;

/**
 * <p>希尔排序(Shell Sort)</p>
 * <p>Time Complexity: O(nlog(n)) - O(n2)</p>
 * <p>Average Case Complexity: O(nlog(n)2)</p>
 * <p>Auxiliary Space: O(1)</p>
 * <p>稳定性：不稳定排序 eg: 5 2 2 9</p>
 *
 * @author: imhuis
 * @date: 2023/9/8
 * @description: 希尔排序相当于多个插入排序
 */
public class ShellSort implements IArraySort {

    public static void main(String[] args) {
        int[] arr = new int[]{91,2,52,8,4,1};
        IArraySort shell = new ShellSort();
        shell.sort(arr);
        System.out.printf("after sort:%s", Arrays.toString(arr));
     }

    @Override
    public int[] sort(int[] sourceArray) {
        int n = sourceArray.length;
        for(int gap = n / 2; gap >0 ; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = sourceArray[i];
                int j;
                for(j = i; j >= gap && sourceArray[j - gap] > temp; j-=gap) {
                    sourceArray[j] = sourceArray[j - gap];
                }
                sourceArray[j] = temp;
            }
        }
        return sourceArray;
    }
}
