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

import Controllers.PotvrdiUklanjanjePredmetaSaStudentaController;

public class UklanjanjePredmetaStudentuWindow extends JFrame
{
	private JButton btnDa;
	private JButton btnNe;
	private JLabel labelaPor;
	private static UklanjanjePredmetaStudentuWindow instance;
	
	public UklanjanjePredmetaStudentuWindow() 
	{
		setLayout(new BorderLayout());
		setTitle("Uklanjanje predmeta");
		JPanel pnlMain = new JPanel();
		pnlMain.setLayout(new BoxLayout(pnlMain, BoxLayout.Y_AXIS));
		Dimension d = new Dimension(250,150);
		labelaPor = new JLabel("Da li zelite da ukonite predmet?");
		labelaPor.setPreferredSize(d);
		pack();
		
		btnDa = new JButton(new PotvrdiUklanjanjePredmetaSaStudentaController());
		btnNe = new JButton("Ne");
		btnNe.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				UklanjanjePredmetaStudentuWindow.getInstance().dispose();
				
			}
		});
		
		JPanel pnlButtons = new JPanel();
		JPanel pnlText = new JPanel();
		
		pnlText.setLayout(new FlowLayout());
		pnlButtons.setLayout(new FlowLayout());
		pnlText.add(labelaPor);
		pnlButtons.add(btnDa);
		pnlButtons.add(btnNe);
		
		pnlMain.add(pnlText);
		pnlMain.add(pnlButtons);
		
		add(pnlMain,BorderLayout.CENTER);
 		
	}
	
	
	
	
	public JButton getBtnDa() {
		return btnDa;
	}




	public void setBtnDa(JButton btnDa) {
		this.btnDa = btnDa;
	}




	public JButton getBtnNe() {
		return btnNe;
	}




	public void setBtnNe(JButton btnNe) {
		this.btnNe = btnNe;
	}




	public JLabel getLabelaPor() {
		return labelaPor;
	}




	public void setLabelaPor(JLabel labelaPor) {
		this.labelaPor = labelaPor;
	}




	public static UklanjanjePredmetaStudentuWindow getInstance() 
	{
		if(instance==null) 
		{
			instance = new UklanjanjePredmetaStudentuWindow();
		}
		return instance;
	}
	
	
}
