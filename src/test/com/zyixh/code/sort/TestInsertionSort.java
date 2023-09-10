package com.zyixh.code.sort;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author: imhuis
 * @date: 2023/9/8
 * @description:
 */
public class TestInsertionSort {

    @Test
    public void testInsertionSort() {
        int[] arr = new int[]{5, 4, 3, 2, 1};
        ISort as = new InsertionSort();
        as.sort(arr);
        assertArrayEquals(arr, new int[]{1,2,3,4,5});
    }
}
