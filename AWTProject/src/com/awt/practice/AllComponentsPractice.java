package com.awt.practice;

//import java.awt.Button;
//import java.awt.Canvas;
//import java.awt.Checkbox;
//import java.awt.Choice;
//import java.awt.Color;
//import java.awt.Frame;
//import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.*;

public class AllComponentsPractice extends Frame {
    public static void main(String[] args) {
        Frame frame = new Frame("my AllComponentsPractice");
        frame.setVisible(true);
        frame.setSize(600, 600);
        frame.setLayout(null);




////////button

        Button button = new Button("click me ");

        button.setBounds(20, 50, 70,30);
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e){
                System.out.println("button clicked");
            }
            
        });




        

        
        //canvas


        Canvas canvas =new Canvas();
        canvas.setBounds(150, 50, 90, 90);
        canvas.setBackground(Color.pink);
        canvas.addMouseListener(new MouseAdapter() {
        	
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		System.out.println("canvas clicked");
        		Graphics g =canvas.getGraphics();
        		
        		g.drawRect(30, 65, 34, 33);
            	
        	}
		});

     

        
        
        //checkbox
        
        Checkbox checkbox =new Checkbox();
        
        checkbox.setBounds(100,100, 103,104);
        
        checkbox.addItemListener(new ItemListener() {
			
			
			public void itemStateChanged(ItemEvent e) {
				System.out.println("checkboc state : "+ checkbox.getState() );
				
				
				
			}
		});
        
        
        
        ////choice 
        
        
        Choice choice =new Choice();
        
        choice.setBounds(200, 200, 300, 10);
        choice.add("one");
        choice.add("two");
        choice.add("three");
        
        choice.addItemListener(new ItemListener() {
			
			
			public void itemStateChanged(ItemEvent e) {
	
				
				System.out.println("selected item : "+ choice.getSelectedItem());
				
			}
		});
        		
        
        
      
        List list= new List();
        
        list.setBounds(300,400,140,100);
        list.add("option 1");
        list.add("option 2");
        list.add("option 3");
        
        list.addItemListener(new ItemListener() {
		
			public void itemStateChanged(ItemEvent e) {
				
				System.out.println("selected list option: "+ list.getSelectedItem());
				
			}
		});
        
        		

        //label
        
        Label label =new Label();
        label.setBounds(500, 500, 40,30);
        
        
        
        
        //scrollbaer
        
        Scrollbar scrollbar = new Scrollbar();
        scrollbar.setBounds(30, 200, 20, 100);
        
        scrollbar.addAdjustmentListener(new AdjustmentListener() {
			
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				
				
				
				System.out.println("adgestmet value: "+scrollbar.getValue());
				
			}
		});
        



        
        //textArea
        
        TextArea textarea= new TextArea("wedfwdsf");
        textarea.setBounds(30,320,250,202);
        
        
        
        ////textfield
        
        
        TextField textfield =new TextField("scfdcfva");
        
        textfield.setBounds(300,40,105,35);
        
        
        
        
        
        
        
        

        frame.add(button);
        frame.add(canvas);
        frame.add(checkbox);
        frame.add(choice);
        frame.add(list);
        frame.add(label);
        frame.add(scrollbar);
        frame.add(textarea);
        frame.add(textfield);
        

    }
    
}
