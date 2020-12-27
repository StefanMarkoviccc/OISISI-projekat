package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Kontroleri.AddStudentController;
import Kontroleri.CancelController;


public class NewStudentWindow extends JFrame{
	
	private JTextField txtIme;
	private JTextField txtPrezime;
	private JTextField txtDatumR;
	private JTextField txtAdresaStan;
	private JTextField txtBrTel;
	private JTextField txtMail;
	private JTextField txtBrIndexa;
	private JTextField txtGodUpisa;
	private JComboBox<String> cmbTrGodStud;
	private JComboBox<String> cmbNacinFin;
	private JLabel labelaIme;
	private JLabel labelaPrezime;
	private JLabel labelaDatumR;
	private JLabel labelaAdresaStan;
	private JLabel labelaBrTel;
	private JLabel labelaMail;
	private JLabel labelaBrIndexa;
	private JLabel labelaGodUpisa;
	private JLabel labelaGodStud;
	private JLabel labelaNacinFin;
	private JButton btnPotvrdi;
	private JButton btnOdustani;
	private static NewStudentWindow instance;
	
	public static NewStudentWindow getInstance() 
	{
		if(instance==null) 
		{
			instance=new NewStudentWindow();
		}
		return instance;
	}
	
	public NewStudentWindow () 
	{
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(800,600));
		pack();
		//mainPanel
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		add(mainPanel,BorderLayout.CENTER);
		
		
		JPanel left = new JPanel();
		left.setLayout(new BoxLayout(left, BoxLayout.Y_AXIS));
		JPanel right = new JPanel();
		right.setLayout(new BoxLayout(right, BoxLayout.Y_AXIS));
	
		labelaIme = new JLabel("Ime");
		labelaPrezime = new JLabel("Prezime");
		labelaDatumR = new JLabel("Datum rodjenja");
		labelaAdresaStan = new JLabel("Adresa stanovanja");
		labelaBrTel = new JLabel("Broj telefona");
		labelaMail = new JLabel("Email adresa");
		labelaBrIndexa = new JLabel("Broj indeksa");
		labelaGodUpisa = new JLabel("Godina upisa");
		labelaGodStud = new JLabel("Godina studija");
		labelaNacinFin = new JLabel("Nacin Finasiranja");
		
		Dimension dim= new Dimension(200,30);
		
		txtIme=new JTextField();
		txtIme.setPreferredSize(dim);
		txtPrezime = new JTextField();
		txtPrezime.setPreferredSize(dim);
		txtDatumR = new JTextField();
		txtDatumR.setPreferredSize(dim);
		txtAdresaStan = new JTextField();
		txtAdresaStan.setPreferredSize(dim);
		txtBrTel = new JTextField();
		txtBrTel.setPreferredSize(dim);
		txtMail = new JTextField();
		txtMail.setPreferredSize(dim);
		txtBrIndexa = new JTextField();
		txtBrIndexa.setPreferredSize(dim);
		txtGodUpisa = new JTextField();
		txtGodUpisa.setPreferredSize(dim);
		cmbNacinFin = new JComboBox<String>();
		cmbTrGodStud = new JComboBox<String>();
		btnOdustani = new JButton(new CancelController());
		btnOdustani.setPreferredSize(dim);
		btnPotvrdi = new JButton(new AddStudentController());
		btnPotvrdi.setPreferredSize(dim);
		
		cmbTrGodStud.addItem("I(prva)");
		cmbTrGodStud.addItem("II(druga)");
		cmbTrGodStud.addItem("III(treca)");
		cmbTrGodStud.addItem("IV(cetvrta)");

		cmbNacinFin.addItem("Budzet");
		cmbNacinFin.addItem("Samofinasiranje");
		
		left.add(labelaIme);
		left.add(Box.createVerticalStrut(20));
		left.add(labelaPrezime);
		left.add(Box.createVerticalStrut(20));
		left.add(labelaDatumR);
		left.add(Box.createVerticalStrut(20));
		left.add(labelaAdresaStan);
		left.add(Box.createVerticalStrut(20));
		left.add(labelaBrTel);
		left.add(Box.createVerticalStrut(20));
		left.add(labelaMail);
		left.add(Box.createVerticalStrut(20));
		left.add(labelaBrIndexa);
		left.add(Box.createVerticalStrut(20));
		left.add(labelaGodUpisa);
		left.add(Box.createVerticalStrut(20));
		left.add(labelaGodStud);
		left.add(Box.createVerticalStrut(20));
		left.add(labelaNacinFin);
		left.add(Box.createVerticalStrut(20));
		left.add(btnPotvrdi);
		left.add(Box.createVerticalStrut(20));

		
		right.add(txtIme);
		right.add(Box.createVerticalStrut(20));
		right.add(txtPrezime);
		right.add(Box.createVerticalStrut(20));
		right.add(txtDatumR);
		right.add(Box.createVerticalStrut(20));
		right.add(txtAdresaStan);
		right.add(Box.createVerticalStrut(20));
		right.add(txtBrTel);
		right.add(Box.createVerticalStrut(20));
		right.add(txtMail);
		right.add(Box.createVerticalStrut(20));
		right.add(txtBrIndexa);
		right.add(Box.createVerticalStrut(20));
		right.add(txtGodUpisa);
		right.add(Box.createVerticalStrut(20));
		right.add(cmbTrGodStud);
		right.add(Box.createVerticalStrut(20));
		right.add(cmbNacinFin);
		right.add(Box.createVerticalStrut(20));
		right.add(btnOdustani);
		right.add(Box.createVerticalStrut(20));


		mainPanel.add(left);
		mainPanel.add(right);
		
			
	}

	public JTextField getTxtIme() {
		return txtIme;
	}

	public void setTxtIme(JTextField txtIme) {
		this.txtIme = txtIme;
	}

	public JTextField getTxtPrezime() {
		return txtPrezime;
	}

	public void setTxtPrezime(JTextField txtPrezime) {
		this.txtPrezime = txtPrezime;
	}

	public JTextField getTxtDatumR() {
		return txtDatumR;
	}

	public void setTxtDatumR(JTextField txtDatumR) {
		this.txtDatumR = txtDatumR;
	}

	public JTextField getTxtAdresaStan() {
		return txtAdresaStan;
	}

	public void setTxtAdresaStan(JTextField txtAdresaStan) {
		this.txtAdresaStan = txtAdresaStan;
	}

	public JTextField getTxtBrTel() {
		return txtBrTel;
	}

	public void setTxtBrTel(JTextField txtBrTel) {
		this.txtBrTel = txtBrTel;
	}

	public JTextField getTxtMail() {
		return txtMail;
	}

	public void setTxtMail(JTextField txtMail) {
		this.txtMail = txtMail;
	}

	public JTextField getTxtBrIndexa() {
		return txtBrIndexa;
	}

	public void setTxtBrIndexa(JTextField txtBrIndexa) {
		this.txtBrIndexa = txtBrIndexa;
	}

	public JTextField getTxtGodUpisa() {
		return txtGodUpisa;
	}

	public void setTxtGodUpisa(JTextField txtGodUpisa) {
		this.txtGodUpisa = txtGodUpisa;
	}

	public JComboBox<String> getCmbTrGodStud() {
		return cmbTrGodStud;
	}

	public void setCmbTrGodStud(JComboBox<String> cmbTrGodStud) {
		this.cmbTrGodStud = cmbTrGodStud;
	}

	public JComboBox<String> getCmbNacinFin() {
		return cmbNacinFin;
	}

	public void setCmbNacinFin(JComboBox<String> cmbNacinFin) {
		this.cmbNacinFin = cmbNacinFin;
	}

	public JLabel getLabelaIme() {
		return labelaIme;
	}

	public void setLabelaIme(JLabel labelaIme) {
		this.labelaIme = labelaIme;
	}

	public JLabel getLabelaPrezime() {
		return labelaPrezime;
	}

	public void setLabelaPrezime(JLabel labelaPrezime) {
		this.labelaPrezime = labelaPrezime;
	}

	public JLabel getLabelaDatumR() {
		return labelaDatumR;
	}

	public void setLabelaDatumR(JLabel labelaDatumR) {
		this.labelaDatumR = labelaDatumR;
	}

	public JLabel getLabelaAdresaStan() {
		return labelaAdresaStan;
	}

	public void setLabelaAdresaStan(JLabel labelaAdresaStan) {
		this.labelaAdresaStan = labelaAdresaStan;
	}

	public JLabel getLabelaBrTel() {
		return labelaBrTel;
	}

	public void setLabelaBrTel(JLabel labelaBrTel) {
		this.labelaBrTel = labelaBrTel;
	}

	public JLabel getLabelaMail() {
		return labelaMail;
	}

	public void setLabelaMail(JLabel labelaMail) {
		this.labelaMail = labelaMail;
	}

	public JLabel getLabelaBrIndexa() {
		return labelaBrIndexa;
	}

	public void setLabelaBrIndexa(JLabel labelaBrIndexa) {
		this.labelaBrIndexa = labelaBrIndexa;
	}

	public JLabel getLabelaGodUpisa() {
		return labelaGodUpisa;
	}

	public void setLabelaGodUpisa(JLabel labelaGodUpisa) {
		this.labelaGodUpisa = labelaGodUpisa;
	}

	public JLabel getLabelaGodStud() {
		return labelaGodStud;
	}

	public void setLabelaGodStud(JLabel labelaGodStud) {
		this.labelaGodStud = labelaGodStud;
	}

	public JLabel getLabelaNacinFin() {
		return labelaNacinFin;
	}

	public void setLabelaNacinFin(JLabel labelaNacinFin) {
		this.labelaNacinFin = labelaNacinFin;
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
