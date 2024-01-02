// Write a java program to display strings in uppercase, lowercase and length of the string.

public class Eleven {
    public static void revArr(int[] arr, int n) {
        for (int i = 0, j = n-1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    public static void printArr(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {55, 6, 99, 80, 3, 95, 6};
        System.out.println("Before Reversing: ");
        printArr(arr, arr.length);
        revArr(arr, arr.length);
        System.out.println("\nAfter Reversing: ");
        printArr(arr, arr.length);
    }
}
