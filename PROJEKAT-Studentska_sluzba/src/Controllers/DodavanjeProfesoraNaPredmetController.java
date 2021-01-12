package Controllers;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.DodavanjeProfesoraNaPredmetWindow;

public class DodavanjeProfesoraNaPredmetController extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent arg0) {

		DodavanjeProfesoraNaPredmetWindow.getInstance().show();
		
	}

	public DodavanjeProfesoraNaPredmetController() 
	{
		super("+");
	}
	
}
