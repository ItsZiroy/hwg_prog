package Ubung4.Waehrung;

public class WaehrungsTest {
    public static void main(String[] args) {
        Euro euro = new Euro(1);
        Yen yen = new Yen(124.75);
        Pfund pfund = new Pfund(euro);

        System.out.println(euro.euroBetrag() + " Euro entspricht: " + euro.dollarBetrag());
        System.out.println(yen.waehrungsBetrag() + " Yen entspricht: " + yen.dollarBetrag());
        System.out.println(pfund.waehrungsBetrag() + " Pfund entspricht: "+ pfund.dollarBetrag());

    }
}
