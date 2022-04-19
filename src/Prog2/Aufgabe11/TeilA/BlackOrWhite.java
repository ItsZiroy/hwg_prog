package Prog2.Aufgabe11.TeilA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BlackOrWhite extends JFrame {
    Container c;
    public BlackOrWhite() {
        c = getContentPane();
        c.setBackground(Color.WHITE);

        JButton button = new JButton();
        button.setText("Schwarz oder weiß?");
        button.addActionListener(new ButtonEditor());

        c.add(button, BorderLayout.NORTH);
        c.addMouseListener(new MouseEditor());
    }

    public class MouseEditor implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            c.setBackground(Color.WHITE);
        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

    public class ButtonEditor implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            c.setBackground(Color.BLACK);
        }
    }

    public static void main(String[] args) {
        BlackOrWhite frame = new BlackOrWhite();
        frame.setTitle("Aufgabe 11");
        frame.setSize(250, 150);
        frame.setVisible(true);
    }
}
