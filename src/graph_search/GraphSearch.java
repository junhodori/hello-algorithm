package graph_search;

import graph_search.algorithm.GraphSearchAlgorithm;
import graph_search.algorithm.impl.Bfs;
import graph_search.algorithm.impl.Dfs;

import java.util.ArrayList;

public class GraphSearch {
    public static void main(String[] args) {
        int[] vertextList = {0, 1, 2, 3, 4, 5, 6};
        int[][] edgeList = {{0, 1}, {0, 2}, {1, 0}, {1, 3}, {2, 0}, {2, 4}, {2, 5}, {3, 1}, {4, 2}, {4, 6}, {5, 2}, {6, 4}};

        // 인접 리스트
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
}
