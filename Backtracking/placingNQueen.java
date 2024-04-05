package Backtracking;

public class placingNQueen {

    public static boolean isSafe(char board[][], int row, int col) {
        // right diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        // left diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q')
                return false;
        }
        return true;
    }

    public static void nQueens(char board[][], int row) {
        if (board.length == row) {
            print(board);
            System.out.println();
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);
                board[row][j] = '.';
            }
        }
    }

    public static void print(char board[][]) {
        System.out.println("--Chess Board--");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char board[][] = new char[5][5];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = '.';
            }
        }
        nQueens(board, 0);
    }

}
