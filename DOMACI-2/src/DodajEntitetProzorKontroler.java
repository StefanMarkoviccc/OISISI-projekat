import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class DodajEntitetProzorKontroler  extends AbstractAction
{

	public  DodajEntitetProzorKontroler() {
		super("Dodaj");
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		NewStudentWindow.getInstance().show();
		
	}

}
