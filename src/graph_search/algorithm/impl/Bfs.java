package graph_search.algorithm.impl;

import graph_search.algorithm.GraphSearchAlgorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bfs implements GraphSearchAlgorithm {
    @Override
    public ArrayList<Integer> search(List<ArrayList<Integer>> a) {
        return bfs(a);
    }

    public static ArrayList<Integer> bfs(List<ArrayList<Integer>> a) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[a.size()];
        ArrayList<Integer> result = new ArrayList<>();

        queue.offer(0);

        while (!queue.isEmpty()) {
            Integer current = queue.poll();

            for (int x : a.get(current)) {
                if (!visited[x]) {
                    queue.offer(x);
                }
            }

            if (!visited[current]) {
                result.add(current);
            }

            visited[current] = true;
        }

        return result;
    }
}
