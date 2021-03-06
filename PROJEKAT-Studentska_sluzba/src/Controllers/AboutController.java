package Controllers;

import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JDialog;
import javax.swing.JLabel;

import View.MainWindow;

public class AboutController extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		JDialog dial = new JDialog(MainWindow.getInstance(),"About");
		JLabel lbl = new JLabel("Program namenjen za rad studentske sluzbe koji sluzi za pomoc organizacije podataka.");
		dial.setPreferredSize(new Dimension(200,200));
		dial.pack();
		dial.add(lbl);
		dial.show();
	}
	
	public AboutController() 
	{
		super("About");
	}

}
