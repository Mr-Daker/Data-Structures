public class LastOcc {

    public static int lastOc(int arr[], int i, int item) {
        if (i == 0) {
            return -1;
        }
        if (arr[i] == item) {
            return i;
        }
        return lastOc(arr, i - 1, item);
    }

    public static void main(String[] args) {

        int arr[] = { 23, 45, 45, 22, 2, 3, 8, 9, 1, 7, 1 };
        System.out.println("Element's last occ at index " + lastOc(arr, arr.length - 1, 1));

    }

}
