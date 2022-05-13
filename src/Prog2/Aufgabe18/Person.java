package Prog2.Aufgabe18;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Person {
    private final String vorname;
    private final String nachname;


    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    @Override
    public String toString() {
        return "Person: " + vorname + " " + nachname;
    }

    // Lösung Aufgabe
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return getVorname().equals(person.getVorname()) && getNachname().equals(person.getNachname());
    }

    @Override
    public int hashCode() {
        // return getVorname.length() * getNachname.length();
        return Objects.hash(getVorname(), getNachname());
    }

    public static void main(String[] args) {
        Person maxMustermann1 = new Person("Max", "Mustermann");
        Person maxMustermann2 = new Person("Max", "Mustermann");
        Person maxMustermann3 = new Person("Max", "Mustermann");
        Set<Person> personen = new HashSet<Person>();
        personen.add(maxMustermann1);
        personen.add(maxMustermann2);
        System.out.println("Anzahl Personen: " + personen.size());
        System.out.println("Max Mustermann in Menge enthalten: "
                + personen.contains(maxMustermann3));
    }
}