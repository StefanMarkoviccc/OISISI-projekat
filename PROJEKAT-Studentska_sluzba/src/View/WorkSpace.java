package View;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class WorkSpace extends JPanel{
	
	private JTabbedPane tabs;
	private JTable tableStudenti;
	private JTable tableProfesori;
	private JTable tablePredmeti;
	private DefaultTableModel tmStudenti;
	private DefaultTableModel tmProfesori;
	
	
	
	
	public WorkSpace()
	{
		setLayout(new BorderLayout());
		JPanel pnlStudenti = new JPanel();
		JPanel pnlProfesori = new JPanel();
		JPanel pnlPredmeti = new JPanel();
		pnlStudenti.setLayout(new BorderLayout());
		pnlProfesori.setLayout(new BorderLayout());
		pnlPredmeti.setLayout(new BorderLayout());
		
		Object[] stud = {"Index","Ime","Prezime","Godina studija","Status","Prosek"};
		tmStudenti = new DefaultTableModel(stud,0);
		tableStudenti = new JTable(tmStudenti);
		
		Object[] prof = {"Ime","Prezime","Titula","Zvanje"};
		tmProfesori = new DefaultTableModel(prof,0);
		tableProfesori = new JTable(tmProfesori);
		
		JScrollPane scrollStudenti = new JScrollPane(tableStudenti);
		JScrollPane scrollProfesori = new JScrollPane(tableProfesori);
		JScrollPane scrollPredmeti = new JScrollPane(tablePredmeti);
		
		pnlStudenti.add(scrollStudenti,BorderLayout.CENTER);
		pnlProfesori.add(scrollProfesori,BorderLayout.CENTER);
		pnlPredmeti.add(scrollPredmeti,BorderLayout.CENTER);
		
		tabs = new JTabbedPane();
		tabs.add("Studenti",pnlStudenti);
		tabs.add("Profesori",pnlProfesori);
		tabs.add("Predmeti",pnlPredmeti);
		
		add(tabs,BorderLayout.CENTER);
	}



	public JTabbedPane getTabs() {
		return tabs;
	}



	public void setTabs(JTabbedPane tabs) {
		this.tabs = tabs;
	}



	public JTable getTableStudenti() {
		return tableStudenti;
	}



	public void setTableStudenti(JTable tableStudenti) {
		this.tableStudenti = tableStudenti;
	}



	public JTable getTableProfesori() {
		return tableProfesori;
	}



	public void setTableProfesori(JTable tableProfesori) {
		this.tableProfesori = tableProfesori;
	}



	public JTable getTablePredmeti() {
		return tablePredmeti;
	}



	public void setTablePredmeti(JTable tablePredmeti) {
		this.tablePredmeti = tablePredmeti;
	}
	
	public void setTmProfesori(DefaultTableModel tmProfesori) {
		this.tmProfesori = tmProfesori;
	}	

}
