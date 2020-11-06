package search.algorithm.impl;

import search.algorithm.SearchAlgorithm;

public class LinearSearch implements SearchAlgorithm {
    @Override
    public boolean search(int[] array, int num) {
        for (int x = 0; x < array.length; x++) {
            if (array[x] == num) {
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
