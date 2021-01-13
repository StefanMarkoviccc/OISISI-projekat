package Controllers;

import java.awt.event.ActionEvent;
import View.EditStudentWindow;
import View.MainWindow;

import javax.swing.AbstractAction;

import Model.Predmet;
import Model.Student;
import View.UnosOceneWindow;

public class UnosOceneController extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent e) {
		UnosOceneWindow.getInstance().show();
		int indexp= EditStudentWindow.getInstance().getTableNepolozeni().getSelectedRow();
		int i=MainWindow.getInstance().getWorkSpace().getTableStudenti().getSelectedRow();
		Student s= MainWindow.getInstance().getModel().getStudenti().get(i);
		Predmet p=s.getNepolozeniPredmeti().get(indexp);
		UnosOceneWindow.getInstance().getTxtNaziv().setText(p.getNazivPr());
		UnosOceneWindow.getInstance().getTxtSifra().setText(p.getSifraPr());
	}
	
	public UnosOceneController() 
	{
		super("Polaganje");
	}

}
