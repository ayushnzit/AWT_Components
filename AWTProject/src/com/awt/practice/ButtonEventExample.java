package com.awt.practice;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEventExample {
    public static void main(String[] args) {
        // Create a Frame
        Frame frame = new Frame("Console Button Click Example");

        // Create a Button
        Button myButton = new Button("Click Me");

        // Create an ActionListener for the Button
        ActionListener buttonListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Define the action to be taken when the button is clicked
                System.out.println("Button Clicked!");
            }
        };

        // Register the ActionListener with the Button
        myButton.addActionListener(buttonListener);

        // Add the Button to the Frame
        frame.add(myButton);

        // Set layout manager to FlowLayout (default for Frame)
        frame.setLayout(new FlowLayout());

        // Set Frame properties
        frame.setSize(300, 200);
        frame.setVisible(true);

        // Handle closing the Frame
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
}
