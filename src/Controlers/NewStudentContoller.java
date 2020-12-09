package Controlers;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.NewStudentWindow;

public class NewStudentContoller extends AbstractAction
{
	
	public  NewStudentContoller() 
	{
		super("New");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		NewStudentWindow.getInstance().show();
	}
}
