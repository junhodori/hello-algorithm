package sort.algorithm.impl;

import sort.algorithm.SortAlgorithm;

public class ShellSort extends SortAlgorithm {
    @Override
    public int[] sort(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            if (gap % 2 == 0) gap++;

            for (int x = 0; x < gap; x++) {
                sort(array, x, gap);
            }
        }

        return array;
    }

    public void sort(int[] array, int begin, int gap) {
        for (int x = begin + gap; x < array.length; x += gap) {
            int target = array[x];
            int emptyInx = x;

            while (emptyInx > begin && target < array[emptyInx - gap]) {
                move(array, emptyInx - gap, x);
                emptyInx = emptyInx - gap;
            }

            array[emptyInx] = target;
        }
    }
}
