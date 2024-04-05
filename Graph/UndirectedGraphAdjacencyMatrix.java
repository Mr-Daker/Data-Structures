public class UndirectedGraphAdjacencyMatrix {

    public static void main(String[] args) {
        int v = 4;
        int Graph[][] = new int[v][v];
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++)
                Graph[i][j] = 0;
        }
        Graph[0][2] = 1;
        Graph[1][2] = 1;
        Graph[1][3] = 1;
        Graph[2][0] = 1;
        Graph[2][1] = 1;
        Graph[2][3] = 1;
        Graph[3][1] = 1;
        Graph[3][2] = 1;
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++)
                System.err.print(Graph[i][j] + " ");
            System.err.println();
        }

    }

}
