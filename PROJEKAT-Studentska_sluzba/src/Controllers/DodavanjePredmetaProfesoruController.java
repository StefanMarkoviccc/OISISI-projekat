package Controllers;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.DodavanjePredmetaProfesoruWindow;

public class DodavanjePredmetaProfesoruController extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent e) {
		DodavanjePredmetaProfesoruWindow.getInstance().show();		
	}

	public DodavanjePredmetaProfesoruController() {
		super("Dodaj");
	}
}
