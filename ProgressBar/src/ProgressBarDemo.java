import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.*;

public class ProgressBarDemo {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JProgressBar bar = new JProgressBar(0,100);
	
	JSlider slider = new JSlider();			//50 = starting point
	

	
	ProgressBarDemo(){
		
;
				
		label.setText("°C = ");
		label.setText("°C = "+ slider.getValue());
			
		panel.add(label);
		frame.add(panel);
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);

		frame.setVisible(true);
		
		
		fill();
	}
	
	public void stateChanged(ChangeEvent e) {

		label.setText("°C = "+ bar.getValue());
		
	}

	public void fill() {
		
		int counter = 0;
		
		while(counter<=100) {
			
			bar.setValue(counter);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			counter +=1;
		}
		bar.setString("Done!");
	}
}
