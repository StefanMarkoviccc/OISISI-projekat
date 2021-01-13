package Controllers;

import java.awt.event.ActionEvent;
import View.EditStudentWindow;
import View.MainWindow;

import javax.swing.AbstractAction;

import Model.Predmet;
import View.UnosOceneWindow;

public class UnosOceneController extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent e) {
		UnosOceneWindow.getInstance().show();
		int indexp= EditStudentWindow.getInstance().getTableNepolozeni().getSelectedRow();
		Predmet p=MainWindow.getInstance().getModel().getPredmeti().get(indexp);
		UnosOceneWindow.getInstance().getTxtNaziv().setText(p.getNazivPr());
		UnosOceneWindow.getInstance().getTxtSifra().setText(p.getSifraPr());
	}
	
	public UnosOceneController() 
	{
		super("Polaganje");
	}

}
