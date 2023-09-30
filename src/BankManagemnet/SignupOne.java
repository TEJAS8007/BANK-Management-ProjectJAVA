package BankManagemnet;

import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame implements ActionListener{

	long m;
	
	JTextField nametext,faternametext
	,emailtext,adresstext,citytext,statetext,pincodetext;
	
	JRadioButton male,female,Married,UnMarried;
	JDateChooser date;
	
	public SignupOne()
	{
		setLayout(null);
		Random rand=new Random();
		m= Math.abs(rand.nextLong() % 9000l+1000l);
		
		JLabel formno=new JLabel("Application From No . "+m);
		formno.setFont(new Font("Raleway",Font.BOLD,38));
		formno.setBounds(140,20,500,40);
		add(formno);
		
		JLabel personaldetails=new JLabel("Page 1 :Personal Details");
		personaldetails.setFont(new Font("Raleway",Font.BOLD,22));
		personaldetails.setBounds(250,80,400,30);
		add(personaldetails);

		JLabel name=new JLabel("Name:");
		name.setFont(new Font("Raleway",Font.BOLD,22));
		name.setBounds(100,140,100,30);
		add(name);
		
		nametext=new JTextField();
		nametext.setFont(new Font("Raleway",Font.BOLD,14));
		nametext.setBounds(300,140,400,30);
		add(nametext);
		
		JLabel FatherName=new JLabel("Father's Name:");
		FatherName.setFont(new Font("Raleway",Font.BOLD,22));
		FatherName.setBounds(100,190,200,30);
		add(FatherName);

		faternametext=new JTextField();
		faternametext.setFont(new Font("Raleway",Font.BOLD,14));
		faternametext.setBounds(300,190,400,30);
		add(faternametext);
		
		JLabel dob=new JLabel("Date of Birth:");
		dob.setFont(new Font("Raleway",Font.BOLD,22));
		dob.setBounds(100,240,200,30);
		add(dob);
		
		date=new JDateChooser();
		date.setBounds(300,240,400,30);
		date.setForeground(Color.RED);
		add(date);
		
		JLabel Gender=new JLabel("Gender:");
		Gender.setFont(new Font("Raleway",Font.BOLD,22));
		Gender.setBounds(100,290,200,30);
		add(Gender);
		
		male=new JRadioButton("Male");
		male.setFont(new Font("Raleway",Font.BOLD,16));
		male.setBounds(300,290,80,30);
		male.setBackground(Color.WHITE);
		add(male);
		
		female=new JRadioButton("Female");
		female.setFont(new Font("Raleway",Font.BOLD,16));
		female.setBounds(450,290,80,30);
		female.setBackground(Color.WHITE);
		add(female);
		
		ButtonGroup Gendergroup=new ButtonGroup();
		Gendergroup.add(male);
		Gendergroup.add(female);
		
		JLabel Email=new JLabel("Email:");
		Email.setFont(new Font("Raleway",Font.BOLD,22));
		Email.setBounds(100,340,200,30);
		add(Email);
		
		emailtext=new JTextField();
		emailtext.setFont(new Font("Raleway",Font.BOLD,14));
		emailtext.setBounds(300,340,400,30);
		add(emailtext);
		
		JLabel Marstatus=new JLabel("Marrital Status:");
		Marstatus.setFont(new Font("Raleway",Font.BOLD,22));
		Marstatus.setBounds(100,390,200,30);
		add(Marstatus);
		
		Married=new JRadioButton("Married");
		Married.setFont(new Font("Raleway",Font.BOLD,14));
		Married.setBounds(300,390,100,30);
		Married.setBackground(Color.WHITE);
		add(Married);
		
		UnMarried=new JRadioButton("UnMarried");
		UnMarried.setFont(new Font("Raleway",Font.BOLD,14));
		UnMarried.setBounds(430,390,200,30);
		UnMarried.setBackground(Color.WHITE);
		add(UnMarried);
		
		ButtonGroup MarriedGroup=new ButtonGroup();
		MarriedGroup.add(Married);
		MarriedGroup.add(UnMarried);
		
		JLabel address=new JLabel("Address:");
		address.setFont(new Font("Raleway",Font.BOLD,22));
		address.setBounds(100,440,200,30);
		add(address);
		
		adresstext=new JTextField();
		adresstext.setFont(new Font("Raleway",Font.BOLD,14));
		adresstext.setBounds(300,440,400,30);
		add(adresstext);
		
		JLabel City=new JLabel("City:");
		City.setFont(new Font("Raleway",Font.BOLD,22));
		City.setBounds(100,490,200,30);
		add(City);
		
		citytext=new JTextField();
		citytext.setFont(new Font("Raleway",Font.BOLD,14));
		citytext.setBounds(300,490,400,30);
		add(citytext);
		
		JLabel state=new JLabel("State:");
		state.setFont(new Font("Raleway",Font.BOLD,22));
		state.setBounds(100,540,200,30);
		add(state);
		
		statetext=new JTextField();
		statetext.setFont(new Font("Raleway",Font.BOLD,14));
		statetext.setBounds(300,540,400,30);
		add(statetext);
		
		JLabel pincode=new JLabel("PinCode:");
		pincode.setFont(new Font("Raleway",Font.BOLD,22));
		pincode.setBounds(100,590,200,30);
		add(pincode);
		
		pincodetext=new JTextField();
		pincodetext.setFont(new Font("Raleway",Font.BOLD,14));
		pincodetext.setBounds(300,590,400,30);
		add(pincodetext);
		
		JButton button=new JButton("Next");
		button.setBackground(Color.BLACK);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Railway",Font.BOLD,14));
		button.setBounds(620,660,80,30);
		button.addActionListener(this);
		add(button);
		
		getContentPane().setBackground(Color.WHITE);
		
	   	setSize(850,850);
	   	setLocation(350,10);
	   	setVisible(true);
	   	
	}
	
	public void actionPerformed(ActionEvent ae) {
		String formno=""+m;
		String name=nametext.getText();
		String fname=faternametext.getText();
		String dob=((JTextField)date.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(male.isSelected())
        {
        	gender="Male";
        }
        else if(female.isSelected())
        {
        	gender="Female";
        }
        
        String email=emailtext.getText();
        String marrital=null;
        
        if(Married.isSelected())
        {
        	marrital="Married";
        }
        else if(UnMarried.isSelected())
        {
        	marrital="Unmarried";
        }
        String address=adresstext.getText();
        String city=citytext.getText();
        String state=statetext.getText();
        String pin=pincodetext.getText();
        
        try
        {
        	if(name.equals(""))
        	{
        		JOptionPane.showMessageDialog(null, "Name is Required");
        	    
        	}
        	else
        	{
        		Conn c = new Conn();
        		String query = "INSERT INTO signup (formno, name, father_name , dob, gender, email, marital_status, address, city, pincode, state) VALUES ('" + formno + "', '" + name + "', '" + fname + "', '" + dob + "', '" + gender + "', '" + email + "', '" + marrital + "', '" + address + "', '" + city + "', '" + pin + "', '" + state + "')";
        		c.s.executeUpdate(query);

        		setVisible(false);
        		new SignupTwo(formno).setVisible(true);
        	}
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
	}
	
	public static void main(String[] args) {
		new SignupOne();
	}

	
}
