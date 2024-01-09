package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 56, -23, 6, 21, 68, -53, 78, 0, 25, -16};
        System.out.println("Array before sorting: " + Arrays.toString(array));
        insertionSort(array);
        System.out.println("Array after sorting: " + Arrays.toString(array));
    }
}
