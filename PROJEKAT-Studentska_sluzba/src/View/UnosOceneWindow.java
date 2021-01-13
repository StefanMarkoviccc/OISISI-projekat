package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controllers.PotvrdiPolaganjeControler;
import Model.Ocena;
import Model.Student;

public class UnosOceneWindow extends JFrame {
	
	private JLabel labelaSifra;
	private JLabel labelaNaziv;
	private JLabel labelaOcena;
	private JLabel labelaDatum;
	private JTextField txtSifra;
	private JTextField txtNaziv;
	private JComboBox<String> cmbOcena;
	private JTextField txtDatum;
	private JButton btnPotvrdi;
	private JButton btnOdustani;

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
		 txtSifra = new JTextField();
		txtSifra.setEditable(false);
		 txtNaziv = new JTextField();
		txtNaziv.setEditable(false);
		cmbOcena = new JComboBox<String>();
		cmbOcena.addItem("6");
		cmbOcena.addItem("7");
		cmbOcena.addItem("8");
		cmbOcena.addItem("9");
		cmbOcena.addItem("10");
		
		 txtDatum = new JTextField();
		JButton btnPotvrdi = new JButton(new PotvrdiPolaganjeControler());
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

	public JLabel getLabelaSifra() {
		return labelaSifra;
	}

	public void setLabelaSifra(JLabel labelaSifra) {
		this.labelaSifra = labelaSifra;
	}

	public JLabel getLabelaNaziv() {
		return labelaNaziv;
	}

	public void setLabelaNaziv(JLabel labelaNaziv) {
		this.labelaNaziv = labelaNaziv;
	}

	public JLabel getLabelaOcena() {
		return labelaOcena;
	}

	public void setLabelaOcena(JLabel labelaOcena) {
		this.labelaOcena = labelaOcena;
	}

	public JLabel getLabelaDatum() {
		return labelaDatum;
	}

	public void setLabelaDatum(JLabel labelaDatum) {
		this.labelaDatum = labelaDatum;
	}

	public JTextField getTxtSifra() {
		return txtSifra;
	}

	public void setTxtSifra(JTextField txtSifra) {
		this.txtSifra = txtSifra;
	}

	public JTextField getTxtNaziv() {
		return txtNaziv;
	}

	public void setTxtNaziv(JTextField txtNaziv) {
		this.txtNaziv = txtNaziv;
	}

	public JComboBox<String> getCmbOcena() {
		return cmbOcena;
	}

	public void setCmbOcena(JComboBox<String> cmbOcena) {
		this.cmbOcena = cmbOcena;
	}

	public JTextField getTxtDatum() {
		return txtDatum;
	}

	public void setTxtDatum(JTextField txtDatum) {
		this.txtDatum = txtDatum;
	}

	public JButton getBtnPotvrdi() {
		return btnPotvrdi;
	}

	public void setBtnPotvrdi(JButton btnPotvrdi) {
		this.btnPotvrdi = btnPotvrdi;
	}

	public JButton getBtnOdustani() {
		return btnOdustani;
	}

	public void setBtnOdustani(JButton btnOdustani) {
		this.btnOdustani = btnOdustani;
	}
	
	

}
