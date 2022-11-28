package Datenbanken2.Aufgabe10.Entities;

import javax.persistence.*;

@Entity
@Table(name = "adressen")
public class Adresse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String strasse_nr;
    private String plz;
    private String ort;

    @Override
    public String toString() {
        return "Adresse{" +
                "id=" + id +
                ", strasse_nr='" + strasse_nr + '\'' +
                ", plz='" + plz + '\'' +
                ", ort='" + ort + '\'' +
                '}';
    }
}
