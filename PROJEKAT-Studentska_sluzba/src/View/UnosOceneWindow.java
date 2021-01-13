package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Model.Ocena;

public class UnosOceneWindow extends JFrame {
	
	public JLabel labelaSifra;
	public JLabel labelaNaziv;
	public JLabel labelaOcena;
	public JLabel labelaDatum;
	public JTextField txtSifra;
	public JTextField txtNaziv;
	public JComboBox<String> cmbOcena;
	public JTextField txtDatum;
	public JButton btnPotvrdi;
	public JButton btnOdustani;

	public static UnosOceneWindow instance;
	
	public UnosOceneWindow() 
	{
		setTitle("Unos ocene");
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(300,200));
		pack();
		
		JLabel labelaSifra = new JLabel("Sifra*");
		JLabel labelaNaziv = new JLabel("Naziv*");
		JLabel labelaOcena = new JLabel("Ocena*");
		JLabel labelaDatum = new JLabel("Datum*");
		JTextField txtSifra = new JTextField();
		txtSifra.setEditable(false);
		JTextField txtNaziv = new JTextField();
		txtNaziv.setEditable(false);
		JComboBox<String> cmbOcena = new JComboBox<String>();
		cmbOcena.addItem("6");
		cmbOcena.addItem("7");
		cmbOcena.addItem("8");
		cmbOcena.addItem("9");
		cmbOcena.addItem("10");
		
		JTextField txtDatum = new JTextField();
		JButton btnPotvrdi = new JButton("Potvrdi");
		JButton btnOdustani = new JButton("Odustani");
		JPanel pnlLevo = new JPanel();
		JPanel pnlDesno = new JPanel();
		JPanel pnlDOWN = new JPanel();
		
		
		
		pnlLevo.setLayout(new BoxLayout(pnlLevo,BoxLayout.Y_AXIS));
		pnlDesno.setLayout(new BoxLayout(pnlDesno,BoxLayout.Y_AXIS));
		
		pnlLevo.add(labelaSifra);
		pnlLevo.add(labelaNaziv);
		pnlLevo.add(labelaOcena);
		pnlLevo.add(labelaDatum);
		
		pnlDesno.add(txtSifra);
		pnlDesno.add(txtNaziv);
		pnlDesno.add(cmbOcena);
		pnlDesno.add(txtDatum);
		
		JPanel pnlMain= new JPanel();
		pnlMain.setLayout(new FlowLayout());
		pnlMain.add(pnlLevo);
		pnlMain.add(pnlDesno);
		
		
		pnlDOWN.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		pnlDOWN.add(btnPotvrdi);
		pnlDOWN.add(btnOdustani);
		
		btnOdustani.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				UnosOceneWindow.getInstance().dispose();
			}
		});
		
		add(pnlMain,BorderLayout.CENTER);
		add(pnlDOWN,BorderLayout.SOUTH);
		
		
			
	}
	
	public static UnosOceneWindow getInstance() 
	{
		if(instance==null) 
		{
			instance = new UnosOceneWindow();
		}
		return instance;
	}
}
