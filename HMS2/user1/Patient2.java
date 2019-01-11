package user1;

import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import javax.swing.JPasswordField;
import java.awt.ScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Patient2 {

    JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Patient2 window = new Patient2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the application.
	 */
	public Patient2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 51));
		frame.setBounds(100, 100, 663, 460);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPatientLogin = new JLabel("PATIENT LOGIN");
		lblPatientLogin.setForeground(new Color(255, 255, 255));
		lblPatientLogin.setBackground(new Color(0, 0, 51));
		lblPatientLogin.setFont(new Font("Californian FB", Font.BOLD, 28));
		lblPatientLogin.setBounds(212, 57, 222, 45);
		frame.getContentPane().add(lblPatientLogin);
		
		textField = new JTextField();
		textField.setFont(new Font("Californian FB", Font.BOLD, 20));
		textField.setBounds(257, 182, 207, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setBackground(new Color(0, 0, 51));
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setFont(new Font("Californian FB", Font.BOLD, 22));
		lblUsername.setBounds(93, 183, 116, 30);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setBackground(new Color(0, 0, 51));
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Californian FB", Font.BOLD, 22));
		lblPassword.setBounds(93, 266, 116, 33);
		frame.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(257, 267, 207, 33);
		frame.getContentPane().add(passwordField);
		
		JLabel lblClickOk = new JLabel("Click OK :");
		lblClickOk.setBackground(new Color(0, 0, 51));
		lblClickOk.setForeground(new Color(255, 255, 255));
		lblClickOk.setFont(new Font("Californian FB", Font.BOLD, 20));
		lblClickOk.setBounds(404, 350, 116, 27);
		frame.getContentPane().add(lblClickOk);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false","chandana","Jkma999*");
					//Statement mys = mycon.createStatement();
					String username = textField.getText();
					String password = String.valueOf(passwordField.getPassword());
					PreparedStatement ps2 = mycon.prepareStatement("SELECT password FROM patient WHERE username = ?");
					PreparedStatement ps3 = mycon.prepareStatement("SELECT count(*) From patient WHERE username = ?");
					ps2.setString(1, username);
					ps3.setString(1, username);
					ResultSet rs = ps2.executeQuery();
					ResultSet rs1 = ps3.executeQuery();
					rs.next();
					rs1.next();
					if( rs1.getInt(1)!=0 && rs.getString(1).compareTo(password)==0)
					{
						Patientdetails1 p2 = new Patientdetails1(username);
						p2.frame.setVisible(true);
						frame.setVisible(false);
					}
					else
					{
						JOptionPane.showMessageDialog(frame,"wrong user credentials, try again","error",JOptionPane.ERROR_MESSAGE);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnOk.setForeground(new Color(0, 0, 0));
		btnOk.setBackground(new Color(255, 255, 255));
		btnOk.setFont(new Font("Californian FB", Font.BOLD, 20));
		btnOk.setBounds(512, 344, 74, 39);
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
		btnBack.setBounds(31, 348, 74, 39);
		frame.getContentPane().add(btnBack);
	}
}
