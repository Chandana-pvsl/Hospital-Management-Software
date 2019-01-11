package user1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class user2 {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					user2 window = new user2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public user2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 51));
		frame.getContentPane().setBackground(new Color(0, 0, 51));
		frame.setBounds(100, 100, 781, 481);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSuvidhaHospital = new JLabel("SUVIDHA HOSPITAL");
		lblSuvidhaHospital.setForeground(new Color(255, 248, 220));
		lblSuvidhaHospital.setFont(new Font("Californian FB", Font.BOLD, 36));
		lblSuvidhaHospital.setBounds(203, 44, 362, 67);
		frame.getContentPane().add(lblSuvidhaHospital);
		
		JRadioButton rdbtnpatient = new JRadioButton("PATIENT");
		rdbtnpatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Patient2 p1 = new Patient2();
					p1.frame.setVisible(true);
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		rdbtnpatient.setForeground(new Color(0, 0, 51));
		rdbtnpatient.setBackground(new Color(255, 255, 255));
		rdbtnpatient.setFont(new Font("Californian FB", Font.BOLD, 20));
		rdbtnpatient.setBounds(310, 147, 129, 33);
		frame.getContentPane().add(rdbtnpatient);
		
		JRadioButton rdbtnDoctor = new JRadioButton("DOCTOR");
		rdbtnDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Doctor2 d1 = new Doctor2();
					d1.frame.setVisible(true);
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		rdbtnDoctor.setBackground(new Color(255, 255, 255));
		rdbtnDoctor.setFont(new Font("Californian FB", Font.BOLD, 20));
		rdbtnDoctor.setForeground(new Color(0, 0, 51));
		rdbtnDoctor.setBounds(310, 209, 129, 33);
		frame.getContentPane().add(rdbtnDoctor);
		
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(rdbtnpatient);
		bgroup.add(rdbtnDoctor);
		
		
		JLabel lblNewUserClick = new JLabel("New User? Click here to register ");
		lblNewUserClick.setForeground(new Color(255, 255, 255));
		lblNewUserClick.setFont(new Font("Californian FB", Font.BOLD, 20));
		lblNewUserClick.setBounds(153, 346, 286, 54);
		frame.getContentPane().add(lblNewUserClick);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Register reg = new Register();
					reg.frame.setVisible(true);
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnRegister.setForeground(new Color(0, 0, 0));
		btnRegister.setBackground(new Color(255, 255, 255));
		btnRegister.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		btnRegister.setBounds(485, 351, 162, 41);
		frame.getContentPane().add(btnRegister);
		
		JRadioButton rdbtnAdministration = new JRadioButton("ADMINISTRATION");
		rdbtnAdministration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				administration2 a1 = new administration2();
				a1.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		rdbtnAdministration.setForeground(new Color(0, 0, 51));
		rdbtnAdministration.setFont(new Font("Californian FB", Font.BOLD, 20));
		rdbtnAdministration.setBackground(Color.WHITE);
		rdbtnAdministration.setBounds(276, 274, 212, 33);
		frame.getContentPane().add(rdbtnAdministration);
		
		bgroup.add(rdbtnAdministration);
	}
}
