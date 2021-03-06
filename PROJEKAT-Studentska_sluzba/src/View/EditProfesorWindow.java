package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import Controllers.ButtonOdustaniControllerProf;
import Controllers.ButtonPotvrdiControllerProf;
import Controllers.PotvrdiIzmenuProfesora;
import Model.Predmet;
import Model.Profesor;

public class EditProfesorWindow extends JFrame{
	
	private JTextField txtIme;
	private JTextField txtPrezime;
	private JTextField txtDatumRodjenja;
	private JTextField txtAdresaStanovanja;
	private JTextField txtBrojTelefona;
	private JTextField txtEmail;
	private JTextField txtAdresaKancelarije;
	private JTextField txtBrojLicneKarte;
	private JTextField txtTitula;
	private JTextField txtZvanje;
	private PredmetiPanel predmetiPanel;
	private JTabbedPane tabs;
	private JLabel lblIme;
	private JLabel lblPrezime;
	private JLabel lblDatumRodjenja;
	private JLabel lblAdresaStanovanja;
	private JLabel lblBrojTelefona;
	private JLabel lblEmail;
	private JLabel lblAdresaKancelarije;
	private JLabel lblBrojLicneKarte;
	private JLabel lblTitula;
	private JLabel lblZvanje;
	private JComboBox<String> cmbTitula;
	private JComboBox<String> cmbZvanje;

	
	private JButton btnPotvrdi;
	private JButton btnOdustani;
	private static EditProfesorWindow instance;
	
	public static EditProfesorWindow getInstance() 
	{
		if(instance==null) 
		{
			
			instance=new EditProfesorWindow();
		}
		return instance;
		
	}
	
	public EditProfesorWindow() 
	{
		cmbTitula= new JComboBox<String>();
		cmbZvanje= new JComboBox<String>();
		cmbTitula.addItem("BCs");
		cmbTitula.addItem("MSc");
		cmbTitula.addItem("prof_dr");
		cmbTitula.addItem("mr");
		cmbTitula.addItem("dr");
	
		cmbZvanje.addItem("saradnik_u_nastavi");
		cmbZvanje.addItem("asistent");
		cmbZvanje.addItem("asistent_sa_doktoratom");
		cmbZvanje.addItem("docent");
		cmbZvanje.addItem("radovni_profesor");

		cmbZvanje.addItem("vanredni_profesor");
		cmbZvanje.addItem("profesor_emeritus");

		tabs= new JTabbedPane();
		predmetiPanel= new PredmetiPanel();
		Dimension dim= new Dimension(200,20);
		setLayout(new BorderLayout());
		JPanel mainPanel= new JPanel();
		setPreferredSize(new Dimension(800,600));
		pack();
		mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		add(mainPanel, BorderLayout.CENTER);
		
		lblIme= new JLabel("Ime");
		lblPrezime= new JLabel("Prezime");
		lblDatumRodjenja= new JLabel("Datum Rodjenja");
		lblAdresaStanovanja= new JLabel("Adresa Stanovanja");
		lblBrojTelefona= new JLabel("Broj Telefona");
		lblEmail= new JLabel("Email");
		lblAdresaKancelarije= new JLabel("Adresa Kancelarije");
		lblBrojLicneKarte= new JLabel("Broj Licne Karte");
		lblTitula= new JLabel("Titula");
		lblZvanje= new JLabel("Zvanje");
		btnPotvrdi= new JButton(new PotvrdiIzmenuProfesora());
		btnOdustani= new JButton("Odustani");
		
		btnOdustani.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				EditProfesorWindow.getInstance().dispose();
				
			}
		});
	
		
		txtIme= new JTextField();
		txtIme.setPreferredSize(dim);
		txtPrezime= new JTextField();
		txtPrezime.setPreferredSize(dim);
		txtDatumRodjenja= new JTextField();
		txtDatumRodjenja.setPreferredSize(dim);
		txtAdresaStanovanja= new JTextField();
		txtAdresaStanovanja.setPreferredSize(dim);
		txtBrojTelefona= new JTextField();
		txtBrojTelefona.setPreferredSize(dim);
		txtEmail= new JTextField();
		txtEmail.setPreferredSize(dim);
		txtAdresaKancelarije= new JTextField();
		txtAdresaStanovanja.setPreferredSize(dim);
		txtBrojLicneKarte= new JTextField();
		txtBrojLicneKarte.setPreferredSize(dim);
		txtTitula= new JTextField();
		txtTitula.setPreferredSize(dim);
		txtZvanje= new JTextField();
		txtZvanje.setPreferredSize(dim);

		
		
		JPanel levo= new JPanel();
		levo.setLayout(new BoxLayout(levo,BoxLayout.Y_AXIS));
		levo.add(lblIme);
		levo.add(Box.createVerticalStrut(10));
		levo.add(lblPrezime);
		levo.add(Box.createVerticalStrut(10));
		levo.add(lblDatumRodjenja);
		levo.add(Box.createVerticalStrut(10));
		levo.add(lblAdresaStanovanja);
		levo.add(Box.createVerticalStrut(10));
		levo.add(lblBrojTelefona);
		levo.add(Box.createVerticalStrut(10));
		levo.add(lblEmail);
		levo.add(Box.createVerticalStrut(10));
		levo.add(lblAdresaKancelarije);
		levo.add(Box.createVerticalStrut(10));
		levo.add(lblBrojLicneKarte);
		levo.add(Box.createVerticalStrut(10));
		levo.add(lblTitula);
		levo.add(Box.createVerticalStrut(10));
		levo.add(lblZvanje);
		levo.add(Box.createVerticalStrut(10));
		levo.add(btnPotvrdi);
		levo.add(Box.createVerticalStrut(10));

		


		
		JPanel desno= new JPanel();
		desno.setLayout(new BoxLayout(desno,BoxLayout.Y_AXIS));
		
		desno.add(txtIme);
		desno.add(Box.createVerticalStrut(10));
		desno.add(txtPrezime);
		desno.add(Box.createVerticalStrut(10));
		desno.add(txtDatumRodjenja);
		desno.add(Box.createVerticalStrut(10));
		desno.add(txtAdresaStanovanja);
		desno.add(Box.createVerticalStrut(10));
		desno.add(txtBrojTelefona);
		desno.add(Box.createVerticalStrut(10));
		desno.add(txtEmail);
		desno.add(Box.createVerticalStrut(10));
		desno.add(txtAdresaKancelarije);
		desno.add(Box.createVerticalStrut(10));
		desno.add(txtBrojLicneKarte);
		desno.add(Box.createVerticalStrut(10));
		desno.add(cmbTitula);
		desno.add(Box.createVerticalStrut(10));
		desno.add(cmbZvanje);
		desno.add(Box.createVerticalStrut(10));
		desno.add(btnOdustani);
		desno.add(Box.createVerticalStrut(10));
		
		mainPanel.add(levo);
		mainPanel.add(desno);
		tabs.add("Infomracije",mainPanel);
		tabs.add("Predmeti",predmetiPanel);
		add(tabs,BorderLayout.CENTER);
		
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

	public JTextField getTxtDatumRodjenja() {
		return txtDatumRodjenja;
	}

	public void setTxtDatumRodjenja(JTextField txtDatumRodjenja) {
		this.txtDatumRodjenja = txtDatumRodjenja;
	}

	public JTextField getTxtAdresaStanovanja() {
		return txtAdresaStanovanja;
	}

	public void setTxtAdresaStanovanja(JTextField txtAdresaStanovanja) {
		this.txtAdresaStanovanja = txtAdresaStanovanja;
	}

	public JTextField getTxtBrojTelefona() {
		return txtBrojTelefona;
	}

	public void setTxtBrojTelefona(JTextField txtBrojTelefona) {
		this.txtBrojTelefona = txtBrojTelefona;
	}

	public JTextField getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(JTextField txtEmail) {
		this.txtEmail = txtEmail;
	}

	public JTextField getTxtAdresaKancelarije() {
		return txtAdresaKancelarije;
	}

	public void setTxtAdresaKancelarije(JTextField txtAdresaKancelarije) {
		this.txtAdresaKancelarije = txtAdresaKancelarije;
	}

	public JTextField getTxtBrojLicneKarte() {
		return txtBrojLicneKarte;
	}

	public void setTxtBrojLicneKarte(JTextField txtBrojLicneKarte) {
		this.txtBrojLicneKarte = txtBrojLicneKarte;
	}

	public JTextField getTxtTitula() {
		return txtTitula;
	}

	public void setTxtTitula(JTextField txtTitula) {
		this.txtTitula = txtTitula;
	}

	public JTextField getTxtZvanje() {
		return txtZvanje;
	}

	public void setTxtZvanje(JTextField txtZvanje) {
		this.txtZvanje = txtZvanje;
	}

	public JLabel getLblIme() {
		return lblIme;
	}

	public void setLblIme(JLabel lblIme) {
		this.lblIme = lblIme;
	}

	public JLabel getLblPrezime() {
		return lblPrezime;
	}

	public void setLblPrezime(JLabel lblPrezime) {
		this.lblPrezime = lblPrezime;
	}

	public JLabel getLblDatumRodjenja() {
		return lblDatumRodjenja;
	}

	public void setLblDatumRodjenja(JLabel lblDatumRodjenja) {
		this.lblDatumRodjenja = lblDatumRodjenja;
	}

	public JLabel getLblAdresaStanovanja() {
		return lblAdresaStanovanja;
	}

	public void setLblAdresaStanovanja(JLabel lblAdresaStanovanja) {
		this.lblAdresaStanovanja = lblAdresaStanovanja;
	}

	public JLabel getLblBrojTelefona() {
		return lblBrojTelefona;
	}

	public void setLblBrojTelefona(JLabel lblBrojTelefona) {
		this.lblBrojTelefona = lblBrojTelefona;
	}

	public JLabel getLblEmail() {
		return lblEmail;
	}

	public void setLblEmail(JLabel lblEmail) {
		this.lblEmail = lblEmail;
	}

	public JLabel getLblAdresaKancelarije() {
		return lblAdresaKancelarije;
	}

	public void setLblAdresaKancelarije(JLabel lblAdresaKancelarije) {
		this.lblAdresaKancelarije = lblAdresaKancelarije;
	}

	public JLabel getLblBrojLicneKarte() {
		return lblBrojLicneKarte;
	}

	public void setLblBrojLicneKarte(JLabel lblBrojLicneKarte) {
		this.lblBrojLicneKarte = lblBrojLicneKarte;
	}

	public JLabel getLblTitula() {
		return lblTitula;
	}

	public void setLblTitula(JLabel lblTitula) {
		this.lblTitula = lblTitula;
	}

	public JLabel getLblZvanje() {
		return lblZvanje;
	}

	public void setLblZvanje(JLabel lblZvanje) {
		this.lblZvanje = lblZvanje;
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

	public PredmetiPanel getPredmetiPanel() {
		return predmetiPanel;
	}

	public void setPredmetiPanel(PredmetiPanel predmetiPanel) {
		this.predmetiPanel = predmetiPanel;
	}

	public JTabbedPane getTabs() {
		return tabs;
	}

	public void setTabs(JTabbedPane tabs) {
		this.tabs = tabs;
	}

	public JComboBox<String> getCmbTitula() {
		return cmbTitula;
	}

	public void setCmbTitula(JComboBox<String> cmbTitula) {
		this.cmbTitula = cmbTitula;
	}

	public JComboBox<String> getCmbZvanje() {
		return cmbZvanje;
	}

	public void setCmbZvanje(JComboBox<String> cmbZvanje) {
		this.cmbZvanje = cmbZvanje;
	}
	
	public static void fillPredmeteProfesoru()
	{
		EditProfesorWindow.getInstance().getPredmetiPanel().getDtmPredmeti().setRowCount(0);
		int index=MainWindow.getInstance().getWorkSpace().getTableProfesori().getSelectedRow();
		if(index==-1) 
		{
			return ;
		}
		Profesor p=MainWindow.getInstance().getModel().getProfesori().get(index);
		ArrayList<Predmet> predmeti=p.getPredmeti();
		for(Predmet pred : predmeti) 
		{
			
			Object[] data= {pred.getSifraPr(),pred.getNazivPr(),pred.getGodStudija(),pred.getSemestar()};
			EditProfesorWindow.getInstance().getPredmetiPanel().getDtmPredmeti().addRow(data);
		}
		
	}

}
