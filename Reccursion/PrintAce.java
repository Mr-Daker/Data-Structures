
public class PrintAce {

    public static void printAscend(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printAscend(n - 1);
    }

    public static void main(String[] args) {
        printAscend(10);
    }

}
