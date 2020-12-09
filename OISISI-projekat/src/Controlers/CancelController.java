package Controlers;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.NewStudentWindow;

public class CancelController extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		NewStudentWindow.getInstance().dispose();
		
	}

	public CancelController() 
	{
		super("Odustani");
	}
}
