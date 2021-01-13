package Controllers;

import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.AbstractAction;

import Model.Ocena;
import Model.Predmet;
import Model.Student;
import View.EditStudentWindow;
import View.MainWindow;
import View.UnosOceneWindow;

public class PotvrdiPolaganjeControler extends AbstractAction
{

	public PotvrdiPolaganjeControler() 
	{
		super("Potvrdi");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String datum= UnosOceneWindow.getInstance().getTxtDatum().getText();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate datumpol=LocalDate.parse(datum,formatter);
		LocalDateTime dat=LocalDateTime.of(datumpol, LocalDateTime.now().toLocalTime());
		String naziv= UnosOceneWindow.getInstance().getTxtNaziv().getText();
		int ocena;
		String sifra= UnosOceneWindow.getInstance().getTxtSifra().getText();
		int ind= MainWindow.getInstance().getWorkSpace().getTableStudenti().getSelectedRow();
		Student s= MainWindow.getInstance().getModel().getStudenti().get(ind);
		int indexp= EditStudentWindow.getInstance().getTableNepolozeni().getSelectedRow();
		Predmet p=s.getNepolozeniPredmeti().get(indexp);
		
		int index= UnosOceneWindow.getInstance().getCmbOcena().getSelectedIndex();
		if(index==0)
		{
			 ocena = 6;
		}
		else if(index==1)
		{
			 ocena= 7;
		}
		else if(index==2)
		{
			 ocena= 8;
		}
		else if(index==3)
		{
			 ocena=9;
			
		}
		else
		{
			 ocena=10;
		}
		
		
		Ocena o= new Ocena(s,p, ocena, dat);
		s.getOcene().add(o);
		o.setStudent(s);
		System.out.println(s.getOcene().size());
		s.getNepolozeniPredmeti().remove(indexp);
		//s.removePredmet(p.getSifraPredmeta());
		int indexP=EditStudentWindow.getInstance().getTableNepolozeni().getSelectedRow();
		
		EditStudentWindow.getInstance().getTmNepolozeni().removeRow(indexp);
		Object[] rowData= {p.getSifraPr(), p.getNazivPr(), p.getEspb(), o.getOcena(), o.getDatumPolaganja()};
		EditStudentWindow.getInstance().getTmPolozeni().addRow(rowData);
		EditStudentWindow.Calculate();
		UnosOceneWindow.getInstance().dispose();
		
	}

}
