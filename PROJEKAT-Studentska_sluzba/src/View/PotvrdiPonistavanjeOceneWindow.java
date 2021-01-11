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

public class PotvrdiPonistavanjeOceneWindow extends JFrame {
	
	public JLabel labelaText;
	public JButton btnDa;
	public JButton btnNe; 	
	public static PotvrdiPonistavanjeOceneWindow instance;
	
	
	public PotvrdiPonistavanjeOceneWindow() 
	{
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(300,200));
		pack();
		JPanel pnlPonisti = new JPanel();
		JPanel pnlText = new JPanel();
		JPanel pnlButtons = new JPanel();
		
		pnlText.setLayout(new BorderLayout());
		pnlButtons.setLayout(new FlowLayout(new FlowLayout().CENTER));
		
		btnDa = new JButton("Da");
		btnNe = new JButton("Ne");
		btnNe.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				PotvrdiPonistavanjeOceneWindow.getInstance().dispose();
				
			}
		});
		labelaText = new JLabel("Da li ste sigurni da zelite da ponistite ocenu?");
		
		pnlText.add(labelaText,BorderLayout.CENTER);
		pnlButtons.add(btnDa);
		pnlButtons.add(btnNe);
		
		pnlPonisti.setLayout(new BoxLayout(pnlPonisti,BoxLayout.Y_AXIS));
		pnlPonisti.add(pnlText);
		pnlPonisti.add(pnlButtons);
		
		add(pnlPonisti,BorderLayout.CENTER);	
	}
	
	public static PotvrdiPonistavanjeOceneWindow getInstance() 
	{
		if(instance==null) 
		{
			instance=new PotvrdiPonistavanjeOceneWindow();
		}		return instance;
		
	}
}
