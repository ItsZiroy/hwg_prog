package Prog2.Aufgabe16;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextAttribute;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class VerschiebeChiffre extends JFrame implements ActionListener {

    Container c;
    JDialog dialog = new JDialog();
    JTextField inputField, outputField, keyField;
    public VerschiebeChiffre() {
        c = getContentPane();
        c.setLayout(new GridLayout(4, 2));

        JLabel inputLabel = new JLabel("Eingabedatei: "),
               outputLabel = new JLabel("Ausgabedatei: "),
               keyLabel = new JLabel("Schlüssel: ");

        inputField = new JTextField();
        outputField = new JTextField();
        keyField = new JTextField();

        inputField.setText("Input.txt");
        outputField.setText("Output.txt");
        keyField.setText("1");

        JButton cypherButton = new JButton("Verschlüsseln");
        cypherButton.addActionListener(this);

        c.add(inputLabel);
        c.add(inputField);
        c.add(outputLabel);
        c.add(outputField);
        c.add(keyLabel);
        c.add(keyField);
        c.add(cypherButton);


        // Dialog
        createDialog();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dialog.setVisible(true);
        CypherIO.cypherIgnoreWhiteSpace(inputField.getText(), outputField.getText(), Short.parseShort(keyField.getText()));
    }

    public static void main(String[] args) {
        JFrame frame = new VerschiebeChiffre();
        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    public void createDialog() {
        JLabel label = new JLabel("Open Output file");

        HashMap<TextAttribute, Integer> fontAttributes = new HashMap<>();
        fontAttributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        label.setFont(new Font("Open Sans", Font.PLAIN, 20).deriveFont(fontAttributes));
        label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        label.setForeground(Color.BLUE);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                File outputFile = new File(outputField.getText());
                try {
                    Desktop.getDesktop().open(outputFile);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        dialog.add(label);
        dialog.setTitle("SUCCESS");
        dialog.setSize(200,200);
        dialog.setLocation(250, 150);
    }
}
