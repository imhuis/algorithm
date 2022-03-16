package code.sort;

import java.util.Arrays;

/**
 * @author: imhuis
 * @date: 2022/3/12
 * @description:
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] originalArray = new int[]{3, 5, 2, 88, 11, 21, 31, 44, 97, 52, 23, 32, 99};
        bubbleSort1(originalArray, originalArray.length);
    }

    public static int[] bubbleSort1(int[] arr, int length) {
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
}
