package Controllers;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.EditProfesorWindow;
import View.MainWindow;

public class EditEntityControler extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		
		int indx=MainWindow.getInstance().getWorkSpace().getTabs().getSelectedIndex();
		if(indx==0) 
		{
			
		}
		else if(indx==2) 
		{
			
			
		}else{
			EditProfesorWindow.getInstance().show();
		}
	
		
	}

}
