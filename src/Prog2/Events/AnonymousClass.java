package Prog2.Events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AnonymousClass extends JFrame {
    Container c;
    JButton button;

    public AnonymousClass() {
        c = getContentPane();
        button = new JButton("Button");
        c.add(button, BorderLayout.NORTH);

        /*
         * Anonymous class for listener
         */
        button.addActionListener(event -> System.out.println("Action triggered!"));

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // super.mouseClicked(e);
            }
        });
    }
}
