package Mini;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class Board extends JPanel{
	private BufferedImage vehicule1;
	
 public Board() {
 setBackground(Color.GRAY);
 }
 

public void time() {
		try {
			Thread.sleep(1000);
		
			
		}
		
		catch(Exception e) {
			
		}
	}


		
 
	public void changeColor() {
		
		go = Color.gray;
		slow = Color.gray;
		stop = Color.gray;
		
		
		if (activelight.contentEquals("red")){
			activelight = "green";
			slow = Color.orange;
			
		}else if (activelight.contentEquals("green")) {
			activelight = "yellow";
			go = Color.green;
		
			
		}else {
			activelight = "red";
			stop = Color.red;
		}
		
		repaint();
	}
 public Dimension getPreferredSize() {
 return new Dimension(1000, 1000);
 }
 
 
    Color go = Color.gray;
	Color slow = Color.gray;
	Color stop = Color.gray;

	String activelight = "red";
 
 public void paintComponent(Graphics g) {
 super.paintComponent(g);
 // draws a line diagonally across the screen
 // draws a rectangle around "hello there!"
 //g.setColor(Color.BLACK);
// g.fillRect(0, 0,getWidth(), getHeight());
 
 

g.setColor(Color.BLACK);
g.fillRoundRect(260, 503, 75, 20, 45, 45 );
g.fillRoundRect(590, 278, 75, 20, 45, 45 );
g.fillRoundRect(338, 202, 20, 75, 45, 45 );
g.fillRoundRect(562, 532, 20, 75, 45, 45);


g.fillRoundRect(10, 0, 40,115, 45, 45 );
g.fillRoundRect(950, 0, 40,115, 45, 45 );
g.fillRoundRect(10, 600, 40,115, 45, 45 );
g.fillRoundRect(950, 600, 40,115, 45, 45 );
  
 
   
   changeColor();
	
	time();
	g.setColor(stop);
	 g.fillOval(310, 505, 15, 15);//route 2
	 g.fillOval(600, 280, 15, 15);//route4
	g.fillOval(960, 10, 25, 25); 
	g.fillOval(20, 610, 25, 25); 
	
	g.setColor(slow);
	 g.fillOval(290, 505, 15, 15); //route 2
	 g.fillOval(620, 280, 15, 15);//route 4
	g.fillOval(960, 45, 25, 25);
	g.fillOval(20, 645, 25, 25);
	
    
	g.setColor(go);
	 g.fillOval(270, 505, 15, 15);//route 2
	 g.fillOval(640, 280, 15, 15);//route 4
	g.fillOval(20, 670, 25, 25);
	g.fillOval(960, 80, 25, 25); 
	  
		changeColor();
		time();
		g.setColor(stop);
		g.fillOval(20, 10, 25, 25);
	    g.fillOval(960, 610, 25, 25); 
		g.fillOval(340, 250, 15, 15);   //route 1
		g.fillOval(565, 540, 15, 15); //route 3
	  
		
		g.setColor(slow);
		g.fillOval(340, 230, 15, 15); //route 1
		g.fillOval(565, 560, 15, 15);//route3
		g.fillOval(20, 45, 25, 25); 
	    g.fillOval(960, 645, 25, 25);
	
		
		g.setColor(go);
		g.fillOval(340, 210, 15, 15);//route 1
		g.fillOval(565, 580, 15, 15); //route 3
		 g.fillOval(20, 80, 25, 25);  
		 g.fillOval(960, 680, 25, 25); 

	
		

	}

	
  
}

