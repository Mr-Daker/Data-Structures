package Array;

public class Printsubarrays {
    public static void findsubarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = start; j < arr.length; j++) {
                int end = j;
                for (int j2 = start; j2 <= end; j2++) {
                    System.out.print(arr[j2] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, -3, 4, -5 };
        findsubarray(a);
    }

}
