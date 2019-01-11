package user1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class administration2 {

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
					administration2 window = new administration2();
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
	public administration2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 51));
		frame.setBounds(100, 100, 574, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAdministration = new JLabel("ADMINISTRATION");
		lblAdministration.setFont(new Font("Baskerville Old Face", Font.BOLD, 22));
		lblAdministration.setBackground(new Color(0, 0, 51));
		lblAdministration.setForeground(new Color(255, 255, 255));
		lblAdministration.setBounds(181, 54, 233, 35);
		frame.getContentPane().add(lblAdministration);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblUsername.setBackground(new Color(0, 0, 51));
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setBounds(90, 159, 117, 26);
		frame.getContentPane().add(lblUsername);
		
		textField = new JTextField();
		textField.setFont(new Font("Baskerville Old Face", Font.BOLD, 12));
		textField.setBounds(217, 166, 218, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblPassword.setBackground(new Color(0, 0, 51));
		lblPassword.setBounds(90, 219, 117, 26);
		frame.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Baskerville Old Face", Font.BOLD, 12));
		passwordField.setBounds(217, 226, 218, 26);
		frame.getContentPane().add(passwordField);
		
		//char[] a = {'a','d','m','i','n'};
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = String.valueOf(passwordField.getPassword());
				if(textField.getText().compareTo("ADMINISTER")==0 && s.compareTo("admin")==0)
				{
					administration a = new administration();
					a.frame.setVisible(true);
					frame.setVisible(false);
				}
				else
				{
					JOptionPane.showMessageDialog(frame, "Wrong login credentials", "", JOptionPane.WARNING_MESSAGE);
					
				}
			}
		});
		btnOk.setFont(new Font("Baskerville Old Face", Font.BOLD, 18));
		btnOk.setBounds(418, 342, 85, 35);
		frame.getContentPane().add(btnOk);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				user2 a = new user2();
				a.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Baskerville Old Face", Font.BOLD, 18));
		btnBack.setBounds(75, 342, 107, 35);
		frame.getContentPane().add(btnBack);
	}
}
