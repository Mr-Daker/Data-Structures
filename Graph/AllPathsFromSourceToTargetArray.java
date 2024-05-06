import java.util.*;

public class AllPathsFromSourceToTargetArray {
    public static List<List<Integer>> ans = new ArrayList<>();

    public static void dfs(int[][] Graph, List<Integer> nodes, boolean[] visited, int cur) {
        if (Graph.length - 1 == cur) {
            ans.add(new ArrayList<>(nodes));
            return;
        }

        for (int i = 0; i < Graph[cur].length; i++) {
            if (!visited[Graph[cur][i]]) {
                visited[Graph[cur][i]] = true;
                nodes.add(Graph[cur][i]);
                dfs(Graph, nodes, visited, Graph[cur][i]);
                nodes.remove(nodes.size() - 1);
                visited[Graph[cur][i]] = false;
            }
        }

    }

    public static void main(String[] args) {
        int[][] Graph = {
                { 4, 3, 1 },
                { 3, 2, 4 },
                {},
                { 4 },
                {}
        };
        boolean visited[] = new boolean[Graph.length];

        List<Integer> temp = new ArrayList<>();
        temp.add(0);
        dfs(Graph, temp, visited, 0);
        System.out.println(ans);
    }
}
