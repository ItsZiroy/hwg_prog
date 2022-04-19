package Prog2.Aufgabe12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

public class RectanglePanel extends JPanel {

    private final Vector<Rectangle> rects = new Vector<>();
    private Rectangle currentRect;
    private int startX;
    private int startY;

    public void clearBoard() {
        rects.clear();
        repaint();
    }

    public RectanglePanel() {
        this.setSize(200, 200);
        this.setVisible(true);
        this.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                super.mouseReleased(e);
                if(e.getX() > startX) {
                    currentRect.width = e.getX() - currentRect.x;
                } else {
                    currentRect.width = startX - e.getX();
                    currentRect.x = e.getX();
                }

                if(e.getY() > startY) {
                    currentRect.height = e.getY() - currentRect.y;
                } else {
                    currentRect.height = startY - e.getY();
                    currentRect.y = e.getY();
                }
                repaint();
            }
        });
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                currentRect = new Rectangle();
                currentRect.x = e.getX();
                startX = e.getX();
                startY = e.getY();
                currentRect.y = e.getY();
                rects.add(currentRect);
            }
        });
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Rectangle rect : rects) {
            g.drawRect(rect.x, rect.y, rect.width, rect.height);
        }
    }

}
