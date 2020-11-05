package sort;

import sort.algorithm.SortAlgorithm;
import sort.algorithm.impl.*;

public class Sort {
    public static void main(String[] args) {
        int[] input = {5, 2, 9, 3, 8, 1, 4, 6, 7, 0};

        print("input", input);

        SortAlgorithm sortAlgorithm = null;

        // 선택 정렬
        sortAlgorithm = new SelectionSort();
        print("output-1", sortAlgorithm.sort(input.clone()));

        // 버블 정렬
        sortAlgorithm = new BubbleSort();
        print("output-2", sortAlgorithm.sort(input.clone()));

        // 삽입 정렬
        sortAlgorithm = new InsertSort();
        print("output-3", sortAlgorithm.sort(input.clone()));

        // 퀵 정렬
        sortAlgorithm = new QuickSort();
        print("output-4", sortAlgorithm.sort(input.clone()));

        // 병합 정렬
        sortAlgorithm = new MergeSort();
        print("output-5", sortAlgorithm.sort(input.clone()));

        // 힙 정렬
        sortAlgorithm = new HeapSort();
        print("output-6", sortAlgorithm.sort(input.clone()));

        // 쉘 정렬
        sortAlgorithm = new ShellSort();
        print("output-7", sortAlgorithm.sort(input.clone()));
    }

    public static void print(String name, int[] array) {
        System.out.print(name + " : ");
        for (int x = 0; x < array.length; x++) {
            System.out.print("[" + array[x] + "] ");
        }
        System.out.println();
    }
}
