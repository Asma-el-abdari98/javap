package Mini;

import java.awt.Color;

import javax.swing.*;
public class DrawingCanvas extends JFrame {
	
	
 public DrawingCanvas() {
 Board board = new Board();
 add(board); // adds the Board to our JFrame
 pack(); // sets JFrame dimension to contain subcomponents
 setResizable(false);
 setTitle("Graphics Test");
 setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
 setLocationRelativeTo(null); // centers window on screen
 }
 public static void main(String[] args) {
 DrawingCanvas canvas = new DrawingCanvas();
 canvas.setVisible(true);
	
 }
}