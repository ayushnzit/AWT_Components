package com.awt.practice;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FontExample extends Frame {

    public FontExample() {
        setTitle("Font Example");
        setSize(400, 300);
        setBackground(Color.WHITE);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        // Set the font for drawing text
        Font font = new Font("Arial", Font.BOLD | Font.ITALIC, 20);
        g.setFont(font);

        // Draw text
        g.drawString("Hello, AWT!", 50, 100);

        // Get font metrics for additional information
        FontMetrics fontMetrics = g.getFontMetrics();
        int stringWidth = fontMetrics.stringWidth("Hello, AWT!");

        // Draw a rectangle around the text
        g.drawRect(50, 80, stringWidth+60, 30);
    }

    public static void main(String[] args) {
        FontExample frame = new FontExample();
        frame.setVisible(true);
    }
}

