import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CounterThread implements Runnable {

    private CounterState state = CounterState.STOPPED;
    double count = 0.0;
    JLabel label;
    JButton counterButton;
    JButton resetButton;
    Thread thread = new Thread(this);

   public CounterThread(JButton counterButton, JButton resetButton, JLabel label) {
       this.counterButton = counterButton;
       this.counterButton.addActionListener(e -> {
           this.toggleState();
       });
       this.resetButton = resetButton;
       resetButton.setEnabled(false);
       this.resetButton.addActionListener(e -> {
           this.reset();
       });
       this.label = label;
   }

    @Override
    public void run() {
        ScheduledExecutorService executer = Executors.newSingleThreadScheduledExecutor();
        executer.scheduleAtFixedRate(() -> {
            if(this.thread.isInterrupted()) {
                executer.shutdown();
            } else {
                DecimalFormat df = new DecimalFormat("####0.000");
                count = count + 0.001;
                this.label.setText(df.format(count));
            }
        }, 1, 1, TimeUnit.MILLISECONDS);
    }

    public void reset() {
       this.count = 0.0;
       this.resetButton.setEnabled(false);
       this.label.setText("0.0");
    }
    public void setState(CounterState state) {
        switch(state) {
            case RUNNING -> {
                this.state = CounterState.RUNNING;
                this.counterButton.setText("Stop");
                this.resetButton.setEnabled(false);
                if(!this.thread.isAlive()) {
                    this.thread = new Thread(this);
                }
                this.thread.start();
            }
            case STOPPED -> {
                this.state = CounterState.STOPPED;
                this.counterButton.setText("Start");
                this.resetButton.setEnabled(true);
                this.thread.interrupt();
            }
        }
    }
    public void toggleState() {
        switch(this.state) {
            case RUNNING -> this.setState(CounterState.STOPPED);
            case STOPPED -> this.setState(CounterState.RUNNING);
        }
    }

    public enum CounterState {
        RUNNING, STOPPED;
    }
}
