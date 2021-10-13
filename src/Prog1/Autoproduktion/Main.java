package Prog1.Autoproduktion;

import Tools.Colors;

public class Main {

    public static void main(String[] args) {
        Kleinteil lautstaerkeRegler = new Kleinteil("lautstärkeRegler", 2);
        Kleinteil antenne = new Kleinteil("antenne", 2);
        Kleinteil fmEmpfaenger = new Kleinteil("fmEmpfänger", 5);
        Kleinteil amEmpfaenger = new Kleinteil("amEmpfänger", 5);
        Kleinteil bildschirm = new Kleinteil("Bildschirm", 10);

        Komponente radio = new Komponente("Radio",
                new Kleinteil[]{lautstaerkeRegler, antenne, fmEmpfaenger, amEmpfaenger, bildschirm});
        Komponente radio2 = new Komponente("Radio2",
                new Kleinteil[]{lautstaerkeRegler, antenne, fmEmpfaenger, amEmpfaenger, bildschirm});

        System.out.println(radio.istGleichesTeil(radio2));

        Produktionsstandort berlin = new Produktionsstandort("Berlin", 50);
        Produktionsstandort potsdam = new Produktionsstandort("Potsdam", 30);

        berlin.addProduziertesTeil(lautstaerkeRegler);
        berlin.addProduziertesTeil(antenne);
        berlin.addProduziertesTeil(fmEmpfaenger);
        berlin.addProduziertesTeil(amEmpfaenger);
        berlin.addProduziertesTeil(bildschirm);

        potsdam.addProduziertesTeil(lautstaerkeRegler);
        potsdam.addProduziertesTeil(antenne);
        potsdam.addProduziertesTeil(fmEmpfaenger);
        potsdam.addProduziertesTeil(amEmpfaenger);
        potsdam.addProduziertesTeil(bildschirm);

        System.out.println(berlin.kannProduziertWerden(antenne));
        System.out.println(berlin.kannProduziertWerden(lautstaerkeRegler));
        System.out.println(berlin.kannProduziertWerden(fmEmpfaenger));
        System.out.println(berlin.kannProduziertWerden(amEmpfaenger));
        System.out.println(berlin.kannProduziertWerden(bildschirm));


        try {
            berlin.starteProduktion(radio);
            berlin.starteProduktion(radio2);
            System.out.println("Produktion gestartet");
        } catch(MangelndeMitarbeiterException e) {
            System.out.println(Colors.ANSI_RED + e.getMessage());
        }

        try {
            potsdam.starteProduktion(radio);
            potsdam.starteProduktion(radio2);

        } catch(MangelndeMitarbeiterException e) {
            System.out.println(Colors.ANSI_RED + e.getMessage());
        }

    }
}
