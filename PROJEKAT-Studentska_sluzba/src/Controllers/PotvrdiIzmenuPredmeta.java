package Controllers;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import Model.Predmet;
import Model.Profesor;
import View.MainWindow;
import View.NewPredmetWindow;

public class PotvrdiIzmenuPredmeta extends AbstractAction 
{

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		int row = MainWindow.getInstance().getWorkSpace().getTableProfesori().getSelectedRow();
		Predmet pred= MainWindow.getInstance().getModel().getPredmeti().get(row);
		
		String sifraPred=NewPredmetWindow.getInstance().getTxtSifraPred().getText();
		String nazivPred=NewPredmetWindow.getInstance().getTxtSifraPred().getText();
		String  brLik=NewPredmetWindow.getInstance().getTxtProfesor().getText(); 	
		int ESPB=Integer.parseInt(NewPredmetWindow.getInstance().getTxtESPB().getText());
	}

}
