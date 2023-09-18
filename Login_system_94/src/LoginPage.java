import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class LoginPage implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JTextField userIDField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIDLabel = new JLabel("userID:");
	JLabel userPasswordLabel = new JLabel("password:");
	String messageLabelText = "Login successful,\nplease wait!";
	JLabel messageLabel = new JLabel(messageLabelText);
	JLabel helpLabel1 = new JLabel();
	JLabel helpLabel2 = new JLabel();
	JLabel timeLabel = new JLabel();
	int seconds =5;
	int countdownTime = 5000;
	String seconds_string = String.format("%2d", seconds);
	
	//TIMER - COUNTDOWN
	Timer timer = new Timer(1000, new ActionListener() {		
			public void actionPerformed(ActionEvent e) {		
			countdownTime=countdownTime-1000;
			seconds = (countdownTime/1000) % 60;
			seconds_string = String.format("%2d", seconds);
			timeLabel.setText(seconds_string);			
		}	
	});
	
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	LoginPage(HashMap<String,String> loginInfoOriginal){
		
		logininfo = loginInfoOriginal;
		
		userIDLabel.setBounds(50,30,75,25);
		userPasswordLabel.setBounds(50,80,75,25);
		
		messageLabel.setBounds(125,160,250,50);
		messageLabel.setFont(new Font(null,Font.ITALIC,20));
		messageLabel.setForeground(Color.green);
		messageLabel.setVisible(false);
		
		helpLabel1.setBounds(125,48,250,35);
		helpLabel1.setFont(new Font("Ink Free",Font.PLAIN,15));
		helpLabel1.setText("help: Bro");
		
		helpLabel2.setBounds(125,98,250,35);
		helpLabel2.setFont(new Font("Ink Free",Font.PLAIN,15));
		helpLabel2.setText("help: Code");
						
		timeLabel.setText(seconds_string);
		timeLabel.setBounds(125,210,200,100);
		timeLabel.setFont(new Font("Verdana",Font.PLAIN,35));
		timeLabel.setForeground(Color.GREEN);
		timeLabel.setBorder(BorderFactory.createBevelBorder(1));
		timeLabel.setHorizontalAlignment(JTextField.CENTER);
		timeLabel.setOpaque(true);
		timeLabel.setVisible(false);
		
		userIDField.setBounds(125,30,200,25);
		userPasswordField.setBounds(125,80,200,25);
		
		loginButton.setBounds(125,130,100,25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		resetButton.setBounds(225,130,100,25);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		frame.add(helpLabel1);
		frame.add(helpLabel2);
		frame.add(timeLabel);
		frame.add(userIDLabel);
		frame.add(userPasswordLabel);
		frame.add(messageLabel);
		frame.add(userIDField);
		frame.add(userPasswordField);
		frame.add(loginButton);
		frame.add(resetButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setVisible(true);	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==resetButton) {
			userIDField.setText("");
			userPasswordField.setText("");
		}
		
		if(e.getSource()==loginButton) {
			
			String userID = userIDField.getText();
			String password = String.valueOf(userPasswordField.getPassword());
			
			if(logininfo.containsKey(userID)) {						//userID je platné
				if(logininfo.get(userID).equals(password)) {		//password je platný
					messageLabel.setVisible(true);
					timeLabel.setVisible(true);
					timer.start();
					//frame.dispose();											//stránka zmizne
					
					WelcomePage welcomePage = new WelcomePage(userID);
				}
				else {
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Wrong password");
				}

			}
			else {
				messageLabel.setForeground(Color.red);
				messageLabel.setText("username not found");
			}
		}
	}	
}