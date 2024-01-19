package com.awt.practice;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseEventsExample extends Frame {

    public MouseEventsExample() {
        setSize(300, 200);
        setTitle("Mouse Events Example");

        // Add MouseListener using MouseAdapter
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked at: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse button pressed at: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse button released at: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse entered the component");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse exited the component");
            }
        });
    }

    public static void main(String[] args) {
        MouseEventsExample frame = new MouseEventsExample();
        frame.setVisible(true);
    }
}
