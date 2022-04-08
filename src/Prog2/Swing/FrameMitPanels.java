package Prog2.Swing;

import javax.swing.*;
import java.awt.*;

public class FrameMitPanels extends JFrame {
    Container c;
    public FrameMitPanels() {
        c = getContentPane();
        JPanel jp1 = new JPanel(), jp2 = new JPanel(), jp3 = new JPanel();
        ButtonGroup bgrp = new ButtonGroup();
        c.setLayout(new BorderLayout());
        for (int i = 0; i < 4; i++) {
            jp1.add(new Button("Taste " + i));
            JRadioButton b = new JRadioButton("B" + i);
            jp2.add(b);
            bgrp.add(b);
        }
        c.add(jp1, BorderLayout.NORTH);
        c.add(jp2, BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
       Frame frame = new FrameMitPanels();
       frame.setSize(200, 200);
       MenuBar bar = new MenuBar();
       Menu menu = new Menu();
       menu.add("hello");
       menu.setName("hee");
       menu.setLabel("hee");
       bar.add(menu);
       frame.setMenuBar(bar);
       frame.setVisible(true);
    }
}
