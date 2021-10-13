package Prog1.Ubung3;

public class Rekursion {
    public static void main(String[] args) {
        int tries = 5;
        for (int i = 0; i <= tries; i++) {
            System.out.println("f(" + i + "): " + f(i));
        }
    }

    public static int f(int x) {
        if (x == 0) {
            return 1;
        }
        return 2 * f(x - 1) + 1;
    }
}