package Prog2.Aufgabe12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PunkteVerbinden extends JFrame {
    Container c;
    RectanglePanel z;

    public PunkteVerbinden() {
        c = getContentPane();
        z = new RectanglePanel();
        c.add(z, BorderLayout.CENTER);
        JButton button = new JButton("Reset Board");
        
        button.addActionListener(e -> z.clearBoard());

        c.add(button, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        PunkteVerbinden frame = new PunkteVerbinden();
        frame.setTitle("Punkte Verbinden");
        frame.setSize(250, 200);
        frame.setVisible(true);
    }
}
