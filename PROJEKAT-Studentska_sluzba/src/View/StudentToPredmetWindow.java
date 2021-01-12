package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

import Controllers.ButtonPotvrdiStudentToPredmetController;
import Model.Predmet;

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
		setTitle("Predmeti");
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(300,200));
		pack();
		String ss="";
		Object[] data= {ss};
		dtmPredmeti= new DefaultTableModel(data,0);
		tblPredmeti= new JTable(dtmPredmeti);
		JScrollPane scp= new JScrollPane(tblPredmeti);
		JPanel pnlTbl= new JPanel();
		pnlTbl.setLayout(new BorderLayout());
		pnlTbl.add(scp,BorderLayout.CENTER);
		btnDodaj= new JButton(new ButtonPotvrdiStudentToPredmetController());
		btnOdustani= new JButton("Odustani");
		
		btnOdustani.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				StudentToPredmetWindow.getInstance().dispose();
				
			}
		});
		JPanel pnlButtons= new JPanel();
		pnlButtons.setLayout(new FlowLayout());
		pnlButtons.add(btnDodaj);
		pnlButtons.add(btnOdustani);
		add(pnlTbl,BorderLayout.CENTER);
		add(pnlButtons,BorderLayout.SOUTH);
		
		//poziv
		PopuniTabelu();
	}
	
	public void PopuniTabelu() 
	{
		for(int i=0; i<MainWindow.getInstance().getModel().getPredmeti().size(); i++) 
		{
				Predmet p=MainWindow.getInstance().getModel().getPredmeti().get(i);
				String s=p.getSifraPr()+"-"+p.getNazivPr();
				Object[] data= {s};
				dtmPredmeti.addRow(data);
			
		}
	}

	public JTable getTblPredmeti() {
		return tblPredmeti;
	}

	public void setTblPredmeti(JTable tblPredmeti) {
		this.tblPredmeti = tblPredmeti;
	}

	public DefaultTableModel getDtmPredmeti() {
		return dtmPredmeti;
	}

	public void setDtmPredmeti(DefaultTableModel dtmPredmeti) {
		this.dtmPredmeti = dtmPredmeti;
	}

	public JButton getBtnDodaj() {
		return btnDodaj;
	}

	public void setBtnDodaj(JButton btnDodaj) {
		this.btnDodaj = btnDodaj;
	}

	public JButton getBtnOdustani() {
		return btnOdustani;
	}

	public void setBtnOdustani(JButton btnOdustani) {
		this.btnOdustani = btnOdustani;
	}

	
	
}
