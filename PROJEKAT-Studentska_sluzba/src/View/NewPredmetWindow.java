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
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Model.Student;

public class NewPredmetWindow extends JFrame {
	
	private JTextField txtSifraPred;
	private JTextField txtNazivPred;
	private JComboBox<String> cmbSemestar;
	private JTextField txtProfesor;
	private JTextField txtESPB;
	private JTextField txtIme;
	private JTextField txtPrezime;
	private JTextField txtDatumR;
	private JTextField txtAdresaStan;
	private JTextField txtBrojTel;
	private JTextField txtMail;
	private JTextField txtBrI;
	private JTextField txtGodUpisa;
	private JComboBox<String> cmbTrGodStud;
	private JComboBox<String> cmbNacinFin;
	
	
	private static NewPredmetWindow instance;
	private JLabel labelaSifraPred;
	private JLabel labelaNazivPred;
	private JLabel labelaSemestar;
	private JLabel labelaGodStud;
	private JLabel labelaProfesor;
	private JLabel labelaESPB;
	private JLabel labelaIme;
	private JLabel labelaPrezime;
	private JLabel labelaDatumR;
	private JLabel labelaAdresaStan;
	private JLabel labelaBrojTel;
	private JLabel labelaMail;
	private JLabel labelaBrI;
	private JLabel labelaGodUpisa;
	private JLabel labelaTrGodStud;
	private JLabel labelaNacinFin;
	private JLabel labelaPolozili;
	private JLabel labelaPali;
	private JButton btnPotvrdi;
	private JButton btnOdustani;
	private DefaultTableModel tmPolozili;
	private DefaultTableModel tmPali;
	private JTable tablePolozili;
	private JTable tablePali;
	private JTabbedPane tabs;
	
	public NewPredmetWindow() 
	{
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(800,600));
		pack();
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		labelaIme = new JLabel("Ime");
		labelaPrezime = new JLabel("Prezime");
		labelaDatumR = new JLabel("Datum rodjenja");
		labelaAdresaStan = new JLabel("Adresa stanovanja");
		labelaBrojTel = new JLabel("Broj telefona");
		labelaMail = new JLabel("E-mail adresa");
		labelaBrI = new JLabel("Broj indeksa");
		labelaGodUpisa = new JLabel("Godina upisa");
		labelaSifraPred = new JLabel("Sifra predmeta");
		labelaNazivPred = new JLabel("Naziv predmeta");
		labelaSemestar = new JLabel("Semestar");
		labelaGodStud = new JLabel("Godina studija u kojoj se pred izvodi");
		labelaProfesor = new JLabel("Predmeti profesor");
		labelaESPB = new JLabel("Broj ESPB bodova");
		labelaPolozili = new JLabel("Spisak stud koji su polozili");
		labelaPali = new JLabel("Spisak stud koji su pali");
		btnPotvrdi = new JButton("Potvrdi");
		btnOdustani = new JButton("Odustani");
		cmbNacinFin = new JComboBox<String>();
		
		Dimension d = new Dimension(200,30);
		txtSifraPred = new JTextField();
		txtSifraPred.setPreferredSize(d);
		txtNazivPred = new JTextField();
		txtNazivPred.setPreferredSize(d);
		cmbSemestar = new JComboBox<String>();
		cmbSemestar.setPreferredSize(d);
		cmbTrGodStud = new JComboBox<String>();
		cmbTrGodStud.setPreferredSize(d);
		txtProfesor = new JTextField();
		txtProfesor.setPreferredSize(d);
		txtESPB = new JTextField();
		txtESPB.setPreferredSize(d);
		txtIme = new JTextField();
		txtPrezime = new JTextField();
		txtAdresaStan = new JTextField();
		txtDatumR = new JTextField();
		txtBrojTel = new JTextField();
		txtMail = new JTextField();
		txtBrI = new JTextField();
		txtGodUpisa = new JTextField();
		labelaNacinFin=new JLabel("Nacin finansiranja");
		JPanel levo = new JPanel();
		JPanel desno = new JPanel();
		levo.setLayout(new BoxLayout(levo,BoxLayout.Y_AXIS));
		desno.setLayout(new BoxLayout(desno, BoxLayout.Y_AXIS));
		levo.add(labelaIme);
		levo.add(Box.createVerticalStrut(10));
		levo.add(labelaPrezime);
		levo.add(Box.createVerticalStrut(10));
		levo.add(labelaDatumR);
		levo.add(Box.createVerticalStrut(10));
		levo.add(labelaAdresaStan);
		levo.add(Box.createVerticalStrut(10));
		levo.add(labelaBrojTel);
		levo.add(Box.createVerticalStrut(10));
		levo.add(labelaMail);
		levo.add(Box.createVerticalStrut(10));
		levo.add(labelaBrI);
		levo.add(Box.createVerticalStrut(10));
		levo.add(labelaGodUpisa);
		levo.add(Box.createVerticalStrut(10));
		levo.add(labelaGodStud);
		levo.add(Box.createVerticalStrut(10));
		levo.add(labelaNacinFin);
		levo.add(Box.createVerticalStrut(10));
		levo.add(btnPotvrdi);
		levo.add(Box.createVerticalStrut(10));
		System.out.println("test");
		
		desno.add(txtIme);
		desno.add(Box.createVerticalStrut(10));
		desno.add(txtPrezime);
		desno.add(Box.createVerticalStrut(10));
		desno.add(txtDatumR);
		desno.add(Box.createVerticalStrut(10));
		desno.add(txtAdresaStan);
		desno.add(Box.createVerticalStrut(10));
		desno.add(txtBrojTel);
		desno.add(Box.createVerticalStrut(10));
		desno.add(txtMail);
		desno.add(Box.createVerticalStrut(10));
		desno.add(txtBrI);
		desno.add(Box.createVerticalStrut(10));
		desno.add(txtGodUpisa);
		desno.add(Box.createVerticalStrut(10));
		desno.add(cmbTrGodStud);
		desno.add(Box.createVerticalStrut(10));
		desno.add(cmbNacinFin);
		desno.add(Box.createVerticalStrut(10));
		desno.add(btnOdustani);
	
		

		
		JPanel pnlPolozili = new JPanel();
		JPanel pnlPali = new JPanel();
		pnlPolozili.setLayout(new BorderLayout());
		pnlPali.setLayout(new BorderLayout());
		
		Object[] pred = {"Sifra predmeta","Naziv predmeta","ESPB","Ocena","Datum"};
		
		tmPolozili = new DefaultTableModel(pred,0);
		tmPali = new DefaultTableModel(pred,0);
		
		tablePolozili = new JTable(tmPolozili);
		tablePali = new JTable(tmPali);
		
		JScrollPane scrollPalozili = new JScrollPane(tablePolozili);
		JScrollPane scrollPali = new JScrollPane(tablePali);
		
		pnlPolozili.add(scrollPalozili,BorderLayout.CENTER);
		pnlPali.add(scrollPali,BorderLayout.CENTER);
		mainPanel.add(levo);
		mainPanel.add(desno);
		tabs= new JTabbedPane();
		tabs.add("Informacije",mainPanel);
		tabs.add("Polozeni",pnlPolozili);
		tabs.add("Pali",pnlPali);
		
		add(tabs,BorderLayout.CENTER);
		
	}
	
	
	

	public JTextField getTxtSifraPred() {
		return txtSifraPred;
	}




	public void setTxtSifraPred(JTextField txtSifraPred) {
		this.txtSifraPred = txtSifraPred;
	}




	public JTextField getTxtNazivPred() {
		return txtNazivPred;
	}




	public void setTxtNazivPred(JTextField txtNazivPred) {
		this.txtNazivPred = txtNazivPred;
	}




	public JComboBox<String> getCmbSemestar() {
		return cmbSemestar;
	}




	public void setCmbSemestar(JComboBox<String> cmbSemestar) {
		this.cmbSemestar = cmbSemestar;
	}




	public JTextField getTxtProfesor() {
		return txtProfesor;
	}




	public void setTxtProfesor(JTextField txtProfesor) {
		this.txtProfesor = txtProfesor;
	}




	public JTextField getTxtESPB() {
		return txtESPB;
	}




	public void setTxtESPB(JTextField txtESPB) {
		this.txtESPB = txtESPB;
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




	public JTextField getTxtBrojTel() {
		return txtBrojTel;
	}




	public void setTxtBrojTel(JTextField txtBrojTel) {
		this.txtBrojTel = txtBrojTel;
	}




	public JTextField getTxtMail() {
		return txtMail;
	}




	public void setTxtMail(JTextField txtMail) {
		this.txtMail = txtMail;
	}




	public JTextField getTxtBrI() {
		return txtBrI;
	}




	public void setTxtBrI(JTextField txtBrI) {
		this.txtBrI = txtBrI;
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




	public JLabel getLabelaSifraPred() {
		return labelaSifraPred;
	}




	public void setLabelaSifraPred(JLabel labelaSifraPred) {
		this.labelaSifraPred = labelaSifraPred;
	}




	public JLabel getLabelaNazivPred() {
		return labelaNazivPred;
	}




	public void setLabelaNazivPred(JLabel labelaNazivPred) {
		this.labelaNazivPred = labelaNazivPred;
	}




	public JLabel getLabelaSemestar() {
		return labelaSemestar;
	}




	public void setLabelaSemestar(JLabel labelaSemestar) {
		this.labelaSemestar = labelaSemestar;
	}




	public JLabel getLabelaGodStud() {
		return labelaGodStud;
	}




	public void setLabelaGodStud(JLabel labelaGodStud) {
		this.labelaGodStud = labelaGodStud;
	}




	public JLabel getLabelaProfesor() {
		return labelaProfesor;
	}




	public void setLabelaProfesor(JLabel labelaProfesor) {
		this.labelaProfesor = labelaProfesor;
	}




	public JLabel getLabelaESPB() {
		return labelaESPB;
	}




	public void setLabelaESPB(JLabel labelaESPB) {
		this.labelaESPB = labelaESPB;
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




	public JLabel getLabelaBrojTel() {
		return labelaBrojTel;
	}




	public void setLabelaBrojTel(JLabel labelaBrojTel) {
		this.labelaBrojTel = labelaBrojTel;
	}




	public JLabel getLabelaMail() {
		return labelaMail;
	}




	public void setLabelaMail(JLabel labelaMail) {
		this.labelaMail = labelaMail;
	}




	public JLabel getLabelaBrI() {
		return labelaBrI;
	}




	public void setLabelaBrI(JLabel labelaBrI) {
		this.labelaBrI = labelaBrI;
	}




	public JLabel getLabelaGodUpisa() {
		return labelaGodUpisa;
	}




	public void setLabelaGodUpisa(JLabel labelaGodUpisa) {
		this.labelaGodUpisa = labelaGodUpisa;
	}




	public JLabel getLabelaTrGodStud() {
		return labelaTrGodStud;
	}




	public void setLabelaTrGodStud(JLabel labelaTrGodStud) {
		this.labelaTrGodStud = labelaTrGodStud;
	}




	public JLabel getLabelaNacinFin() {
		return labelaNacinFin;
	}




	public void setLabelaNacinFin(JLabel labelaNacinFin) {
		this.labelaNacinFin = labelaNacinFin;
	}




	public JLabel getLabelaPolozili() {
		return labelaPolozili;
	}




	public void setLabelaPolozili(JLabel labelaPolozili) {
		this.labelaPolozili = labelaPolozili;
	}




	public JLabel getLabelaPali() {
		return labelaPali;
	}




	public void setLabelaPali(JLabel labelaPali) {
		this.labelaPali = labelaPali;
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




	public DefaultTableModel getTmPolozili() {
		return tmPolozili;
	}




	public void setTmPolozili(DefaultTableModel tmPolozili) {
		this.tmPolozili = tmPolozili;
	}




	public DefaultTableModel getTmPali() {
		return tmPali;
	}




	public void setTmPali(DefaultTableModel tmPali) {
		this.tmPali = tmPali;
	}




	public JTable getTablePolozili() {
		return tablePolozili;
	}




	public void setTablePolozili(JTable tablePolozili) {
		this.tablePolozili = tablePolozili;
	}




	public JTable getTablePali() {
		return tablePali;
	}




	public void setTablePali(JTable tablePali) {
		this.tablePali = tablePali;
	}




	public JTabbedPane getTabs() {
		return tabs;
	}




	public void setTabs(JTabbedPane tabs) {
		this.tabs = tabs;
	}




	public static NewPredmetWindow getInstance() 
	{
		if(instance==null) 
		{
			instance=new NewPredmetWindow();
		}
		return instance;
	}
	
	

}	

