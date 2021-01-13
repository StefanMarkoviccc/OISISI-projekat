package View;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import Model.Predmet;

public class DodavanjePredmetaProfesoruWindow extends JFrame
{

	private JButton btnOdustani;
	private JTable tblPredmeti;
	private JLabel lblpredmeti;
	private DefaultTableModel dtmPredmeti;
	private JButton btnPotvrdi;
	private static DodavanjePredmetaProfesoruWindow instance;
	
	public static DodavanjePredmetaProfesoruWindow getInstance() 
	{
		if(instance==null) 
		{
			
			instance=new DodavanjePredmetaProfesoruWindow();
		}
		return instance;
		
	}
	
	public DodavanjePredmetaProfesoruWindow()
	{
		setTitle("Dodaj predmet");
		setLocationRelativeTo(null);
		setPreferredSize(new Dimension(380,380));
		  pack();
		
		this.setLayout(new BorderLayout());
		JPanel pnlLabels= new JPanel();
		JPanel pnlTable= new JPanel();
		JPanel pnlButtons= new JPanel();
		pnlLabels.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnlTable.setLayout(new BorderLayout());
		pnlButtons.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		
		
		lblpredmeti= new JLabel("Predmeti:");
		pnlLabels.add(lblpredmeti);
		add(pnlLabels, BorderLayout.NORTH);
		
		btnPotvrdi= new JButton("Potvdi");
		btnOdustani= new JButton("Odustani");
		btnOdustani.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			DodavanjePredmetaProfesoruWindow.getInstance().dispose();
				
			}
		});
		
		pnlButtons.add(btnPotvrdi);
		pnlButtons.add(btnOdustani);
		add(pnlButtons, BorderLayout.SOUTH);
		Object[] test= {""};
		dtmPredmeti= new DefaultTableModel(test,0);
		tblPredmeti= new JTable(dtmPredmeti);
		tblPredmeti.setRowSelectionAllowed(true);
		tblPredmeti.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		JScrollPane spPredmeti= new JScrollPane(tblPredmeti);
		pnlTable.add(spPredmeti, BorderLayout.CENTER);
		add(pnlTable,BorderLayout.CENTER);
		fillTablePredmet();
		
		
	}
	
	public  void fillTablePredmet()
	{
		for(int i=0; i<MainWindow.getInstance().getModel().getPredmeti().size();i++)
		{
		Predmet p= MainWindow.getInstance().getModel().getPredmeti().get(i);
		String s=p.getSifraPr()+"-"+p.getNazivPr();
		Object[] data= {s};
		dtmPredmeti.addRow(data);
		}
	}



}
