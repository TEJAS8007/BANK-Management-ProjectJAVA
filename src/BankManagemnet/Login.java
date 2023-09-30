package BankManagemnet;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{

	JButton login,clear,Signup;
	JTextField cardfield;
	JPasswordField pinfield;
	public Login()
	{
		setTitle("Automated Teller Machine");
		setLayout(null);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/logo.png"));

		Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);

		JLabel label=new JLabel(i3);
		label.setBounds(70,10,100,100);
		add(label);

		JLabel text=new JLabel("Welcome To ATM");
		text.setFont(new Font("Osward",Font.BOLD,38));
		text.setBounds(200,40,400,40);
		add(text);

		JLabel cardno=new JLabel("Card No");
		cardno.setFont(new Font("Raleway",Font.BOLD,28));
		cardno.setBounds(120,150,150,40);
		add(cardno);

		cardfield=new JTextField();
		cardfield.setBounds(300,150,230,30);
		cardfield.setFont(new Font("Arial",Font.BOLD,14));
		add(cardfield);

		JLabel pin=new JLabel("Pin");
		pin.setFont(new Font("Raleway",Font.BOLD,28));
		pin.setBounds(120,220,250,30);
		add(pin);

		pinfield=new JPasswordField();
		pinfield.setBounds(300,220,230,30);
		add(pinfield);

		login=new JButton("SIGN IN");
		login.setBounds(300,280,100,30);
		login.setBackground(Color.BLACK);
		login.setForeground(Color.WHITE);
		login.addActionListener(this);
		add(login);

		clear=new JButton("CLEAR");
		clear.setBounds(430,280,100,30);
		clear.setBackground(Color.BLACK);
		clear.setForeground(Color.WHITE);
		clear.addActionListener(this);
		add(clear);

		Signup=new JButton("SIGN UP");
		Signup.setBounds(300,350,230,30);
		Signup.setBackground(Color.BLACK);
		Signup.setForeground(Color.WHITE);
		Signup.addActionListener(this);
		add(Signup);
		getContentPane().setBackground(Color.WHITE);

		setSize(800,700);
		setUndecorated(true);
		setVisible(true);
		setLocation(350,150);

	}

	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==clear){
			cardfield.setText("");
			pinfield.setText("");
		}else if(ae.getSource()==login){
           Conn con=new Conn();
           String cardnumber=cardfield.getText();
           String pinnumber=pinfield.getText();
           
           String querry="SELECT * FROM LOGIN WHERE cardnumber ='"+cardnumber+"' AND pin= '"+pinnumber+"'";
           try
           {
        	   ResultSet rs=con.s.executeQuery(querry);
        	   if(rs.next())
        	   {
        		   setVisible(false);
        		   new Transactions(pinnumber).setVisible(true);;
        	   }
        	   else
        	   {
        		   JOptionPane.showMessageDialog(null, "Invalid card Number or Pin");
        	   }
           }
           catch(Exception e)
           {
        	   System.out.println(e);
           }
		}else if(ae.getSource()==Signup) {
			setVisible(false);
			new SignupOne().setVisible(true);
		}
	}

	public static void main(String[] args) {
		new Login();
	}


}
