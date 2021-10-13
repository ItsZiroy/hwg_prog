package Prog1.Ubung5.Nummerierer;

public class Schilder {
    public static void beschriften(Nummerierer n) {
        // 5 Beschriftungen drucken
        for (int i = 1; i <= 5; i++) {
            System.out.println("Nächste Beschriftung: " + n.next());
        }
        // von vorne beginnen
        n.reset();
        // alle möglichen Beschriftungen drucken
        while (n.available()) {
            System.out.println("Nächste Beschriftung: " + n.next());
        }
    }

}
