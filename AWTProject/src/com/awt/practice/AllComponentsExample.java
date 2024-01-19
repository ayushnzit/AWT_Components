package com.awt.practice;

import java.awt.*;
import java.awt.event.*;

public class AllComponentsExample {
    public static void main(String[] args) {
        Frame frame = new Frame("All Components Example");
        frame.setSize(500, 400);

        // Button
        Button button = new Button("Click me");
        button.setBounds(20, 50, 80, 30);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });

        // // Canvas
        // Canvas canvas = new Canvas();
        // canvas.setBounds(120, 50, 80, 80);
        // canvas.setBackground(Color.blue);
        // canvas.addMouseListener(new MouseAdapter() {
        //     public void mouseClicked(MouseEvent e) {
        //         System.out.println("Canvas clicked!");
        //     }
        // });
            

          // Canvas
          Canvas canvas =   new Canvas();
          canvas.setBounds(120, 50, 100, 150);
          canvas.setBackground(Color.pink);
  
          canvas.addMouseListener(new MouseAdapter() {
              public void mouseClicked(MouseEvent e) {
                  Graphics g = canvas.getGraphics();
                  g.setColor(Color.red);
                  g.fillRect(50, 50, 100, 80);
              }
          });

        // Checkbox
        Checkbox checkbox = new Checkbox("Check me");
        checkbox.setBounds(220, 50, 80, 30);
        checkbox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Checkbox state: " + checkbox.getState());
            }
        });

        // Choice
        Choice choice = new Choice();
        choice.setBounds(320, 50, 80, 30);
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");
        choice.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Selected choice: " + choice.getSelectedItem());
            }
        });

        // Label
        Label label = new Label("This is a label");
        label.setBounds(20, 150, 150, 30);

        // List
        List list = new List();
        list.setBounds(20, 200, 100, 80);
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Selected item in list: " + list.getSelectedItem());
            }
        });

        // Scrollbar
        Scrollbar scrollbar = new Scrollbar();
        scrollbar.setBounds(140, 200, 20, 80);
        scrollbar.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                System.out.println("Current scrollbar value: " + scrollbar.getValue());
            }
        });

        // TextArea
        TextArea textArea = new TextArea("This is a TextArea", 5, 30);
        textArea.setBounds(20, 300, 200, 80);

        // TextField
        TextField textField = new TextField("Type here");
        textField.setBounds(240, 300, 150, 30);
        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Entered text: " + textField.getText());
            }
        });

        // Add components to the frame
        frame.add(button);
        frame.add(canvas);
        frame.add(checkbox);
        frame.add(choice);
        frame.add(label);
        frame.add(list);
        frame.add(scrollbar);
        frame.add(textArea);
        frame.add(textField);

        frame.setLayout(null);
        frame.setVisible(true);

        // WindowListener to handle closing the frame
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
