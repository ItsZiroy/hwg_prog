package Prog2.Aufgabe17;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class AuskunftServer {

    private ArrayList<Telefonbucheintrag> telefonbuch = new ArrayList<>();

    public AuskunftServer() {
        telefonbuch.add(new Telefonbucheintrag("Fischer", 12345678));
        telefonbuch.add(new Telefonbucheintrag("Meier", 225577));
        telefonbuch.add(new Telefonbucheintrag("Müller", 958771));
        telefonbuch.add(new Telefonbucheintrag("Schmidt", 330912));

        try {
            ServerSocket server = new ServerSocket(3033);
            while(true) {
                Socket s = server.accept();
                new AuskunftProtocol(s, telefonbuch).start();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
       AuskunftServer server = new AuskunftServer();
    }
}
