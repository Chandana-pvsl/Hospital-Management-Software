package user1;
import java.awt.*;
import java.awt.EventQueue;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.border.CompoundBorder;
import java.awt.Component;

public class administration {

	JFrame frame;
	JPanel a,b,c;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					administration window = new administration();
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
	public administration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		frame.setBounds(100, 100, 590, 648);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		a = new JPanel();
		a.setBackground(new Color(0, 0, 51));
		b = new JPanel();
		b.setBackground(new Color(0, 0, 51));
		c = new JPanel();
		c.setBackground(new Color(0, 0, 51));
		
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 576, 609);
		frame.getContentPane().add(tabbedPane);
		
		/**salary management **/
		
		tabbedPane.add("Manage Salary",a);
		a.setLayout(null);
		
		JLabel lblSalaryManagement = new JLabel("Salary Management");
		lblSalaryManagement.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblSalaryManagement.setBackground(new Color(0, 0, 51));
		lblSalaryManagement.setForeground(new Color(255, 255, 255));
		lblSalaryManagement.setBounds(23, 36, 188, 23);
		a.add(lblSalaryManagement);
		
		JLabel lblBasicSalaryOf = new JLabel("Basic salary of regular doctors :");
		lblBasicSalaryOf.setBackground(new Color(0, 0, 51));
		lblBasicSalaryOf.setForeground(new Color(255, 255, 255));
		lblBasicSalaryOf.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblBasicSalaryOf.setBounds(23, 103, 265, 23);
		a.add(lblBasicSalaryOf);
		
		textField = new JTextField();
		textField.setBounds(298, 108, 121, 19);
		a.add(textField);
		textField.setColumns(10);
		
		JLabel lblBasicSalaryOf_1 = new JLabel("Charge for each patient treated by visiting doctors :");
		lblBasicSalaryOf_1.setBackground(new Color(0, 0, 51));
		lblBasicSalaryOf_1.setForeground(new Color(255, 255, 255));
		lblBasicSalaryOf_1.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblBasicSalaryOf_1.setBounds(23, 153, 436, 23);
		a.add(lblBasicSalaryOf_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(23, 204, 161, 19);
		a.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("Basic salary of staff :");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		label.setBackground(new Color(0, 0, 51));
		label.setBounds(23, 255, 193, 23);
		a.add(label);
		
		textField_2 = new JTextField();
		textField_2.setBounds(226, 260, 161, 19);
		a.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblStatistics = new JLabel("STATISTICS");
		lblStatistics.setForeground(Color.WHITE);
		lblStatistics.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblStatistics.setBackground(new Color(0, 0, 51));
		lblStatistics.setBounds(18, 324, 193, 23);
		a.add(lblStatistics);
		
		JLabel lblTotalIncomeOf = new JLabel("Monthly income of hospital :");
		lblTotalIncomeOf.setForeground(Color.WHITE);
		lblTotalIncomeOf.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblTotalIncomeOf.setBackground(new Color(0, 0, 51));
		lblTotalIncomeOf.setBounds(23, 432, 250, 23);
		a.add(lblTotalIncomeOf);
		
		textField_3 = new JTextField();
		try {
			Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false","chandana","Jkma999*");
			PreparedStatement ps = mycon.prepareStatement("select sum(payment) as total from patient ");
			ResultSet rs = ps.executeQuery();
			rs.next();
			textField_3.setText(String.valueOf(rs.getFloat(1)));
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		textField_3.setBounds(267, 437, 202, 19);
		a.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblTotalSalaryOutgo = new JLabel("Monthly salary outgo :");
		lblTotalSalaryOutgo.setForeground(Color.WHITE);
		lblTotalSalaryOutgo.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblTotalSalaryOutgo.setBackground(new Color(0, 0, 51));
		lblTotalSalaryOutgo.setBounds(23, 480, 188, 23);
		a.add(lblTotalSalaryOutgo);
		
		textField_4 = new JTextField();
		textField_4.setBounds(226, 485, 193, 19);
		a.add(textField_4);
		textField_4.setColumns(10);
		
		try {
			float a,b,c,d;
			Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false","chandana","Jkma999*");
			PreparedStatement ps1 = mycon.prepareStatement("select value from detail where details = 'staffno'");
			PreparedStatement ps2 = mycon.prepareStatement("select count(*) from doctor where type = 'regular'");
			PreparedStatement ps3 = mycon.prepareStatement("select value from detail where details = 'reg_salary' ");
			PreparedStatement ps = mycon.prepareStatement("select value from detail where details = 'staffsalary' ");
			ResultSet rs = ps2.executeQuery();
			rs.next();
			c = rs.getFloat(1);
			rs = ps3.executeQuery();
			rs.next();
			b = rs.getFloat(1);
			rs = ps1.executeQuery();
			rs.next();
			a = Float.parseFloat(rs.getString(1));
			rs = ps.executeQuery();
			rs.next();
			d = Float.parseFloat(rs.getString(1));
			ps = mycon.prepareStatement("select sum(max_count) as total from availability");
			rs = ps.executeQuery();
			rs.next();
			int k = rs.getInt(1);
			ps = mycon.prepareStatement("select patientcharge from details");
			rs = ps.executeQuery();
			rs.next();
			float l = rs.getInt(1);
			textField_4.setText(String.valueOf(b*c+d*a+l*k));

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false","chandana","Jkma999*");
					Statement mys = mycon.createStatement();
					PreparedStatement ps = mycon.prepareStatement("update detail set value = ? where details = 'patientcharge' ");
					ps.setFloat(1, Float.parseFloat(textField_1.getText()));
					ps.executeUpdate();
					float a,b,c,d;
					PreparedStatement ps1 = mycon.prepareStatement("select value from detail where details = 'staffno'");
					PreparedStatement ps2 = mycon.prepareStatement("select count(*) from doctor where type = 'regular'");
					PreparedStatement ps3 = mycon.prepareStatement("select value from detail where details = 'reg_salary' ");
					ps = mycon.prepareStatement("select value from detail where details = 'staffsalary' ");
					ResultSet rs = ps2.executeQuery();
					rs.next();
					c = rs.getFloat(1);
					rs = ps3.executeQuery();
					rs.next();
					b = rs.getFloat(1);
					rs = ps1.executeQuery();
					rs.next();
					a = Float.parseFloat(rs.getString(1));
					rs = ps.executeQuery();
					rs.next();
					d = Float.parseFloat(rs.getString(1));
					ps = mycon.prepareStatement("select sum(max_count) as total from availability");
					rs = ps.executeQuery();
					rs.next();
					int k = rs.getInt(1);
					ps = mycon.prepareStatement("select patientcharge from details");
					rs = ps.executeQuery();
					rs.next();
					float l = rs.getInt(1);
					textField_4.setText(String.valueOf(b*c+d*a+l*k));
					JOptionPane.showMessageDialog(frame, "updates successfull","",JOptionPane.PLAIN_MESSAGE);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		btnUpdate.setFont(new Font("Baskerville Old Face", Font.BOLD, 14));
		btnUpdate.setBounds(434, 202, 113, 23);
		a.add(btnUpdate);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				administration2 a = new administration2();
				a.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnLogout.setFont(new Font("Baskerville Old Face", Font.BOLD, 18));
		btnLogout.setBounds(402, 524, 127, 33);
		a.add(btnLogout);
		
		JButton button_1 = new JButton("UPDATE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					float a,b,c;
					Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false","chandana","Jkma999*");
					Statement mys = mycon.createStatement();
					PreparedStatement ps = mycon.prepareStatement("update detail set value = ? where details = 'staffsalary' ");
					PreparedStatement ps1 = mycon.prepareStatement("select value from detail where details = 'staffno'");
					PreparedStatement ps2 = mycon.prepareStatement("select count(*) from doctor where type = 'regular'");
					PreparedStatement ps3 = mycon.prepareStatement("select value from detail where details = 'reg_salary' ");
					ResultSet rs = ps2.executeQuery();
					rs.next();
					c = rs.getFloat(1);
					rs = ps3.executeQuery();
					rs.next();
					b = rs.getFloat(1);
					ps.setFloat(1, Float.parseFloat(textField_2.getText()));
					ps.executeUpdate();
					rs = ps1.executeQuery();
					rs.next();
					a = Float.parseFloat(rs.getString(1));
					ps = mycon.prepareStatement("select sum(max_count) as total from availability");
					rs = ps.executeQuery();
					rs.next();
					int k = rs.getInt(1);
					ps = mycon.prepareStatement("select patientcharge from details");
					rs = ps.executeQuery();
					rs.next();
					float l = rs.getInt(1);
					textField_4.setText(String.valueOf(b*c+Float.parseFloat(textField_2.getText())*a+l*k));
					JOptionPane.showMessageDialog(frame, "updates successfull","",JOptionPane.PLAIN_MESSAGE);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		button_1.setFont(new Font("Baskerville Old Face", Font.BOLD, 14));
		button_1.setBounds(434, 258, 113, 23);
		a.add(button_1);
		
		JButton button_2 = new JButton("UPDATE");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					float a,b,c;
					Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false","chandana","Jkma999*");
					Statement mys = mycon.createStatement();
					PreparedStatement ps = mycon.prepareStatement("update detail set value = ? where details = 'reg_salary'");
					ps.setFloat(1, Float.parseFloat(textField.getText()));
					ps.executeUpdate();
					PreparedStatement ps1 = mycon.prepareStatement("select value from detail where details = 'staffno'");
					PreparedStatement ps2 = mycon.prepareStatement("select count(*) from doctor where type = 'regular'");
					PreparedStatement ps3 = mycon.prepareStatement("select value from detail where details = 'staffsalary' ");
					ResultSet rs = ps2.executeQuery();
					rs.next();
					c = rs.getFloat(1);
					
					rs = ps3.executeQuery();
					rs.next();
					b = rs.getFloat(1);
					
					rs = ps1.executeQuery();
					rs.next();
					a = rs.getFloat(1);
					
					ps = mycon.prepareStatement("select sum(max_count) as total from availability");
					rs = ps.executeQuery();
					rs.next();
					int k = rs.getInt(1);
					ps = mycon.prepareStatement("select patientcharge from details");
					rs = ps.executeQuery();
					rs.next();
					float l = rs.getFloat(1);
					
					textField_4.setText(String.valueOf(b*a+Float.parseFloat(textField.getText())*c+l*k));
					
					
					JOptionPane.showMessageDialog(frame, "updates successfull","",JOptionPane.PLAIN_MESSAGE);
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		button_2.setFont(new Font("Baskerville Old Face", Font.BOLD, 14));
		button_2.setBounds(434, 107, 113, 23);
		a.add(button_2);
		
		JLabel lblTotalNoOf = new JLabel("Total no. of staff:");
		lblTotalNoOf.setForeground(Color.WHITE);
		lblTotalNoOf.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblTotalNoOf.setBackground(new Color(0, 0, 51));
		lblTotalNoOf.setBounds(23, 378, 193, 23);
		a.add(lblTotalNoOf);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(203, 383, 202, 19);
		a.add(textField_6);
		
		JButton button_3 = new JButton("UPDATE");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					float a,b,c;
					Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false","chandana","Jkma999*");
					Statement mys = mycon.createStatement();
					PreparedStatement ps = mycon.prepareStatement("update detail set value = ? where details = 'staffno'");
					PreparedStatement ps1 = mycon.prepareStatement("select value from detail where details = 'staffsalary' ");
					PreparedStatement ps2 = mycon.prepareStatement("select count(*) from doctor where type = 'regular'");
					PreparedStatement ps3 = mycon.prepareStatement("select value from detail where details = 'reg_salary' ");
					ResultSet rs = ps2.executeQuery();
					rs.next();
					c = rs.getFloat(1);
					rs = ps3.executeQuery();
					rs.next();
					b = rs.getFloat(1);
					ps2 = mycon.prepareStatement("update doctor set salary = ? where type = 'regular'");
					ps2.setFloat(1, b*c);
					ps2.executeUpdate();
					ps.setFloat(1, Float.parseFloat(textField_6.getText()));
					ps.executeUpdate();
					rs = ps1.executeQuery();
					rs.next();
					a = Float.parseFloat(rs.getString(1));
					ps = mycon.prepareStatement("select sum(max_count) as total from availability");
					rs = ps.executeQuery();
					rs.next();
					int k = rs.getInt(1);
					ps = mycon.prepareStatement("select patientcharge from details");
					rs = ps.executeQuery();
					rs.next();
					float l = rs.getInt(1);
					textField_4.setText(String.valueOf(c*b+Float.parseFloat(textField_6.getText())*a+l*k));
					JOptionPane.showMessageDialog(frame, "updates successfull","",JOptionPane.PLAIN_MESSAGE);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		button_3.setFont(new Font("Baskerville Old Face", Font.BOLD, 14));
		button_3.setBounds(434, 382, 113, 23);
		a.add(button_3);
		
		/**routine management**/
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
		b.setLayout(null);
	   // table.getColumnModel().getColumn(1).setCellRenderer(renderer);
	    //table.getColumnModel().getColumn(2).setCellRenderer(renderer);
	    //table.getColumnModel().getColumn(3).setCellRenderer(renderer);
		table.setShowGrid(true);
		JScrollPane pane = new JScrollPane(table);
		pane.setBounds(0, 5, 561, 486);
		pane.setViewportBorder(new LineBorder(Color.BLACK, 3));
		try {
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
			b.add(pane);
		tabbedPane.add("Update Roster",b);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		JButton btnUpdate_1 = new JButton("UPDATE");
		btnUpdate_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false","chandana","Jkma999*");
					String[] s = String.valueOf(table.getModel().getValueAt(0,1)).split(" ");
					PreparedStatement ps;
					for( int i = 0 ; i < s.length/3 ; i++)
					{
						ps  = mycon.prepareStatement("update availability set sun = 'Available' where firstname = ? and lastname = ?");
						ps.setString(1,s[i*3]);
						ps.setString(2, s[i*3+1]);
						ps.executeUpdate();
					}
					ps = mycon.prepareStatement("update schedule set col1 = ? where day = 'sunday'");
					ps.setString(1,String.valueOf(table.getModel().getValueAt(0,1)) );
					ps.executeUpdate();
					
					s = String.valueOf(table.getModel().getValueAt(0,2)).split(" ");
					for( int i = 0 ; i < s.length/3 ; i++)
					{
						ps  = mycon.prepareStatement("update availability set sun = 'Available' where firstname = ? and lastname = ?");
						ps.setString(1,s[i*3]);
						ps.setString(2, s[i*3+1]);
						ps.executeUpdate();
						
					}
					ps  = mycon.prepareStatement("update schedule set col2 = ? where day = 'sunday'");
					ps.setString(1,String.valueOf(table.getModel().getValueAt(0,2)) );
					ps.executeUpdate();
					
					s = String.valueOf(table.getModel().getValueAt(0,3)).split(" ");
					for( int i = 0 ; i < s.length/3 ; i++)
					{
						ps  = mycon.prepareStatement("update availability set sun = 'Available' where firstname = ? and lastname = ?");
						ps.setString(1,s[i*3]);
						ps.setString(2, s[i*3+1]);
						ps.executeUpdate();
					}
					ps  = mycon.prepareStatement("update schedule set col3 = ? where day = 'sunday'");
					ps.setString(1,String.valueOf(table.getModel().getValueAt(0,3)));
					ps.executeUpdate();
					
					s = String.valueOf(table.getModel().getValueAt(1,1)).split(" ");
					for( int i = 0 ; i < s.length/3 ; i++)
					{
						ps  = mycon.prepareStatement("update availability set mon = 'Available' where firstname = ? and lastname = ?");
						ps.setString(1,s[i*3]);
						ps.setString(2, s[i*3+1]);
						ps.executeUpdate();
					}
					ps  = mycon.prepareStatement("update schedule set col1 = ? where day = 'monday'");
					ps.setString(1,String.valueOf(table.getModel().getValueAt(1,1)) );
					ps.executeUpdate();
					s = String.valueOf(table.getModel().getValueAt(1,2)).split(" ");
					for( int i = 0 ; i < s.length/3 ; i++)
					{
						ps  = mycon.prepareStatement("update availability set mon = 'Available' where firstname = ? and lastname = ?");
						ps.setString(1,s[i*3]);
						ps.setString(2, s[i*3+1]);
						ps.executeUpdate();
					}
					ps  = mycon.prepareStatement("update schedule set col2 = ? where day = 'monday'");
					ps.setString(1,String.valueOf(table.getModel().getValueAt(1,2)));
					ps.executeUpdate();
					
					s = String.valueOf(table.getModel().getValueAt(1,3)).split(" ");
					for( int i = 0 ; i < s.length/3 ; i++)
					{
						ps  = mycon.prepareStatement("update availability set mon = 'Available' where firstname = ? and lastname = ?");
						ps.setString(1,s[i*3]);
						ps.setString(2, s[i*3+1]);
						ps.executeUpdate();
					}
					ps  = mycon.prepareStatement("update schedule set col3 = ? where day = 'monday'");
					ps.setString(1,String.valueOf(table.getModel().getValueAt(1,3)));
					ps.executeUpdate();
					
					s = String.valueOf(table.getModel().getValueAt(2,1)).split(" ");
					for( int i = 0 ; i < s.length/3 ; i++)
					{
						ps  = mycon.prepareStatement("update availability set tue = 'Available' where firstname = ? and lastname = ?");
						ps.setString(1,s[i*3]);
						ps.setString(2, s[i*3+1]);
						ps.executeUpdate();
					}
					ps  = mycon.prepareStatement("update schedule set col1 = ? where day = 'tuesday'");
					ps.setString(1,String.valueOf(table.getModel().getValueAt(2,1)));
					ps.executeUpdate();
					s = String.valueOf(table.getModel().getValueAt(2,2)).split(" ");
					for( int i = 0 ; i < s.length/3 ; i++)
					{
						ps  = mycon.prepareStatement("update availability set tue = 'Available' where firstname = ? and lastname = ?");
						ps.setString(1,s[i*3]);
						ps.setString(2, s[i*3+1]);
						ps.executeUpdate();
					}
					ps  = mycon.prepareStatement("update schedule set col2 = ? where day = 'tuesday'");
					ps.setString(1,String.valueOf(table.getModel().getValueAt(2,2)));
					ps.executeUpdate();
					
					s = String.valueOf(table.getModel().getValueAt(2,3)).split(" ");
					for( int i = 0 ; i < s.length/3 ; i++)
					{
						ps  = mycon.prepareStatement("update availability set tue = 'Available' where firstname = ? and lastname = ?");
						ps.setString(1,s[i*3]);
						ps.setString(2, s[i*3+1]);
						ps.executeUpdate();
					}
					ps  = mycon.prepareStatement("update schedule set col3 = ? where day = 'tuesday'");
					ps.setString(1,String.valueOf(table.getModel().getValueAt(2,3)));
					ps.executeUpdate();
					
					s = String.valueOf(table.getModel().getValueAt(3,1)).split(" ");
					for( int i = 0 ; i < s.length/3 ; i++)
					{
						ps  = mycon.prepareStatement("update availability set wed = 'Available' where firstname = ? and lastname = ?");
						ps.setString(1,s[i*3]);
						ps.setString(2, s[i*3+1]);
						ps.executeUpdate();
					}
					ps  = mycon.prepareStatement("update schedule set col1 = ? where day = 'wednesday'");
					ps.setString(1,String.valueOf(table.getModel().getValueAt(3,1)));
					ps.executeUpdate();
					
					s = String.valueOf(table.getModel().getValueAt(3,2)).split(" ");
					for( int i = 0 ; i < s.length/3 ; i++)
					{
						ps  = mycon.prepareStatement("update availability set wed = 'Available' where firstname = ? and lastname = ?");
						ps.setString(1,s[i*3]);
						ps.setString(2, s[i*3+1]);
						ps.executeUpdate();
					}
					ps  = mycon.prepareStatement("update schedule set col2 = ? where day = 'wednesday'");
					ps.setString(1,String.valueOf(table.getModel().getValueAt(3,2)));
					ps.executeUpdate();
					
					s = String.valueOf(table.getModel().getValueAt(3,3)).split(" ");
					for( int i = 0 ; i < s.length/3 ; i++)
					{
						ps  = mycon.prepareStatement("update availability set wed = 'Available' where firstname = ? and lastname = ?");
						ps.setString(1,s[i*3]);
						ps.setString(2, s[i*3+1]);
						ps.executeUpdate();
					}
					ps  = mycon.prepareStatement("update schedule set col3 = ? where day = 'wednesday'");
					ps.setString(1,String.valueOf(table.getModel().getValueAt(3,3)));
					ps.executeUpdate();
					
					s = String.valueOf(table.getModel().getValueAt(4,1)).split(" ");
					for( int i = 0 ; i < s.length/3 ; i++)
					{
						ps  = mycon.prepareStatement("update availability set thur = 'Available' where firstname = ? and lastname = ?");
						ps.setString(1,s[i*3]);
						ps.setString(2, s[i*3+1]);
						ps.executeUpdate();
					}
					ps  = mycon.prepareStatement("update schedule set col1 = ? where day = 'thursday'");
					ps.setString(1,String.valueOf(table.getModel().getValueAt(4,1)));
					ps.executeUpdate();
					
					s = String.valueOf(table.getModel().getValueAt(4,2)).split(" ");
					for( int i = 0 ; i < s.length/3 ; i++)
					{
						ps  = mycon.prepareStatement("update availability set thur = 'Available' where firstname = ? and lastname = ?");
						ps.setString(1,s[i*3]);
						ps.setString(2, s[i*3+1]);
						ps.executeUpdate();
					}
					ps  = mycon.prepareStatement("update schedule set col2 = ? where day = 'thursday'");
					ps.setString(1,String.valueOf(table.getModel().getValueAt(4,2)));
					ps.executeUpdate();
					
					s = String.valueOf(table.getModel().getValueAt(4,3)).split(" ");
					for( int i = 0 ; i < s.length/3 ; i++)
					{
						ps  = mycon.prepareStatement("update availability set thur = 'Available' where firstname = ? and lastname = ?");
						ps.setString(1,s[i*3]);
						ps.setString(2, s[i*3+1]);
						ps.executeUpdate();
					}
					ps  = mycon.prepareStatement("update schedule set col3 = ? where day = 'thursday'");
					ps.setString(1,String.valueOf(table.getModel().getValueAt(4,3)));
					ps.executeUpdate();
					
					s = String.valueOf(table.getModel().getValueAt(5,1)).split(" ");
					for( int i = 0 ; i < s.length/3 ; i++)
					{
						ps  = mycon.prepareStatement("update availability set fri = 'Available' where firstname = ? and lastname = ?");
						ps.setString(1,s[i*3]);
						ps.setString(2, s[i*3+1]);
						ps.executeUpdate();
					}
					ps  = mycon.prepareStatement("update schedule set col1 = ? where day = 'friday'");
					ps.setString(1,String.valueOf(table.getModel().getValueAt(5,1)));
					ps.executeUpdate();
					
					s = String.valueOf(table.getModel().getValueAt(5,2)).split(" ");
					for( int i = 0 ; i < s.length/3 ; i++)
					{
						ps  = mycon.prepareStatement("update availability set fri = 'Available' where firstname = ? and lastname = ?");
						ps.setString(1,s[i*3]);
						ps.setString(2, s[i*3+1]);
						ps.executeUpdate();
					}
					ps  = mycon.prepareStatement("update schedule set col2 = ? where day = 'friday'");
					ps.setString(1,String.valueOf(table.getModel().getValueAt(5,2)));
					ps.executeUpdate();
					
					s = String.valueOf(table.getModel().getValueAt(5,3)).split(" ");
					for( int i = 0 ; i < s.length/3 ; i++)
					{
						ps  = mycon.prepareStatement("update availability set fri = 'Available' where firstname = ? and lastname = ?");
						ps.setString(1,s[i*3]);
						ps.setString(2, s[i*3+1]);
						ps.executeUpdate();
					}
					ps  = mycon.prepareStatement("update schedule set col3 = ? where day = 'friday'");
					ps.setString(1,String.valueOf(table.getModel().getValueAt(5,3)));
					ps.executeUpdate();
					
					s = String.valueOf(table.getModel().getValueAt(6,1)).split(" ");
					for( int i = 0 ; i < s.length/3 ; i++)
					{
						ps  = mycon.prepareStatement("update availability set sat = 'Available' where firstname = ? and lastname = ?");
						ps.setString(1,s[i*3]);
						ps.setString(2, s[i*3+1]);
						ps.executeUpdate();
					}
					ps  = mycon.prepareStatement("update schedule set col1 = ? where day = 'saturday'");
					ps.setString(1,String.valueOf(table.getModel().getValueAt(6,1)));
					ps.executeUpdate();
					
					s = String.valueOf(table.getModel().getValueAt(6,2)).split(" ");
					for( int i = 0 ; i < s.length/3 ; i++)
					{
						ps  = mycon.prepareStatement("update availability set sat = 'Available' where firstname = ? and lastname = ?");
						ps.setString(1,s[i*3]);
						ps.setString(2, s[i*3+1]);
						ps.executeUpdate();
					}
					ps  = mycon.prepareStatement("update schedule set col2 = ? where day = 'saturday'");
					ps.setString(1,String.valueOf(table.getModel().getValueAt(6,2)));
					ps.executeUpdate();
					
					s = String.valueOf(table.getModel().getValueAt(6,3)).split(" ");
					for( int i = 0 ; i < s.length/3 ; i++)
					{
						ps  = mycon.prepareStatement("update availability set sat = 'Available' where firstname = ? and lastname = ?");
						ps.setString(1,s[i*3]);
						ps.setString(2, s[i*3+1]);
						ps.executeUpdate();
					}
					ps  = mycon.prepareStatement("update schedule set col3 = ? where day = 'saturday'");
					ps.setString(1,String.valueOf(table.getModel().getValueAt(6,3)) );
					ps.executeUpdate();
					JOptionPane.showMessageDialog(frame, "updates successfully","",JOptionPane.PLAIN_MESSAGE);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnUpdate_1.setFont(new Font("Baskerville Old Face", Font.BOLD, 16));
		btnUpdate_1.setBounds(428, 529, 117, 32);
		b.add(btnUpdate_1);
		
		/**managing staff**/
		tabbedPane.add("Manage Staff",c);
		c.setLayout(null);
		
		JLabel lblManageStaff = new JLabel("Manage Staff ");
		lblManageStaff.setBackground(new Color(0, 0, 51));
		lblManageStaff.setForeground(new Color(255, 255, 255));
		lblManageStaff.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
		lblManageStaff.setBounds(24, 44, 166, 27);
		c.add(lblManageStaff);
		
		JLabel lblRemoveDoctor = new JLabel("Doctor username :");
		lblRemoveDoctor.setBackground(new Color(0, 0, 51));
		lblRemoveDoctor.setForeground(new Color(255, 255, 255));
		lblRemoveDoctor.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblRemoveDoctor.setBounds(24, 207, 166, 23);
		c.add(lblRemoveDoctor);
		
		textField_5 = new JTextField();
		textField_5.setBounds(194, 212, 208, 19);
		c.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblAddDoctor = new JLabel("Remove Doctor :");
		lblAddDoctor.setForeground(Color.WHITE);
		lblAddDoctor.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblAddDoctor.setBackground(new Color(0, 0, 51));
		lblAddDoctor.setBounds(24, 136, 166, 23);
		c.add(lblAddDoctor);
		
		JRadioButton rdbtnRegular = new JRadioButton("Regular");
		rdbtnRegular.setBackground(new Color(255, 255, 255));
		rdbtnRegular.setForeground(new Color(0, 0, 51));
		rdbtnRegular.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		rdbtnRegular.setBounds(173, 140, 103, 27);
		c.add(rdbtnRegular);
		
		JRadioButton rdbtnVisiting = new JRadioButton("Visiting");
		rdbtnVisiting.setBackground(new Color(255, 255, 255));
		rdbtnVisiting.setForeground(new Color(0, 0, 51));
		rdbtnVisiting.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		rdbtnVisiting.setBounds(337, 140, 95, 27);
		c.add(rdbtnVisiting);
		
		ButtonGroup grp1 = new ButtonGroup();
		grp1.add(rdbtnVisiting);
		grp1.add(rdbtnRegular);
		
		JLabel lblStatistics_1 = new JLabel("STATISTICS");
		lblStatistics_1.setForeground(Color.WHITE);
		lblStatistics_1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblStatistics_1.setBackground(new Color(0, 0, 51));
		lblStatistics_1.setBounds(10, 319, 137, 23);
		c.add(lblStatistics_1);
		
		JLabel lblToatlNumberOf = new JLabel("Total number of patients visited the hospital :");
		lblToatlNumberOf.setForeground(Color.WHITE);
		lblToatlNumberOf.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblToatlNumberOf.setBackground(new Color(0, 0, 51));
		lblToatlNumberOf.setBounds(10, 434, 374, 23);
		c.add(lblToatlNumberOf);
		
		textField_7 = new JTextField();
		textField_7.setBounds(10, 481, 151, 19);
		c.add(textField_7);
		textField_7.setColumns(10);
		try {
			Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false","chandana","Jkma999*");
			PreparedStatement ps  = mycon.prepareStatement("select sum(max_count) as total from availability");
			ResultSet rs = ps.executeQuery();
			rs.next();
			textField_7.setText(String.valueOf(rs.getString(1)));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		JLabel lblTimePeriod = new JLabel("Time period :");
		lblTimePeriod.setForeground(Color.WHITE);
		lblTimePeriod.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblTimePeriod.setBackground(new Color(0, 0, 51));
		lblTimePeriod.setBounds(10, 380, 166, 23);
		c.add(lblTimePeriod);
		
		JRadioButton rdbtnMonth = new JRadioButton("1 month");
		rdbtnMonth.setForeground(new Color(0, 0, 51));
		rdbtnMonth.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		rdbtnMonth.setBackground(Color.WHITE);
		rdbtnMonth.setBounds(173, 378, 103, 27);
		c.add(rdbtnMonth);
		
		JRadioButton rdbtnMonths = new JRadioButton("6 months");
		rdbtnMonths.setForeground(new Color(0, 0, 51));
		rdbtnMonths.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		rdbtnMonths.setBackground(Color.WHITE);
		rdbtnMonths.setBounds(299, 378, 103, 27);
		c.add(rdbtnMonths);
		
		JRadioButton rdbtnYear = new JRadioButton("1 year");
		rdbtnYear.setForeground(new Color(0, 0, 51));
		rdbtnYear.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		rdbtnYear.setBackground(Color.WHITE);
		rdbtnYear.setBounds(423, 378, 103, 27);
		c.add(rdbtnYear);
		
		ButtonGroup grp = new ButtonGroup();
		grp.add(rdbtnMonth);
		grp.add(rdbtnMonths);
		grp.add(rdbtnYear);
		
		JButton button = new JButton("UPDATE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false","chandana","Jkma999*");
					Statement mys = mycon.createStatement();
					String username = textField_5.getText();
					PreparedStatement ps3 = mycon.prepareStatement("SELECT * from doctor WHERE username = ?");
					ps3.setString(1, username);
					ResultSet rs1 = ps3.executeQuery();
					if(rs1.next()==false)
					{
						JOptionPane.showMessageDialog(frame, "Doctor with such username doesn,t exist, check again",null, JOptionPane.ERROR_MESSAGE);
					}
					else {
					String type;
					if(rdbtnVisiting.isSelected()==true)
					 {
						 type = "Visiting";
					 }
					 else
					 {
						 type = "Regular";
					 }
					PreparedStatement ps2 = mycon.prepareStatement("DELETE FROM doctor WHERE username = ? AND type= ?" );
					ps2.setString(1, username);
					ps2.setString(2, type);
					ps2.executeUpdate();
					JOptionPane.showMessageDialog(frame, "doctor " +username+" deleted",null, JOptionPane.PLAIN_MESSAGE);
					}
					} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		button.setFont(new Font("Baskerville Old Face", Font.BOLD, 18));
		button.setBounds(404, 266, 127, 33);
		c.add(button);
		
		try {
			float a,b,c,d;
			Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false","chandana","Jkma999*");
			Statement mys = mycon.createStatement();
			PreparedStatement ps = mycon.prepareStatement("select count(*) from doctor where type = 'regular'");
			PreparedStatement ps1 = mycon.prepareStatement("select value from detail where details = 'reg_salary' ");
			ResultSet rs = ps.executeQuery();
			rs.next();
			a = rs.getFloat(1);
			rs = ps1.executeQuery();
			rs.next();
			b = rs.getFloat(1);
			PreparedStatement ps2 = mycon.prepareStatement("select value from detail where details = 'staffno'");
			PreparedStatement ps3 = mycon.prepareStatement("select value from detail where details = 'staffsalary'");
			rs = ps2.executeQuery();
			rs.next();
			c = rs.getFloat(1);
			rs = ps3.executeQuery();
			rs.next();
			d = rs.getFloat(1);
			textField_4.setText(String.valueOf(a*b+c*d));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		JButton btnLogout_1 = new JButton("LOGOUT");
		btnLogout_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				administration2 a = new administration2();
				a.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnLogout_1.setFont(new Font("Baskerville Old Face", Font.BOLD, 18));
		btnLogout_1.setBounds(404, 515, 127, 33);
		c.add(btnLogout_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 51));
		tabbedPane.addTab("Manage Drugs", panel);
		panel.setLayout(null);
		
		JLabel lblDrugName = new JLabel("Drug name:");
		lblDrugName.setForeground(Color.WHITE);
		lblDrugName.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblDrugName.setBackground(new Color(0, 0, 51));
		lblDrugName.setBounds(29, 94, 166, 23);
		panel.add(lblDrugName);
		
		textField_8 = new JTextField();
		textField_8.setBounds(144, 99, 210, 19);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblDecreaseByNumber = new JLabel("Decrease by number:");
		lblDecreaseByNumber.setForeground(Color.WHITE);
		lblDecreaseByNumber.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblDecreaseByNumber.setBackground(new Color(0, 0, 51));
		lblDecreaseByNumber.setBounds(29, 153, 166, 23);
		panel.add(lblDecreaseByNumber);
		
		JLabel lblIecreaseByNumber = new JLabel("Iecrease by number:");
		lblIecreaseByNumber.setForeground(Color.WHITE);
		lblIecreaseByNumber.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblIecreaseByNumber.setBackground(new Color(0, 0, 51));
		lblIecreaseByNumber.setBounds(29, 215, 166, 23);
		panel.add(lblIecreaseByNumber);
		
		textField_9 = new JTextField();
		textField_9.setBounds(205, 158, 96, 19);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(218, 220, 96, 19);
		panel.add(textField_10);
		
		JLabel lblChangePrice = new JLabel("Change price :");
		lblChangePrice.setForeground(Color.WHITE);
		lblChangePrice.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblChangePrice.setBackground(new Color(0, 0, 51));
		lblChangePrice.setBounds(29, 269, 166, 23);
		panel.add(lblChangePrice);
		
		textField_11 = new JTextField();
		textField_11.setBounds(157, 274, 96, 19);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblDrugManagement = new JLabel("DRUG MANAGEMENT");
		lblDrugManagement.setForeground(Color.WHITE);
		lblDrugManagement.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblDrugManagement.setBackground(new Color(0, 0, 51));
		lblDrugManagement.setBounds(29, 32, 246, 23);
		panel.add(lblDrugManagement);
		
		JLabel lblAvailablilty = new JLabel("Availablilty:");
		lblAvailablilty.setForeground(Color.WHITE);
		lblAvailablilty.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblAvailablilty.setBackground(new Color(0, 0, 51));
		lblAvailablilty.setBounds(29, 333, 110, 23);
		panel.add(lblAvailablilty);
		
		JLabel lblNewLabel = new JLabel("New label");
		
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.BOLD, 16));
		lblNewLabel.setBounds(144, 333, 170, 21);
		panel.add(lblNewLabel);
		
		JButton btnUpdate_2 = new JButton("UPDATE");
		btnUpdate_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false","chandana","Jkma999*");
					//Statement mys = mycon.createStatement();
					PreparedStatement ps = mycon.prepareStatement("select count(*) from drugs where name = ?");
					ps.setString(1, textField_8.getText());
					ResultSet rs = ps.executeQuery();
					rs.next();
					int i = rs.getInt(1);
					if(i == 0)
					{
						JOptionPane.showMessageDialog(frame, "drug not present","",JOptionPane.WARNING_MESSAGE);
						 //ps = mycon.prepareStatement("insert into drugs values (?,?)"); 
					}
					else
					{
						ps = mycon.prepareStatement("select * from drugs where name = ?");
						ps.setString(1,textField_8.getText() );
						rs = ps.executeQuery();
						rs.next();
						int k = rs.getInt("quantity");
						int p = Integer.parseInt(textField_9.getText());
						if(p>k)
						{
							JOptionPane.showMessageDialog(frame, "quantity not sufficent " + k + " are present" ,"",JOptionPane.WARNING_MESSAGE);
						}
						else
						{
							ps = mycon.prepareStatement("update drugs set quantity = ? where name = ?");
							ps.setString(2,textField_8.getText() );
							ps.setInt(1,k-p);
							JOptionPane.showMessageDialog(frame, "updates successfull","",JOptionPane.PLAIN_MESSAGE);
						}
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		btnUpdate_2.setFont(new Font("Baskerville Old Face", Font.BOLD, 14));
		btnUpdate_2.setBounds(413, 157, 123, 30);
		panel.add(btnUpdate_2);
		
		JButton button_4 = new JButton("UPDATE");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false","chandana","Jkma999*");
					//Statement mys = mycon.createStatement();
					PreparedStatement ps = mycon.prepareStatement("select count(*) from drugs where name = ?");
					ps.setString(1, textField_8.getText());
					ResultSet rs = ps.executeQuery();
					rs.next();
					int i = rs.getInt(1);
					if(i == 0)
					{
						//JOptionPane.showMessageDialog(frame, "drug not present","",JOptionPane.WARNING_MESaddActionListener(new ActionListener() {
						 ps = mycon.prepareStatement("insert into drugs (name,quantity) values (?,?)"); 
						 ps.setString(1,textField_8.getText() );
						 ps.setInt(2,Integer.parseInt(textField_10.getText()));
						 ps.executeUpdate();
							
					}
					else
					{
						ps = mycon.prepareStatement("select quantity from drugs where name = ?");
						ps.setString(1,textField_8.getText() );
						rs = ps.executeQuery();
						rs.next();
						int k = rs.getInt("quantity");
						int p = Integer.parseInt(textField_10.getText());
						ps = mycon.prepareStatement("update drugs set quantity = ? where name = ?");
						ps.setString(2,textField_8.getText() );
						ps.setInt(1,k+p);
						ps.executeUpdate();
						JOptionPane.showMessageDialog(frame, "updates successfull","",JOptionPane.PLAIN_MESSAGE);
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		button_4.setFont(new Font("Baskerville Old Face", Font.BOLD, 14));
		button_4.setBounds(413, 214, 123, 30);
		panel.add(button_4);
		
		JButton button_5 = new JButton("UPDATE");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false","chandana","Jkma999*");
					//Statement mys = mycon.createStatement();
					PreparedStatement ps = mycon.prepareStatement("select count(*) from drugs where name = ?");
					ps.setString(1, textField_8.getText());
					ResultSet rs = ps.executeQuery();
					rs.next();
					int i = rs.getInt(1);
					if(i == 0)
					{
						//JOptionPane.showMessageDialog(frame, "drug not present","",JOptionPane.WARNING_MESaddActionListener(new ActionListener() {
						 ps = mycon.prepareStatement("insert into drugs (name,price) values (?,?)"); 
						 ps.setString(1,textField_8.getText() );
						 ps.setFloat(2,Float.parseFloat(textField_11.getText()));
						 ps.executeUpdate();
							
					}
					else
					{
						ps = mycon.prepareStatement("update drugs set price = ? where name = ?");
						ps.setString(2,textField_8.getText() );
						ps.setFloat(1,Float.parseFloat(textField_11.getText()));
						ps.executeUpdate();
						JOptionPane.showMessageDialog(frame, "updates successfull","",JOptionPane.PLAIN_MESSAGE);
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		button_5.setFont(new Font("Baskerville Old Face", Font.BOLD, 14));
		button_5.setBounds(413, 268, 123, 30);
		panel.add(button_5);
		
		JButton btnCheckAvailabilty = new JButton("CHECK AVAILABILTY");
		btnCheckAvailabilty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false","chandana","Jkma999*");
					PreparedStatement ps = mycon.prepareStatement("select count(*) from drugs where name = ?");
					ps.setString(1, textField_8.getText());
					ResultSet rs = ps.executeQuery();
					rs.next();
					int i = rs.getInt(1);
					if(i == 0)
					{
						lblNewLabel.setText("NOT AVAILABLE");
					}
					else
					{
							ps = mycon.prepareStatement("select quantity from drugs where name = ?");
							ps.setString(1, textField_8.getText());
							rs = ps.executeQuery();
							rs.next();
							int k = rs.getInt("quantity");
							if(k>0)
							{
								lblNewLabel.setText("AVAILABLE");
							}
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		btnCheckAvailabilty.setFont(new Font("Baskerville Old Face", Font.BOLD, 14));
		btnCheckAvailabilty.setBounds(326, 332, 210, 30);
		panel.add(btnCheckAvailabilty);
		
		JPanel e = new JPanel();
		e.setBackground(new Color(0, 0, 51));
		tabbedPane.addTab("Update Notices", null, e, null);
		e.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("NOTIFICATIONS");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Baskerville Old Face", Font.BOLD, 24));
		lblNewLabel_1.setBounds(160, 39, 229, 30);
		e.add(lblNewLabel_1);
		
		TextArea textArea = new TextArea("", 0,0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		textArea.setFont(new Font("Baskerville Old Face", Font.BOLD, 14));
		textArea.setBounds(48, 93, 462, 350);
		e.add(textArea);
		try {
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
		JButton btnNewButton = new JButton("UPDATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
					{Connection mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false","chandana","Jkma999*");
					PreparedStatement ps = mycon.prepareStatement("update detail set notify = ? where details = 'note'");
					ps.setString(1,textArea.getText());
				    ps.executeUpdate();
				    JOptionPane.showMessageDialog(frame, "update successful", "", JOptionPane.PLAIN_MESSAGE);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Baskerville Old Face", Font.BOLD, 16));
		btnNewButton.setBounds(382, 502, 141, 38);
		e.add(btnNewButton);
		
	}	
}
class MultiLine extends JTextArea implements TableCellRenderer {

	private List<List<Integer>> rowColHeight = new ArrayList<>();
	
	public MultiLine() {
		setLineWrap(true);
		setWrapStyleWord(true);
		setOpaque(true);
		
	}
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        //make multiple-line where the cell value is String[]
    	setText((value == null) ? "":value.toString());
    	setEditable(false);
       // updateRowHeight(table,row,column);
        return this;
    }
}