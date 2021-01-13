package Controllers;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import Model.Predmet;
import Model.Student;
import View.EditStudentWindow;
import View.MainWindow;
import View.UklanjanjePredmetaStudentuWindow;

public class PotvrdiUklanjanjePredmetaSaStudentaController extends AbstractAction 
{
	@Override
	public void actionPerformed(ActionEvent arg0) {

		int ind = EditStudentWindow.getInstance().getTableNepolozeni().getSelectedRow();
		int indStud = MainWindow.getInstance().getWorkSpace().getTableStudenti().getSelectedRow();
		Student stud = MainWindow.getInstance().getModel().getStudenti().get(indStud);
		
		if(ind != -1) 
		{
			String sifraPred = (String) EditStudentWindow.getInstance().getTmNepolozeni().getValueAt(ind, 0);
			for(int i = 0;i<stud.getNepolozeniPredmeti().size();i++) 
			{
				Predmet pred = stud.getNepolozeniPredmeti().get(i);
				if(pred.getSifraPr().equals(sifraPred)) 
				{
					stud.getNepolozeniPredmeti().remove(i);
					break;
				}
			}
			EditStudentWindow.getInstance().getTmNepolozeni().removeRow(ind);
			UklanjanjePredmetaStudentuWindow.getInstance().dispose();
		}
	}
	
	public PotvrdiUklanjanjePredmetaSaStudentaController() 
	{
		super("Da");
	}

}
