package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controllers.DodavanjePredmetaProfesoruController;

public class PredmetiPanel  extends JPanel
{
	private JButton btnDodaj;
	private JButton btnUkloni;
	private JTable tablePredmeti;
	private DefaultTableModel dtmPredmeti;
	
	
	public PredmetiPanel() 
	{
		btnDodaj= new JButton(new DodavanjePredmetaProfesoruController());
		btnUkloni= new JButton("Ukloni predmeti");
		setLayout(new BorderLayout());
		Object[] data= {"Sifra","Naziv","Godina studija","Semestar"};
		dtmPredmeti= new DefaultTableModel(data,0);
		tablePredmeti= new JTable(dtmPredmeti);
		JScrollPane sc= new JScrollPane(tablePredmeti);
		
		JPanel pnlButtons= new JPanel();
		pnlButtons.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnlButtons.add(btnDodaj);
		pnlButtons.add(btnUkloni);
		JPanel pnlTable= new JPanel();
		pnlTable.setLayout(new BorderLayout());
		pnlTable.add(sc,BorderLayout.CENTER);
		add(pnlButtons,BorderLayout.NORTH);
		add(pnlTable,BorderLayout.CENTER);
	}
	
	

}
