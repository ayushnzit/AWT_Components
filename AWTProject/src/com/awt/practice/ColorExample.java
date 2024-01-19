package com.awt.practice;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ColorExample extends Frame {

    public ColorExample() {
//         Set the title of the frame
        setTitle("Color Example");

        // Set the size of the frame
        setSize(400, 300);

        // Set the background color of the frame
        setBackground(Color.WHITE);

        // Add a window listener to handle window close events
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        // Draw shapes with different colors
        drawColoredShapes(g);
    }

    private void drawColoredShapes(Graphics g) {
        // Draw a rectangle with a red border
        g.setColor(Color.RED);
        g.drawRect(50, 50, 100, 80);

        // Draw an oval with a blue fill
        g.setColor(Color.BLUE);
        g.fillOval(200, 50, 100, 80);

        // Draw a line with a green color
//        g.setColor(Color(1,1,0));
        g.setColor(new Color(0.5f, 0.3f, 0.0f));


        g.drawLine(50, 200, 300, 200);
    }

    public static void main(String[] args) {
        // Create an instance of the ColorExample class
        ColorExample frame = new ColorExample();

        // Set the frame to be visible
        frame.setVisible(true);
//        frame.setBackground(Color.pink);
        frame.setTitle("Color Example");
 
        // Set the size of the frame
        frame.setSize(400, 300);
        frame.setBackground(Color.pink);
    }
}

