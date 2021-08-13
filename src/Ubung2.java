import Tools.IOTools;

public class Ubung2 {


    public static void main(String[] args) {

        Ubung2.aufgabe20();

    }

    public static void aufgabe18() {
        double r = IOTools.readDouble("radius = ");
        System.out.println("radius > 0 und < 10: " + (r > 0 && r < 10));

        double radius = 2* Math.PI * r;
        double flaeche = Math.PI * Math.pow(r, 2);
        System.out.println("Der Umfang eines Kreises mit Radius 2.5 ist " + radius + ".");
        System.out.println("Der Flächeninhalt eines Kreises mit Radius 2.5 ist " + flaeche + ".");
    }

    public static void aufgabe19() {
        String mode = IOTools.readString("while, for oder do-while? Defaults to for: ");
        int n = IOTools.readInt("n = ");
        System.out.println("N ist: " + n);
        switch(mode) {
            case "while" -> {
                int i = 3;
                System.out.println("while");
                while (i < 2 * n) {
                    i++;
                    System.out.println((double) 1/(2 * i + 1));
                }
            }
            case "do-while" -> {
                int i = 3;
                System.out.println("do-while");
                do {
                    i++;
                    System.out.println((double) 1/(2 * i + 1));
                } while (i < 2 * n);
            }
            default -> {
                System.out.println("for");
                for(int i = 3; i < 2 * n;) {
                    i++;
                    System.out.println((double) 1 / (2 * i + 1));
                }
            }
        }
    }
    public static class Zylinder {
        public static double mantel(double r, double h) {
            return 2 * Math.PI * r * h;
        }
        public static double grund(double r) {
            return Math.PI * Math.pow(r, 2);
        }

        public static double volumen(double r, double h) {
            return Zylinder.grund(r) * h;
        }

    }
    public static class Kegel {
        public static double mantel(double r, double h) {
            return Math.PI * r * Math.sqrt(Math.pow(r,2) * + Math.pow(h,2));
        }
        public static double grund(double r) {
            return Zylinder.grund(r);
        }

        public static double volumen(double r, double h) {
            return Zylinder.grund(r) * h/3;
        }
    }
    public static void aufgabe20() {
        System.out.println("Berechnung von Kreiskörpern");
        char koerper = IOTools.readChar("Kreiszylinder(Z) oder Kreiskegel(K)?: ");
        char berechnung = IOTools.readChar("Mantelfläche(M), Grundfläche(G) oder Volumen(V)?: ");
        double radius = IOTools.readInteger("Geben Sie bitte den Radius ein:");
        double hoehe = IOTools.readInteger("Geben Sie bitte die Höhe ein:");
        String berechnungName = "";
        String koerperName = "";
        double ergebnis = 0;
        switch (koerper) {
            case 'z', 'Z' -> {
                koerperName = "Kreiszylinder";
                switch (berechnung) {
                    case 'm', 'M' -> {
                        berechnungName = "Mantelfläche";
                        ergebnis = Zylinder.mantel(radius, hoehe);
                    }
                    case 'v', 'V' -> {
                        berechnungName = "Volumen";
                        ergebnis = Zylinder.volumen(radius, hoehe);
                    }
                    case 'g', 'G' -> {
                        berechnungName = "Grundfläche";
                        ergebnis = Zylinder.grund(radius);
                    }
                    default -> {
                        Ubung2.error();
                    }
                }
            }
            case 'k', 'K' -> {
                koerperName = "Kreiskegel";
                switch (berechnung) {
                    case 'm', 'M' -> {
                        berechnungName = "Mantelfläche";
                        ergebnis = Kegel.mantel(radius, hoehe);
                    }
                    case 'v', 'V' -> {
                        berechnungName = "Volumen";
                        ergebnis = Kegel.volumen(radius, hoehe);
                    }
                    case 'g', 'G' -> {
                        berechnungName = "Grundfläche";
                        ergebnis = Kegel.grund(radius);
                    }
                    default -> {
                        Ubung2.error();
                    }
                }
            }

        }
        System.out.println("Die "+ berechnungName +" eines "+ koerperName +" mit Radius " + radius + " und Höhe "
                + hoehe + " beträgt: " + ergebnis);
    }
    public static void error() {
        System.out.println("Fehler bei der Eingabe");
    }
}
