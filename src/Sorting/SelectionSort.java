package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 56, -23, 6, 21, 68, -53, 78, 0, 25, -16};
        System.out.println("Array before sorting: " + Arrays.toString(array));
        selectionSort(array);
        System.out.println("Array after sorting: " + Arrays.toString(array));
    }
}
