package Prog2.Swing;

import javax.swing.*;
import java.awt.*;

public class FrameMitText extends JFrame {
    private final Container c;
    private final JLabel beschriftung;

    public FrameMitText() {
        c = getContentPane();
        c.setLayout(new FlowLayout());

        beschriftung = new JLabel("Label-Text im Frame");
        c.add(beschriftung);
    }

    public static void main(String[] args) {
        FrameMitText frame = new FrameMitText();
        frame.setTitle("Frame Mit Text");
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
