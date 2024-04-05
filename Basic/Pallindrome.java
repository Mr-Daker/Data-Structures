package Basic;

import java.util.*;

public class Pallindrome {

    public static int printReverse(int n) {
        int rev = 0;
        while (n > 0) {
            int last_digit = n % 10;
            rev = rev * 10 + last_digit;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int number = sc.nextInt();
        if (number == printReverse(number)) {
            System.out.println("it is a palinodrome");
        } else {
            System.out.println("not palinodrome");
        }

    }

}
