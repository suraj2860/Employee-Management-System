package employee.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Splash extends JFrame implements ActionListener {
	
	Splash(){
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		
		JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
		heading.setForeground(Color.RED);
		heading.setBounds(120,30,1200,60);
		heading.setFont(new Font("serif",Font.BOLD,50));
		add(heading);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
		Image i2=i1.getImage().getScaledInstance(1100,700,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(10,100,1135,500);
		add(image);
		
		JButton clickhere=new JButton("CLICK HERE TO CONTINUE");
		clickhere.setBounds(420,420,300,50);
		clickhere.setFont(new Font("Tahoma",Font.PLAIN,20));
		clickhere.addActionListener(this);
		image.add(clickhere);
		
		setSize(1170,650);
		setLocation(180,100);
		setVisible(true);
		
		while(true) {
			heading.setVisible(false);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
			heading.setVisible(true);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void actionPerformed(ActionEvent ae) {
			setVisible(false);
			new Login();
	}
	
	public static void main(String[] args) {
		new Splash();
	}

}
