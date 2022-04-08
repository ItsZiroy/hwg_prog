package Prog2.Swing;

import java.awt.*;
import javax.swing.*;

    public class VierButtonFrame extends JFrame {
        Container c;
        public VierButtonFrame(int i) {
            c = getContentPane();
            switch (i) {
                case 1:
                    c.setLayout(new FlowLayout());
                    break;
                case 2:
                    c.setLayout(new BorderLayout());
                    break;
                case 3:
                    c.setLayout(new GridLayout());
                    break;
                case 4:
                    c.setLayout(new GridLayout(0, 1));
            }
            c.add(new JButton("A"));
            c.add(new JButton("B"));
            c.add(new JButton("C"));
            c.add(new JButton("D"));
        }
        public static void main(String[] args) {
            for (int i = 0; i < 4; i++) {
                VierButtonFrame fenster = new VierButtonFrame(i + 1);
                fenster.setTitle("Fenster " + (i + 1));
                fenster.setSize(200, 200);
                fenster.setLocation(i * 200, 0);
                fenster.setVisible(true);
                fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            } }
    }

