package Prog1;

import Tools.IOTools;

public class Ubung1 {

    public final String name = "Hahn";
    public final String firstname = "Yannik";
    public final String phone = "+49 xxxxxxxxx";
    public final short alter = 18;

    public static void main(String[] args) {
        Ubung1 ubung1 = new Ubung1();

        // ubung1.getMe();
        // ubung1.berechnung();
        // ubung1.intDiv();
        // ubung1.doubleDiv();
        ubung1.schleife();
    }

    public void schleife() {
        int i = 1;
        int n = 3;
        int summe = 0;
        while (i <= n)
            summe += i++;

        System.out.println(summe);
    }

    public void getMe() {


        System.out.print("Name: " + firstname + " ");
        System.out.println(name);
        System.out.println("Telefon: " + phone);
        System.out.println("Alter: " + alter);
    }

    public void berechnung() {
        int int1, int2;
        double double1, double2;

        int1 = 7;
        int2 = 3;
        double1 = 2.5;
        double2 = 1.35e-23;

        System.out.println(double1 / double2);


    }

    public void intDiv() {
        int a = IOTools.readInt("a =");
        int b = IOTools.readInt("b =");

        System.out.println(a / b);
    }

    public void DoubleDiv() {
        double a = IOTools.readDouble("a =");
        double b = IOTools.readDouble("b =");

        System.out.println(a / b);
    }


}