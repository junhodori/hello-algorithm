package graph_search;

import graph_search.algorithm.GraphSearchAlgorithm;
import graph_search.algorithm.impl.Bfs;
import graph_search.algorithm.impl.Dfs;
import graph_search.algorithm.impl.Dijkstra;

import java.util.ArrayList;

public class GraphSearch {
    public static void main(String[] args) {
        // 인접 리스트
        char[] vertextList = {0, 1, 2, 3, 4, 5, 6};
        int[][] edgeList = {{0, 1}, {0, 2}, {1, 0}, {1, 3}, {2, 0}, {2, 4}, {2, 5}, {3, 1}, {4, 2}, {4, 6}, {5, 2}, {6, 4}};

        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();

        for (int x = 0; x < vertextList.length; x++) {
            adjacencyList.add(new ArrayList<>());
        }

        for (int[] edge : edgeList) {
            adjacencyList.get(edge[0]).add(edge[1]);
        }

        for (int x = 0; x < adjacencyList.size(); x++) {
            System.out.println("input[" + x + "] : " + adjacencyList.get(x));
        }

        GraphSearchAlgorithm graphSearchAlgorithm = new Dfs();
        ArrayList<Integer> result = graphSearchAlgorithm.search(adjacencyList);

        print("output-1", result);

        graphSearchAlgorithm = new Bfs();
        result = graphSearchAlgorithm.search(adjacencyList);

        print("output-2", result);


        System.out.println("Dijkstra");
        // 인접 리스트 (다익스트라 알고리즘)
//        vertextList = new char[] {'A', 'B', 'C', 'D', 'E', 'F'};
        int[][] matrix = new int[6][6];

        input(matrix, 0, 1, 3);
        input(matrix, 0, 2, 2);
        input(matrix, 0, 3, 4);
        input(matrix, 1, 3, 2);
        input(matrix, 1, 5, 5);
        input(matrix, 2, 4, 1);
        input(matrix, 3, 4, 1);
        input(matrix, 3, 5, 3);
        input(matrix, 4, 5, 2);

        printMatrix("input", matrix);


        Dijkstra dijkstra = new Dijkstra();

        printArray("output-search-3", dijkstra.search(matrix, 0, 5));
        System.out.println("output-distance-3 : " + dijkstra.distance(matrix, 0, 5));

    }

    public static void print(String name, ArrayList<Integer> result) {
        System.out.print(name + " : ");
        System.out.print("[");
        for (int x = 0; x < result.size(); x++) {
            if (x == result.size() - 1) {
                System.out.print(result.get(x));
            } else {
                System.out.print(result.get(x) + ",");
            }
        }
        System.out.print("]");
        System.out.println();
    }

    public static void printMatrix(String name, int[][] a) {
        for (int x = 0; x < a.length; x++) {
            System.out.print(name + "-" + x + ":");
            for (int y = 0; y < a.length; y++) {
                System.out.print("[");
                System.out.print(a[x][y]);
                System.out.print("]");
            }
            System.out.println();
        }
    }

    public static void printArray(String name, int[] a) {
        System.out.print(name + " : ");
        for (int x = 0; x < a.length; x++) {
            System.out.print("[");
            System.out.print(a[x]);
            System.out.print("]");
        }
        System.out.println();
    }

    public static void input(int[][] adjacencyMatrix, int a, int b, int weight) {
        adjacencyMatrix[a][b] = weight;
        adjacencyMatrix[b][a] = weight;
    }
}
