// Write a java program to print all prime numbers between 1 to 1000.

public class Five {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            for (int j = 2; j <= i/2; j++) {
                if (i%j != 0 && j == i/2) {
                    System.out.print(i + ", ");
                }
            }
        }
    }
}
