import java.util.ArrayList;
import java.util.Arrays;

/**
 * DFS
 */
public class DFS {

    static class Edge {
        int source, destination;

        public Edge(int s, int d) {
            this.source = s;
            this.destination = d;
        }

    }

    static void createGraph(ArrayList<Edge> Graph[]) {
        for (int i = 0; i < Graph.length; i++) {
            Graph[i] = new ArrayList<>();
        }

        Graph[0].add(new Edge(0, 1));
        Graph[0].add(new Edge(0, 2));
        Graph[1].add(new Edge(1, 0));
        Graph[1].add(new Edge(1, 3));
        Graph[2].add(new Edge(2, 0));
        Graph[2].add(new Edge(2, 4));
        Graph[3].add(new Edge(3, 1));
        Graph[3].add(new Edge(3, 4));
        Graph[3].add(new Edge(3, 5));
        Graph[5].add(new Edge(5, 3));
        Graph[5].add(new Edge(5, 4));
        Graph[5].add(new Edge(5, 6));
        Graph[4].add(new Edge(4, 2));
        Graph[4].add(new Edge(4, 3));
        Graph[4].add(new Edge(4, 5));
        Graph[6].add(new Edge(6, 5));

    }

    public static void dfs(ArrayList<Edge> Graph[], Boolean visited[], int start) {

        System.out.println(start);
        visited[start] = true;
        for (int i = 0; i < Graph[start].size(); i++) {
            Edge e = Graph[start].get(i);
            if (visited[e.destination] == false) {
                dfs(Graph, visited, e.destination);
            }
        }

    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> Graph[] = new ArrayList[v];
        createGraph(Graph);
        Boolean visited[] = new Boolean[v];
        Arrays.fill(visited, false);
        dfs(Graph, visited, 0);

    }
}