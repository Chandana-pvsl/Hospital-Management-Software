package user1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Doctordetails1 {

	JFrame frame;
	JPanel a,b;
	private JLabel lblPersonalDetails;
	private JLabel lblSalaryPerMonth;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Doctordetails1 window = new Doctordetails1();
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
	public Doctordetails1(String name) {
		initialize(name);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String name) {
		frame = new JFrame();
		frame.setBounds(100, 100, 741, 576);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 724, 537);
		frame.getContentPane().add(tabbedPane);
		try {
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
		pane.setBounds(0, 5, 561, 486);
		pane.setViewportBorder(new LineBorder(Color.BLACK, 3));
		a.add(pane);
		Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false","chandana","Jkma999*");
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
		}catch(Exception e) {
			e.printStackTrace();
		}
		tabbedPane.add("View Roster",a);
		//a.setLayout(null);
		
		b= new JPanel();
		b.setBackground(new Color(0, 0, 51));
		tabbedPane.add("Personal details",b);
		b.setLayout(null);
		
		lblPersonalDetails = new JLabel("Personal Details");
		lblPersonalDetails.setBackground(new Color(0, 0, 51));
		lblPersonalDetails.setForeground(new Color(255, 255, 255));
		lblPersonalDetails.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		lblPersonalDetails.setBounds(26, 30, 215, 34);
		b.add(lblPersonalDetails);
		
		lblSalaryPerMonth = new JLabel("Salary :(for current month)");
		lblSalaryPerMonth.setBackground(new Color(0, 0, 51));
		lblSalaryPerMonth.setForeground(new Color(255, 255, 255));
		lblSalaryPerMonth.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblSalaryPerMonth.setBounds(22, 244, 234, 41);
		b.add(lblSalaryPerMonth);
		
		textField = new JTextField();
		textField.setFont(new Font("Baskerville Old Face", Font.BOLD, 14));
		textField.setBounds(254, 258, 321, 19);
		b.add(textField);
		textField.setColumns(10);
		try {
			Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false","chandana","Jkma999*");
			PreparedStatement ps = mycon.prepareStatement("select firstname, lastname,type from doctor where username = ?");
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			rs.next();
			String first,last;
			first = rs.getString(1);
			last = rs.getString(2);
			if(rs.getString("type").compareTo("Regular")==0)
			{
				ps = mycon.prepareStatement("select value from detail where details = 'reg_salary' ");
				rs = ps.executeQuery();
				rs.next();
				textField.setText(rs.getString(1));
			}
			else {
				ps = mycon.prepareStatement("select max_count from availability where firstname = ? and lastname = ?");
				ps.setString(1, first);
				ps.setString(2, last);
				rs = ps.executeQuery();
				rs.next();
				int k = rs.getInt(1);
				ps = mycon.prepareStatement("select patientcharge from details");
				rs = ps.executeQuery();
				rs.next();
				float l = rs.getInt(1);
				textField.setText(String.valueOf(k*l));
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		JLabel lblNoOfPatients = new JLabel("No. of patients treated :");
		lblNoOfPatients.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblNoOfPatients.setForeground(new Color(255, 255, 255));
		lblNoOfPatients.setBounds(22, 323, 234, 23);
		b.add(lblNoOfPatients);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Baskerville Old Face", Font.BOLD, 14));
		textField_2.setBounds(254, 328, 321, 19);
		b.add(textField_2);
		textField_2.setColumns(10);
		try {
			Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false","chandana","Jkma999*");
			PreparedStatement ps = mycon.prepareStatement("select firstname, lastname,type from doctor where username = ?");
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			rs.next();
			String first,last;
			first = rs.getString(1);
			last = rs.getString(2);
			ps =mycon.prepareStatement("select max_count from availability where firstname = ? and lastname = ?");
			ps.setString(1, first);
			ps.setString(2, last);
			rs = ps.executeQuery();
			rs.next();
			textField_2.setText(String.valueOf(rs.getInt(1)));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		JLabel lblNewLabel_1 = new JLabel("Qualification :");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(26, 123, 125, 23);
		b.add(lblNewLabel_1);
		
		JLabel lblSpecialization = new JLabel("Specialization :");
		lblSpecialization.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblSpecialization.setForeground(new Color(255, 255, 255));
		lblSpecialization.setBounds(26, 186, 125, 23);
		b.add(lblSpecialization);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Baskerville Old Face", Font.BOLD, 14));
		textField_3.setBounds(161, 128, 355, 19);
		b.add(textField_3);
		textField_3.setColumns(10);
		
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Baskerville Old Face", Font.BOLD, 14));
		textField_4.setBounds(164, 191, 349, 19);
		b.add(textField_4);
		textField_4.setColumns(10);
		try {
			float a,b,c;
			Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false","chandana","Jkma999*");
			Statement mys = mycon.createStatement();
			PreparedStatement ps = mycon.prepareStatement("select specification , qualification,type from doctor where username =  ?");
			ps.setString(1, name);
			ResultSet rs  = ps.executeQuery();
			rs.next();
			textField_3.setText(rs.getString("specification"));
			textField_4.setText(rs.getString("qualification"));
			
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Doctor2 d = new Doctor2();
				d.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnLogout.setForeground(new Color(0, 0, 0));
		btnLogout.setFont(new Font("Baskerville Old Face", Font.BOLD, 18));
		btnLogout.setBounds(528, 451, 131, 34);
		b.add(btnLogout);
		
		JPanel e = new JPanel();
		e.setBackground(new Color(0, 0, 51));
		JLabel lblNewLabel_11 = new JLabel("NOTIFICATIONS");
		lblNewLabel_11.setForeground(new Color(255, 255, 255));
		lblNewLabel_11.setFont(new Font("Baskerville Old Face", Font.BOLD, 24));
		lblNewLabel_11.setBounds(231, 37, 229, 30);
		e.add(lblNewLabel_11);
		
		TextArea textArea = new TextArea("", 0,0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		textArea.setFont(new Font("Baskerville Old Face", Font.BOLD, 14));
		textArea.setBounds(122, 95, 475, 350);
		e.add(textArea);
		try
		{
			Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false","chandana","Jkma999*");
			PreparedStatement ps = mycon.prepareStatement("select notify from detail where details = 'note'");
			ResultSet rs = ps.executeQuery();
			rs.next();
			textArea.setText(rs.getString(1));
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		tabbedPane.add("Notifications",e);
		e.setLayout(null);
		
	}
}
