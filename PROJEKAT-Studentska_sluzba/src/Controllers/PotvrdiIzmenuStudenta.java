package Controllers;

import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.AbstractAction;

import Enums.Status;
import Enums.TrenutnaGodina;
import Model.Student;
import View.EditStudentWindow;
import View.MainWindow;
import View.NewStudentWindow;
import View.WorkSpace;

public class PotvrdiIzmenuStudenta extends AbstractAction
{
	
	public  PotvrdiIzmenuStudenta () 
	{
		super("Edit");
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		int row=MainWindow.getInstance().getWorkSpace().getTableStudenti().getSelectedRow();
		Student stud=MainWindow.getInstance().getModel().getStudenti().get(row);
		
		String ime,prezime,datumR,adresaStan,brTel,mail,brIndexa,godUpisa;
		
		ime=EditStudentWindow.getInstance().getTxtIme().getText();
		prezime=EditStudentWindow.getInstance().getTxtPrezime().getText();
		datumR=EditStudentWindow.getInstance().getTxtDatumR().getText();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate ld = LocalDate.parse(datumR, formatter);
	    LocalDateTime date = LocalDateTime.of(ld, LocalDateTime.now().toLocalTime());
		
		adresaStan=EditStudentWindow.getInstance().getTxtAdresaStan().getText();
		brTel=EditStudentWindow.getInstance().getTxtBrTel().getText();
		mail=EditStudentWindow.getInstance().getTxtMail().getText();
		brIndexa=EditStudentWindow.getInstance().getTxtBrIndexa().getText();
		godUpisa=EditStudentWindow.getInstance().getTxtGodUpisa().getText();
		int godUpisaInt=Integer.parseInt(godUpisa);
		
		TrenutnaGodina trGodStud;
		if(EditStudentWindow.getInstance().getCmbTrGodStud().getSelectedIndex()==0) 
		{
			trGodStud=TrenutnaGodina.prva;	
		}else if(EditStudentWindow.getInstance().getCmbTrGodStud().getSelectedIndex()==1){
			trGodStud=TrenutnaGodina.druga;
		}else if(EditStudentWindow.getInstance().getCmbTrGodStud().getSelectedIndex()==2){
			trGodStud=TrenutnaGodina.treca;
		}else {
			trGodStud=TrenutnaGodina.cetvrta;
			
		}

		Status status;
		if(NewStudentWindow.getInstance().getCmbNacinFin().getSelectedIndex()==0) 
		{
			status=Status.budzet;
		}else {
			status=Status.samofinansiranje;
		}
		stud.setIme(ime);
		stud.setPrezime(prezime);
		stud.setBrIndexa(brIndexa);
		stud.setAdresaStanovanja(adresaStan);
		stud.setDatumR(date);
		stud.setEmailAdresa(mail);
		stud.setGodUpisa(Integer.parseInt(godUpisa));
		stud.setGodina(trGodStud);
		stud.setStatus(status);
		stud.setKontaktTel(brTel);
		EditStudentWindow.getInstance().dispose();
		MainWindow.getInstance().getWorkSpace().getTmStudenti().setRowCount(0);
		WorkSpace.insertTableStudent();
	}

}
