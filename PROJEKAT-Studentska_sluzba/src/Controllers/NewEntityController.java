package Controllers;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.MainWindow;
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
			
			
		}
		else 
		{
			
			
		}
		
	}
	
	public NewEntityController()
	{
		 
		super("Dodaj");
	}	
}