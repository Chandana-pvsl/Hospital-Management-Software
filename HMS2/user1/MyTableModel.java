package user1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.table.AbstractTableModel;

public class MyTableModel extends AbstractTableModel {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyTableModel window = new MyTableModel();
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
	/*public MyTableModel() {
		initialize();
	}*/

	/**
	 * Initialize the contents of the frame.
	 */
	/*private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}*/
	
	private final String[][] data;
	private final Object[] columnNames;
	public MyTableModel(String[][] d, Object[] on)
	{
		data = d;
		columnNames = on;
	}
	public boolean iscellEditable(int row,int col)
	{
		return false;
	}
	public int getRowCount()
	{
		return data.length;
	}
	public int getColumnCount() {
		return columnNames.length;
	}
	public Object getValueAt(int rowIndex, int columnIndex)
	{
		return data[rowIndex][columnIndex];
	}
	public String getColumnName(int col) {
		return (String)columnNames[col];
	}
}
