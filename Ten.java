// 10	Write a java program that prints the biggest, second biggest, and third biggest number and their positions from an array.	

public class Ten {
    public static void main(String[] args) {
        int[] arr = {55, 6, 99, 80, 3, 95, 6};
        int f = -3200000, s = -3200000, t = -3200000;
        int posf = -1, poss = -1, post = -1;
        for (int i = 0; i < arr.length; i++) {
            if (f < arr[i]) {
                s = f;
                t = s;
                f = arr[i];
                poss = posf;
                post = poss;
                posf = i + 1;
            } else if (s < arr[i]) {
                t = s;
                s = arr[i];
                post = poss;
                poss = i + 1;
            } else if (t < arr[i]) {
                t = arr[i];
                post = i + 1;
            }
        }
        System.out.print("First Largest: " + f + " at " + posf + ", Second Largest:  " + s + " at " + poss  + ", Third Largest: " + t + " at " + post );
    }
}
