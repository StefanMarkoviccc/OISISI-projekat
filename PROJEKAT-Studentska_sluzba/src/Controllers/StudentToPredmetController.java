package Controllers;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.StudentToPredmetWindow;

public class StudentToPredmetController extends AbstractAction {

	
	public StudentToPredmetController () 
	{
		
		super("Dodaj");
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		StudentToPredmetWindow.getInstance().show();
		
	}

}
