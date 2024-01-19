package com.awt.practice;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//import java.awt.event.WindowAdapter;
//
//import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.awt.Graphics;
public class EventHandling extends Frame {

    public EventHandling(){

    	setLayout(null);
    	Button bt =new Button("click me");
    	
    	bt.setBounds(10,10,100,90);
        add(bt);

    	
        
        
    
        
        

    		addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    System.out.println("Closing window");
                     System.exit(0); // Commenting out this line
                }

                public void windowClosed(WindowEvent e) {
                    System.out.println("Closed");
                }
            });

    		
    		
    		addWindowListener( new WindowAdapter() {
    			
    			
    			public void windowIconified(WindowEvent e) {
    				System.out.println("is now icon ");
    			}
    			
    			public void  windowDeiconified(WindowEvent e) {
                    System.out.println("Window deiconified");
    			}
			});
    		
    		
    		addKeyListener(new KeyAdapter() {
//    			
    			   public void keyTyped(KeyEvent e) {
    	                System.out.println(e.getKeyChar() + " " + KeyEvent.getKeyText(e.getKeyCode()));
    	            }
    			   
    			   
    			   public void keyPressed(KeyEvent e) {
    				   
    				   System.out.println("keyPressed" + " "+e.getKeyChar() + " " + KeyEvent.getKeyText(e.getKeyCode()));
    				   
    			   }
			});
    		
    		
    		addMouseListener(new MouseAdapter() {
    			
    		
    			public void mouseEntered(MouseEvent e) {
    				
    				System.out.println("mouse entered");
					
				}
    			
    			public void mouseExited(MouseEvent e) {
    				
    				System.out.println("mouse exit");
					
				}
    			
    			public  void  mouseClicked(MouseEvent e) {
    				
    				System.out.println("mouce cliked at" + "  " + e.getX() + "  "+ e.getY());
					
				}
    			
    			public void mousePressed(MouseEvent e) {
    				System.out.println("mouse presed "+e.getX()+" "+ e.getY());
    			}
    			public void mouseReleased(MouseEvent e) {
    				System.out.println("mouse released"+" "+ e.getX()+ " "+e.getY());
    			}
			});
    		
    		ActionListener actionBt =new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("button pressed");
					
				}
			};
           
			
			
			
			ActionListener at= new ActionListener() {
				
				
				
				public void actionPerformed(ActionEvent e) {
					System.out.println("khdbcscbs");
				}

//				@Override
//				public void actionPerformed(ActionEvent e) {
//					// TODO Auto-generated method stub
//					
//				}
			};
			
//			bt.addActionListener(actionBt);
			
			bt.addActionListener(at);
			
    }



	
	public void paint(Graphics g) {

		g.setColor(Color.BLACK);
		g.drawRect(20, 130, 50, 60);


		g.setColor(Color.red);
		// g.fillArc(160, 160, 150, 305, 140, 190);


		g.fillOval(60, 150, 300, 200);
	}
	
	
		

    public static void main(String[] args) {
        


        EventHandling frame =new EventHandling();
        frame.setVisible(true);
        frame.setSize(300, 400);
        

    }
    
}
