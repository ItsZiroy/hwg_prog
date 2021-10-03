package Ubung7;

public class AutoTest {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Aston Martin", "Braun", "ST-Y-1111");
        Auto auto2 = new Auto("Ferrari", "Gelb", "MA-Y-1111");
        Auto auto3 = new Auto("VW", "Weiß", "ST-Y-123");
        Auto auto4 = new Auto("BMW", "Schwarz", "TE-Y-1111");

        Auto[] autos = {auto1, auto2, auto3, auto4};

        for (Auto auto: autos) {
            System.out.println(auto.toString());
            System.out.println("Landkreis: " + auto.ermittleLandkreis());
        }

    }
}
