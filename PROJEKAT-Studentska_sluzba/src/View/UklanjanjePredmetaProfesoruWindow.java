package View;

import javax.swing.JFrame;

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

import Model.Profesor;
public class UklanjanjePredmetaProfesoruWindow extends JFrame
{
	private JButton dugmeNe;
	private JButton dugmeDa;
	private JLabel lblPoruka;
	
	private static UklanjanjePredmetaProfesoruWindow instance;

	public static UklanjanjePredmetaProfesoruWindow getInstance()
	{
	  if(instance==null)
	  {
		  instance= new UklanjanjePredmetaProfesoruWindow();
		  
	  }
	  
	  return instance;
	}


public UklanjanjePredmetaProfesoruWindow()
{
	setTitle("Ukloni predmet");
	setLayout(new BorderLayout());
	 JPanel mainPanel=new JPanel();
	 setPreferredSize(new Dimension(300,200));
    	pack();
    	setLocationRelativeTo(null);
	 mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));
	 Dimension dim= new Dimension(100,100);
	lblPoruka=new JLabel("Da li ste sigurni?");
	lblPoruka.setPreferredSize(dim);
	dugmeDa=new JButton("Potvrdi");
	
	dugmeDa.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			int ind= EditProfesorWindow.getInstance().getPredmetiPanel().getTablePredmeti().getSelectedRow();
			int indP=MainWindow.getInstance().getWorkSpace().getTableProfesori().getSelectedRow();
			Profesor p= MainWindow.getInstance().getModel().getProfesori().get(indP);
			if(ind!=-1) 
			{
				EditProfesorWindow.getInstance().getPredmetiPanel().getDtmPredmeti().removeRow(ind);
			}
			UklanjanjePredmetaProfesoruWindow.getInstance().dispose();
			
		}
	});
	dugmeNe=new JButton("Odustani");
	dugmeNe.addActionListener(new ActionListener() 
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			instance=null;
			dispose();
			
		}
		
	});
	JPanel pnlLblPoruka=new JPanel();
	JPanel pnlDugme=new JPanel();
	  pnlLblPoruka.setLayout(new FlowLayout());
	  pnlLblPoruka.add(lblPoruka);
	  pnlDugme.setLayout(new FlowLayout());
	  pnlDugme.add(dugmeDa);
	  pnlDugme.add(dugmeNe);
	  mainPanel.add(pnlLblPoruka);
	  mainPanel.add(pnlDugme);
	  
	  
	  add(mainPanel,BorderLayout.CENTER);
	
	
}



}
