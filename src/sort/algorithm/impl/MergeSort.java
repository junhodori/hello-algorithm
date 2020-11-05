package sort.algorithm.impl;

import sort.algorithm.SortAlgorithm;

public class MergeSort extends SortAlgorithm {
    @Override
    public int[] sort(int[] array) {
        sort(array, 0, array.length - 1);
        return array;
    }

    public void sort(int[] array, int p, int q) {
        if (p < q) {
            int mid = (p + q) / 2;
            sort(array, p, mid);
            sort(array, mid + 1, q);

            int left = p;
            int right = mid + 1;
            int idx = p;

            int[] tmp = new int[array.length];

            while (left <= mid && right <= q) {
                if (array[left] < array[right]) {
                    tmp[idx++] = array[left++];
                } else {
                    tmp[idx++] = array[right++];
                }
            }

            while (left <= mid) {
                tmp[idx++] = array[left++];
            }

            while (right <= q) {
                tmp[idx++] = array[right++];
            }

            for (int x = p; x <= q; x++) {
                array[x] = tmp[x];
            }
        }

    }
}
