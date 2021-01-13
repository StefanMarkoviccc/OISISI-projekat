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
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import Model.Profesor;

public class DodavanjeProfesoraNaPredmetWindow extends JFrame
{
	private JTable tableProfesori;
	private JButton btnPotvrdi;
	private JButton btnOdustani;
	private DefaultTableModel tmProfesori;
	private static DodavanjeProfesoraNaPredmetWindow instance;
	
	public DodavanjeProfesoraNaPredmetWindow() 
	{
		JPanel pnlMain = new JPanel();
		JPanel pnlButtons = new JPanel();
		btnPotvrdi = new JButton("Potvrdi");
		btnOdustani = new JButton("Odustani");
		
		setTitle("Odaberite profesora");
		setPreferredSize(new Dimension(500,350));
		pack();
		
		setLayout(new BorderLayout());
		String s="";
		Object[] d = {s};
		tmProfesori = new DefaultTableModel(d,0);
		tableProfesori = new JTable(tmProfesori);
		tableProfesori.setRowSelectionAllowed(true);
		tableProfesori.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		
		JScrollPane scrollPaneProf = new JScrollPane(tableProfesori);
		pnlMain.add(scrollPaneProf,BorderLayout.CENTER);
		add(pnlMain,BorderLayout.CENTER);
		
		btnOdustani.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				DodavanjeProfesoraNaPredmetWindow.getInstance().dispose();
			}
		});
		
		pnlButtons.setLayout(new FlowLayout());
		pnlButtons.add(btnPotvrdi);
		pnlButtons.add(btnOdustani);
		
		add(pnlButtons,BorderLayout.SOUTH);
		
		popuniProfesora();
		
	}
	
	public static DodavanjeProfesoraNaPredmetWindow getInstance() 
	{
		if(instance==null) 
		{
			instance = new DodavanjeProfesoraNaPredmetWindow();
		}
		return instance;
	}
	
	private void popuniProfesora() 
	{
		for(int i = 0; i<MainWindow.getInstance().getModel().getProfesori().size();i++) 
		{
			Profesor prof = MainWindow.getInstance().getModel().getProfesori().get(i);
			String upisProf = prof.getIme()+"-"+prof.getPrezime();
			Object[] red = {upisProf};
			tmProfesori.addRow(red);
		}
	}

	public JTable getTableProfesori() {
		return tableProfesori;
	}

	public void setTableProfesori(JTable tableProfesori) {
		this.tableProfesori = tableProfesori;
	}

	public JButton getBtnPotvrdi() {
		return btnPotvrdi;
	}

	public void setBtnPotvrdi(JButton btnPotvrdi) {
		this.btnPotvrdi = btnPotvrdi;
	}

	public JButton getBtnOdustani() {
		return btnOdustani;
	}

	public void setBtnOdustani(JButton btnOdustani) {
		this.btnOdustani = btnOdustani;
	}

	public DefaultTableModel getTmProfesori() {
		return tmProfesori;
	}

	public void setTmProfesori(DefaultTableModel tmProfesori) {
		this.tmProfesori = tmProfesori;
	}
	
	
}
