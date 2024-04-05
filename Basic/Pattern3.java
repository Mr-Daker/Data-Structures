package Basic;

public class Pattern3 {

    public static void printPattern3(int r, int c) {
        for (int i = 1; i <= r; i++) {
            for (int j = i; j <= c; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern3(5, 5);
    }

}
