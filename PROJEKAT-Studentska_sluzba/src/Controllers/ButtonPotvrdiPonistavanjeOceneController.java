package Controllers;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import Model.Student;
import View.EditStudentWindow;
import View.MainWindow;
import View.PotvrdiPonistavanjeOceneWindow;

public class ButtonPotvrdiPonistavanjeOceneController extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent arg0) {

		int i = EditStudentWindow.getInstance().getTablePolozeni().getSelectedRow();
		int indStudenta = MainWindow.getInstance().getWorkSpace().getTableStudenti().getSelectedRow();
		Student stud = MainWindow.getInstance().getModel().getStudenti().get(indStudenta);
		stud.getOcene().remove(i);
		PotvrdiPonistavanjeOceneWindow.getInstance().dispose();
		
	}

}
