package com.awt.practice;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GraphicsExample extends Frame {

    public GraphicsExample() {
        setTitle("Graphics Example");
        setSize(400, 300);
        setBackground(Color.WHITE);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }



    public void paint(Graphics g) {


        g.setColor(Color.GREEN);
        g.drawRect(10, 50, 100, 80);

        g.setColor(Color.red);
        g.fillOval(180, 50, 50, 48);

        g.setColor(Color.pink);
        g.drawString("Black Pink", 190, 190);

        g.setColor(Color.BLUE);
        g.drawLine(120, 60, 120, 180);

        g.fillArc(220, 120, 80, 40, 90, -90);;
    }
    public static void main(String[] args) {
        GraphicsExample frame = new GraphicsExample();
        frame.setVisible(true);
        frame.setTitle("My AWT Frame");
    }
}
