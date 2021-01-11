package Controllers;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.MainWindow;
import View.WorkSpace;

public class ButtonSearchController extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		int index = MainWindow.getInstance().getWorkSpace().getTabs().getSelectedIndex();
		
		if(index == 0) 
		{
			String s = MainWindow.getInstance().getTool().getTxtSearch().getText();
			String[] parts = s.split(" ");
			System.out.println(parts.length);
			
		};
		
		
		
	}
	
	public ButtonSearchController() 
	{
		super("Search");
	}

}
