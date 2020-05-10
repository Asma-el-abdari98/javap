package Mini;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Vector;

import javax.swing.JPanel;
public class Panneau extends JPanel {
Vector<Feu> f;
Vector<Vehicules> v;

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

//int  y=60;
                  //je ss ps prq
// int x=20;


public void paintComponent(Graphics g){
	
	setBackground(Color.GRAY);
	
	super.paintComponent(g);
	 // draws a line diagonally across the screen
	 // draws a rectangle around "hello there!"
	 //g.setColor(Color.BLACK);
	// g.fillRect(0, 0,getWidth(), getHeight());
	

	 g.setColor(Color.WHITE);
	 for(int i=370;i<580;i+=55){  // passage de la route 1
	 	 g.fillRect(i, 190, 25, 60);
	 }
	 
	 for(int i=310;i<500;i+=55){  //passage de la route 2
	  g.fillRect(240, i, 60, 25);
	 }
	 
	 for(int i=370;i<580;i+=55){  // passage de la route 3
	 	 g.fillRect(i, 570, 25, 60);
	 }
	 
	 for(int i=310;i<500;i+=55){  //passage de la route 4
	 	 g.fillRect(620, i, 60, 25);
	 }
	 
	 
	 
	for(int i=0;i<280;i+=40){  // ligne route1
		 g.setColor(Color.WHITE);
		 g.fillRect(460, i, 5, 30);
	 }

	for(int i=0;i<320;i+=40){  //ligne route 2
		 g.fillRect(i, 405, 30, 5);
	}
	 
	 for(int i=530;i<1000;i+=40){ //ligne  route 3
		 g.fillRect(460, i, 5, 30);
	 }
	 
	 for(int i=600;i<2000;i+=40){  //ligne route 4
		 g.fillRect(i, 405, 30, 5);
	 }
	 
	 g.setColor(new Color(0, 183, 0));
   //les espaces vert
	 
	g.fillRoundRect(-20, -20, 360, 300, 45, 45);  
	g.fillRoundRect(-20, 520, 360, 800, 45, 45);
	g.fillRoundRect(580, -20, 1000, 300, 45, 45);
	g.fillRoundRect(580, 520, 1000, 1000, 45, 45);
	
	//les panneaux noirs
	
	g.setColor(Color.BLACK);
	g.fillRoundRect(260, 503, 75, 20, 45, 45 );
	g.fillRoundRect(590, 278, 75, 20, 45, 45 );
	g.fillRoundRect(338, 202, 20, 75, 45, 45 );
	g.fillRoundRect(562, 532, 20, 75, 45, 45);
	
	
	g.fillRoundRect(10, 0, 40,115, 45, 45 );
	g.fillRoundRect(950, 0, 40,115, 45, 45 );
	g.fillRoundRect(10, 600, 40,115, 45, 45 );
	g.fillRoundRect(950, 600, 40,115, 45, 45 );
	
	/* g.setColor(Color.WHITE);
	   g.fillOval(20, 10, 25, 25); 
	   g.fillOval(20, 45, 25, 25);   //1
	   g.fillOval(20, 80, 25, 25); 
	   
	   g.setColor(Color.WHITE);
	   g.fillOval(960, 10, 25, 25); 
	   g.fillOval(960, 45, 25, 25); //4
	   g.fillOval(960, 80, 25, 25); 
	   
	   g.setColor(Color.WHITE);
	   g.fillOval(20, 610, 25, 25); 
	   g.fillOval(20, 645, 25, 25); //2
	   g.fillOval(20, 670, 25, 25);
	   
	   g.setColor(Color.WHITE);
	   g.fillOval(960, 610, 25, 25); 
	   g.fillOval(960, 645, 25, 25); //3
	   g.fillOval(960, 680, 25, 25); 

	  /* 
	   changeColor();
		
		time();
		g.setColor(stop);
		// g.fillOval(310, 505, 15, 15);//route 2
		 //g.fillOval(600, 280, 15, 15);//route4
		g.fillOval(960, 10, 25, 25); 
		g.fillOval(20, 610, 25, 25); 
		
		g.setColor(slow);
		 //g.fillOval(290, 505, 15, 15); //route 2
		 //g.fillOval(620, 280, 15, 15);//route 4
		g.fillOval(960, 45, 25, 25);
		g.fillOval(20, 645, 25, 25);
		
		    
		g.setColor(go);
		// g.fillOval(270, 505, 15, 15);//route 2
		// g.fillOval(640, 280, 15, 15);//route 4
		g.fillOval(20, 670, 25, 25);
		g.fillOval(960, 80, 25, 25); 
		  
			changeColor();
			time();
			g.setColor(stop);
			g.fillOval(20, 10, 25, 25);
		    g.fillOval(960, 610, 25, 25); 
			//g.fillOval(340, 250, 15, 15);   //route 1
			//g.fillOval(565, 540, 15, 15); //route 3
		  
			
			g.setColor(slow);
			//g.fillOval(340, 230, 15, 15); //route 1
			//g.fillOval(565, 560, 15, 15);//route3
			g.fillOval(20, 45, 25, 25); 
		    g.fillOval(960, 645, 25, 25);
		
			
			g.setColor(go);
			//g.fillOval(340, 210, 15, 15);//route 1
			//g.fillOval(565, 580, 15, 15); //route 3
			 g.fillOval(20, 80, 25, 25);  
			 g.fillOval(960, 680, 25, 25); 

		
	*/
	

/*
	changeColor();
	time();
	g.setColor(stop);
	g.fillOval(340, 250, 15, 15);   //route 1
	g.fillOval(565, 540, 15, 15); //route 3

	g.setColor(slow);
	g.fillOval(340, 230, 15, 15); //route 1
	g.fillOval(565, 560, 15, 15);//route3

	
	g.setColor(go);
	g.fillOval(340, 210, 15, 15);//route 1
	g.fillOval(565, 580, 15, 15); //route 3

	
	// g.drawImage(car01, 10, 10, null);
	
changeColor();

time();

g.setColor(stop);
 g.fillOval(310, 505, 15, 15);//route 2
 g.fillOval(600, 280, 15, 15);//route4

g.setColor(slow);
 g.fillOval(290, 505, 15, 15); //route 2
 g.fillOval(620, 280, 15, 15);//route 4
 
g.setColor(go);
 g.fillOval(270, 505, 15, 15);//route 2
 g.fillOval(640, 280, 15, 15);//route 4
*/
/*	   
	System.out.print("PP"+v.size());
	for(int i=0;i<v.size();i++){
	 g.setColor(v.get(i).getClr());
	g.fillOval(v.get(i).getX(),v.get(i).getY(),28,30);
	}
	for(int i=0;i<f.size();i++){
	//changeColor();
	//g.setColor(go);        
	g.setColor(f.get(i).getClr());
	g.fillOval(f.get(i).getX(),f.get(i).getY(),15,15);
	}

	*/
	
     for(int i=0;i<v.size();i++)
       {
             g.setColor(v.get(i).getClr());
             g.fillOval(v.get(i).getX(),v.get(i).getY(),28,30);
          
                 
       }
       
    for(int i=0;i<f.size();i++)
       {
     	changeColor();
    	 // g.setColor(go);        
         g.setColor(f.get(i).getClr());
         
         g.fillOval(f.get(i).getX(),f.get(i).getY(),15,15);
    	
    	}
   
   
}
    

public void setFeu(Vector<Feu> f1) {
    f=f1;
}                                                      

public void setVehicule(Vector<Vehicules> v1) {
    v=v1;
}
}