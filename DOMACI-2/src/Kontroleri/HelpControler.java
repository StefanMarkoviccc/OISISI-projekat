package Kontroleri;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import View.MainWindow;

public class HelpControler extends AbstractAction{

	
	public HelpControler()
	{
		super("Help");
	}
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		
		  JDialog d = new JDialog(MainWindow.getInstance(), "Help"); 
		  d.setLayout(new BorderLayout());
		  JLabel l= new JLabel("Akceleratori: ");
          JLabel l1 = new JLabel("Ctrl-N Prozor za dodavanje entiteta"); 
          JLabel l2 = new JLabel("Ctrl-H Help prozor");
          JLabel l3 = new JLabel("Ctrl-A About prozor");
          JLabel ll= new JLabel("Mneumonici: ");
          JLabel ll1 = new JLabel("N Prozor za dodavanje entiteta"); 
          JLabel ll2 = new JLabel("H Help prozor");
          JLabel ll3 = new JLabel("A About prozor");
          
          JPanel pnl= new JPanel();
          pnl.setLayout(new BoxLayout(pnl, BoxLayout.Y_AXIS));
          pnl.add(l);
          pnl.add(l1);
          pnl.add(l2);
          pnl.add(l3);
          pnl.add(ll);
          pnl.add(ll1);
          pnl.add(ll2);
          pnl.add(ll3);

          d.setPreferredSize(new Dimension(300,300));
          d.pack();
          d.add(pnl,BorderLayout.CENTER); 
          d.show();
		
	}

}
