package Controllers;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.PotvrdiPonistavanjeOceneWindow;

public class PonistiOcenuController extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent arg0) {

		PotvrdiPonistavanjeOceneWindow.getInstance().show();
		
	}
	
	public PonistiOcenuController() 
	{
		super("Ponisti ocenu");
	}

	
	
}
