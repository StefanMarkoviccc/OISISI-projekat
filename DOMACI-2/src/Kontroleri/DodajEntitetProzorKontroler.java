package Kontroleri;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import View.MainWindow;
import View.NewProfesorWindow;
import View.NewStudentWindow;

public class DodajEntitetProzorKontroler  extends AbstractAction
{

	public  DodajEntitetProzorKontroler() {
		super("Dodaj");
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
	
		int i = MainWindow.getInstance().getWorkSpace().getTabs().getSelectedIndex();
		
		if(i==0) {
		
		NewStudentWindow.getInstance().show();
		}else if(i==1){
			NewProfesorWindow.getInstance().show();
		}
		
	}

}
