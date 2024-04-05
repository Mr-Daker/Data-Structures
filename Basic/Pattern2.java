
package Basic;

import java.util.*;

public class Pattern2 {
    public static void PrintStars(int r, int c) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        PrintStars(5, 5);

    }
}
