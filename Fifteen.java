// Write a program to implements method overloading.Ex:  add(2,3), add(2,3,4), add(2,3,4,5)

public class Fifteen {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    public static void main(String[] args) {
        int a = 10, b = 20, c = 25, d = 50;
        System.out.println(add(a, b));
        System.out.println(add(a, b, c));
        System.out.println(add(a, b, c, d));
    }
}


