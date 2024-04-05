package Basic;

import java.util.*;

public class Pattern1 {
    public static void PrintStars(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();

    }

    public static void PrintBlank(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(" *");
        }

    }

    public static void main(String[] args) {

        for (int i = 5; i > 0; i--) {
            PrintBlank(i);
            PrintStars(i);
        }
    }
}