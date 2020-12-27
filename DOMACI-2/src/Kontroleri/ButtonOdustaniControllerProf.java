package Kontroleri;



import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.NewProfesorWindow;

public class ButtonOdustaniControllerProf extends AbstractAction
{

	public ButtonOdustaniControllerProf() 
	{
		super("Odustani");
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		NewProfesorWindow.getInstance().dispose();
	}
	

}
