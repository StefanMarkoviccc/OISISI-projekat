package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
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
		JScrollPane scp= new JScrollPane(tblPredmeti);
		JPanel pnlTbl= new JPanel();
		pnlTbl.setLayout(new BorderLayout());
		pnlTbl.add(scp,BorderLayout.CENTER);
		btnDodaj= new JButton("Dodaj");
		btnOdustani= new JButton("Odustani");
		JPanel pnlButtons= new JPanel();
		pnlButtons.setLayout(new FlowLayout());
		pnlButtons.add(btnDodaj);
		pnlButtons.add(btnOdustani);
		add(pnlTbl,BorderLayout.CENTER);
		add(pnlButtons,BorderLayout.SOUTH);
		
	}

}
