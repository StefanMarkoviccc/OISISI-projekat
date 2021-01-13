package Controllers;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import Model.Predmet;
import Model.Profesor;
import View.DodavanjeProfesoraNaPredmetWindow;
import View.MainWindow;

public class PotvrdiDodavanjeProfesoraNaPredmetController extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent arg0) {

		int ind = DodavanjeProfesoraNaPredmetWindow.getInstance().getTableProfesori().getSelectedRow();
		int r = MainWindow.getInstance().getWorkSpace().getTablePredmeti().getSelectedRow();
		
		Predmet p = MainWindow.getInstance().getModel().getPredmeti().get(r);
		Profesor pr = MainWindow.getInstance().getModel().getProfesori().get(ind);
		//Profesor prof = MainWindow.getInstance().getModel().findProfesor(pr.getBrLK());
		//p.setProfesor(prof);
		
		DodavanjeProfesoraNaPredmetWindow.getInstance().dispose();
		
		
	}

}
