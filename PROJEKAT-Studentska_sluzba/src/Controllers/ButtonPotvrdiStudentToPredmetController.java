package Controllers;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import Model.Predmet;
import Model.Student;
import View.EditStudentWindow;
import View.MainWindow;
import View.StudentToPredmetWindow;

public class ButtonPotvrdiStudentToPredmetController extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int[] ind= StudentToPredmetWindow.getInstance().getTblPredmeti().getSelectedRows();
		int red=MainWindow.getInstance().getWorkSpace().getTableStudenti().getSelectedRow();
		Student s= MainWindow.getInstance().getModel().getStudenti().get(red);
		
		for(int i = 0; i<ind.length;i++) 
		{
			String ss = (String)StudentToPredmetWindow.getInstance().getDtmPredmeti().getValueAt(ind[i] ,0);
			String[] parts = ss.split("\\-");
			Predmet pred = MainWindow.getInstance().getModel().findPredmet(parts[0]);
			if(pred==null) 
			{
				return;
			
			}
			s.getNepolozeniPredmeti().add(pred);
			
			Object[] o= {pred.getSifraPr(),pred.getNazivPr(),pred.getEspb(),pred.getGodStudija(),pred.getSemestar()};
			EditStudentWindow.getInstance().getTmNepolozeni().addRow(o);
			
		}
		
		StudentToPredmetWindow.getInstance().dispose();	
	}
	
	public ButtonPotvrdiStudentToPredmetController() 
	{
		super("Dodaj");
	}

}
