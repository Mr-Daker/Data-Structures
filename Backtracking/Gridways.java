
public class Gridways {
    static int count = 0;

    public static void grid(int i, int j, int row, int col) {
        if (i == row && j == col) {
            count++;
            return;
        }
        grid(i + 1, j, row, col);
        grid(i, j + 1, row, col);
    }

    public static void main(String[] args) {
        grid(0, 0, 4, 4);
        System.out.println(count);
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        gridways.count = count;
    }

}
