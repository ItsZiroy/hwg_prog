package Ubung3;

public class Durchschnitt {
    public static void main(String[] args) {
        System.out.println(Durchschnitt.avg(new double[]{0, 1, 5}));
        System.out.println(Durchschnitt.avg(new double[]{-2.4, 0.3, 5.2, 3.3}));
    }

    public static double avg(double[] d) {
        double temp = 0;
        for (double a : d) {
            temp += a;
        }
        return temp / d.length;
    }
}
