package Controllers;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import DataSave.Configuration;
import View.MainWindow;
import View.NewPredmetWindow;
import View.NewProfesorWindow;
import View.NewStudentWindow;

public class NewEntityController extends AbstractAction
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
			NewPredmetWindow.getInstance().show();
			
		}
		
	}
	
	public NewEntityController()
	{
		 
		super("Dodaj",Configuration.addIcon);
	}	
}