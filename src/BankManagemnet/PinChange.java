package BankManagemnet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PinChange extends JFrame implements ActionListener{

	JPasswordField pin,repin;
	JButton change,back;
	String pinnumber;
	public PinChange(String pinnumber) {

		this.pinnumber=pinnumber;
		setLayout(null);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/atm.png"));
		Image i2=i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);

		JLabel image=new JLabel(i3);
		image.setBounds(0,0,900,900);
		add(image);

		JLabel text=new JLabel("CHANGE YOUR PIN");
		text.setBounds(250,280,700,35);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System",Font.BOLD,16));
		image.add(text);

		JLabel pintext=new JLabel("New PIN");
		pintext.setBounds(165,320,180,25);
		pintext.setForeground(Color.WHITE);
		pintext.setFont(new Font("System",Font.BOLD,16));
		image.add(pintext);

		JLabel repintext=new JLabel("RE-Enter PIN");
		repintext.setBounds(165,360,180,25);
		repintext.setForeground(Color.WHITE);
		repintext.setFont(new Font("System",Font.BOLD,16));
		image.add(repintext);

		pin=new JPasswordField();
		pin.setFont(new Font("Raleway",Font.BOLD,16));
		pin.setBounds(330,320,180,25);
		image.add(pin);

		repin=new JPasswordField();
		repin.setFont(new Font("Raleway",Font.BOLD,16));
		repin.setBounds(330,360,180,25);
		image.add(repin);

		change=new JButton("CHANGE");
		change.setBounds(355,485,150,30);
		change.addActionListener(this);
		image.add(change);

		back=new JButton("BACK");
		back.setBounds(355,520,150,30);
		back.addActionListener(this);
		image.add(back);


		setSize(900,900);
		setLocation(300,0);
		setUndecorated(true);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==change) {
			try{
				String npin=pin.getText();
				String rpin=repin.getText();
				if(!npin.equals(rpin)) {
					JOptionPane.showMessageDialog(null,"Pin Doesnt Matched /n Please ReEnter Pin");
					return;
				}
				if(npin.equals("")) {
					JOptionPane.showMessageDialog(null,"Please Enter Pin");
				    return;
				}
				if(rpin.equals("")) {
					JOptionPane.showMessageDialog(null, "Please ReEnter Pin");
				}
				
				Conn con=new Conn();
				String querry1="UPDATE bank SET pin = '"+rpin+"' WHERE pin='"+pinnumber+"'";
				String querry2="UPDATE login SET pin = '"+rpin+"' WHERE pin='"+pinnumber+"'";
				String querry3="UPDATE signupthree SET pin = '"+rpin+"' WHERE pin='"+pinnumber+"'";
				
				con.s.executeUpdate(querry1);
				con.s.executeUpdate(querry2);
				con.s.executeUpdate(querry3);
				
				JOptionPane.showMessageDialog(null,"Pin Change SuccessFully");
				setVisible(false);
				new Transactions(rpin).setVisible(true);
				
			}
			catch(Exception e) {
				System.out.println(e);
			}

		}else {
			setVisible(false);
			new Transactions(pinnumber).setVisible(true);
		}

		
	}

	public static void main(String[] args) {
		new PinChange("");
	}


}
