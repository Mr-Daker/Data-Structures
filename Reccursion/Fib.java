public class Fib {

    public static int fibofN(int n) {
        if (n == 1 || n == 0) {
            return n;
        }

        return fibofN(n - 1) + fibofN(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibofN(6));
    }

}
