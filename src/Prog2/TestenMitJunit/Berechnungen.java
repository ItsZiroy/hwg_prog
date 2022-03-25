package Prog2.TestenMitJunit;

public class Berechnungen {

    public static int addiere(int summand1, int summand2) {
        return summand1 + summand2;
    }

    public static int multipliziere(int faktor1, int faktor2) {
        if (faktor1 < 0 || faktor2 < 0) {
            throw new IllegalArgumentException();
        }
        return faktor1 * faktor2;
    }
}
