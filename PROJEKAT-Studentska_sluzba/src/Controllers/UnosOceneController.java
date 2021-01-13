package Controllers;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.UnosOceneWindow;

public class UnosOceneController extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent e) {
		UnosOceneWindow.getInstance().show();
	}
	
	public UnosOceneController() 
	{
		super("Polaganje");
	}

}
