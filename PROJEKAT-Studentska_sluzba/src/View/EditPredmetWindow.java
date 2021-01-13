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

import Controllers.ButtonOdustaniControllerProf;
import Controllers.ButtonPotvrdiControllerProf;
import Controllers.PotvrdiIzmenuPredmeta;

public class EditPredmetWindow extends JFrame
{
	private JTextField txtSifraPred;
	private JTextField txtNazivPred;
	private JComboBox<String> cmbSemestar;
	private JComboBox<String> cmbTrGodStud;
	private JTextField txtProfesor;
	private JTextField txtESPB;
	private JButton btnPlus;
	private JButton btnMinus;
	
	private static EditPredmetWindow instance;
	private JLabel labelaSifraPred;
	private JLabel labelaNazivPred;
	private JLabel labelaSemestar;
	private JLabel labelaGodStud;
	private JLabel labelaProfesor;
	private JLabel labelaESPB;
	private JLabel labelaGodUpisa;
	private JLabel labelaTrGodStud;
	private JLabel labelaPolozili;
	private JLabel labelaPali;
	private JButton btnPotvrdi;
	private JButton btnOdustani;
	private DefaultTableModel tmPolozili;
	private DefaultTableModel tmPali;
	private JTable tablePolozili;
	private JTable tablePali;
	private JTabbedPane tabs;
	
	public EditPredmetWindow() 
	{
		btnPlus= new JButton("+");
		btnMinus= new JButton("-");
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(800,600));
		pack();
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		labelaGodUpisa = new JLabel("Godina upisa");
		labelaSifraPred = new JLabel("Sifra predmeta");
		labelaNazivPred = new JLabel("Naziv predmeta");
		labelaSemestar = new JLabel("Semestar");
		labelaGodStud = new JLabel("Godina studija u kojoj se pred izvodi");
		labelaProfesor = new JLabel("Predmeti profesor");
		labelaESPB = new JLabel("Broj ESPB bodova");
		labelaPolozili = new JLabel("Spisak stud koji su polozili");
		labelaPali = new JLabel("Spisak stud koji su pali");
		btnPotvrdi = new JButton(new PotvrdiIzmenuPredmeta());
		btnOdustani = new JButton(new ButtonOdustaniControllerProf());
		
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
		JPanel levo = new JPanel();
		JPanel desno = new JPanel();
		levo.setLayout(new BoxLayout(levo,BoxLayout.Y_AXIS));
		desno.setLayout(new BoxLayout(desno, BoxLayout.Y_AXIS));
	
		levo.add(labelaSifraPred);
		levo.add(Box.createVerticalStrut(10));
		levo.add(labelaNazivPred);
		levo.add(Box.createVerticalStrut(10));
		levo.add(labelaSemestar);
		levo.add(Box.createVerticalStrut(10));
		levo.add(labelaGodStud);
		levo.add(Box.createVerticalStrut(10));
		levo.add(labelaESPB);
		levo.add(Box.createVerticalStrut(10));
		levo.add(labelaProfesor);
		levo.add(Box.createVerticalStrut(10));
		levo.add(btnPotvrdi);
		levo.add(Box.createVerticalStrut(10));

		JPanel pnl= new JPanel();
		pnl.add(txtProfesor);
		pnl.add(btnPlus);
		pnl.add(btnMinus);
		pnl.setLayout(new FlowLayout());
		desno.add(txtSifraPred);
		desno.add(Box.createVerticalStrut(10));
		desno.add(txtNazivPred);
		desno.add(Box.createVerticalStrut(10));
		desno.add(cmbSemestar);
		desno.add(Box.createVerticalStrut(10));
		desno.add(cmbTrGodStud);
		desno.add(Box.createVerticalStrut(10));
		desno.add(txtESPB);

		desno.add(Box.createVerticalStrut(10));
		desno.add(pnl);
		desno.add(Box.createVerticalStrut(10));
		desno.add(btnOdustani);
	
		
		cmbSemestar.addItem("Letnji");
		cmbSemestar.addItem("Zimski");
		
		cmbTrGodStud.addItem("I(Prva)");
		cmbTrGodStud.addItem("II(Druga)");
		cmbTrGodStud.addItem("III(Treca)");
		cmbTrGodStud.addItem("IV(Cetvrta)");
		
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
		
		add(mainPanel,BorderLayout.CENTER);
		
		
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


	public JComboBox<String> getCmbTrGodStud() {
		return cmbTrGodStud;
	}




	public void setCmbTrGodStud(JComboBox<String> cmbTrGodStud) {
		this.cmbTrGodStud = cmbTrGodStud;
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




	public static EditPredmetWindow getInstance() 
	{
		if(instance==null) 
		{
			instance=new EditPredmetWindow();
		}
		return instance;
	}
	
	
}
