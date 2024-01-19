package com.awt.practice;
          
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextFieldExample extends Frame {


    public TextFieldExample() {
        setTitle("TextField Example");
        setLayout(null);

        Font fo =new Font("consolas", Font.BOLD, 14);
        Label la =new Label("Username");

        TextField tf =new TextField("Username", 80);
        Label la2 =new Label("Password");

        TextField tf2 =new TextField(80);

        tf2.setEchoChar('+');
        setFont(fo);

        la.setBounds(50, 100, 100, 50);

        tf.setBounds(150, 100, 150, 50);


        tf.setEditable(false);
        la2.setBounds(50, 200, 100, 50);

        tf2.setBounds(150, 200, 150, 50);
        add(la);
        add(tf);


        add(la2);
            add(tf2);



            // Create a TextField with a default width of 20 columns
            // textField = new TextField("Type here", 20);

            // // Add the TextField to the frame
            // add(textField);

            // Add an ActionListener to handle the Enter key
            // textField.addActionListener(new ActionListener() {
            //     public void actionPerformed(ActionEvent e) {
            //         String enteredText = textField.getText();
            //         System.out.println("Entered Text: " + enteredText);
            //     }
            // });

        // Handle window closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        TextFieldExample frame = new TextFieldExample();
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
