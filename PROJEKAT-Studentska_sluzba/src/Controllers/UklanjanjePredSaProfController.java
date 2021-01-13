package Controllers;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.UklanjanjePredmetaSaProfesoraWindow;

public class UklanjanjePredSaProfController extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent arg0) {

		UklanjanjePredmetaSaProfesoraWindow.getInstance().show();
	}

	public UklanjanjePredSaProfController() 
	{
		super("Ukloni predmet");
	}
}
