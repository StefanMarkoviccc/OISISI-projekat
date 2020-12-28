package Controllers;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import Model.Profesor;
import View.MainWindow;

public class PotvrdiIzmenuPredmeta extends AbstractAction 
{

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		int row = MainWindow.getInstance().getWorkSpace().getTableProfesori().getSelectedRow();
		Predmet pred= MainWindow.getInstance().getModel().getPredmeti().get(row);
		
		
	}

}
