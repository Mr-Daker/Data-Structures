public class FirstOcc {

    public static int firstOc(int arr[], int i, int item) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == item) {
            return i;
        }
        return firstOc(arr, i + 1, item);
    }

    public static void main(String[] args) {

        int arr[] = { 23, 45, 45, 22, 2, 3, 8, 9, 1, 7, 1 };
        System.out.println("Element's first occ at index " + firstOc(arr, 0, 1));

    }

}
