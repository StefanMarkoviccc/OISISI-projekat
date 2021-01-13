package Controllers;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import Model.Predmet;
import Model.Profesor;
import View.DodavanjePredmetaProfesoruWindow;
import View.EditProfesorWindow;
import View.MainWindow;

public class PotvrdiDodavanjePredmetaProfesoruController extends AbstractAction
{
	public PotvrdiDodavanjePredmetaProfesoruController() {
		super("Potvrdi");
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{

		int[] ind= DodavanjePredmetaProfesoruWindow.getInstance().getTblPredmeti().getSelectedRows();
		int indP=MainWindow.getInstance().getWorkSpace().getTableProfesori().getSelectedRow();
		Profesor prof=MainWindow.getInstance().getModel().getProfesori().get(indP);
		
		for(int i=0; i<ind.length; i++) 
		{
			String linija=(String) DodavanjePredmetaProfesoruWindow.getInstance().getDtmPredmeti().getValueAt(ind[i], 0);
			String[] deloviLinije=linija.split("\\-");
			System.out.println(deloviLinije[0]);
			Predmet p= MainWindow.getInstance().getModel().findPredmet((deloviLinije[0]));
			prof.getPredmeti().add(p);
			Object[] rowData= {p.getSifraPr(),p.getNazivPr(),p.getGodStudija(),p.getSemestar()};
			EditProfesorWindow.getInstance().getPredmetiPanel().getDtmPredmeti().addRow(rowData);
			

		}
		
		DodavanjePredmetaProfesoruWindow.getInstance().dispose();
			
		}
		
		
	}
	


