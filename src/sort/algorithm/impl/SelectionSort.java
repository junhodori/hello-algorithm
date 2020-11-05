package sort.algorithm.impl;

import sort.algorithm.SortAlgorithm;

public class SelectionSort extends SortAlgorithm {
    @Override
    public int[] sort(int[] array) {
        for (int x = 0; x < array.length; x++) {
            int min = x;

            for (int y = x + 1; y < array.length; y++) {
                if (array[min] > array[y]) {
                    min = y;
                }
            }

            swap(array, x, min);
        }

        return array;
    }
}
