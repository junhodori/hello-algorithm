package sort.algorithm.impl;

public class InsertSort extends SelectionSort {
    @Override
    public int[] sort(int[] array) {
        for (int x = 1; x < array.length; x++) {
            int target = array[x];
            int emptyIdx = x;

            while (emptyIdx > 0 && target < array[emptyIdx - 1]) {
                move(array, emptyIdx - 1, emptyIdx);
                emptyIdx--;
            }

            array[emptyIdx] = target;
        }

        return array;
    }
}
