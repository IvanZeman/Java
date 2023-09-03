import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener{
	
	JLabel label;
	ImageIcon smile;
	ImageIcon nervous;
	ImageIcon pain;
	ImageIcon dizzy;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		label = new JLabel();
		label.addMouseListener(this);
		
		smile = new ImageIcon("smile.png");
		nervous = new ImageIcon("nervous.png");
		pain = new ImageIcon("pain.png");
		dizzy = new ImageIcon("dizzy.png");
		
		label.setIcon(smile);
		
		//label = new JLabel();
		//label.setBounds(0, 0, 100, 100);
		//label.setBackground(Color.red);
		//label.setOpaque(true);
		//label.addMouseListener(this);
				
		this.add(label);
		this.pack();
		this.setLocationRelativeTo(null);	//Obrázok sa zobrazí v strede obrazovky
		this.setVisible(true);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		//System.out.println("You clicked the mouse");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("You pressed the mouse");
		//label.setBackground(Color.yellow);
		label.setIcon(pain);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("You released the mouse");
		//label.setBackground(Color.green);
		label.setIcon(dizzy);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("You entered the component");
		//label.setBackground(Color.blue);
		label.setIcon(nervous);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("You exited the component");
		//label.setBackground(Color.red);
		label.setIcon(smile);
	}

}
