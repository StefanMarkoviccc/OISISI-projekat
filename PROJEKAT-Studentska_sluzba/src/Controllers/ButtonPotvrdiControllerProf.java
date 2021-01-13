package Controllers;

import java.awt.event.ActionEvent;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.AbstractAction;

import Enums.Status;
import Enums.TrenutnaGodina;
import Model.Profesor;
import View.MainWindow;
import View.NewProfesorWindow;

public class ButtonPotvrdiControllerProf extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String pp=NewProfesorWindow.getInstance().getTxtPrezime().getText();
		String i=NewProfesorWindow.getInstance().getTxtIme().getText();
		String dR=NewProfesorWindow.getInstance().getTxtDatumRodjenja().getText();
		String brTel=NewProfesorWindow.getInstance().getTxtBrojTelefona().getText();
		String adrStan=NewProfesorWindow.getInstance().getTxtAdresaStanovanja().getText();
		String adresaKancelarije=NewProfesorWindow.getInstance().getTxtAdresaStanovanja().getText();
		String zvanjeProf=NewProfesorWindow.getInstance().getTxtZvanje().getText();
		String titulaProf=NewProfesorWindow.getInstance().getTxtTitula().getText();
		String mail=NewProfesorWindow.getInstance().getTxtEmail().getText();
		String brojLK=NewProfesorWindow.getInstance().getTxtBrojLicneKarte().getText();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate d=LocalDate.parse(dR,formatter);
		LocalDateTime date=LocalDateTime.of(d, LocalDateTime.now().toLocalTime());
		
		
		
		Profesor p=new Profesor(pp,i,date,adrStan ,brTel,mail,adresaKancelarije,brojLK, titulaProf,zvanjeProf);
		MainWindow.getInstance().getModel().addProfesora(p);
		
		
		
		Object[] rdata= { p.getIme(), p.getPrezime(), p.getTitula(),p.getTitula()};
		MainWindow.getInstance().getWorkSpace().getTmProfesori().addRow(rdata);
		
		NewProfesorWindow.getInstance().dispose();
		
	}
	public ButtonPotvrdiControllerProf()
	{
		super("Potvrdi");
	}
	
}
