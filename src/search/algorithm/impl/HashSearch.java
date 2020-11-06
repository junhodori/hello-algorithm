package search.algorithm.impl;

import search.algorithm.SearchAlgorithm;

public class HashSearch implements SearchAlgorithm {
    public static final int EMPTY_VALUE = -1;

    @Override
    public boolean search(int[] array, int num) {
        int hashIdx = hash(num);
        while (array[hashIdx] != num && array[hashIdx] != EMPTY_VALUE) {
            hashIdx++;
        }

        return array[hashIdx] == num ? true : false;
    }

    public int[] store(int[] array) {
        int[] ret = new int[(int) (array.length * 1.5)];

        for (int x = 0; x < ret.length; x++) {
            ret[x] = EMPTY_VALUE;
        }

        for (int x = 0; x < array.length; x++) {
            int hashIdx = hash(array[x]);

            while (ret[hashIdx] != EMPTY_VALUE) {
                hashIdx++;

                if (hashIdx >= array.length) {
                    hashIdx = 0;
                }
            }

            ret[hashIdx] = array[x];
        }

        return ret;
    }

    public int hash(int num) {
        return num % 10;
    }
}
