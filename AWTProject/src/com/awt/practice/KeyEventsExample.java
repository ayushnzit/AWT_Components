package com.awt.practice;

import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyEventsExample extends Frame {

    public KeyEventsExample() {
        setSize(300, 200);
        setTitle("Key Events Example");

        // Add KeyListener using KeyAdapter
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                System.out.println("Key typed: " + keyChar);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                System.out.println("Key pressed: " + KeyEvent.getKeyText(keyCode));
            }

            @Override
            public void keyReleased(KeyEvent e) {
                int keyCode = e.getKeyCode();
                System.out.println("Key released: " + KeyEvent.getKeyText(keyCode));
            }
        });

        // To make sure the component can receive keyboard focus
        setFocusable(true);
    }

    public static void main(String[] args) {
        KeyEventsExample frame = new KeyEventsExample();
        frame.setVisible(true);
    }
}
