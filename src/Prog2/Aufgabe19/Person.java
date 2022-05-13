package Prog2.Aufgabe19;

import java.util.*;

public class Person implements Comparable<Person> {
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

    // Lösung Aufgabe
    @Override
    public int compareTo(Person person) {
        if(!getNachname().equals(person.getNachname())) {
            return getNachname().compareTo(person.getNachname());
        }
        return getVorname().compareTo(person.getVorname());
    }

    public static void main(String[] args) {
        Person maxMustermann = new Person("Max", "Mustermann");
        Person claudiaSchmidt = new Person("Claudia", "Schmidt");
        Person petraMeier = new Person("Tom", "Meier");
        Person pe = new Person("Petra", "Meier");
        SortedSet<Person> sortiertePersonen = new TreeSet<Person>();
        sortiertePersonen.add(maxMustermann);
        sortiertePersonen.add(claudiaSchmidt);
        sortiertePersonen.add(petraMeier);
        sortiertePersonen.add(pe);
        for (Person person : sortiertePersonen) {
            System.out.println(person);
        }
    }
}