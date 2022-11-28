package Datenbanken2.Aufgabe10.Entities;

import javax.persistence.*;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
@Table(name = "vorlesungen")
public class Vorlesung {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String vorlesungsname;
    @ManyToOne
    @JoinColumn(name = "dozent_id")
    public Dozent dozent;

    public Vorlesung() {}
    public Vorlesung(String vorlesungsname) {
        this.vorlesungsname = vorlesungsname;
    }
    public Vorlesung(String vorlesungsname, Dozent dozent) {
        this.vorlesungsname = vorlesungsname;
        this.dozent = dozent;
    }

    @ManyToMany
    @JoinTable(name = "vorlesungsbesuche", joinColumns = {@JoinColumn(name = "vorlesung_id")}, inverseJoinColumns = {@JoinColumn(name = "student_id")})
    public Set<Student> studenten;

    @Override
    public String toString() {
        return "Vorlesung{" +
                "id=" + id +
                ", vorlesungsname='" + vorlesungsname + '\'' +
                ", dozent=" + dozent.getId() +
                ", studenten=" + studenten.stream().map(student -> student.getId()).collect(Collectors.toSet())  +
                '}';
    }
}
