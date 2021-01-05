package View;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StudentToPredmetWindow extends JFrame
{
	private JTable tblPredmeti;
	private DefaultTableModel dtmPredmeti;
	private JButton btnDodaj;
	private JButton btnOdustani;
	
	
	private static StudentToPredmetWindow instance;
	
	public static StudentToPredmetWindow  getInstance() 
	{
		if(instance==null) 
		{
			instance= new StudentToPredmetWindow();
		}
		return instance;
		
	}
	
	public StudentToPredmetWindow() 
	{
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(300,200));
		pack();
		dtmPredmeti= new DefaultTableModel();
		tblPredmeti= new JTable(dtmPredmeti);
		
	}

}
