package Prog2.Aufgabe20;

import java.util.HashMap;
import java.util.Map;

public class Studentenverwaltung {

    public static void main(String[] args) {
        Map<Integer, Student> studentMap = new HashMap<>();

        Student max = new Student(123456, "Max", "Mustermann");
        Student claudia = new Student(234567, "Claudia", "Schmidt");
        Student petra = new Student(345678, "Petra", "Meier");

        studentMap.put(max.matrikelNr(), max);
        studentMap.put(claudia.matrikelNr(), claudia);
        studentMap.put(petra.matrikelNr(), petra);

        System.out.println(studentMap.containsKey(111111));
        System.out.println(studentMap.get(123456));

        Student maxNew = new Student(123456, "Max", "Fischer");
        studentMap.put(max.matrikelNr(), maxNew);

        System.out.println(studentMap.get(123456));
    }
}
