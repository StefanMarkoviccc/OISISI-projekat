package Controllers;

import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.AbstractAction;

import Model.Profesor;
import View.EditProfesorWindow;
import View.MainWindow;
import View.WorkSpace;
import Enums.Titula;
import Enums.Zvanje;

public class PotvrdiIzmenuProfesora extends AbstractAction {
	
	public PotvrdiIzmenuProfesora() 
	{
		super("Edit");
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	int row = MainWindow.getInstance().getWorkSpace().getTableProfesori().getSelectedRow();
	Profesor prof = MainWindow.getInstance().getModel().getProfesori().get(row);
	
	String ime,prezime,datumR,adresaStan,brTel,mail,adresaKanc,brLK;
	
	ime = EditProfesorWindow.getInstance().getTxtIme().getText();
	prezime = EditProfesorWindow.getInstance().getTxtPrezime().getText();
	datumR = EditProfesorWindow.getInstance().getTxtDatumRodjenja().getText();
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	LocalDate ld = LocalDate.parse(datumR, formatter);
    LocalDateTime date = LocalDateTime.of(ld, LocalDateTime.now().toLocalTime());
	
    adresaStan = EditProfesorWindow.getInstance().getTxtAdresaStanovanja().getText();
    brTel = EditProfesorWindow.getInstance().getTxtBrojTelefona().getText();
    mail = EditProfesorWindow.getInstance().getTxtEmail().getText();
    adresaKanc = EditProfesorWindow.getInstance().getLblAdresaKancelarije().getText();
    brLK = EditProfesorWindow.getInstance().getTxtBrojLicneKarte().getText();
    int indT = EditProfesorWindow.getInstance().getCmbTitula().getSelectedIndex();
    int indZ = EditProfesorWindow.getInstance().getCmbZvanje().getSelectedIndex();
    
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
    
    prof.setIme(ime);
    prof.setPrezime(prezime);
    prof.setDatumR(date);
    prof.setAdresaStanovanja(adresaStan);
    prof.setTelefon(brTel);
    prof.setEmail(mail);
    prof.setAdresaKancelarije(adresaKanc);
    prof.setBrLK(brLK);
    prof.setTitula(titula);
    prof.setZvanje(zvanje);
    EditProfesorWindow.getInstance().dispose();
    MainWindow.getInstance().getWorkSpace().getTmProfesori().setRowCount(0);
    WorkSpace.insertTableProfesor();
    
	}

}
