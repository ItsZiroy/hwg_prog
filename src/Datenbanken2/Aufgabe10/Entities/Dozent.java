package Datenbanken2.Aufgabe10.Entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "dozenten")
public class Dozent {
    public Dozent() {}
    public Dozent(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String vorname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public Set<Vorlesung> getVorlesungen() {
        return vorlesungen;
    }

    public void setVorlesungen(Set<Vorlesung> vorlesungen) {
        this.vorlesungen = vorlesungen;
    }

    private String nachname;

    @Override
    public String toString() {
        return "Dozent{" +
                "id=" + id +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", vorlesungen=" + vorlesungen +
                '}';
    }

    @OneToMany(mappedBy = "dozent")
    private Set<Vorlesung> vorlesungen;
}
