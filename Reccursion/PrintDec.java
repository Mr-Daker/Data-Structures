
public class PrintDec {
    public static void printDescend(int n) {
        if (n == 0) {
            return;
        }

        printDescend(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        printDescend(10);
    }
}
