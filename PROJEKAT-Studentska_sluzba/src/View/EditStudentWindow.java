package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Controllers.AddStudentController;
import Controllers.PonistiOcenuController;
import Controllers.PotvrdiIzmenuStudenta;
import Controllers.StudentToPredmetController;
import Controllers.UklanjanjePredmetaStudentuController;
import Controllers.UnosOceneController;

public class EditStudentWindow  extends JFrame
{

	private JTabbedPane tabs;
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
	private JTable tablePolozeni;
	private DefaultTableModel tmPolozeni;
	private JTable tableNepolozeni;
	private DefaultTableModel tmNepolozeni;
	
	
	private static EditStudentWindow instance;
	
	public static EditStudentWindow getInstance() 
	{
		if(instance==null) 
		{
			instance=new EditStudentWindow();
		}
		return instance;
	}
	
	public EditStudentWindow () 
	{
		tabs= new JTabbedPane();
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(800,600));
		pack();
		//mainPanel
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		
		
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
		btnOdustani = new JButton("Odustani");
		btnOdustani.setPreferredSize(dim);
		btnPotvrdi = new JButton(new PotvrdiIzmenuStudenta());
		
		btnOdustani.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			EditStudentWindow.getInstance().dispose();
				
			}
		});
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
		JPanel pnlBlank = new JPanel();
		pnlBlank.setLayout(new BorderLayout());
		JPanel pnlPolozeni= new JPanel();
		pnlPolozeni.setLayout(new BorderLayout());
		JPanel pnlButton = new JPanel();
		pnlButton.setLayout(new FlowLayout(FlowLayout.LEFT));
		JPanel pnlTable = new JPanel();
		pnlTable.setLayout(new BorderLayout());
		JPanel pnlText = new JPanel();
		pnlText.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		Object[] polozeni = {"Sifra predmeta","Naziv predmeta","ESPB","Ocena","Datum"};
		tmPolozeni = new DefaultTableModel(polozeni,0);
		tablePolozeni = new JTable(tmPolozeni);
		JButton btnPonisti = new JButton(new PonistiOcenuController());
		JLabel labelaProsecna = new JLabel("Prosecna ocena:");
		JLabel labelaUkupno = new JLabel("Ukupno ESPB:");
		
		JScrollPane scrollPolozeni = new JScrollPane(tablePolozeni);
		
		
		Object[] nepolozeni={"Sifra predmeta","Naziv predmeta","ESPB","Ocena","Datum"};
		tmNepolozeni= new DefaultTableModel(nepolozeni,0);
		tableNepolozeni= new JTable(tmNepolozeni);
		JScrollPane scrollNepolozeni= new JScrollPane(tableNepolozeni);
		
		
		JPanel pnlNepolozeni=new JPanel();
		pnlNepolozeni.setLayout(new BorderLayout());
		
		JPanel pnlButtons=new JPanel();
		pnlButtons.setLayout(new FlowLayout(FlowLayout.LEFT));
		JButton btnDodaj= new JButton(new StudentToPredmetController());
		JButton btnObrisi= new JButton(new UklanjanjePredmetaStudentuController());
		JButton btnPolaganje= new JButton(new UnosOceneController());
		pnlButtons.add(btnDodaj);
		pnlButtons.add(btnObrisi);
		pnlButtons.add(btnPolaganje);
		JPanel pnlTableNepolozeni= new JPanel();
		pnlTableNepolozeni.setLayout(new BorderLayout());
		pnlTableNepolozeni.add(scrollNepolozeni,BorderLayout.CENTER);
		pnlNepolozeni.add(pnlButtons,BorderLayout.NORTH);
		pnlNepolozeni.add(pnlTableNepolozeni,BorderLayout.CENTER);
		
		pnlPolozeni.add(pnlButton);
		pnlPolozeni.add(pnlText);
		pnlPolozeni.add(pnlTable);
		pnlPolozeni.add(pnlBlank,BorderLayout.SOUTH);
		
		pnlButton.add(btnPonisti);
		pnlBlank.setLayout(new BoxLayout(pnlBlank, BoxLayout.Y_AXIS));
		pnlBlank.add(labelaUkupno);
		pnlBlank.add(labelaProsecna);
		pnlText.add(pnlBlank);
		
		
		
		pnlPolozeni.add(pnlText,BorderLayout.SOUTH);
		pnlPolozeni.add(pnlButton,BorderLayout.NORTH);
		pnlPolozeni.add(scrollPolozeni,BorderLayout.CENTER);
		
		
		
		
		
		tabs.add("Informacije",mainPanel);
		tabs.add("Polozeni",pnlPolozeni);
		tabs.add("Nepolozeni",pnlNepolozeni);
		
		
		add(tabs,BorderLayout.CENTER);
		
	}
	
	

	public JTabbedPane getTabs() {
		return tabs;
	}

	public void setTabs(JTabbedPane tabs) {
		this.tabs = tabs;
	}

	public JTable getTablePolozeni() {
		return tablePolozeni;
	}

	public void setTablePolozeni(JTable tablePolozeni) {
		this.tablePolozeni = tablePolozeni;
	}

	public DefaultTableModel getTmPolozeni() {
		return tmPolozeni;
	}

	public void setTmPolozeni(DefaultTableModel tmPolozeni) {
		this.tmPolozeni = tmPolozeni;
	}

	public JTable getTableNepolozeni() {
		return tableNepolozeni;
	}

	public void setTableNepolozeni(JTable tableNepolozeni) {
		this.tableNepolozeni = tableNepolozeni;
	}

	public DefaultTableModel getTmNepolozeni() {
		return tmNepolozeni;
	}

	public void setTmNepolozeni(DefaultTableModel tmNepolozeni) {
		this.tmNepolozeni = tmNepolozeni;
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

	
	
	

