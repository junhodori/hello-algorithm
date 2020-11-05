package sort.algorithm.impl;

import sort.algorithm.SortAlgorithm;

public class QuickSort extends SortAlgorithm {
    @Override
    public int[] sort(int[] array) {
        sort(array, 0, array.length - 1);

        return array;
    }

    public void sort(int[] array, int left, int right) {
        int p = left + 1;
        int q = right;

        while (p < q) {

            while (array[left] > array[p] && p < right) {
                p++;
            }

            while (array[q] >= array[left] && q > left) {
                q--;
            }

            if (p < q) {
                swap(array, p, q);
            }
        }

        if (array[left] > array[q]) {
            swap(array, left, q);
        }

        if (left < q - 1) {
            sort(array, left, q - 1);
        }

        if (q + 1 < right) {
            sort(array, q + 1, right);
        }
    }
}
