package Controllers;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.UklanjanjePredmetaStudentuWindow;

public class UklanjanjePredmetaStudentuController extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		UklanjanjePredmetaStudentuWindow.getInstance().show();
		
	}
	
	public UklanjanjePredmetaStudentuController() 
	{
		super("Ukloni");
	}

}
