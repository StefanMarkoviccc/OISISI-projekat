

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class WorkSpace extends JPanel{
	
	private JTabbedPane tabs;
	private JTable tableProfesori;
	private DefaultTableModel tmProfesori;
	
	
	
	public WorkSpace()
	{
		setLayout(new BorderLayout());
		JPanel pnlProfesori = new JPanel();
		pnlProfesori.setLayout(new BorderLayout());
		
		Object[] prof = {"Ime","Prezime","Titula","Zvanje"};
		
		tmProfesori = new DefaultTableModel(prof,0);
		
		tableProfesori = new JTable(tmProfesori);
		
		JScrollPane scrollProfesori = new JScrollPane(tableProfesori);
		
		pnlProfesori.add(scrollProfesori,BorderLayout.CENTER);
		
		tabs = new JTabbedPane();
		tabs.add("Profesori",pnlProfesori);
		
		add(tabs,BorderLayout.CENTER);
	}



	public JTabbedPane getTabs() {
		return tabs;
	}



	public void setTabs(JTabbedPane tabs) {
		this.tabs = tabs;
	}



	public JTable getTableProfesori() {
		return tableProfesori;
	}



	public void setTableProfesori(JTable tableProfesori) {
		this.tableProfesori = tableProfesori;
	}



	public DefaultTableModel getTmProfesori() {
		return tmProfesori;
	}



	public void setTmProfesori(DefaultTableModel tmProfesori) {
		this.tmProfesori = tmProfesori;
	}


}
