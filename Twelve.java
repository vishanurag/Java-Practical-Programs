// Write a java program to perform matrix addition and displays the matrix.

public class Twelve {
    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println("");
        }
    }
    public static int[][] addMatrix(int[][] a, int[][]b) {
        int n = a.length, m = a[0].length;
        int[][] c = new int[n][m];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int[][] a = {{1,2,3,4},{1,2,3,4},{1,2,3,4}, {1,2,3,4}};
        int[][] b = {{1,2,3,4},{1,2,3,4},{1,2,3,4}, {1,2,3,4}};

        System.out.println("Matrix A: ");
        printMatrix(a);
        System.out.println("Matrix B: ");
        printMatrix(b);
        System.out.println("After Adding A & B \n Matrix C: ");
        int[][] c = addMatrix(a, b);
        printMatrix(c);
    }
}
