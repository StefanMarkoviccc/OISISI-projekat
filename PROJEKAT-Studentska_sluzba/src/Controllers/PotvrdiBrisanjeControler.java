package Controllers;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.DeleteEntityWindow;
import View.MainWindow;
import View.PotvrdiPonistavanjeOceneWindow;

public class PotvrdiBrisanjeControler extends AbstractAction
{
	public PotvrdiBrisanjeControler () 
	{
		super("Daaaaa");
	}
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		int index=MainWindow.getInstance().getWorkSpace().getTabs().getSelectedIndex();
		if(index==0) 
		{
			int ind=MainWindow.getInstance().getWorkSpace().getTableStudenti().getSelectedRow();
			if(ind==-1) 
			{
				return;
			}
			MainWindow.getInstance().getWorkSpace().getTmStudenti().removeRow(ind);
			MainWindow.getInstance().getModel().getStudenti().remove(ind);
			DeleteEntityWindow.getInstance("").dispose();
			
		}
		else if(index==1) 
		{
			int ind=MainWindow.getInstance().getWorkSpace().getTableProfesori().getSelectedRow();
			if(ind==-1) 
			{
				return;
			}
			MainWindow.getInstance().getWorkSpace().getTmProfesori().removeRow(ind);
			MainWindow.getInstance().getModel().getProfesori().remove(ind);
			DeleteEntityWindow.getInstance("").dispose();
			
		}else {
			int ind=MainWindow.getInstance().getWorkSpace().getTablePredmeti().getSelectedRow();
			if(ind==-1) 
			{
				return;
			}
			MainWindow.getInstance().getWorkSpace().getTmPredmeti().removeRow(ind);
			MainWindow.getInstance().getModel().getPredmeti().remove(ind);
			DeleteEntityWindow.getInstance("").dispose();
		}
		
		
	}
	
}
