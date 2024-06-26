import java.util.*;

public class BFS {
    static class Edge {
        int source, destination;

        public Edge(int s, int d) {
            this.source = s;
            this.destination = d;
        }

    }

    public static void createGraph(ArrayList<Edge> Graph[]) {

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

    public static void bfs(ArrayList<Edge> Graph[], Boolean visited[], int start) {
        Queue<Integer> q = new LinkedList<Integer>();

        q.add(start);
        while (q.isEmpty() == false) {
            int Current = q.remove();
            if (!visited[Current]) {
                System.out.println(Current);
                visited[Current] = true;
                for (int i = 0; i < Graph[Current].size(); i++) {

                    System.out.print(Graph[Current].get(i).destination + " ");
                    q.add(Graph[Current].get(i).destination);
                }
                System.out.println();
            }

        }
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> Graph[] = new ArrayList[v];
        createGraph(Graph);
        Boolean visited[] = new Boolean[v];
        Arrays.fill(visited, false);

        for (int i = 0; i < v; i++)
            if (visited[i] == false)
                bfs(Graph, visited, i);
        // bfs(Graph, visited, 0);

    }
}
