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

    public static void bfs(ArrayList<Edge> Graph[]) {
        Queue<ArrayList<Edge>> q = new LinkedList<ArrayList<Edge>>();
        Boolean visited[] = new Boolean[Graph.length];
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        q.add(Graph[0]);
        while (!q.isEmpty()) {
            ArrayList<Edge> Current = q.remove();
            if (!visited[Current.get(0).source]) {
                System.out.println(Current.get(0).source);
                visited[Current.get(0).source] = true;
                for (int i = 0; i < Current.size(); i++) {
                    System.out.print(Current.get(i).destination + " ");
                    q.add(Graph[Current.get(i).destination]);
                }
                System.out.println();
            }

        }
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> Graph[] = new ArrayList[v];
        createGraph(Graph);
        bfs(Graph);
    }
}
