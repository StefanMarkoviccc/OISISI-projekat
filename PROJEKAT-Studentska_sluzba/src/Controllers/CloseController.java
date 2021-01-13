package Controllers;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.MainWindow;

public class CloseController extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		MainWindow.getInstance().dispose();
		
	}
	
	public CloseController() 
	{
		super("Close");
	}

}
