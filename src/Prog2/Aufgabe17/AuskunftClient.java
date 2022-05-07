package Prog2.Aufgabe17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class AuskunftClient {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 3033);

        BufferedReader keyboardIn = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader clientIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter clientOut = new PrintWriter(socket.getOutputStream(), true);

        while (true) {
            String line = clientIn.readLine();
            if(line.contains(AuskunftProtocol.ERROR)) {
                System.out.println(line.substring(AuskunftProtocol.ERROR.length()));
                System.out.println(clientIn.readLine());

            } else {
                System.out.println(line);
            }
            clientOut.println(keyboardIn.readLine());
        }

    }
}
