package Kontroleri;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.MainWindow;

import View.NewProfesorWindow;
import View.NewStudentWindow;

public class NewEntitetContoller extends AbstractAction
{
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
		int index=MainWindow.getInstance().getWorkSpace().getTabs().getSelectedIndex();
		if(index==0) 
		{
			
			NewStudentWindow.getInstance().show();
		}
		else if(index==1) 
		{
			
			NewProfesorWindow.getInstance().show();
		}
		else 
		{
			
			
		}
		
	}
	
	public NewEntitetContoller()
	{
		 
		super("Dodaj");
	}	
}
