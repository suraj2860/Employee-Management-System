package employee.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{
	
	JTextField tfusername,tfpassword;
	
	Login(){
		
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblusername = new JLabel("USERNAME");
		lblusername.setBounds(40,40,100,30);
		add(lblusername);
		
		JLabel lblpassword = new JLabel("PASSWORD");
		lblpassword.setBounds(40,90,100,30);
		add(lblpassword);
		
		tfusername = new JTextField();
		tfusername.setBounds(150,40,150,30);
		add(tfusername);
		
		tfpassword = new JTextField();
		tfpassword.setBounds(150,90,150,30);
		add(tfpassword);
		
		JButton login=new JButton("LOG IN");
		login.setBounds(150,160,150,30);
		login.setFont(new Font("Tahoma",Font.PLAIN,16));
		login.setBackground(Color.BLACK);
		login.setForeground(Color.WHITE);
		login.addActionListener(this);
		add(login);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
		Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(350,0,200,200);
		add(image);
		
		setSize(600,300);
		setLocation(450,200);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		try {
			String username=tfusername.getText();
			String password=tfpassword.getText();
			
			Conn c=new Conn();
			String query="select * from login where username = '"+username+"' and password = '"+password+"'"; 
			
			ResultSet rs=c.s.executeQuery(query);
			if(rs.next()) {
				setVisible(false);
				
			}
			else {
				JOptionPane.showMessageDialog(null,"Invalid username or password");
				setVisible(false);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Login();
	}
}
