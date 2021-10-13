package Prog1.Ubung4.Buchhandel;

public class VersandRechnerTest {
    public static void main(String[] args) {
        Buch abc = new Buch("ABC", 125);
        Buch def = new Buch("DEF", 375, 12.95);
        Buch ghi = new Buch("GHI", 490, 27.5);

        Buch[] buecher = {abc, def, ghi};

        for (Buch buch: buecher) {
            buch.ausgeben();
        }

        System.out.println("Der Versand kostet " + VersandRechner.berechneVersandkosten(buecher) + " EUR.");

    }
}
