package com.awt.practice;

import java.awt.Button;
import java.awt.Frame;

public class ButtonExample extends Frame {
    
    public ButtonExample(){

        setLayout(null);


        Button bt =new Button("excuse me");

        bt.setBounds(100,100,100, 30);
        add(bt);

    }

    public static void main(String[] args) {
        
        ButtonExample frame = new ButtonExample();
        frame.setSize(500, 500);
        frame.setVisible(true);

    }
}
