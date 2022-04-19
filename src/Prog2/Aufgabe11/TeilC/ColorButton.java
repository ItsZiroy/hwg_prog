package Prog2.Aufgabe11.TeilC;

import javax.swing.*;
import java.awt.*;

public class ColorButton extends JButton {
    public ColorButton(Container c, Color color) {
        this.addActionListener(e -> c.setBackground(color));
    }
}
