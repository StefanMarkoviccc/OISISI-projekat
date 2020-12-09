package Controlers;

import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.AbstractAction;

import Enums.Status;
import Enums.TrenutnaGodina;
import ModelP.Student;
import View.MainWindow;
import View.NewStudentWindow;

public class AddStudentController extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		String ime,prezime,datumR,adresaStan,brTel,mail,brIndexa,godUpisa;
		
		ime=NewStudentWindow.getInstance().getTxtIme().getText();
		prezime=NewStudentWindow.getInstance().getTxtPrezime().getText();
		datumR=NewStudentWindow.getInstance().getTxtDatumR().getText();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate ld = LocalDate.parse(datumR, formatter);
	    LocalDateTime date = LocalDateTime.of(ld, LocalDateTime.now().toLocalTime());
		
		adresaStan=NewStudentWindow.getInstance().getTxtAdresaStan().getText();
		brTel=NewStudentWindow.getInstance().getTxtBrTel().getText();
		mail=NewStudentWindow.getInstance().getTxtMail().getText();
		brIndexa=NewStudentWindow.getInstance().getTxtBrIndexa().getText();
		godUpisa=NewStudentWindow.getInstance().getTxtGodUpisa().getText();
		int godUpisaInt=Integer.parseInt(godUpisa);
		
		TrenutnaGodina trGodStud;
		if(NewStudentWindow.getInstance().getCmbTrGodStud().getSelectedIndex()==0) 
		{
			trGodStud=TrenutnaGodina.prva;	
		}else if(NewStudentWindow.getInstance().getCmbTrGodStud().getSelectedIndex()==1){
			trGodStud=TrenutnaGodina.druga;
		}else if(NewStudentWindow.getInstance().getCmbTrGodStud().getSelectedIndex()==2){
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
		
		Student s = new Student(ime,prezime,date,adresaStan,brTel,mail,brIndexa,godUpisaInt,trGodStud,status);
		MainWindow.getInstance().getModel().addStudenta(s);
		String trenutna;
		if(s.getGodina()==TrenutnaGodina.prva) 
		{
			trenutna="I (Prva)";
		}
		else if(s.getGodina()==TrenutnaGodina.druga) 
		{
			trenutna="II (Druga)";
			
		}else if(s.getGodina()==TrenutnaGodina.treca) 
		{
			
			trenutna="III (Treca)";
			
		}else {
			
			trenutna="IV (Cetvrta)";
			
		}
		
		String stat;
		if(s.getStatus()==Status.budzet) 
		{
			stat="Budzet";
		}else{
			
			stat="Samofinasiranje";
		}
		
		
		Object[] rowData= {s.getBrIndexa(),s.getIme(),s.getPrezime(),trenutna,stat,String.valueOf(s.getProsecnaOcena())};			
		MainWindow.getInstance().getWorkSpace().getTmStudenti().addRow(rowData);
		
		NewStudentWindow.getInstance().dispose(); //kad unesem podatke,zatvori prozor, sa interneta
		
		
		}
		
	
	
	
	
	
	
	public AddStudentController() 
	{
		super("Potvrdi");
	}
	


}
