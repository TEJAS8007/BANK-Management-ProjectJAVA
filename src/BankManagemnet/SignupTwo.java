package BankManagemnet;

import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class SignupTwo extends JFrame implements ActionListener{

	long m;
	
	JTextField nametext,faternametext
	,emailtext,pantext,aadhartext,statetext,pincodetext;
	
	JRadioButton syes,sno,eyes,eno;
	JComboBox religion,categorys,incomedrop,educationdrop,ocupationdrop;
	String formno;
	public SignupTwo(String formno)
	{
		this.formno=formno;
		setLayout(null);
		
		setTitle("Application form : page 2");
	
		JLabel additonaldetails=new JLabel("Page 2 : Additional Details");
		additonaldetails.setFont(new Font("Raleway",Font.BOLD,22));
		additonaldetails.setBounds(250,80,400,30);
		add(additonaldetails);

		JLabel relig=new JLabel("Religion:");
		relig.setFont(new Font("Raleway",Font.BOLD,22));
		relig.setBounds(100,140,100,30);
		add(relig);
		
		String []relivalue= {"Hindu","Muslim","Christian","Parsi","Other"};
		religion=new JComboBox(relivalue);
		religion.setFont(new Font("Raleway",Font.BOLD,14));
		religion.setBounds(300,140,400,30);
		religion.setBackground(Color.WHITE);
		add(religion);
		
		JLabel category=new JLabel("Category:");
		category.setFont(new Font("Raleway",Font.BOLD,22));
		category.setBounds(100,190,200,30);
		add(category);
		
		String []catvalue= {"OBC","GEN","SC","CT","Other"};
	    categorys=new JComboBox(catvalue);
		categorys.setFont(new Font("Raleway",Font.BOLD,14));
		categorys.setBounds(300,190,400,30);
		categorys.setBackground(Color.WHITE);
		add(categorys);
		
		
		JLabel income=new JLabel("Income");
		income.setFont(new Font("Raleway",Font.BOLD,22));
		income.setBounds(100,240,200,30);
		add(income);
		
		String []incvalue= {"null","<1,50,000","<2,50,000","<5,00,000","< up to 10,00,000"};
		incomedrop=new JComboBox(incvalue);
		incomedrop.setFont(new Font("Raleway",Font.BOLD,14));
		incomedrop.setBounds(300,240,400,30);
		incomedrop.setBackground(Color.WHITE);
		add(incomedrop);
		
		JLabel education=new JLabel("Educational");
		education.setFont(new Font("Raleway",Font.BOLD,22));
		education.setBounds(100,290,200,30);
		add(education);
		
		JLabel qualification=new JLabel("Qualification:");
		qualification.setFont(new Font("Raleway",Font.BOLD,22));
		qualification.setBounds(100,315,200,30);
		add(qualification);
		
		String []eduvalue= {"non graduate","Graduate","Matric pass","UnEducated"};
		educationdrop=new JComboBox(eduvalue);
		educationdrop.setFont(new Font("Raleway",Font.BOLD,14));
		educationdrop.setBounds(300,315,400,30);
		educationdrop.setBackground(Color.WHITE);
		add(educationdrop);
		
		JLabel Marstatus=new JLabel("Occupation");
		Marstatus.setFont(new Font("Raleway",Font.BOLD,22));
		Marstatus.setBounds(100,390,200,30);
		add(Marstatus);
		
		String []ocuvalue= {"Salaried","BuisnessMan","Retired","Student"};
		ocupationdrop=new JComboBox(ocuvalue);
		ocupationdrop.setFont(new Font("Raleway",Font.BOLD,14));
		ocupationdrop.setBounds(300,390,400,30);
		ocupationdrop.setBackground(Color.WHITE);
		add(ocupationdrop);
		
		JLabel pancard=new JLabel("PAN No:");
		pancard.setFont(new Font("Raleway",Font.BOLD,22));
		pancard.setBounds(100,440,200,30);
		add(pancard);
		
		pantext=new JTextField();
		pantext.setFont(new Font("Raleway",Font.BOLD,14));
		pantext.setBounds(300,440,400,30);
		add(pantext);
		
		JLabel City=new JLabel("Addhar No:");
		City.setFont(new Font("Raleway",Font.BOLD,22));
		City.setBounds(100,490,200,30);
		add(City);
		
		aadhartext=new JTextField();
		aadhartext.setFont(new Font("Raleway",Font.BOLD,14));
		aadhartext.setBounds(300,490,400,30);
		add(aadhartext);
		
		JLabel state=new JLabel("Senior Citizen:");
		state.setFont(new Font("Raleway",Font.BOLD,22));
		state.setBounds(100,540,200,30);
		add(state);
		
		syes=new JRadioButton("Yes");
		syes.setFont(new Font("Raleway",Font.BOLD,14));
		syes.setBounds(300,540,100,30);
		syes.setBackground(Color.WHITE);
		add(syes);
		
		sno=new JRadioButton("No");
		sno.setFont(new Font("Raleway",Font.BOLD,14));
		sno.setBounds(430,540,200,30);
		sno.setBackground(Color.WHITE);
		add(sno);
		
		ButtonGroup MarriedGroup=new ButtonGroup();
		MarriedGroup.add(syes);
		MarriedGroup.add(sno);
		
		JLabel pincode=new JLabel("Existing Account:");
		pincode.setFont(new Font("Raleway",Font.BOLD,22));
		pincode.setBounds(100,590,200,30);
		add(pincode);
		
		eyes=new JRadioButton("Yes");
		eyes.setFont(new Font("Raleway",Font.BOLD,14));
		eyes.setBounds(300,590,100,30);
		eyes.setBackground(Color.WHITE);
		add(eyes);
		
		eno=new JRadioButton("No");
		eno.setFont(new Font("Raleway",Font.BOLD,14));
		eno.setBounds(430,590,200,30);
		eno.setBackground(Color.WHITE);
		add(eno);
		
		ButtonGroup Accountgroup=new ButtonGroup();
		Accountgroup.add(eyes);
		Accountgroup.add(eno);
		
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
		
		String religions=(String)religion.getSelectedItem();
		String category=(String)categorys.getSelectedItem();
		String incomes=(String)incomedrop.getSelectedItem();
		String educations=(String)educationdrop.getSelectedItem();
		String Occupations=(String)ocupationdrop.getSelectedItem();
       
		String seniorcitizen=null;
		
        if(syes.isSelected())
        {
        	seniorcitizen="Yes";
        }
        else if(sno.isSelected())
        {
        	seniorcitizen="No";
        }
        
       
        String existingaccount=null;
        
        if(eyes.isSelected())
        {
        	existingaccount="Yes";
        }
        else if(eno.isSelected())
        {
        	existingaccount="No";
        }
        String pan=pantext.getText();
        String addhar=aadhartext.getText();
        try
        {
        	if(religions.equals(""))
        	{
        		JOptionPane.showMessageDialog(null, "Name is Required");
        	}
        	else
        	{
        		Conn c = new Conn();
        		String query =" INSERT INTO signuptwo (formno, religion, category, income, education, occupation, pan, aadhar, seniorcitizen, existingaccount) VALUES ('" + formno + "', '" + religions + "', '" + category + "', '" + incomes + "', '" + educations + "', '" + Occupations + "', '" + pan + "', '" + addhar + "','"+seniorcitizen+"','" + existingaccount + "')";
        		c.s.executeUpdate(query);
        		
        		setVisible(false);
        		new Signupthree(formno).setVisible(true);
        	}
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
	}
	
	public static void main(String[] args) {
		new SignupTwo("");
	}

	
}
