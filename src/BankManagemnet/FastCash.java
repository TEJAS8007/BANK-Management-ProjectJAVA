package BankManagemnet;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.*;
import javax.swing.*;

public class FastCash extends JFrame implements ActionListener {
	
	JButton deposit,withdrawl,ministatement,pinchange,fastcash,balanceinquiry,exit;
	String pinnumber;
	public FastCash(String pinnumber)
	{
		this.pinnumber=pinnumber;
		setLayout(null);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/atm.png"));
		Image i2=i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		
		JLabel image=new JLabel(i3);
		image.setBounds(0,0,900,900);
		add(image);

		JLabel text=new JLabel("SELECT WITHDRAWAL AMOUNT");
		text.setBounds(225,300,700,35);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System",Font.BOLD,16));
		image.add(text);
		
		deposit=new JButton("RS 100");
		deposit.setBounds(170,415,150,30);
		deposit.setFont(new Font("System",Font.BOLD,16));
		deposit.addActionListener(this);
		image.add(deposit);
		
		withdrawl=new JButton("RS 500");
		withdrawl.setBounds(355,415,150,30);
		withdrawl.setFont(new Font("System",Font.BOLD,16));
		withdrawl.addActionListener(this);
		image.add(withdrawl);
		
		fastcash=new JButton("RS 1000");
		fastcash.setBounds(170,450,150,30);
		fastcash.setFont(new Font("System",Font.BOLD,16));
		fastcash.addActionListener(this);
		image.add(fastcash);
		
		ministatement=new JButton("RS 2000");
		ministatement.setBounds(355,450,150,30);
		ministatement.setFont(new Font("System",Font.BOLD,16));
		ministatement.addActionListener(this);
		image.add(ministatement);
		
		pinchange=new JButton("RS 5000");
		pinchange.setBounds(170,485,150,30);
		pinchange.setFont(new Font("System",Font.BOLD,16));
		pinchange.addActionListener(this);
		image.add(pinchange);
		
		balanceinquiry=new JButton("RS 10000");
		balanceinquiry.setBounds(355,485,150,30);
		balanceinquiry.setFont(new Font("System",Font.BOLD,16));
		balanceinquiry.addActionListener(this);
		image.add(balanceinquiry);
		
		exit=new JButton("Back");
		exit.setBounds(355,520,150,30);
		exit.setFont(new Font("System",Font.BOLD,16));
		exit.addActionListener(this);
		image.add(exit);
		
		setSize(900,900);
		setLocation(300,0);
		setUndecorated(true);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==exit){
			setVisible(false);
			new Transactions(pinnumber).setVisible(true);
		}else {
			String amount=((JButton)ae.getSource()).getText().substring(3);
			Conn con=new Conn();
			try
			{
				ResultSet rs=con.s.executeQuery("SELECT * FROM bank WHERE pin = '"+pinnumber+"' ");
			    int balance=0;
			    while(rs.next()){
			    	if(rs.getString("type").equals("Deposit"))
			    	{
			    		balance+=Integer.parseInt(rs.getString("amount"));
			    	}
			    	else
			    	{
			    		balance-=Integer.parseInt(rs.getString("amount"));
			    	}
			    }
			    if(ae.getSource()!=exit && balance<Integer.parseInt(amount))
			    {
			    	JOptionPane.showMessageDialog(null,"Insufficient balance");
			    }
			    Date date=new Date();
			    String querry="INSERT INTO bank(pin,date,type,amount) VALUES('"+pinnumber+"','"+date+"','Withdrawal','"+amount+"')";
			    con.s.executeUpdate(querry);
			    
			    JOptionPane.showMessageDialog(null,"RS "+amount+" Debited Successfully");
		 
			    setVisible(false);
			    new Transactions(pinnumber).setVisible(true);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	
	public static void main(String[] args) {
		new FastCash("");
	}

	

}
