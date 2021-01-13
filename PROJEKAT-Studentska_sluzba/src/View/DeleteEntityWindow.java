package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controllers.PotvrdiBrisanjeControler;

public class DeleteEntityWindow extends JFrame {
	
	
	public JLabel labelaText;
	public JButton btnDa;
	public JButton btnNe; 	
	public static DeleteEntityWindow instance;
	public String str;
	
	public DeleteEntityWindow(String string) 
	{
		str=string;
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(300,200));
		pack();
		JPanel pnlPonisti = new JPanel();
		JPanel pnlText = new JPanel();
		JPanel pnlButtons = new JPanel();
		pnlText.setLayout(new BorderLayout());
		pnlButtons.setLayout(new FlowLayout(new FlowLayout().CENTER));
		
		btnDa = new JButton(new PotvrdiBrisanjeControler());
		btnNe = new JButton("Ne");
		setTitle("Brisanje" +string);
		labelaText = new JLabel("Da li ste sigurni da zelite da obrisete " + str + "?");
		
		btnNe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				instance=null;
				
			}
		});
		
		
		pnlText.add(labelaText,BorderLayout.CENTER);
		pnlButtons.add(btnDa);
		pnlButtons.add(btnNe);
		
		
		
		pnlPonisti.setLayout(new BoxLayout(pnlPonisti,BoxLayout.Y_AXIS));
		pnlPonisti.add(pnlText);
		pnlPonisti.add(pnlButtons);
		
		add(pnlPonisti,BorderLayout.CENTER);	
	}
	
	public static DeleteEntityWindow getInstance(String str) 
	{
		if(instance==null) 
		{
			instance=new DeleteEntityWindow(str);
		}	
		instance.str=str;
		return instance;
	}
	
}
