package Datenbanken2.Aufgabe9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcActions {

    private static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/Datenbanken2";
    private static final String DB_USER = "prog2";
    private static final String DB_PASSWORD = "";

    public static void main(String[] args) {
        // JDBC-Treiber auswählen
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC-Treiber nicht gefunden!");
        }

        try {
            // Verbindung zur DB aufbauen
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Verbindung aufgebaut");

            // Kundin mit ID 27 einlesen
            Statement statement = connection.createStatement();
            ResultSet ergebnis = statement.executeQuery("SELECT * FROM CUSTOMER WHERE id = 27");

            ergebnis.next(); // zur ersten Zeile springen

            Customer kundin = new Customer();
            kundin.id = Integer.parseInt(ergebnis.getString(1));
            kundin.firstname = ergebnis.getString(2);
            kundin.lastname = ergebnis.getString(3);
            kundin.street = ergebnis.getString(4);
            kundin.city = ergebnis.getString(5);

            System.out.println(kundin);

            // Verbindung zur DB beenden
            connection.close();

            System.out.println("Verbindung beendet");
        } catch (SQLException e) {
            System.out.println("SQLException aufgetreten!");
            e.printStackTrace();
        }
    }
}
