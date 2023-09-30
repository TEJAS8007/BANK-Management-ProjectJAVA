package BankManagemnet;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.*;

public class Withdrawal extends JFrame implements ActionListener{

	JTextField amount;
	JButton withdrawal ,back;
	String pinnumber;
	public Withdrawal(String pinnumber)
	{
		this.pinnumber=pinnumber;
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/atm.png"));
		Image i2=i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		
		JLabel image=new JLabel(i3);
		image.setBounds(0,0,900,900);
		add(image);
		
		JLabel text=new JLabel("Enter Amount you want To Withdraw");
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System",Font.BOLD,16));
		text.setBounds(170,300,400,20);
		image.add(text);
		
	    amount=new JTextField();
		amount.setFont(new Font("Raleway",Font.BOLD,22));
		amount.setBounds(170,350,320,25);
		image.add(amount);
		
		withdrawal=new JButton("Withdraw");
		withdrawal.setBounds(200,400,120,30);
		withdrawal.setFont(new Font("Raleway",Font.BOLD,16));
		withdrawal.addActionListener(this);
		image.add(withdrawal);
		
		back=new JButton("Back");
		back.setFont(new Font("Raleway",Font.BOLD,16));
		back.setBounds(350,400,120,30);
		back.addActionListener(this);
		image.add(back);
		
		setSize(900,900);
		setLocation(300,0);
		setUndecorated(true);
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==withdrawal){
			String number=amount.getText();
			Date date=new Date();
			if(number.equals(""))
			{
				JOptionPane.showMessageDialog(null,"Please Enter Amount You want to Withdrawal");
			}
			else
			{
		       try {
				     Conn con=new Conn();
				     String querry="INSERT INTO bank (pin,date,type,amount) VALUES('"+pinnumber+"','"+date+"','Withdrawal','"+number+"')";
					con.s.executeUpdate(querry);
					JOptionPane.showMessageDialog(null,"Rs "+number+" Withdrawal Successfully");
				    
					setVisible(false);
					new Transactions(pinnumber).setVisible(true);;
		       } catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}else if(ae.getSource()==back) {
			setVisible(false);
			new Transactions(pinnumber).setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new Withdrawal("");
	}

	
}
