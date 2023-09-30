package BankManagemnet;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Signupthree extends JFrame implements ActionListener {

	JRadioButton r1,r2,r3,r4;
	JCheckBox c1,c2,c3,c4,c5,c6,c7;
	JButton submit,cancel;
	String formno;
	
	public Signupthree(String formnno)
	{
		this.formno=formno;
		JLabel l1=new JLabel("Page 3 :Account details");
		l1.setFont(new Font("Raleway",Font.BOLD,22));
		l1.setBounds(280,40,400,40);
		add(l1);
		
		JLabel type=new JLabel("Account Type:");
		type.setFont(new Font("Raleway",Font.BOLD,22));
		type.setBounds(100,140,200,30);
		add(type);
		
		r1=new JRadioButton("Saving Account");
		r1.setFont(new Font("Raleway",Font.BOLD,16));
		r1.setBounds(100,180,150,20);
		r1.setBackground(Color.WHITE);
		add(r1);
		
		r2=new JRadioButton("Fixed Deposit Account");
		r2.setFont(new Font("Raleway",Font.BOLD,16));
		r2.setBounds(350,180,250,20);
		r2.setBackground(Color.WHITE);
		add(r2);
		
		r3=new JRadioButton("Current Account");
		r3.setFont(new Font("Raleway",Font.BOLD,16));
		r3.setBounds(100,220,220,20);
		r3.setBackground(Color.WHITE);
		add(r3);
		
		
		r4=new JRadioButton("Reccuring Deposit Account");
		r4.setFont(new Font("Raleway",Font.BOLD,16));
		r4.setBounds(350,220,250,20);
		r4.setBackground(Color.WHITE);
		add(r4);
		
		ButtonGroup groupaccount=new ButtonGroup();
		groupaccount.add(r1);
		groupaccount.add(r2);
		groupaccount.add(r3);
		groupaccount.add(r4);
		
		JLabel card=new JLabel("Card Number:");
		card.setFont(new Font("Raleway",Font.BOLD,22));
		card.setBounds(100,300,300,30);
		add(card);
		
		JLabel number=new JLabel("XXX-XXXX-XXXX-4144");
		number.setFont(new Font("Raleway",Font.BOLD,22));
		number.setBounds(330,300,300,30);
		add(number);
		
		JLabel pin=new JLabel("Pin:");
		pin.setFont(new Font("Raleway",Font.BOLD,22));
		pin.setBounds(100,370,300,30);
		add(pin);
		
		JLabel carddetail=new JLabel("Your 16 digit Card Number:");
		carddetail.setFont(new Font("Raleway",Font.BOLD,12));
		carddetail.setBounds(100,330,300,20);
		add(carddetail);
		
		JLabel pinnumber=new JLabel("XXXX");
		pinnumber.setFont(new Font("Raleway",Font.BOLD,22));
		pinnumber.setBounds(330,370,300,30);
		add(pinnumber);
		
		JLabel pindetail=new JLabel("Your 4 digit pin:");
		pindetail.setFont(new Font("Raleway",Font.BOLD,12));
		pindetail.setBounds(100,400,300,20);
		add(pindetail);
		
		JLabel Services=new JLabel("Services Required:");
		Services.setFont(new Font("Raleway",Font.BOLD,22));
		Services.setBounds(100,450,300,30);
		add(Services);
		
		c1=new JCheckBox("ATM CARD");
		c1.setBackground(Color.WHITE);
		c1.setFont(new Font("Raleway",Font.BOLD,16));
		c1.setBounds(100,500,200,30);
		add(c1);
		

		c2=new JCheckBox("Internet-Banking");
		c2.setBackground(Color.WHITE);
		c2.setFont(new Font("Raleway",Font.BOLD,16));
		c2.setBounds(350,550,200,30);
		add(c2);
		

		c3=new JCheckBox("Mobile-Banking");
		c3.setBackground(Color.WHITE);
		c3.setFont(new Font("Raleway",Font.BOLD,16));
		c3.setBounds(100,550,200,30);
		add(c3);
		

		c4=new JCheckBox("Email :SMS ALert");
		c4.setBackground(Color.WHITE);
		c4.setFont(new Font("Raleway",Font.BOLD,16));
		c4.setBounds(350,500,200,30);
		add(c4);
		
		c5=new JCheckBox("Cheque Book");
		c5.setBackground(Color.WHITE);
		c5.setFont(new Font("Raleway",Font.BOLD,16));
		c5.setBounds(100,600,200,30);
		add(c5);
		
		c6=new JCheckBox("E-Statement");
		c6.setBackground(Color.WHITE);
		c6.setFont(new Font("Raleway",Font.BOLD,16));
		c6.setBounds(350,600,200,30);
		add(c6);
		
		c7=new JCheckBox("I hereby declares that above Entered Details Are Correct");
		c7.setBackground(Color.WHITE);
		c7.setFont(new Font("Raleway",Font.BOLD,12));
		c7.setBounds(100,660,600,30);
		add(c7);
		
        submit=new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);
        
        cancel=new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(420,720,100,30);
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(Color.WHITE);
        
		setLayout(null);
		setUndecorated(true);
		setVisible(true);
		setSize(850,820);
		setLocation(350,0);
		setBackground(Color.WHITE);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==submit) {
			String accountType=null;
			if(r1.isSelected())
			{
				accountType="Saving Account";
			}
			else if(r2.isSelected())
			{
				accountType="Fixed Deposit Account";
			}
			else if(r3.isSelected())
			{
				accountType="Current Account";
			}else if(r4.isSelected())
			{
				accountType="Reccuring Deposit Account";
			}
			
			Random random=new Random();
			String cardnumber=""+Math.abs((random.nextLong() %90000000l)+70409360000000000l);
			String pinNumber=""+Math.abs((random.nextLong() % 8000l) +1000l);
		    String facility="";
		    if(c1.isSelected())
		    {
		    	facility=facility+" ATM CARD";
		    }
		    else if(c2.isSelected())
		    {
		    	facility=facility+" Internet-Banking";
		    }
		    else if(c3.isSelected())
		    {
		    	facility=facility+"Mobile-Banking";
		    }
		    else if(c4.isSelected())
		    {
		    	facility=facility+" Email :SMS ALert";
		    }
		    else if(c5.isSelected())
		    {
		    	facility=facility+" Cheque Book";
		    }
		    else if(c6.isSelected())
		    {
		    	facility=facility+" E-Statement";
		    }
		   
		    try
		    {
		    	if(accountType.equals(""))
		    	{
		    		JOptionPane.showMessageDialog(null,"Selection Account Type Required");
		    	}
		    	else
		    	{
		    		Conn con=new Conn();
		    		String querry="INSERT INTO signupthree (formno,accountType,cardnumber,pin,facility) VALUES('"+formno+"','"+accountType+"', '"+cardnumber+"', '"+pinNumber+"', '"+facility+"')";
		    	    con.s.executeUpdate(querry);
		    	    
		    	    JOptionPane.showMessageDialog(null,"Card No:"+cardnumber+ "\n Pin : "+pinNumber);
		    	
		    	    String querry1="INSERT INTO login (formno,cardnumber,pin) VALUES('"+formno+"','"+cardnumber+"', '"+pinNumber+"')";
		    	    con.s.executeUpdate(querry1);
		    	    
		    	    setVisible(false);
		    	    new Deposit(pinNumber).setVisible(true);
		    	}
		    }
		    catch(Exception e)
		    {
		    	e.printStackTrace();
		    }
		    
		}else if(ae.getSource()==cancel) {
			setVisible(false);
			new Login().setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new Signupthree("");
	}

	
}