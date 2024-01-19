package com.awt.practice;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MixedLayoutExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Mixed Layout Example");

        // FlowLayout
        Panel flowLayoutPanel = new Panel();
        flowLayoutPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        Button flowLayoutButton1 = new Button("Flow 1");
        Button flowLayoutButton2 = new Button("Flow 2");

        flowLayoutPanel.add(flowLayoutButton1);
        flowLayoutPanel.add(flowLayoutButton2);

        Button flowLayoutButton3 = new Button("Flow 3");
        Button flowLayoutButton4 = new Button("Flow 4");

        flowLayoutPanel.add(flowLayoutButton3);
        flowLayoutPanel.add(flowLayoutButton4);
        Button flowLayoutButton5 = new Button("Flow 5");
        Button flowLayoutButton6 = new Button("Flow 6");

        flowLayoutPanel.add(flowLayoutButton5);
        flowLayoutPanel.add(flowLayoutButton6);
        Button flowLayoutButton7 = new Button("Flow 7");
        Button flowLayoutButton8 = new Button("Flow 8");

        flowLayoutPanel.add(flowLayoutButton7);
        // flowLayoutPanel.add(flowLayoutButton8);

        // BorderLayout
        Panel borderLayoutPanel = new Panel();
        borderLayoutPanel.setLayout(new BorderLayout());

        Button northButton = new Button("North");
        Button southButton = new Button("South");
        Button eastButton = new Button("East");
        Button westButton = new Button("West");
        Button centerButton = new Button("Center");

        borderLayoutPanel.add(northButton, BorderLayout.NORTH);
        borderLayoutPanel.add(southButton, BorderLayout.SOUTH);
        borderLayoutPanel.add(eastButton, BorderLayout.EAST);
        borderLayoutPanel.add(westButton, BorderLayout.WEST);
        borderLayoutPanel.add(centerButton, BorderLayout.CENTER);

        // GridLayout
        Panel gridLayoutPanel = new Panel();
        gridLayoutPanel.setLayout(new GridLayout(2, 3,10,15));

        Button gridLayoutButton1 = new Button("Grid Button 1");
        Button gridLayoutButton2 = new Button("Grid Button 2");
        Button gridLayoutButton3 = new Button("Grid Button 3");
        Button gridLayoutButton4 = new Button("Grid Button 4");
        Button gridLayoutButton5 = new Button("Grid Button 5");

        gridLayoutPanel.add(gridLayoutButton1);
        gridLayoutPanel.add(gridLayoutButton2);
        gridLayoutPanel.add(gridLayoutButton3);
        gridLayoutPanel.add(gridLayoutButton4);
        gridLayoutPanel.add(gridLayoutButton5);

        // CardLayout
        Panel cardLayoutPanel = new Panel();
        cardLayoutPanel.setLayout(new CardLayout());

        Button cardLayoutButton1 = new Button("Card Button 1");
        Button cardLayoutButton2 = new Button("Card Button 2");

        cardLayoutPanel.add(cardLayoutButton1, "Card 1");
        cardLayoutPanel.add(cardLayoutButton2, "Card 2");

        // GridBagLayout
        Panel gridBagLayoutPanel = new Panel();
        gridBagLayoutPanel.setLayout(new GridBagLayout());

        Button gridBagLayoutButton1 = new Button("GridBag Button 1");
        Button gridBagLayoutButton2 = new Button("GridBag Button 2");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gridBagLayoutPanel.add(gridBagLayoutButton1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gridBagLayoutPanel.add(gridBagLayoutButton2, gbc);




        //null layaout


        Panel nullPannel= new Panel();

        nullPannel.setLayout(null);

        Button nullb1= new Button("null buttonmn 1");

        Button nullb2= new Button("null button 2");

        nullPannel.add(nullb1);
        nullPannel.add(nullb2);


        // Add all panels to the main frame
        frame.setLayout(new GridLayout(2, 3));
        frame.add(flowLayoutPanel);
        frame.add(borderLayoutPanel);
        frame.add(gridLayoutPanel);
        frame.add(cardLayoutPanel);
        frame.add(gridBagLayoutPanel);

        frame.add(nullPannel);

        // Set frame size and visibility
        frame.setSize(800, 600);
        frame.setVisible(true);

        // CardLayout Button ActionListeners
        cardLayoutButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) cardLayoutPanel.getLayout();
                cardLayout.show(cardLayoutPanel, "Card 1");
            }
        });

        cardLayoutButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) cardLayoutPanel.getLayout();
                cardLayout.show(cardLayoutPanel, "Card 2");
            }
        });
    }
}
