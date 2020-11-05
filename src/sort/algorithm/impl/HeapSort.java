package sort.algorithm.impl;

import sort.algorithm.SortAlgorithm;

public class HeapSort extends SortAlgorithm {
    @Override
    public int[] sort(int[] array) {
        buildMaxHeap(array);

        for (int x = array.length - 1; x > 0; x--) {
            swap(array, 0, x);
            maxHeapify(array, x,0);
        }
        return array;
    }

    public void maxHeapify(int[] array, int len, int idx) {
        int left = idx * 2 + 1;
        int right = idx * 2 + 2;
        int maxIdx = idx;

        if (left < len && array[maxIdx] < array[left]) {
            maxIdx = left;
        }

        if (right < len && array[maxIdx] < array[right]) {
            maxIdx = right;
        }

        if (maxIdx != idx) {
            swap(array, idx, maxIdx);
            maxHeapify(array, len, maxIdx);
        }
    }

    public void buildMaxHeap(int[] array) {
        for (int x = array.length / 2 - 1; x >= 0; x--) {
            maxHeapify(array, array.length, x);
        }
    }
}
