package Prog2.Aufgabe9;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class NotenEingabe3 extends JFrame {
    Container c = getContentPane();

    public NotenEingabe3() {
        FlowLayout flowLayout = new FlowLayout();
        flowLayout.setHgap(20);
        c.setLayout(flowLayout);

        JComboBox<String> comboBox =  new JComboBox<>(new String[]{"sehr gut", "gut", "befriedigend", "ausreichend", "ungenügend"});
        comboBox.setSelectedItem("ausreichend");
        comboBox.setName("Hello");
        Container comboBoxContainer = new JPanel();
        comboBoxContainer.setLayout(new FlowLayout());

        comboBoxContainer.add(new Label("Note: "));
        comboBoxContainer.add(comboBox);
        c.add(comboBoxContainer);

        Checkbox checkbox = new Checkbox("Wiederholprüfung");
        c.add(checkbox);

    }
}
