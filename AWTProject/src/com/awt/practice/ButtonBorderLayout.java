package com.awt.practice;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

public class ButtonBorderLayout extends Frame {
    

    public ButtonBorderLayout(){


        setBackground(Color.pink);


        


        BorderLayout bl =new BorderLayout(50, 95) ;
        setLayout(bl);


        Button northb =new Button("NORTH");
        Button westb =new Button("WEST");
        Button eastb =new Button("EAST");
        Button southb =new Button("SOUTH");
        Button centerb =new Button("CENTER");

        add(northb, BorderLayout.NORTH);
      

        add(centerb, BorderLayout.CENTER);
        add(westb, BorderLayout.WEST);
        add(southb, BorderLayout.SOUTH);
        add(eastb, BorderLayout.EAST);




    }


    public static void main(String[] args) {
        


        ButtonBorderLayout frame =new ButtonBorderLayout();
        frame.setVisible(true);
        frame.setSize(400, 400);

    }
}
