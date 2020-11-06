package search.algorithm.impl;

import search.algorithm.SearchAlgorithm;

public class BinarySearch implements SearchAlgorithm {
    @Override
    public boolean search(int[] array, int num) {
        int left = 0;
        int right = array.length - 1;
        int mid;

        while (left < right) {
            mid = (left + right) / 2;

            if (num < array[mid]) {
                right = mid - 1;
            } else if (num > array[mid]) {
                left = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }

    @Override
    public int[] store(int[] array) {
        return array;
    }
}
