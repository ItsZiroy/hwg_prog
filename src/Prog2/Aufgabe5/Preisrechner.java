package Prog2.Aufgabe5;

public class Preisrechner {
    public static double berechnePreis(Person person) throws NullPointerException {
        if(person == null) throw new NullPointerException();
        if(person.isAdult()) {
            return 10;
        } else {
            return 7.50;
        }
    }
}
