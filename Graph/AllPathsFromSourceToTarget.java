import java.util.*;;

public class AllPathsFromSourceToTarget {

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

    // O(v*v)
    static void allPathsFromSourceToTarget(ArrayList<Edge> Graph[], boolean visited[], int current, int target,
            String path) {
        if (current == target) {
            System.out.println(path);
            return;
        }

        for (int i = 0; i < Graph[current].size(); i++) {
            Edge e = Graph[current].get(i);
            if (!visited[e.destination]) {
                visited[e.destination] = true;
                allPathsFromSourceToTarget(Graph, visited, e.destination, target, path + e.destination);
                visited[e.destination] = false;
            }
        }

    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> Graph[] = new ArrayList[v];
        createGraph(Graph);
        boolean visited[] = new boolean[v];
        Arrays.fill(visited, false);
        // if you will not write this then you will include source again
        visited[0] = true;
        allPathsFromSourceToTarget(Graph, visited, 0, 5, "0");

    }
}
