package Prog2.Aufgabe11.TeilC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BlackOrWhite extends JFrame {
    Container c;
    public BlackOrWhite() {
        c = getContentPane();
        c.setBackground(Color.WHITE);

        ColorButton button = new ColorButton(c, Color.BLACK);
        button.setText("Schwarz oder weiß?");
        c.add(button, BorderLayout.NORTH);
        c.addMouseListener(new MouseEditor());
    }

    public class MouseEditor extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            c.setBackground(Color.WHITE);
        }
    }

    public static void main(String[] args) {
        BlackOrWhite frame = new BlackOrWhite();
        frame.setTitle("Aufgabe 11");
        frame.setSize(250, 150);
        frame.setVisible(true);
    }
}
