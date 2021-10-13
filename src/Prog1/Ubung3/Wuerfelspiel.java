package Prog1.Ubung3;

import Tools.IOTools;

public class Wuerfelspiel {

    private int spieler;

    private int[][] wuerfe;

    private int durchlaeufe;

    public static void main(String[] args) {
        int spieler = IOTools.readInt("Anzahl Spieler: ");
        int durchlaeufe = IOTools.readInt("Anzahl Würfe pro Spieler: ");
        Wuerfelspiel wu = new Wuerfelspiel(spieler, durchlaeufe);
        wu.simuliere();
    }

    public Wuerfelspiel(int spieler, int durchlaeufe) {
        this.spieler = spieler;
        this.durchlaeufe = durchlaeufe;
    }

    public int wuerfel() {
        return (int) (Math.random() * 100) % 6 + 1;
    }

    public void simuliere() {
        this.wuerfe = new int[spieler][durchlaeufe];

        for (int i = 0; i < this.wuerfe.length; i++) {
            long temp = 0;
            for (int j = 0; j < this.durchlaeufe; j++) {

                int gewuerfelteZahl = this.wuerfel();

                this.wuerfe[i][j] = gewuerfelteZahl;

                temp += gewuerfelteZahl;
            }

            double avg = temp / (double) this.durchlaeufe;

            System.out.println("Durschnitt Würfe " + (i + 1) + ". Spieler " + avg);
        }
    }

}
