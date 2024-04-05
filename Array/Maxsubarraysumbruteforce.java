package Array;

public class Maxsubarraysumbruteforce {
    public static void maxsubArraySum(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = start; j < arr.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum += arr[k];
                }
                if (sum > max) {
                    max = sum;
                }
            }
        }

        System.out.println("The max sum possible in this sub array is " + max);

    }

    public static void main(String[] args) {
        int[] a = { 1, 2, -3, 4, -5 };
        maxsubArraySum(a);
    }
}
