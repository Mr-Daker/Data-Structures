package Backtracking;

public class SubsetOfBinarynum {
    public static void findSubset(int n, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        findSubset(n - 1, str + "0");
        findSubset(n - 1, str + "1");
    }

    public static void main(String[] args) {
        findSubset(3, "");
    }
}
