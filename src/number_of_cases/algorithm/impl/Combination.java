package number_of_cases.algorithm.impl;

import number_of_cases.algorithm.NumberOfCasesAlgorithm;

public class Combination implements NumberOfCasesAlgorithm {

    @Override
    public int count(int a, int b) {
        if (a == b || b == 0) return 1;

        return count(a - 1, b - 1) + count(a - 1, b);
    }

    @Override
    public void cases(int[] array, int r) {
        cases(array, new boolean[array.length], 0, r);

    }

    public void cases(int[] array, boolean[] visited, int depth, int r) {
//        System.out.println("depth:" + depth);
//        System.out.println("r:" + r);

        if (r == 0) {
            print(array, visited);
            return;
        }

        if (depth < array.length) {
            visited[depth] = true;
            cases(array, visited, depth + 1, r - 1);

            visited[depth] = false;
            cases(array, visited, depth + 1, r);
        }

    }

    public static void print(int[] array, boolean[] visited) {
        for (int x = 0; x < array.length; x++) {
            if (visited[x]) {
                System.out.print("[");
                System.out.print(array[x]);
                System.out.print("]");
            }
        }
        System.out.println();
    }
}
