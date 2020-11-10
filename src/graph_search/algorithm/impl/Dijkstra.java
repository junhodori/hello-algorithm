package graph_search.algorithm.impl;

import java.util.Stack;

public class Dijkstra {
    public int[] search(int[][] matrix, int start, int end) {
        int distance[] = new int[matrix.length];
        boolean[] visited = new boolean[matrix.length];
        int[] vertex = new int[matrix.length];

        for (int x = 0; x < matrix.length; x++) {
            distance[x] = Integer.MAX_VALUE;
            vertex[x] = -1;
        }

        distance[start] = 0;
        visited[start] = true;
        vertex[start] = start;

        for (int x = 0; x < matrix.length; x++) {
            if (!visited[x] && matrix[start][x] != 0) {
                distance[x] = matrix[start][x];
                vertex[x] = start;
            }
        }

        printBoolean("visited", visited);
        print("distance", distance);
        print("vertex", vertex);

        while (!isAllTrue(visited)) {
            int minIndex = -1;

            // 최저값 찾기
            for (int x = 0; x < matrix.length; x++) {
                if (!visited[x] && distance[x] != Integer.MAX_VALUE) {
                    if (minIndex < 0 || distance[x] < distance[minIndex]) {
                        minIndex = x;
                    }
                }
            }

            visited[minIndex] = true;

            printBoolean("visited", visited);

            for (int x = 0; x < matrix.length; x++) {
                if (!visited[x] && matrix[minIndex][x] != 0) {
                    if (distance[x] > distance[minIndex] + matrix[minIndex][x]) {
                        distance[x] = distance[minIndex] + matrix[minIndex][x];
                        vertex[x] = minIndex;
                    }
                }
            }

            print("distance", distance);
            print("vertex", vertex);
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(end);

        while (end != start) {
            stack.push(vertex[end]);
            end = vertex[end];
        }

        int[] result = new int[stack.size()];
        int idx = 0;

        while (!stack.empty()) {
            result[idx++] = stack.pop();
        }

        return result;
    }

    public int distance(int[][] matrix, int start, int end) {
        int distance[] = new int[matrix.length];
        boolean[] visited = new boolean[matrix.length];

        for (int x = 0; x < matrix.length; x++) {
            distance[x] = Integer.MAX_VALUE;
        }

        distance[start] = 0;
        visited[start] = true;

        for (int x = 0; x < matrix.length; x++) {
            if (!visited[x] && matrix[start][x] != 0) {
                distance[x] = matrix[start][x];
            }
        }

        printBoolean("visited", visited);
        print("distance", distance);

        while (!isAllTrue(visited)) {
            int minIndex = -1;

            // 최저값 찾기
            for (int x = 0; x < matrix.length; x++) {
                if (!visited[x] && distance[x] != Integer.MAX_VALUE) {
                    if (minIndex < 0 || distance[x] < distance[minIndex]) {
                        minIndex = x;
                    }
                }
            }

            visited[minIndex] = true;

            printBoolean("visited", visited);

            for (int x = 0; x < matrix.length; x++) {
                if (!visited[x] && matrix[minIndex][x] != 0) {
                    if (distance[x] > distance[minIndex] + matrix[minIndex][x]) {
                        distance[x] = distance[minIndex] + matrix[minIndex][x];
                    }
                }
            }

            print("distance", distance);
        }

        return distance[end];
    }

    public static boolean isAllTrue(boolean[] array) {
        for (boolean x : array) {
            if (!x) {
                return false;
            }
        }
        return true;
    }

    public static void print(String name, int[] array) {
        System.out.print(name + " : ");
        for (int x = 0; x < array.length; x++) {
            System.out.print("[");
            System.out.print(array[x]);
            System.out.print("]");
        }
        System.out.println();
    }

    public static void printBoolean(String name, boolean[] array) {
        System.out.print(name + " : ");
        for (int x = 0; x < array.length; x++) {
            System.out.print("[");
            System.out.print(array[x]);
            System.out.print("]");
        }
        System.out.println();
    }
}
