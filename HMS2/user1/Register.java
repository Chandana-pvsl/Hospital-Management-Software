package user1;

import java.awt.EventQueue;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;

//import com.toedter.calendar.JCalendar;
//import com.toedter.calendar.JDateChooser;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.BorderLayout;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class Register {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_8;
	private JTextField textField_1;
	private JTextField textField_5;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register window = new Register();
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
	public Register() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try {
			/*Class.forName("com.mysql.jdbc.Driver");
			Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false","chandana","Jkma999*");
			Statement mys = mycon.createStatement();*/
			
			frame = new JFrame();
			frame.setBounds(100, 100, 576, 767);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//frame.getContentPane().setLayout(null);
		
			JPanel container = new JPanel();
			container.setBackground(new Color(0, 0, 51));
			JScrollPane jsp = new JScrollPane(container);
			container.setPreferredSize(new Dimension(200, 200));
			container.setLayout(null);
        
        JLabel lblRegister = new JLabel("REGISTER");
        lblRegister.setBackground(new Color(0, 0, 51));
        lblRegister.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
        lblRegister.setForeground(new Color(255, 255, 255));
        lblRegister.setBounds(214, 37, 124, 41);
        container.add(lblRegister);
        
        JLabel lblName = new JLabel("First Name :");
        lblName.setBackground(new Color(0, 0, 51));
        lblName.setForeground(new Color(255, 255, 255));
        lblName.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        lblName.setBounds(41, 149, 114, 28);
        container.add(lblName);
        
        textField = new JTextField();
        textField.setBounds(162, 157, 155, 19);
        container.add(textField);
        textField.setColumns(10);
        
        JLabel lblDateOfBirth = new JLabel("Age :");
        lblDateOfBirth.setBackground(new Color(0, 0, 51));
        lblDateOfBirth.setForeground(new Color(255, 255, 255));
        lblDateOfBirth.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        lblDateOfBirth.setBounds(41, 227, 91, 28);
        container.add(lblDateOfBirth);
        
        textField_2 = new JTextField();
        textField_2.setBounds(116, 235, 124, 19);
        container.add(textField_2);
        textField_2.setColumns(10);
        
       /* JDateChooser mydatechooser = new com.toedter.calendar.JDateChooser();
        mydatechooser.setBounds(30, 39, 35, -20);
        Calendar cal = mydatechooser.getCalendar();
        int datevar = cal.get(Calendar.DATE);
	    int monthvar = cal.get(Calendar.MONTH);
        int yearvar = cal.get(Calendar.YEAR);
        container.add(mydatechooser);*/
        
        JLabel lblMobileNumber = new JLabel("Mobile Number :");
        lblMobileNumber.setBackground(new Color(0, 0, 51));
        lblMobileNumber.setForeground(new Color(255, 255, 255));
        lblMobileNumber.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        lblMobileNumber.setBounds(41, 279, 134, 13);
        container.add(lblMobileNumber);
        
        textField_3 = new JTextField();
        textField_3.setBounds(193, 279, 124, 19);
        container.add(textField_3);
        textField_3.setColumns(10);
        
        JLabel lblGender = new JLabel("Gender :");
        lblGender.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        lblGender.setForeground(new Color(255, 255, 255));
        lblGender.setBounds(41, 320, 91, 19);
        container.add(lblGender);
        
        JRadioButton rdbtnFemale = new JRadioButton("Female");
        rdbtnFemale.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        rdbtnFemale.setForeground(new Color(255, 255, 255));
        rdbtnFemale.setBackground(new Color(0, 0, 51));
        rdbtnFemale.setBounds(137, 319, 103, 21);
        container.add(rdbtnFemale);
        
        JRadioButton rdbtnMale = new JRadioButton("Male");
        rdbtnMale.setForeground(new Color(255, 255, 255));
        rdbtnMale.setBackground(new Color(0, 0, 51));
        rdbtnMale.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        rdbtnMale.setBounds(235, 319, 103, 21);
        container.add(rdbtnMale);
        
        JRadioButton rdbtnOther = new JRadioButton("Other");
        rdbtnOther.setBackground(new Color(0, 0, 51));
        rdbtnOther.setForeground(new Color(255, 255, 255));
        rdbtnOther.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        rdbtnOther.setBounds(340, 319, 103, 21);
        container.add(rdbtnOther);
        
        JLabel lblIllnessif = new JLabel("Specification :");
        lblIllnessif.setBackground(new Color(0, 0, 51));
        lblIllnessif.setForeground(new Color(255, 255, 255));
        lblIllnessif.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        lblIllnessif.setBounds(41, 533, 134, 28);
        container.add(lblIllnessif);
        
        textField_4 = new JTextField();
        textField_4.setBounds(200, 541, 236, 19);
        container.add(textField_4);
        textField_4.setColumns(10);
        
        JLabel lblUsername = new JLabel("Username :");
        lblUsername.setBackground(new Color(0, 0, 51));
        lblUsername.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        lblUsername.setForeground(new Color(255, 255, 255));
        lblUsername.setBounds(41, 358, 96, 19);
        container.add(lblUsername);
        
        textField_8 = new JTextField();
        textField_8.setBounds(162, 361, 173, 19);
        container.add(textField_8);
        textField_8.setColumns(10);
        
       
        
        JLabel lblPassword = new JLabel("Password :");
        lblPassword.setBackground(new Color(0, 0, 51));
        lblPassword.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        lblPassword.setForeground(new Color(255, 255, 255));
        lblPassword.setBounds(41, 403, 91, 19);
        container.add(lblPassword);
        
        JRadioButton rdbtnDoctor = new JRadioButton("Doctor");
        rdbtnDoctor.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        rdbtnDoctor.setForeground(new Color(0, 0, 51));
        rdbtnDoctor.setBounds(41, 97, 103, 28);
        container.add(rdbtnDoctor);
        
        JRadioButton rdbtnPatient = new JRadioButton("Patient");
        rdbtnPatient.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        rdbtnPatient.setForeground(new Color(0, 0, 51));
        rdbtnPatient.setBounds(411, 97, 103, 28);
        container.add(rdbtnPatient);
        frame.getContentPane().add(jsp);
        
        ButtonGroup bg3 = new ButtonGroup();
        bg3.add(rdbtnDoctor);
        bg3.add(rdbtnPatient);
        
        JLabel lblTypeOfDoctor = new JLabel("Type of doctor :");
        lblTypeOfDoctor.setForeground(Color.WHITE);
        lblTypeOfDoctor.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        lblTypeOfDoctor.setBounds(41, 493, 155, 19);
        container.add(lblTypeOfDoctor);
        
        JRadioButton rdbtnVisiting = new JRadioButton("Visiting");
        rdbtnVisiting.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        rdbtnVisiting.setBounds(214, 493, 103, 21);
        container.add(rdbtnVisiting);
        
        JRadioButton rdbtnRegular = new JRadioButton("Regular");
        rdbtnRegular.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        rdbtnRegular.setBounds(369, 493, 103, 21);
        container.add(rdbtnRegular);
      
        ButtonGroup bg4 = new ButtonGroup();
        bg4.add(rdbtnRegular);
        bg4.add(rdbtnVisiting);
        
        JButton btnOk = new JButton("OK");
        btnOk.addActionListener(new ActionListener() {
        	
        	//ResultSet myrs = mys.executeQuery("INSERT INTO student ( username , password , name ) VALUES ("+username+" ," + password +","+ name +");");
           	public void actionPerformed(ActionEvent arg0) {
           		
				try {
					//Class.forName("com.mysql.jdbc.Driver");
					PreparedStatement ps,ps1,ps2;
					Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false","chandana","Jkma999*");
					Statement mys = mycon.createStatement();
					String gender;
					 if(rdbtnFemale.isSelected()==true)
					 {
						 gender = "female";
					 }
					 else if(rdbtnMale.isSelected()==true)
					 {
						 gender = "male";
					 }
					 else {
						 gender = "other";
					 }
					if(rdbtnPatient.isSelected()==true)
					{
					 String username = textField_8.getText();
					 ps1 = mycon.prepareStatement("SELECT * FROM patient WHERE username = (?)");
					 ps1.setString(1, username);
					 
					 ResultSet rs = ps1.executeQuery();
					 if(rs.next() == false)
					 {
						 String password = String.valueOf(passwordField.getPassword());
						 String name = textField.getText();
						 String name1 = textField_5.getText();
						 String mobileno = textField_3.getText();
						 Integer i;
						 i = Integer.parseInt(textField_2.getText());
						 ps = mycon.prepareStatement("INSERT INTO patient (username,password,firstname,age,payment,mobile_number,gender,lastname) VALUES (?,?,?,?,?,?,?,?);");
						 ps.setString(1,username);
						 ps.setString(2, password);
						 ps.setString(3, name);
						 ps.setInt(4,i);
						 ps.setInt(5, 0);
						 ps.setString(6,mobileno);
						 ps.setString(7,gender);
						 ps.setString(8, name1);
						 ps.executeUpdate();
						 JOptionPane.showMessageDialog(frame, "You have been successfully registered :)", "", JOptionPane.PLAIN_MESSAGE);
					 }
					 else
					 {
						 JOptionPane.showMessageDialog(frame, "you have already registered or username already exists create another","error",JOptionPane.ERROR_MESSAGE);
					 }
					}
					else
					{
						 String username = textField_8.getText();
						 ps1 = mycon.prepareStatement("SELECT * FROM doctor WHERE username = (?)");
						 ps1.setString(1, username);
						 ResultSet rs = ps1.executeQuery();
						 if(rs.next() == false)
						 {
							 String name = textField.getText();
							 String name1 = textField_5.getText();
							 String password =String.valueOf(passwordField.getPassword());
							 String specification = textField_4.getText();
							 String qualification= textField_1.getText();
							 Integer i;
							 i = Integer.parseInt(textField_2.getText());
							 String type;
							 if(rdbtnVisiting.isSelected()==true)
							 {
								 type = "Visiting";
							 }
							 else
							 {
								 type = "Regular";
							 }
							 
							 
							 ps2 = mycon.prepareStatement("INSERT INTO doctor (username,password,firstname,type,age,mobile_number,gender,specification,qualification,lastname) VALUES (?,?,?,?,?,?,?,?,?,?);");
							 ps2.setString(1,username);
							 ps2.setString(2, password);
							 ps2.setString(3, name);
							 ps2.setString(4, type);
							 ps2.setInt(5,i);
							 ps2.setString(6, textField_3.getText());
							 ps2.setString(7, gender);
							 ps2.setString(8, specification);
							 ps2.setString(9, qualification);
							 ps2.setString(10, name1);
							 ps2.executeUpdate();
							 ps2 = mycon.prepareStatement("INSERT INTO availability (firstname,lastname,monno,tueno,wedno,thurno,frino,satno,sunno) VALUES (?,?,?,?,?,?,?,?,?);");
							 ps2.setString(1,name);
							 ps2.setString(2, name1);
							 ps2.setInt(3,0);
							 ps2.setInt(4,0);
							 ps2.setInt(5,0);
							 ps2.setInt(6,0);
							 ps2.setInt(7,0);
							 ps2.setInt(8,0);
							 ps2.setInt(9,0);
							 ps2.executeUpdate();
							 JOptionPane.showMessageDialog(frame, "You have been successfully registered :)", "", JOptionPane.PLAIN_MESSAGE);
						 }
						 else
						 {
							 JOptionPane.showMessageDialog(frame, "you have already registered or username already exists create another","error",JOptionPane.ERROR_MESSAGE);
						 }
					}

					 
				} catch (SQLException e1) {
					e1.printStackTrace();
				} 
           	}
           });
        btnOk.setFont(new Font("Baskerville Old Face", Font.BOLD, 18));
        btnOk.setForeground(new Color(0, 0, 0));
        btnOk.setBounds(440, 658, 74, 28);
        container.add(btnOk);
        
        JButton btnBackToLogin = new JButton("Back To Login");
        btnBackToLogin.addActionListener(new ActionListener() {
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
        btnBackToLogin.setFont(new Font("Baskerville Old Face", Font.BOLD, 18));
        btnBackToLogin.setBounds(10, 658, 165, 28);
        container.add(btnBackToLogin);
        
        JLabel lblQualification = new JLabel("Qualification :");
        lblQualification.setForeground(Color.WHITE);
        lblQualification.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        lblQualification.setBackground(new Color(0, 0, 51));
        lblQualification.setBounds(41, 587, 134, 28);
        container.add(lblQualification);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(185, 595, 236, 19);
        container.add(textField_1);
        
        JLabel lblOnlyForDoctors = new JLabel("Only for doctors :");
        lblOnlyForDoctors.setForeground(Color.WHITE);
        lblOnlyForDoctors.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        lblOnlyForDoctors.setBounds(41, 452, 155, 19);
        container.add(lblOnlyForDoctors);
        
        JLabel lblLastName = new JLabel("Last Name :");
        lblLastName.setForeground(Color.WHITE);
        lblLastName.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        lblLastName.setBackground(new Color(0, 0, 51));
        lblLastName.setBounds(41, 189, 114, 28);
        container.add(lblLastName);
        
        textField_5 = new JTextField();
        textField_5.setColumns(10);
        textField_5.setBounds(162, 197, 155, 19);
        container.add(textField_5);
        
        JButton btnReset = new JButton("RESET");
        btnReset.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		textField.setText("");
        		textField_1.setText("");
        		textField_2.setText("");
        		textField_3.setText("");
        		textField_4.setText("");
        		textField_5.setText("");
        		textField_8.setText("");
        		passwordField.setText("");
        		rdbtnVisiting.setSelected(false);
        		rdbtnRegular.setSelected(false);
        		rdbtnFemale.setSelected(false);
        		rdbtnMale.setSelected(false);
        		rdbtnOther.setSelected(false);
        	}
        });
        btnReset.setForeground(Color.BLACK);
        btnReset.setFont(new Font("Baskerville Old Face", Font.BOLD, 18));
        btnReset.setBounds(255, 658, 103, 28);
        container.add(btnReset);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(162, 406, 173, 19);
        container.add(passwordField);
        
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
