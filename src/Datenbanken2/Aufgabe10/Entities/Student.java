package Datenbanken2.Aufgabe10.Entities;

import javax.persistence.*;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
@Table(name = "studenten")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int matrikelnr;
    private String vorname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMatrikelnr() {
        return matrikelnr;
    }

    public void setMatrikelnr(int matrikelnr) {
        this.matrikelnr = matrikelnr;
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

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    private String nachname;
    @ManyToMany
    @JoinTable(name = "vorlesungsbesuche", joinColumns = {@JoinColumn(name = "student_id")}, inverseJoinColumns = {@JoinColumn(name = "vorlesung_id")})
    private Set<Vorlesung> vorlesungen;

    @OneToOne
    @JoinColumn(name = "adresse_id")
    private Adresse adresse;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", matrikelnr=" + matrikelnr +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", adresse=" + adresse +
                ", vorlesungen=" + vorlesungen.stream().map(vorlesung -> vorlesung.id).collect(Collectors.toSet()) +
                '}';
    }
}
