package Datenbanken2.Aufgabe10;

import Datenbanken2.Aufgabe10.Entities.Dozent;
import Datenbanken2.Aufgabe10.Entities.Student;
import Datenbanken2.Aufgabe10.Entities.Vorlesung;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Set;

public class Main {
    private static final String PERSISTENCE_UNIT_NAME = "shop";

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager manager = factory.createEntityManager();

        try {

            // Part 2
            Student s0 = manager.find(Student.class, 0);
            System.out.println(s0);

            // Part 3
            TypedQuery<Student> studentQuery = manager.createQuery("select s from Student s where s.adresse.ort = 'Ludwigshafen'", Student.class);
            List<Student> s1 = studentQuery.getResultList();
            System.out.println(s1);

            // Part 4
            TypedQuery<Vorlesung> dozentQuery = manager.createQuery("select v from Vorlesung v where v.vorlesungsname = 'Programmieren I'", Vorlesung.class);
            Vorlesung prog1 = dozentQuery.getSingleResult();
            System.out.println(prog1.dozent);

            // Part 5
            System.out.println(prog1.studenten);

            // Part 6
            manager.getTransaction().begin();

            Dozent susanne = new Dozent("Susanne", "Klein");
            manager.persist(susanne);

            Vorlesung rechnernetze = new Vorlesung("Rechnernetze", susanne);
            manager.persist(rechnernetze);

            manager.getTransaction().commit();
            manager.close();
        } finally {
            if (manager != null) {
                manager.close();
            }
            factory.close();
            System.out.println("Alle Ressourcen geschlossen.");
        }
    }
}
