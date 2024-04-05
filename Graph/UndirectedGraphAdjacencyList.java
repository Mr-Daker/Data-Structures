import java.util.ArrayList;

/**
 * UndirectedGraphAdjacencyList
 */
public class UndirectedGraphAdjacencyList {
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

        Graph[0].add(new Edge(0, 2));
        Graph[1].add(new Edge(1, 2));
        Graph[1].add(new Edge(1, 3));
        Graph[2].add(new Edge(2, 0));
        Graph[2].add(new Edge(2, 1));
        Graph[2].add(new Edge(2, 3));
        Graph[3].add(new Edge(3, 1));
        Graph[3].add(new Edge(3, 2));

    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> Graph[] = new ArrayList[v];
        createGraph(Graph);
        for (int i = 0; i < Graph[2].size(); i++) {
            System.out.println(
                    "Source: " + Graph[2].get(i).source + "               Destination: " + Graph[2].get(i).destination);
        }

    }

}