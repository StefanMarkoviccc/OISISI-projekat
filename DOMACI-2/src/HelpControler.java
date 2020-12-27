import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class HelpControler extends AbstractAction{

	
	public HelpControler()
	{
		super("Help");
	}
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		  JDialog d = new JDialog(MainWindow.getInstance(), "Help"); 
          JLabel l = new JLabel("This is help"); 
          d.setPreferredSize(new Dimension(300,300));
          d.pack();
          d.add(l); 
          d.show();
		
	}

}
