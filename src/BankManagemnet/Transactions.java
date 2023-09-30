package BankManagemnet;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.*;

public class Transactions extends JFrame implements ActionListener {
	
	JButton deposit,withdrawl,ministatement,pinchange,fastcash,balanceinquiry,exit;
	String pinnumber;
	public Transactions(String pinnumber)
	{
		this.pinnumber=pinnumber;
		setLayout(null);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/atm.png"));
		Image i2=i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		
		JLabel image=new JLabel(i3);
		image.setBounds(0,0,900,900);
		add(image);

		JLabel text=new JLabel("Please Select Your Transaction");
		text.setBounds(225,300,700,35);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System",Font.BOLD,16));
		image.add(text);
		
		deposit=new JButton("Deposit");
		deposit.setBounds(170,415,150,30);
		deposit.setFont(new Font("System",Font.BOLD,16));
		deposit.addActionListener(this);
		image.add(deposit);
		
		withdrawl=new JButton("Withdrawl");
		withdrawl.setBounds(355,415,150,30);
		withdrawl.setFont(new Font("System",Font.BOLD,16));
		withdrawl.addActionListener(this);
		image.add(withdrawl);
		
		fastcash=new JButton("FastCash");
		fastcash.setBounds(170,450,150,30);
		fastcash.setFont(new Font("System",Font.BOLD,16));
		fastcash.addActionListener(this);
		image.add(fastcash);
		
		ministatement=new JButton("Ministatement");
		ministatement.setBounds(355,450,150,30);
		ministatement.setFont(new Font("System",Font.BOLD,16));
		ministatement.addActionListener(this);
		image.add(ministatement);
		
		pinchange=new JButton("PinChange");
		pinchange.setBounds(170,485,150,30);
		pinchange.setFont(new Font("System",Font.BOLD,16));
		pinchange.addActionListener(this);
		image.add(pinchange);
		
		balanceinquiry=new JButton("BalanceInquiry");
		balanceinquiry.setBounds(355,485,150,30);
		balanceinquiry.setFont(new Font("System",Font.BOLD,16));
		balanceinquiry.addActionListener(this);
		image.add(balanceinquiry);
		
		exit=new JButton("Exit");
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
			System.exit(0);
		}else if (ae.getSource()==deposit) {
			setVisible(false);
			new Deposit(pinnumber).setVisible(true);
		}else if(ae.getSource()==withdrawl) {
			setVisible(false);
			new Withdrawal(pinnumber).setVisible(true);
		}else if (ae.getSource()==fastcash) {
			setVisible(false);
			new FastCash(pinnumber).setVisible(true);
		}else if(ae.getSource()==pinchange){
			setVisible(false);
			new PinChange(pinnumber).setVisible(true);
		}else if(ae.getSource()==balanceinquiry) {
			setVisible(false);
			new BalanceEnquiry(pinnumber).setVisible(true);
		}else if(ae.getSource()==ministatement) {
			new MiniStatement(pinnumber).setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new Transactions("");
	}

	

}
