package user1;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JMenu;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

public class Patientdetails1 {

	JFrame frame;
	JPanel a,b,c,d,home;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;
	private JTable table_1;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Patientdetails1 window = new Patientdetails1(name);
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
	public Patientdetails1(String name) {
		initialize(name);
	}

	/**
	 * Initialize the contents of the frame.
	 * @param specification 
	 * @param qualification 
	 */
	private void initialize(String name) {
		try {
		Connection mycon;
		mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false","chandana","Jkma999*");
		Statement mys = mycon.createStatement();
		frame = new JFrame();
		frame.setBounds(100, 100, 837, 632);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		home = new JPanel();
		home.setBackground(new Color(0, 0, 51));
		JLabel lblWelcomeToSuvidha = new JLabel("Welcome to Suvidha Hospital");
		lblWelcomeToSuvidha.setBackground(new Color(0, 0, 51));
		lblWelcomeToSuvidha.setForeground(new Color(255, 255, 255));
		lblWelcomeToSuvidha.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		lblWelcomeToSuvidha.setBounds(10, 32, 355, 44);
		home.add(lblWelcomeToSuvidha);
		
		
		JLabel lblGoodHealthIs = new JLabel("Good health is the key to a happy and fruitful life; it is also the most neglected asset. Our lifestyle today");
		lblGoodHealthIs.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblGoodHealthIs.setForeground(new Color(255, 255, 255));
		lblGoodHealthIs.setBounds(10, 142, 821, 29);
		home.add(lblGoodHealthIs);
		
		JLabel lblNewLabel = new JLabel("is ridden with unnecessary stress, irregular working hours, and poor eating habits, late night partying and ");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 175, 878, 23);
		home.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("inadequate rest. All these coupled with high pollution levels result in physical and psychological health");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 208, 821, 23);
		home.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("problems. We offer several preventive health check packages to suit specific needs.We do make customized ");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 275, 821, 23);
		home.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("packages for corporate and insurance companies based on individual requirements.The aim of these ");
		lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(10, 308, 912, 23);
		home.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("packages is to promote good health and prevent disease, thereby paving the way to “WELLNESS”.");
		lblNewLabel_4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(10, 341, 912, 23);
		home.add(lblNewLabel_4);
		
		JButton btnLogOut = new JButton("Log out");
		btnLogOut.addActionListener(new ActionListener() {
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
		btnLogOut.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		btnLogOut.setBounds(20, 461, 124, 38);
		home.add(btnLogOut);
		
		JLabel lblNewLabel_5 = new JLabel(name);
		lblNewLabel_5.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(609, 32, 177, 25);
		home.add(lblNewLabel_5);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 836, 589);
		frame.getContentPane().add(tabbedPane);
		tabbedPane.add("HOME",home);
		home.setLayout(null);
		
		a = new JPanel();
		a.setBackground(new Color(0, 0, 51));
		String doctor[] = {"Days\\Time","6:00AM - 2:00PM","2:00PM - 10:00AM","10:00AM - 6:00AM"};
		String data[][] = new String[7][4]; 
		data[1][0] = "monday";
		data[2][0] = "tuesday";
		data[3][0] = "wednesday";
		data[4][0] = "thursday";
		data[5][0] = "friday";
		data[6][0] = "saturday";
		data[0][0] = "sunday";
		DefaultTableModel model = new DefaultTableModel(data, doctor); 
		JTable table = new JTable(model);
		table.setBounds(0, 578, 571, -578);
		table.setBackground(Color.WHITE);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		table.getColumnModel().getColumn(0).setPreferredWidth(141);
		table.getColumnModel().getColumn(1).setPreferredWidth(141);
		table.getColumnModel().getColumn(2).setPreferredWidth(141);
		table.getColumnModel().getColumn(3).setPreferredWidth(141);
		table.setRowHeight(0, 82);
		table.setRowHeight(1, 82);
		table.setRowHeight(2, 82);
		table.setRowHeight(3, 82);
		table.setRowHeight(4, 82);
		table.setRowHeight(5, 82);
		table.setRowHeight(6, 82);
		
		MultiLine renderer = new MultiLine();
	    table.setDefaultRenderer(Object.class, renderer);
		//a.setLayout(null);
	    // table.getColumnModel().getColumn(1).setCellRenderer(renderer);
	    //table.getColumnModel().getColumn(2).setCellRenderer(renderer);
	    //table.getColumnModel().getColumn(3).setCellRenderer(renderer);
		table.setShowGrid(true);
		JScrollPane pane = new JScrollPane(table);
		pane.setBounds(136, 0, 561, 486);
		pane.setViewportBorder(new LineBorder(Color.BLACK, 3));
		a.add(pane);
		mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false","chandana","Jkma999*");
		PreparedStatement ps  = mycon.prepareStatement("select * from schedule");
		ResultSet rs = ps.executeQuery();
		rs.next();
		table.getModel().setValueAt(rs.getString(2), 0, 1) ;
		table.getModel().setValueAt(rs.getString(3), 0, 2) ;
		table.getModel().setValueAt(rs.getString(4), 0, 3) ;
		rs.next();
		table.getModel().setValueAt(rs.getString(2), 1, 1) ;
		table.getModel().setValueAt(rs.getString(3), 1, 2) ;
		table.getModel().setValueAt(rs.getString(3), 1, 3) ;
		rs.next();
		table.getModel().setValueAt(rs.getString(2), 2, 1) ;
		table.getModel().setValueAt(rs.getString(3), 2, 2) ;
		table.getModel().setValueAt(rs.getString(4), 2, 3) ;
		rs.next();
		table.getModel().setValueAt(rs.getString(2), 3, 1) ;
		table.getModel().setValueAt(rs.getString(3), 3, 2) ;
		table.getModel().setValueAt(rs.getString(4), 3, 3) ;
		rs.next();
		table.getModel().setValueAt(rs.getString(2), 4, 1) ;
		table.getModel().setValueAt(rs.getString(3), 4, 2) ;
		table.getModel().setValueAt(rs.getString(4), 4, 3) ;
		rs.next();
		table.getModel().setValueAt(rs.getString(2), 5, 1) ;
		table.getModel().setValueAt(rs.getString(3), 5, 2) ;
	    table.getModel().setValueAt(rs.getString(4), 5, 3) ;
		rs.next();
		table.getModel().setValueAt(rs.getString(2), 6, 1) ;
		table.getModel().setValueAt(rs.getString(3), 6, 2) ;
		table.getModel().setValueAt(rs.getString(4), 6, 3);
		
		tabbedPane.add("View Schedule",a);
		//a.setLayout(null);
		
		/**********Doctor Details***************/
		b = new JPanel();
		b.setBackground(new Color(0, 0, 51));
		PreparedStatement ps1 = mycon.prepareStatement("SELECT COUNT(*) FROM doctor");
		ResultSet rs5 = ps1.executeQuery();
		rs5.next();
		int k = rs5.getInt(1);
		int i;
		PreparedStatement ps2 = mycon.prepareStatement("SELECT firstname,lastname, specification,qualification FROM doctor");
		rs = ps2.executeQuery();
		String doctor1[] = {"Doctor Name","Specification","Qualification"};
		String data1[][] = null; 
		String s;
		DefaultTableModel model1 = new DefaultTableModel(data1, doctor1); 
		
		JTable table1 = new JTable(model1);
		table1.setBounds(0, 0, 831, 562);
		table1.setBackground(Color.WHITE);
		table1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		//table.setCellSelectionEnabled(true);
		//table.setColumnSelectionAllowed(true);
		table1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		for(i = 0 ; i < k ; i++)
		{
			rs.next();
			s = rs.getString("firstname")+rs.getString("lastname");
			model1.addRow(new Object[] {s,rs.getString("specification"),rs.getString("qualification")});
		}
		b.setLayout(null);
		
		JScrollPane pane1 = new JScrollPane(table1);
		pane1.setBounds(184, 5, 462, 478);
		pane1.setViewportBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		b.add(pane1);
		//b.add(table);
		tabbedPane.add("Doctor Details",b);
		b.setLayout(null);
		
		/******************************************/
		
		
		/**booking appointment **/
		
		
		c = new JPanel();
		c.setBackground(new Color(0, 0, 51));
		JLabel lblBookYourAppointment = new JLabel("Book your Appointment");
		lblBookYourAppointment.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		lblBookYourAppointment.setForeground(new Color(255, 255, 255));
		lblBookYourAppointment.setBounds(23, 25, 311, 40);
		c.add(lblBookYourAppointment);
		
		JLabel lblDoctorName = new JLabel("Name of the Doctor :");
		lblDoctorName.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblDoctorName.setForeground(new Color(255, 255, 255));
		lblDoctorName.setBounds(23, 102, 249, 31);
		c.add(lblDoctorName);
		
		JLabel lblDateOfBooking = new JLabel("Day of Booking :");
		lblDateOfBooking.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblDateOfBooking.setForeground(new Color(255, 255, 255));
		lblDateOfBooking.setBounds(23, 165, 160, 31);
		c.add(lblDateOfBooking);
		
		
		
		JLabel lblNewLabel1 = new JLabel(name);
		lblNewLabel1.setBackground(new Color(0, 0, 51));
		lblNewLabel1.setForeground(new Color(255, 255, 255));
		lblNewLabel1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel1.setBounds(632, 37, 124, 22);
		c.add(lblNewLabel1);
		
		textField_5 = new JTextField();
	    textField_5.setBounds(487, 111, 212, 22);
	    c.add(textField_5);
	    textField_5.setColumns(10);
	        
	    textField_6 = new JTextField();
	    textField_6.setColumns(10);
	    textField_6.setBounds(332, 173, 212, 22);
	    c.add(textField_6);
		
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String st;
    			st = String.valueOf(comboBox_1.getSelectedItem());
    			textField_6.setText(st);
			}
		});
		comboBox_1.setFont(new Font("Baskerville Old Face", Font.BOLD, 14));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Sunday", "Monday", "Tuesday", "Thursday", "Friday", "Saturday"}));
		comboBox_1.setBounds(192, 173, 106, 21);
		c.add(comboBox_1);
		
		  JComboBox comboBox = new JComboBox();	
		    mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false","chandana","Jkma999*");
			ps = mycon.prepareStatement("select count(*) from doctor ");
			rs = ps.executeQuery();
			rs.next();
			int j = rs.getInt(1);
			ps = mycon.prepareStatement("select firstname,lastname from doctor ");
			rs = ps.executeQuery();
			String str ;
			for (i = 0 ; i < j ; i++ )
			{
				rs.next();
				str = rs.getString(1) +" "+ rs.getString(2);
				comboBox.addItem(str);
			}
			
			comboBox.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent arg0) {
		    	String st;
		    	st = String.valueOf(comboBox.getSelectedItem());
		    	textField_5.setText(st);
		    	}
		    });
			comboBox.setBounds(237, 110, 206, 21);
		    c.add(comboBox);
		
		

	    JLabel lblNewLabel_6 = new JLabel("New label");
        lblNewLabel_6.setForeground(Color.WHITE);
        lblNewLabel_6.setFont(new Font("Baskerville Old Face", Font.BOLD, 18));
        lblNewLabel_6.setBounds(265, 231, 154, 31);
        c.add(lblNewLabel_6);
	    
		JButton btnCheckAvailability = new JButton("Check Availability");
		btnCheckAvailability.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false","chandana","Jkma999*");
				
				String day = null,day1 = "",no="";
				day1 = String.valueOf(comboBox_1.getSelectedItem());
				System.out.println(day1);
				if(day1.compareTo("Monday")==0)
						{
								day = "mon";
								no = "monno";
						}
				if(day1.compareTo("Tuesday")==0)
				{
						day = "tue";
						no = "tueno";
				}
				if(day1.compareTo("Wednesday")==0)
				{
						day = "wed";
						no = "wedno";
				}
				if(day1.compareTo("Thursday")==0)
				{
						day = "thur";
						no = "thurno";
				}
				if(day1.compareTo("Friday")==0)
				{
						day = "fri";
						no = "frino";
				}
				if(day1.compareTo("Saturday")==0)
				{
						day = "sat";
						no = "satno";
				}
				if(day1.compareTo("Sunday")==0)
				{
						day = "sun";
						no = "sunno";
				}
				PreparedStatement ps  = mycon.prepareStatement("select "+ day +", " + no+ " from availability where firstname = ? and lastname = ?");
				String s12[] = String.valueOf(comboBox.getSelectedItem()).split(" ");
				//System.out.println(s12[0] + s12[1]);
				ps.setString(1, s12[0]);
				ps.setString(2, s12[1]);
				ResultSet rs = ps.executeQuery();
				rs.next();
				
				if(rs.getString(1).compareTo("Available")==0 && rs.getInt(2)<30)
				{
					lblNewLabel_6.setText("AVAILABLE");
				}
				else {
					if(rs.getInt(1)>=30)
					{
						 ps  = mycon.prepareStatement("update availability set max_count = 0 where firstname = ? and lastname = ?");
							//System.out.println(s12[0] + s12[1]);
							ps.setString(1, s12[0]);
							ps.setString(2, s12[1]);
							ps.executeUpdate();
							}
					lblNewLabel_6.setText("NOT AVAILABLE");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}}
		);
	        btnCheckAvailability.setFont(new Font("Baskerville Old Face", Font.BOLD, 16));
	        btnCheckAvailability.setBounds(23, 231, 197, 31);
	        c.add(btnCheckAvailability);
	        
	        JButton btnConfirm = new JButton("CONFIRM");
			btnConfirm.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
					if(lblNewLabel_6.getText().compareTo("AVAILABLE")==0)
					{
						String s12[] = String.valueOf(comboBox.getSelectedItem()).split(" ");
						Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false","chandana","Jkma999*");
						PreparedStatement ps  = mycon.prepareStatement("select max_count from availability where firstname = ? and lastname = ?");
						ps.setString(1, s12[0]);
						ps.setString(2, s12[1]);
						ResultSet rs = ps.executeQuery();
						rs.next();
						int f = rs.getInt(1);
						ps  = mycon.prepareStatement("update availability set max_count = ? where firstname = ? and lastname = ?");
						ps.setInt(1, f+1);
						ps.setString(2, s12[0]);
						ps.setString(3, s12[1]);
					JOptionPane.showMessageDialog(frame,
						    "Your appointment has been confirmed", "",JOptionPane.PLAIN_MESSAGE);
					}
					else
					{
						JOptionPane.showMessageDialog(frame,
							    "Your appointment has not been confirmed","",JOptionPane.ERROR_MESSAGE);
					}}
					catch(Exception e) {
						e.printStackTrace();
					}
				}
				
			});
			btnConfirm.setFont(new Font("Baskerville Old Face", Font.BOLD, 16));
			btnConfirm.setBounds(593, 291, 124, 40);
			c.add(btnConfirm);
	        
	        
	    tabbedPane.add("Book Appointment",c);
		c.setLayout(null);
		
		
		
		/**online payment **/
		
		d = new JPanel();
		JLabel label = new JLabel(name);
		label.setHorizontalAlignment(SwingConstants.TRAILING);
		label.setBackground(new Color(0, 0, 51));
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		label.setForeground(new Color(255, 255, 255));
		label.setBounds(649, 46, 144, 43);
		d.add(label);
		
		d.setBackground(new Color(0, 0, 51));
		JLabel lblOnlinePayment = new JLabel("Online Payment ");
		lblOnlinePayment.setBounds(16, 40, 225, 49);
		lblOnlinePayment.setBackground(new Color(0, 0, 51));
		lblOnlinePayment.setForeground(new Color(255, 255, 255));
		lblOnlinePayment.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		d.add(lblOnlinePayment);
		
		JLabel lblNewLabel11 = new JLabel("Total Payment :");
		lblNewLabel11.setBounds(16, 120, 144, 26);
		lblNewLabel11.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblNewLabel11.setBackground(new Color(0, 0, 51));
		lblNewLabel11.setForeground(new Color(255, 255, 255));
		d.add(lblNewLabel11);
		
		JLabel lblNewLabel_11 = new JLabel("Date of Payment :");
		lblNewLabel_11.setBounds(16, 177, 168, 26);
		lblNewLabel_11.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblNewLabel_11.setBackground(new Color(0, 0, 51));
		lblNewLabel_11.setForeground(new Color(255, 255, 255));
		d.add(lblNewLabel_11);
		
		JLabel lblNewLabel_21 = new JLabel("Name of the Bank:");
		lblNewLabel_21.setBounds(16, 237, 173, 26);
		lblNewLabel_21.setForeground(new Color(255, 255, 255));
		lblNewLabel_21.setBackground(new Color(0, 0, 51));
		lblNewLabel_21.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		d.add(lblNewLabel_21);
		
		JLabel lblCardNumber = new JLabel("Card Number :");
		lblCardNumber.setBounds(16, 306, 135, 26);
		lblCardNumber.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblCardNumber.setBackground(new Color(0, 0, 51));
		lblCardNumber.setForeground(new Color(255, 255, 255));
		d.add(lblCardNumber);
		
		JLabel lblValidUntil = new JLabel("Valid Until :");
		lblValidUntil.setBounds(16, 367, 110, 26);
		lblValidUntil.setBackground(new Color(0, 0, 51));
		lblValidUntil.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblValidUntil.setForeground(new Color(255, 255, 255));
		d.add(lblValidUntil);
		
		textField = new JTextField();
		textField.setBounds(203, 313, 276, 19);
		d.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(203, 374, 399, 19);
		d.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(203, 127, 246, 19);
		d.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(203, 184, 246, 19);
		d.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(202, 244, 247, 19);
		d.add(textField_4);
		textField_4.setColumns(10);
		tabbedPane.add("Pay Online",d);
		d.setLayout(null);
		
		
		JButton btnConfirmPayment = new JButton("Confirm Payment");
		btnConfirmPayment.setBounds(534, 435, 225, 29);
		btnConfirmPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					try {
					Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false","chandana","Jkma999*");
					PreparedStatement ps = mycon.prepareStatement("UPDATE patient SET payment = ? WHERE username = ?");
					ps.setInt(1, Integer.parseInt(textField_2.getText()));
					ps.setString(2, name);
					ps.executeUpdate();
					ps = mycon.prepareStatement("select name from patient where username= ?");
					ps.setString(1, name);
					ResultSet rs = ps.executeQuery();
					rs.next();
					ps = mycon.prepareStatement("INSERT INTO payment values (?,?,?)");
					ps.setString(1,rs.getString(1));
					ps.setFloat(2, Integer.parseInt(textField_2.getText()));
					ps.setString(3, textField_3.getText());
					JOptionPane.showMessageDialog(frame, "successful payment","", JOptionPane.PLAIN_MESSAGE);
					}catch(Exception e)
					{
						e.printStackTrace();
					}
				} 
			}
		);
		btnConfirmPayment.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		d.add(btnConfirmPayment);
		
		JPanel e = new JPanel();
		e.setBackground(new Color(0, 0, 51));
		JLabel lblNewLabel_111 = new JLabel("NOTIFICATIONS");
		lblNewLabel_111.setForeground(new Color(255, 255, 255));
		lblNewLabel_111.setFont(new Font("Baskerville Old Face", Font.BOLD, 24));
		lblNewLabel_111.setBounds(280, 35, 229, 30);
		e.add(lblNewLabel_111);
		
		TextArea textArea = new TextArea("", 0,0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		textArea.setFont(new Font("Baskerville Old Face", Font.BOLD, 14));
		textArea.setBounds(170, 94, 475, 350);
		e.add(textArea);
		mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false","chandana","Jkma999*");
		ps = mycon.prepareStatement("select notify from detail where details = 'note'");
		rs = ps.executeQuery();
		rs.next();
		textArea.setText(rs.getString(1));
		tabbedPane.add("Notifications",e);
		e.setLayout(null);
	}
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	} }

