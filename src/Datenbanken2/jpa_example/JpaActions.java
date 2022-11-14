package Datenbanken2.jpa_example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaActions {

    private static final String PERSISTENCE_UNIT_NAME = "shop";

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;

        try {
            // EntityManager erzeugen
            entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
            entityManager = entityManagerFactory.createEntityManager();

            // Kundin mit ID 0 aus DB lesen
            entityManager.getTransaction().begin();
            Customer kundin = entityManager.find(Customer.class, 1);
            entityManager.getTransaction().commit();
            System.out.println("Kundin mit ID 0: " + kundin.toString());

            // Anschrift der Kundin ändern und speichern
            entityManager.getTransaction().begin();
            kundin.setStreet("Turmstraße 8");
            kundin.setCity("Ludwigshafen");
            entityManager.getTransaction().commit();
            System.out.println("Kunden-Anschrift in Datenbank geändert.");
        } finally {
            // Ressourcen schließen
            if (entityManager != null) {
                entityManager.close();
            }
            if (entityManagerFactory != null) {
                entityManagerFactory.close();
            }
            System.out.println("Alle Ressourcen geschlossen.");
        }
    }
}
