package Autoproduktion;

public class Main {

    public static void main2(String[] args) {
        Kleinteil lautstaerkeRegler = new Kleinteil("lautstärkeRegler", 2);
        Kleinteil antenne = new Kleinteil("antenne", 2);
        Kleinteil fmEmpfaenger = new Kleinteil("fmEmpfänger", 5);
        Kleinteil amEmpfaenger = new Kleinteil("amEmpfänger", 5);
        Kleinteil bildschirm = new Kleinteil("Bildschirm", 10);

        Komponente radio = new Komponente("Radio",
                new Kleinteil[]{lautstaerkeRegler, antenne, fmEmpfaenger, amEmpfaenger, bildschirm});
        Komponente radio2 = new Komponente("Radio2",
                new Kleinteil[]{lautstaerkeRegler, antenne, fmEmpfaenger, amEmpfaenger, bildschirm});

        Produktionsstandort berlin = new Produktionsstandort("Berlin", 30);
        System.out.println(Colors.ANSI_CYAN + "Überprüfe Methode Produktionsstandort.addProduziertes Teil.");
        berlin.addProduziertesTeil(lautstaerkeRegler);
        berlin.addProduziertesTeil(antenne);
        berlin.addProduziertesTeil(fmEmpfaenger);
        berlin.addProduziertesTeil(amEmpfaenger);
        berlin.addProduziertesTeil(bildschirm);
        try {
            System.out.println(Colors.ANSI_CYAN + "Überprüfe Methode Produktionsstandort.starteProduktion mit " + radio.getName());
            berlin.starteProduktion(radio);
            System.out.println(Colors.ANSI_GREEN + "Methode funktioniert");
            System.out.println(Colors.ANSI_CYAN + "Starte Produktion von " + radio2.getName());
            berlin.starteProduktion(radio2);
            System.out.println(Colors.ANSI_GREEN + "Produktion gestartet");
        } catch (MangelndeMitarbeiterException e) {
            System.out.println(Colors.ANSI_RED + e.getMessage() + Colors.ANSI_RESET);
            System.out.println(Colors.ANSI_CYAN + "Beende Produktion von Kleinteil " + bildschirm.getName());
            berlin.beendeProuktion(bildschirm);
            System.out.println(Colors.ANSI_GREEN + "Produktion beendet");
            System.out.println(Colors.ANSI_CYAN + "Starte Produktion von " + radio2.getName());
            try {
                berlin.starteProduktion(radio2);
                System.out.println(Colors.ANSI_GREEN + "Produktion gestartet" + Colors.ANSI_RESET);
            } catch(MangelndeMitarbeiterException e2) {
                System.out.println(Colors.ANSI_RED + "Produktion von Radios fehlgeschlagen. Grund: "+ e2.getMessage() + Colors.ANSI_RESET);
                System.out.println(Colors.ANSI_CYAN + "Füge fehlende Mitarbeiter hinzu: " + e2.getDefizit());
                try {
                    System.out.println(Colors.ANSI_CYAN + "Starte erneute Produktion von " + radio2.getName());
                    berlin.starteProduktion(radio2);
                } catch (MangelndeMitarbeiterException e3) {

                }

            }

        }
        System.out.println(Colors.ANSI_CYAN + "Überprüfe Methode Komponente.istGleichesTeil mit Radio und Radio2");
        if(radio.istGleichesTeil(radio2)) {
            System.out.println(Colors.ANSI_GREEN + "Methode funktioniert.");
        } else {
            System.out.println(Colors.ANSI_GREEN + "Überprüfung fehlgeschlagen.");

        }

    }

    public static void main(String[] args) {
        Test.start();
    }
}
