package sort.algorithm.impl;

import sort.algorithm.SortAlgorithm;

public class BubbleSort extends SortAlgorithm {
    @Override
    public int[] sort(int[] array) {
        for (int x = 0; x < array.length - 1; x++) {

            for (int y = array.length - 1; y > x; y--) {
                if (array[y] < array[y - 1]) {
                    swap(array, y, y - 1);
                }
            }
        }

        return array;
    }
}
