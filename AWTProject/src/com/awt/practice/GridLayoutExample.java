package com.awt.practice;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class GridLayoutExample extends Frame {
    

    public GridLayoutExample(){



    }
    public static void main(String[] args) {
        GridLayoutExample frame = new GridLayoutExample();

        frame.setVisible(true);
        frame.setSize(500, 500);


        
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");

        frame.setLayout(new FlowLayout());
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
