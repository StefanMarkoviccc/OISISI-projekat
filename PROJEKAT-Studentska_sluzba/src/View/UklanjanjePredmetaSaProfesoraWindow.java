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

public class UklanjanjePredmetaSaProfesoraWindow extends JFrame 
{
	private JLabel labelaPor;
	private JButton btnDa;
	private JButton btnNe;
	
	private static UklanjanjePredmetaSaProfesoraWindow instance;
	
	public UklanjanjePredmetaSaProfesoraWindow() 
	{
		setTitle("Ukloni predmet");
		setLayout(new BorderLayout());
		JPanel pnlMain = new JPanel();
		setPreferredSize(new Dimension(350,250));
		pack();
		pnlMain.setLayout(new BoxLayout(pnlMain, BoxLayout.Y_AXIS));
		labelaPor= new JLabel("Da li ste sigurni da zelite da uklonite predmet?");
		Dimension d = new Dimension(150,150);
		labelaPor.setPreferredSize(d);

		btnDa = new JButton("Da");
		btnNe =new JButton("Ne");
		btnNe.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {

				UklanjanjePredmetaSaProfesoraWindow.getInstance().dispose();
			
			}
		});
		
		JPanel pnlButtons = new JPanel();
		JPanel pnlPor = new JPanel();
		
		pnlButtons.setLayout(new FlowLayout());
		pnlButtons.add(btnDa);
		pnlButtons.add(btnNe);
		
		pnlPor.setLayout(new FlowLayout());
		pnlPor.add(labelaPor);
		
		pnlMain.add(pnlPor);
		pnlMain.add(pnlButtons);
		
		add(pnlMain,BorderLayout.CENTER);
		
	}
	
	public JLabel getLabelaPor() {
		return labelaPor;
	}





	public void setLabelaPor(JLabel labelaPor) {
		this.labelaPor = labelaPor;
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





	public static UklanjanjePredmetaSaProfesoraWindow getInstance() 
	{
		if(instance==null) 
		{
			instance = new UklanjanjePredmetaSaProfesoraWindow();
		}
		return instance;
	}
}
