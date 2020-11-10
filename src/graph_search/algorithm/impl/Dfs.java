package graph_search.algorithm.impl;

import graph_search.algorithm.GraphSearchAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Dfs implements GraphSearchAlgorithm {
    @Override
    public ArrayList<Integer> search(List<ArrayList<Integer>> a) {
        return dfs(a);
    }

    public static ArrayList<Integer> dfs(List<ArrayList<Integer>> a) {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[a.size()];

        ArrayList<Integer> result = new ArrayList<>();

        stack.push(0);

        while (!stack.empty()) {
            int current = stack.pop();

            for (int x : a.get(current)) {
                if (!visited[x]) {
                    stack.push(x);
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
