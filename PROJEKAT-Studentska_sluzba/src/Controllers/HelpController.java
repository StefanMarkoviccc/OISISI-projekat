package Controllers;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import View.MainWindow;

public class HelpController extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent arg0) {

		JDialog dial = new JDialog(MainWindow.getInstance(),"Help");
		dial.setLayout(new BorderLayout());
		
		JLabel label1 = new JLabel("Akceleratori:  ");
		JLabel label2 = new JLabel("CTRL-H Help prozor.");
		JLabel label3 = new JLabel("CTRL-N Dodaj novi entitet.");
		JLabel label4 = new JLabel("CTRL-A Prozor about.");
		JLabel label5 = new JLabel("H Help prozor.");
		JLabel label6 = new JLabel("N Novi entitet prozor.");
		JLabel label7 = new JLabel("A About prozor.");
		JLabel label8 = new JLabel("Mnemonici:");
		JLabel label9 = new JLabel("Foramt datuma se unosi na sledeci nacin: 'yyyy-mm-dd' ");
		
		JPanel pnl = new JPanel();
		pnl.setLayout(new BoxLayout(pnl, BoxLayout.Y_AXIS));
		
		pnl.add(label1);
		pnl.add(label2);
		pnl.add(label3);
		pnl.add(label4);
		pnl.add(label8);
		pnl.add(label5);
		pnl.add(label6);
		pnl.add(label7);
		pnl.add(label9);
		
		dial.setPreferredSize(new Dimension(500,200));
		dial.pack();
		dial.add(pnl,BorderLayout.CENTER);
		dial.show();
	
	}

}
