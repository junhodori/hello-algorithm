package number_of_cases.algorithm.impl;

import number_of_cases.algorithm.NumberOfCasesAlgorithm;

public class Permutation implements NumberOfCasesAlgorithm {
    @Override
    public int count(int a, int b) {
        return fact(a) / fact(a - b);
    }

    public int fact(int n) {
        if (n <= 1) return 1;

        return fact(n - 1) * n;
    }

    @Override
    public void cases(int[] array, int r) {
        cases(array, 0, r);
    }

    public void cases(int[] array, int depth, int r) {
        if (depth == r) {
            print(array, r);
            return;
        }

        for (int x = depth; x < array.length; x++) {
            swap(array, depth, x);
            cases(array, depth + 1, r);
            swap(array, depth, x);
        }

    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void print(int[] array, int r) {
        for (int x = 0; x < r; x++) {
            System.out.print("[");
            System.out.print(array[x]);
            System.out.print("]");
        }
        System.out.println();
    }
}
