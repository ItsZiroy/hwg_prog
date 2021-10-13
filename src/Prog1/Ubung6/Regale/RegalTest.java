package Prog1.Ubung6.Regale;

public class RegalTest {
    public static void main(String[] args) {
        Regal<Buch> buchRegal = new Regal<>();
        buchRegal.fuegeHinzu1(new Buch("Buch A"));
        buchRegal.fuegeHinzu2(new Buch("Buch B"));
        buchRegal.fuegeHinzu3(new Buch("Buch C"));

        Regal<CD> cdRegal = new Regal<>();
        cdRegal.fuegeHinzu1(new CD("CD A"));
        cdRegal.fuegeHinzu2(new CD("CD B"));
        cdRegal.fuegeHinzu3(new CD("CD C"));

        System.out.println("Inhalt des Buchregals:");
        System.out.println( buchRegal.getGegenstand1());
        System.out.println( buchRegal.getGegenstand2());
        System.out.println( buchRegal.getGegenstand3());

        System.out.println("Inhalt des CD-Regals:");
        System.out.println( cdRegal.getGegenstand1());
        System.out.println( cdRegal.getGegenstand2());
        System.out.println( cdRegal.getGegenstand3());
    }
}
