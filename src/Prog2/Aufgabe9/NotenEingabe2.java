package Prog2.Aufgabe9;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class NotenEingabe2 extends JFrame {
    public NotenEingabe2() {
        Container c = getContentPane();
        FlowLayout flowLayout = new FlowLayout();
        flowLayout.setHgap(20);
        c.setLayout(flowLayout);

        ButtonGroup bg = new ButtonGroup();
        JRadioButton[] buttons = new JRadioButton[5];

        Container boxContainer = new JPanel();
        boxContainer.setLayout(new GridLayout(5,1));

        buttons[0] = new JRadioButton("sehr gut");
        buttons[1] = new JRadioButton("gut");
        buttons[2] = new JRadioButton("befriedigend");
        buttons[3] = new JRadioButton("ausreichend", true);
        buttons[4] = new JRadioButton("ungenügend");

        Arrays.stream(buttons).forEach(button -> {
            bg.add(button);
            boxContainer.add(button);
        });

        c.add(boxContainer);

        Checkbox checkbox = new Checkbox("Wiederholprüfung");
        c.add(checkbox);


    }
}
