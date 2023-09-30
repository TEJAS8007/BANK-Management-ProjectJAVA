package BankManagemnet;

import java.awt.Color;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MiniStatement extends JFrame{

	String pinnumber;
	public MiniStatement(String pinnumber) {
		this.pinnumber=pinnumber;
		setLayout(null);
		
		JLabel mini=new JLabel();
		add(mini);
		
		JLabel bank=new JLabel("Indian Bank");
		bank.setBounds(150,20,100,20);
		add(bank);
		
		JLabel card=new JLabel();
		card.setBounds(20,80,300,20);
		add(card);
		
		JLabel balance=new JLabel();
		balance.setBounds(20,400,300,20);
		add(balance);
		
		try {
			  Conn con=new Conn();
			  ResultSet rs=con.s.executeQuery("SELECT * FROM login WHERE pin = '"+pinnumber+"' ");
		      while(rs.next()) {
		    	  card.setText("Card Number : "+rs.getString("cardnumber").substring(0,4)+"XXXXXXXX"+rs.getString("cardnumber").substring(12));
		     
		      }
		}catch(Exception e) {
			System.out.println(e);
		}
		
		try{
			 Conn con=new Conn();
			 int bal=0;
			 ResultSet rs=con.s.executeQuery("SELECT * FROM bank WHERE pin = '"+pinnumber+"'");
		     while(rs.next()) {
		    	 mini.setText(mini.getText()+ "<html>" +rs.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;;"+rs.getString("amount")+"<br><br><html>");
		     
		    	 if(rs.getString("type").equals("Deposit"))
			    	{
			    		bal+=Integer.parseInt(rs.getString("amount"));
			    	}
			    	else
			    	{
			    		bal-=Integer.parseInt(rs.getString("amount"));
			    	}
		     }
		     balance.setText("Your Courrent Account Balance : "+bal);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		mini.setBounds(20,140,400,200);
		
		setSize(400,600);
		setLocation(20,20);
		setUndecorated(true);
		setVisible(true);
		getContentPane().setBackground(Color.WHITE);
	}
	
	public static void main(String[] args) {
		new MiniStatement("");
	}
}
