import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class AboutControler  extends AbstractAction
{

	public AboutControler() 
	{
		super("About");
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		   JDialog d = new JDialog(MainWindow.getInstance(), "About"); 
           JLabel l = new JLabel("This is about"); 
           d.setPreferredSize(new Dimension(300,300));
           d.pack();
           d.add(l); 
           d.show();
		
	}
	

}
