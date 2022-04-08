package Prog2.Aufgabe9;

public class NotenEingabeTest {
    public static void main(String[] args) {
        NotenEingabe1 n1 = new NotenEingabe1();
        NotenEingabe2 n2 = new NotenEingabe2();
        NotenEingabe3 n3 = new NotenEingabe3();

        n1.setSize(400, 200);
        n1.setVisible(true);

        n2.setSize(400, 200);
        n2.setVisible(true);
        n2.setLocation(400, 0);

        n3.setSize(400, 200);
        n3.setVisible(true);
        n3.setLocation(800, 0);
    }
}
