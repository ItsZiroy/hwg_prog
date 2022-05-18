package Prog2.Aufgabe23;

public class Main {
    public static void main(String[] args) {
        Druckerwarteschlange druckerwarteschlange1 = Druckerwarteschlange.getInstance();
        druckerwarteschlange1.addEntry("Test");
        Druckerwarteschlange druckerwarteschlange2 = Druckerwarteschlange.getInstance();
        druckerwarteschlange2.addEntry("Test2");
        System.out.println(druckerwarteschlange1);

    }
}
