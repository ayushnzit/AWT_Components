package com.awt.practice;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LabelExample extends Frame {

    public LabelExample() {
        setTitle("Label Example");
        // setLayout(null);  // Set layout manager to null for absolute positioning

        // Label label1 = new Label("Hello, AWT!");
        Label label2 = new Label("This is a Label.");
        Label label1= new Label("This is a Label  5");

        // Set bounds for label1
        label1.setBounds(50, 100, 150, 30);

        // Set bounds for label2 with some spacing below label1
        label2.setBounds(50, 150, 150, 30);

        // Add labels to the frame
        add(label1);
        add(label2);

        // Handle window closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        LabelExample frame = new LabelExample();
        frame.setSize(300, 550);
        frame.setVisible(true);
    }
}
