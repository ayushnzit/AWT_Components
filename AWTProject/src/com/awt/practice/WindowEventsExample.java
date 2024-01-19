package com.awt.practice;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class WindowEventsExample extends Frame {

    public WindowEventsExample() {
        // Set the layout manager, e.g., FlowLayout
        setLayout(null);

        // Set the size and title of the frame
        setSize(400, 400);
        setTitle("Window Events Example");

        // Add a WindowListener for various window events
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Window opened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window closing");
                // You might perform cleanup or confirmation tasks here
                System.exit(0); // Terminate the application
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Window closed");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("Window iconified");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("Window deiconified");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("Window activated");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("Window deactivated");
            }
        });

        // Add a WindowStateListener for the window state change event (Java 7 and later)
        addWindowStateListener(new WindowStateListener() {
            @Override
            public void windowStateChanged(WindowEvent e) {
                System.out.println("Window state changed");
            }
        });
    }

    public static void main(String[] args) {
        // Create an instance of WindowEventsExample
        WindowEventsExample frame = new WindowEventsExample();

        // Make the frame visible
        frame.setVisible(true);
    }
}
