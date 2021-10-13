package Prog1.Autoproduktion;

import Tools.Colors;

public class Test {
    public static void start() {
        if(Test.testeKleinteil() == 0) {
            Test.testeKomponente();
        }

    }

    public static int testeKleinteil() {
        try {
            Test.info("Erstelle Kleinteil [Name: Teil, Arbeiter: 10]");
            Kleinteil teil = new Kleinteil("Teil", 10);
            if(teil.getName().equals("Teil") && teil.getBenoetigteArbeiter() == 10) {
                Test.success();
            } else {
                Test.error();
                return 1;
            }
            Test.info("Teste Methode Kleinteil.istGleichesTeil");
            Kleinteil teil2 = new Kleinteil("Teil", 10);
            Kleinteil teil3 = new Kleinteil("Teil3", 10);
            Kleinteil teil4 = new Kleinteil("Teil", 15);
            if(teil.istGleichesTeil(teil2) && !teil.istGleichesTeil(teil3) && !teil.istGleichesTeil(teil4)) {
                Test.success();
            } else {
                Test.error();
                return 1;
            }
        } catch (Exception e) {
            Test.error();
            return 1;
        }
        return 0;
    }

    public static int testeKomponente() {
        Test.info("Erstelle Komponente [Name: Radio, Teile: Antenne, Receiver]");
        Kleinteil antenne = new Kleinteil("Antenne", 10);
        Kleinteil receiver = new Kleinteil("Receiver", 10);
        try {
            Komponente radio = new Komponente("Radio", new Kleinteil[]{antenne, receiver});
            Test.success();

        }  catch (Exception e) {
            Test.error();
            return 1;
        }
        return 0;
    }

    public static void info(String message) {
        System.out.println(Colors.ANSI_CYAN + message);
    }
    public static void error(String message) {
        System.out.println(Colors.ANSI_RED + message);
    }
    public static void error() {
        System.out.println(Colors.ANSI_RED + "Test fehlgeschlagen");
    }
    public static void success(String message) {
        System.out.println(Colors.ANSI_GREEN + message);
    }
    public static void success() {
        System.out.println(Colors.ANSI_GREEN + "Test bestanden");
    }
}
