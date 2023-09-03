package _2D_Graphics;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	MyPanel panel;
	
	MyFrame(){
		
		panel = new MyPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null); 	//Frame appear in the middle of the screen
		this.setVisible(true);		
	}
	
}
