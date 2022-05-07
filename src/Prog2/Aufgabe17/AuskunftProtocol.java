package Prog2.Aufgabe17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Locale;

public class AuskunftProtocol extends Thread {
    BufferedReader in;

    public static final String SUCCESS = "OK: ";
    public static final String ERROR = "ERROR: ";

    PrintWriter out;
    ArrayList<Telefonbucheintrag> telefonbuch;
    Socket socket;

    static int clientsTotal;

    int client;

    public AuskunftProtocol(Socket s, ArrayList<Telefonbucheintrag> telefonbuch) {
        try {
            socket = s;
            this.telefonbuch = telefonbuch;
            client = ++clientsTotal;
            in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            out = new PrintWriter(s.getOutputStream(), true);
        } catch (IOException e) {
            System.out.println("Client Fehler bei:" + client);
        }
    }

    @Override
    public void run() {
        System.out.println("Protokoll gestartet");
        try {
            while(!this.isInterrupted()) {
                out.println("Geben sie ABFRAGE oder QUIT ein");

                String command = in.readLine();
                if(command != null) {
                    System.out.println(command);
                    switch (command) {
                        case "ABFRAGE" -> {
                            out.println("Zu welchem Namen soll die Nummer gesucht werden?");
                            String name = in.readLine();
                            for (Telefonbucheintrag eintrag :
                                    telefonbuch) {
                                if (eintrag.name().equalsIgnoreCase(name)) {
                                    out.println(eintrag.name() + " hat die Nummer " + eintrag.nummer());
                                } else {
                                    out.println("Für " + name + " konnte keine Nummer gefunden werden.");
                                }
                            }
                        }
                        case "QUIT" -> {
                            this.interrupt();
                        }
                        default -> {
                            out.println(ERROR + command + "Falscher Command.");
                        }
                    }
                } else {
                    this.interrupt();
                }
            }
        } catch (IOException e) {

        } finally {
            out.println("Connection closing.");
            try {
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
