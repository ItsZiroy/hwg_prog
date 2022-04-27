import javax.swing.*;
import java.awt.*;

public class StopwatchFrame extends JFrame {
    Container c;
    public StopwatchFrame() {
        c = getContentPane();

        JLabel label = new JLabel("0.0");
        label.setFont(new Font("Open Sans", Font.PLAIN, 48));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        JButton button = new JButton("Start");

        JButton resetButton = new JButton("Reset");

        CounterThread thread = new CounterThread(button, resetButton, label);

        c.setLayout(new GridLayout(2,1));

        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(1, 2));
        buttonPanel.add(button);
        buttonPanel.add(resetButton);


        Panel labelPanel = new Panel();
        labelPanel.setLayout(new BorderLayout());
        labelPanel.add(label);
        c.add(labelPanel);
        c.add(buttonPanel);

    }

    public static void main(String[] args) {
        StopwatchFrame frame = new StopwatchFrame();
        frame.setSize(500, 500);
        frame.setTitle("Stoppuhr");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
