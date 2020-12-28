package Controllers;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.EditProfesorWindow;
import View.EditStudentWindow;
import View.MainWindow;

public class EditEntityControler extends AbstractAction {

	 public EditEntityControler() 
	 {
		super("Edit");
	 }
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		
		int indx=MainWindow.getInstance().getWorkSpace().getTabs().getSelectedIndex();
		if(indx==0) 
		{
			EditStudentWindow.getInstance().show();
		}
		else if(indx==2) 
		{
			
			
		}else{
			EditProfesorWindow.getInstance().show();
		}
	
		
	}

}
