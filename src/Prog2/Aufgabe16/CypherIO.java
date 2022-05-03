package Prog2.Aufgabe16;

import java.io.*;

public class CypherIO {

    static void cypher(String inputFileName, String outputFileName, short key) {
        File inputFile = new File(inputFileName);
        File outputFile = new File(outputFileName);
        int c;
        try {
            FileReader inputReader = new FileReader(inputFile);
            FileWriter outputWriter = new FileWriter(outputFile);

            while((c = inputReader.read()) != -1) {
                c = c + key;
                outputWriter.write((char) c);
            }

            inputReader.close();
            outputWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static void cypherIgnoreWhiteSpace(String inputFileName, String outputFileName, short key) {
        File inputFile = new File(inputFileName);
        File outputFile = new File(outputFileName);
        int c;
        try {
            FileReader inputReader = new FileReader(inputFile);
            FileWriter outputWriter = new FileWriter(outputFile);

            while((c = inputReader.read()) != -1) {
                c = c == 32 ? c : c  + key;
                outputWriter.write((char) c);
            }

            inputReader.close();
            outputWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
