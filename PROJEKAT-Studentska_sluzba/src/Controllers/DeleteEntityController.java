package Controllers;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.MainWindow;

public class DeleteEntityController extends AbstractAction 
{

	public DeleteEntityController() 
	{
		super("Delete");
	
	}
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		int tabbedIndex=MainWindow.getInstance().getWorkSpace().getTabs().getSelectedIndex();
		if(tabbedIndex==0) 
		{
			//TO DOOOOOO
		}
		else if(tabbedIndex==1) 
		{
			//TO DOOOOOO
		}
		else 
		{
			int index=MainWindow.getInstance().getWorkSpace().getTablePredmeti().getSelectedRow();
			if(index!=-1) 
			{
				MainWindow.getInstance().getWorkSpace().getTmPredmeti().removeRow(index);
			}
			
		}
		
	}
	

}
