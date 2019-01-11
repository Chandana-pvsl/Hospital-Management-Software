package user1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Doctor2 {

	JFrame frame;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Doctor2 window = new Doctor2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public Doctor2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Californian FB", Font.BOLD, 18));
		frame.getContentPane().setBackground(new Color(0, 0, 51));
		frame.setBounds(100, 100, 622, 435);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDoctorLogin = new JLabel("DOCTOR LOGIN");
		lblDoctorLogin.setBackground(new Color(0, 0, 51));
		lblDoctorLogin.setForeground(new Color(255, 255, 255));
		lblDoctorLogin.setFont(new Font("Californian FB", Font.BOLD, 30));
		lblDoctorLogin.setBounds(212, 58, 239, 35);
		frame.getContentPane().add(lblDoctorLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(239, 244, 212, 35);
		frame.getContentPane().add(passwordField);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setBackground(new Color(0, 0, 51));
		lblUsername.setFont(new Font("Californian FB", Font.BOLD, 22));
		lblUsername.setBounds(88, 157, 125, 29);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setBackground(new Color(0, 0, 51));
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Californian FB", Font.BOLD, 22));
		lblPassword.setBounds(88, 243, 118, 35);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblClickOk = new JLabel("Click OK :");
		lblClickOk.setFont(new Font("Californian FB", Font.BOLD, 20));
		lblClickOk.setForeground(new Color(255, 255, 255));
		lblClickOk.setBounds(394, 339, 105, 35);
		frame.getContentPane().add(lblClickOk);
		
		
		
		textField = new JTextField();
		textField.setFont(new Font("Baskerville Old Face", Font.BOLD, 16));
		textField.setBounds(239, 151, 212, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Connection mycon;
				try {
					mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false","chandana","Jkma999*");
					Statement mys = mycon.createStatement();
					String username = textField.getText();
					String password = String.valueOf(passwordField.getPassword());
					PreparedStatement ps2 = mycon.prepareStatement("SELECT password FROM doctor WHERE username = ?");
					PreparedStatement ps3 = mycon.prepareStatement("SELECT count(*) From doctor WHERE username = ?");
					ps3.setString(1, username);
					ps2.setString(1, username);
					ResultSet rs = ps2.executeQuery();
					rs.next();
					ResultSet rs1 = ps3.executeQuery();
					rs1.next();
					if( rs1.getInt(1)!=0 && rs.getString(1).compareTo(password)==0)
					{
						Doctordetails1 d1 = new Doctordetails1(textField.getText());
						d1.frame.setVisible(true);
						frame.setVisible(false);
					}
					else
					{
						JOptionPane.showMessageDialog(frame,"wrong user credentials, try again","error",JOptionPane.ERROR_MESSAGE);
					}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			}});
		btnOk.setForeground(new Color(0, 0, 0));
		btnOk.setBackground(new Color(255, 255, 255));
		btnOk.setFont(new Font("Californian FB", Font.BOLD, 20));
		btnOk.setBounds(500, 342, 70, 29);
		frame.getContentPane().add(btnOk);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					user2 user = new user2();
					user.frame.setVisible(true);
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnBack.setFont(new Font("Baskerville Old Face", Font.BOLD, 18));
		btnBack.setBounds(36, 339, 99, 35);
		frame.getContentPane().add(btnBack);
	}
}
