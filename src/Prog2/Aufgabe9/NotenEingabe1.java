package Prog2.Aufgabe9;

import java.awt.*;
import javax.swing.*;
public class NotenEingabe1 extends JFrame {
    public NotenEingabe1() {
        Container c = getContentPane();
        c.setLayout(new GridLayout(5, 1));
        c.add(new JCheckBox("sehr gut"));
        c.add(new JCheckBox("gut"));
        c.add(new JCheckBox("befriedigend"));
        c.add(new JCheckBox("ausreichend", true));
        c.add(new JCheckBox("ungen ̈ugend"));
    }
}