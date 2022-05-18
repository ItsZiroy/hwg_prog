package Prog2.Aufgabe21;

import Prog2.Aufgabe20.Student;
import com.google.common.base.Splitter;
import com.google.common.collect.HashMultimap;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readLines(new File("src/Prog2/Aufgabe21/studenten.txt"), StandardCharsets.UTF_8);
            HashMultimap<String, Student> lastNameMap = HashMultimap.create();
            Map<Integer,Student> idMap = new HashMap<>();
            lines.forEach(line -> {
                List<String> vars = Splitter.on(';').trimResults().splitToList(line);
                Student student = new Student(Integer.parseInt(vars.get(0)), vars.get(1), vars.get(2));
                lastNameMap.put(student.nachname(), student);
                idMap.put(student.matrikelNr(), student);
            });

            System.out.println(idMap.get(123456));
            System.out.println(lastNameMap.get("König"));
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
