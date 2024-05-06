import java.util.LinkedList;
import java.util.Queue;

public class BFSonMatrix {
    static class Pair {
        int row, col;

        public Pair(int r, int c) {
            this.row = r;
            this.col = c;
        }
    }

    public static boolean isValid(int i, int j, int rowSize, int colSize) {
        if (i >= 0 && j >= 0 && i < rowSize && j < colSize)
            return true;
        return false;
    }

    public static int count(int[][] graph, int row, int col) {
        int result = 0;
        int[] d1 = { 1, 0, -1, 0 };
        int[] d2 = { 0, -1, 0, 1 };
        for (int i = 0; i < 4; i++) {
            int r = row + d1[i];
            int c = col + d2[i];
            if (!isValid(r, c, graph.length, graph[0].length))
                result++;
            else if (isValid(r, c, graph.length, graph[0].length) && graph[r][c] == 0)
                result++;

        }

        return result;

    }

    public static int bfs(int graph[][], int r, int c) {
        Queue<Pair> q = new LinkedList<>();
        boolean vis[][] = new boolean[graph.length][graph[0].length];
        int[] d1 = { 0, 1, 0, -1, 0 };
        int[] d2 = { 0, 0, -1, 0, 1 };

        q.offer(new Pair(r, c));
        int ans = 0;
        while (!q.isEmpty()) {
            Pair cur = q.poll();
            for (int i = 0; i < 4; i++) {
                int row = cur.row + d1[i];
                int col = cur.col + d2[i];

                if (isValid(row, col, graph.length, graph[0].length) && graph[row][col] == 1
                        && vis[row][col] == false) {
                    q.add(new Pair(row, col));
                    ans += count(graph, row, col);
                    vis[row][col] = true;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] graph = { { 0, 1 } };
        int row = -1, col = -1;
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; i < graph[0].length; i++)
                if (graph[i][j] == 1) {
                    row = i;
                    col = j;
                    break;
                }
            if (row != -1 && col != -1)
                break;
        }
        System.out.println(bfs(graph, row, col));

    }
}
