package Datenbanken2.Aufgabe9;

public class Customer {

    public int id;
    public String firstname;
    public String lastname;
    public String street;
    public String city;

    @Override
    public String toString() {
        return firstname + " " + lastname + " (ID " + id + "), " + street + ", " + city;
    }
}
