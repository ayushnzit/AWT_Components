package com.awt.practice;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ex extends Frame {
    
    public static void main(String[] args) {
        

        Frame frame = new Frame("my example");

        frame.setVisible(true);
        frame.setSize(400, 400);


        FlowLayout flowLayout = new FlowLayout();
      frame.setLayout(flowLayout);

      Button bt = new Button("excuse me");
      TextArea ta = new TextArea("ygwfquyfg");
      ta.setPreferredSize(new Dimension(200, 150));

      // Use setBounds to set the size in pixels
      ta.setBounds(50, 40, 200, 150); // x, y, width, height

      frame.add(ta);

        ActionListener action = new ActionListener() {
            
            public void actionPerformed(ActionEvent e){

                System.out.println("clicl me");
            }

           
        };          

        // Create an ActionListener for the Button
   
        bt.setSize(30, 60);
        // frame.add(bt);

        bt.addActionListener(action);

         
    }
}
