package code.sort;

import java.util.Arrays;

/**
 * @author: imhuis
 * @date: 2022/3/11
 * @description:
 */
public class SortTest {

    public static void main(String[] args) {
        int[] originalArray = new int[]{3, 5, 2, 88, 11, 21, 31, 44, 97, 52, 23, 32, 99};

        int[] aa = new int[]{3, 10, 2, 4};
        int[] bubbleSortArr = bubbleSort(originalArray);
        System.out.println("--------------");
//        int[] selectionSortArr = selectionSort(originalArray);
//        int[] insertionSortArr = insertionSort(aa);

    }

    /**
     * 冒泡排序
     * @param arr
     * @return 最大的元素会被依次放到末尾
     */
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    // 相邻两个元素比较
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
        return arr;
    }

    /**
     * 选择排序
     * @param arr
     * @return
     */
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

    /**
     * 插入排序
     * @param arr
     * @return
     */
    public static int[] insertionSort(int[] arr) {
        System.out.printf("初始化: \t %s\n",Arrays.toString(arr));
        int len = arr.length;
        int preIndex, current;
        for (int i = 1; i < len; i++) {
            preIndex = i - 1;
            current = arr[i];
            while(preIndex >= 0 && arr[preIndex] > current) {
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
                System.out.printf("\t %s\n", Arrays.toString(arr));
            }
            arr[preIndex + 1] = current;
            System.out.printf("外循环: \t %s\n", Arrays.toString(arr));
        }
        return arr;
    }
}
