package View;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class UkloniProfesoraSaPredmetaWindow extends JFrame
{
	private JLabel lblporuka;
	private JButton dugmeDa;
	private JButton dugmeNe;
	
private static UkloniProfesoraSaPredmetaWindow instance;
	
	public static UkloniProfesoraSaPredmetaWindow getInstance() 
	{
		if(instance==null) 
		{
			
			instance=new UkloniProfesoraSaPredmetaWindow();
		}
		return instance;
		
	}

	
	public UkloniProfesoraSaPredmetaWindow()
	{
		Dimension dim= new Dimension(200,20);
		
		
		setLayout(new BorderLayout());
		//mainPanel
		JPanel mainPanel= new JPanel();
		setPreferredSize(new Dimension(300,300));
		pack();
	   setLocationRelativeTo(null);
		mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));
		
		add(mainPanel,BorderLayout.CENTER);
		
		
		
		setTitle("Uklanjanje profesora sa predmeta");
		lblporuka= new JLabel("Da li ste sigurni da zelite da ukonite profesora " );
		dugmeDa= new JButton("Da");
		dugmeNe= new JButton("Ne");
		
		
		dugmeNe.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				    dispose();
				    instance=null;
				  } 
				} );
		
		JPanel pnlPoruka= new JPanel();
		
		pnlPoruka.add(lblporuka);
		
		JPanel pnlDugme= new JPanel();
		
		pnlDugme.add(dugmeDa);
		pnlDugme.add(dugmeNe);
		
		
		mainPanel.add(pnlPoruka);
		mainPanel.add(pnlDugme);
		
		
		
		
	}
	
}
