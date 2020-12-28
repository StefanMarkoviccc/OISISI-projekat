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

public class PotvrdiIzmenuProfesora extends AbstractAction {
	
	public PotvrdiIzmenuProfesora() 
	{
		super("Edit");
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	int row = MainWindow.getInstance().getWorkSpace().getTableProfesori().getSelectedRow();
	Profesor prof = MainWindow.getInstance().getModel().getProfesori().get(row);
	
	String ime,prezime,datumR,adresaStan,brTel,mail,adresaKanc,brLK,titula,zvanje;
	
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
    titula = EditProfesorWindow.getInstance().getTxtTitula().getText();
    zvanje = EditProfesorWindow.getInstance().getTxtZvanje().getText();
    
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
