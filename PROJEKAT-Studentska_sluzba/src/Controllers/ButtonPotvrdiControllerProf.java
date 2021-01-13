package Controllers;

import java.awt.event.ActionEvent;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.AbstractAction;

import Enums.Status;
import Enums.Titula;
import Enums.TrenutnaGodina;
import Enums.Zvanje;
import Model.Profesor;
import View.EditProfesorWindow;
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
		String mail=NewProfesorWindow.getInstance().getTxtEmail().getText();
		String brojLK=NewProfesorWindow.getInstance().getTxtBrojLicneKarte().getText();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate d=LocalDate.parse(dR,formatter);
		LocalDateTime date=LocalDateTime.of(d, LocalDateTime.now().toLocalTime());
		
		 int indT = NewProfesorWindow.getInstance().getCmbTitula().getSelectedIndex();
		    int indZ = NewProfesorWindow.getInstance().getCmbZvanje().getSelectedIndex();
		    
		    Titula titula;
		    Zvanje zvanje;
		    
		    if(indT==0) 
		    {
		    	titula=Titula.BCs;
		    }
		    else if(indT==1) 
		    {
		    	titula=Titula.MSc;
		    	
		    }
		    else if(indT==2) 
		    {
		    	
		    	titula=Titula.dr;
		    }
		    else if(indT==3) 
		    {
		    	titula=Titula.mr;
		    	
		    }
		    else  
		    {
		    	titula=Titula.prof_dr;
		    	
		    }
		    
		    if(indZ==0) 
		    {
		    	zvanje=Zvanje.saradnik_u_nastavi;
		    	
		    }
		    else if(indZ==1) 
		    {
		    	zvanje=Zvanje.asistent;

		    	
		    }
		    else if(indZ==2) 
		    {
		    	
		    	zvanje=Zvanje.asistent_sa_doktoratom;

		    }
		    else if(indZ==3) 
		    {
		    	zvanje=Zvanje.docent;

		    	
		    }
		    else if(indZ==4) 
		    {
		    	zvanje=Zvanje.vanredni_profesor;

		    	
		    }
		    else if(indZ==5) 
		    {
		    	zvanje=Zvanje.vanredni_profesor;

		    	
		    }
		    else 
		    {
		    	zvanje=Zvanje.profesor_emeritus;
		    }
		    
		
		
		
		Profesor p=new Profesor(pp,i,date,adrStan ,brTel,mail,adresaKancelarije,brojLK, titula,zvanje);
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
