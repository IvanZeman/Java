import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame implements ActionListener {
	
	JMenuBar menuBar;	
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	ImageIcon loadIcon;
	ImageIcon saveIcon;
	ImageIcon exitIcon;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		loadIcon = new ImageIcon("hamburger.png");
		saveIcon = new ImageIcon("hotdog.png");
		exitIcon = new ImageIcon("pizza.png");
		
		menuBar = new JMenuBar();
		
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
		
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		loadItem.setIcon(loadIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);
	
		fileMenu.setMnemonic(KeyEvent.VK_F);	// Alt + f for file
		editMenu.setMnemonic(KeyEvent.VK_E);	// Alt + e for edit
		helpMenu.setMnemonic(KeyEvent.VK_H);	// Alt + h for help
		loadItem.setMnemonic(KeyEvent.VK_L);	// l for load
		saveItem.setMnemonic(KeyEvent.VK_S);	// s for save
		exitItem.setMnemonic(KeyEvent.VK_E);	// e for exit

		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		this.setJMenuBar(menuBar);
		
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==loadItem) {
			System.out.println("you load a file");
		}
		if(e.getSource()==saveItem) {
			System.out.println("you save a file");
		}
		if(e.getSource()==exitItem) {
			System.exit(0);
		}	
	}



}
