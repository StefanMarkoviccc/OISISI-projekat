package Controllers;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import Enums.Titula;
import Enums.Zvanje;
import Model.Predmet;
import Model.Profesor;
import Model.Student;
import View.EditPredmetWindow;
import View.EditProfesorWindow;
import View.EditStudentWindow;
import View.MainWindow;

public class EditEntityControler extends AbstractAction {

	 public EditEntityControler() 
	 {
		super("Edit");
	 }
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		
		int indx=MainWindow.getInstance().getWorkSpace().getTabs().getSelectedIndex();
		if(indx==0) 
		{
			int row=MainWindow.getInstance().getWorkSpace().getTableStudenti().getSelectedRow();
			if(row==-1) 
			{
				return;
				
			}
			Student stud=MainWindow.getInstance().getModel().getStudenti().get(row);
			
			EditStudentWindow.getInstance().getTxtAdresaStan().setText(stud.getAdresaStanovanja());
			EditStudentWindow.getInstance().getTxtIme().setText(stud.getIme());
			EditStudentWindow.getInstance().getTxtBrIndexa().setText(stud.getBrIndexa());
			EditStudentWindow.getInstance().getTxtBrTel().setText(stud.getKontaktTel());
			String txt=String.valueOf(stud.getDatumR().getYear())+"-"+String.valueOf(stud.getDatumR().getMonthValue())+"-"+String.valueOf(stud.getDatumR().getDayOfMonth());
			EditStudentWindow.getInstance().getTxtDatumR().setText(txt);
			EditStudentWindow.getInstance().getTxtMail().setText(stud.getEmailAdresa());
			EditStudentWindow.getInstance().getTxtPrezime().setText(stud.getPrezime());
			EditStudentWindow.getInstance().getTxtGodUpisa().setText(String.valueOf(stud.getGodUpisa()));
			EditStudentWindow.fillNepolozeni();
			EditStudentWindow.Calculate();
			EditStudentWindow.fillPolozeni();
			EditStudentWindow.getInstance().show();
			
		}
		else if(indx==2) 
		{
			int row=MainWindow.getInstance().getWorkSpace().getTablePredmeti().getSelectedRow();
			Predmet pred=MainWindow.getInstance().getModel().getPredmeti().get(row);
			
			EditPredmetWindow.getInstance().getTxtSifraPred().setText(pred.getSifraPr());
			EditPredmetWindow.getInstance().getTxtESPB().setText(String.valueOf(pred.getEspb()));
			EditPredmetWindow.getInstance().getTxtNazivPred().setText(pred.getNazivPr());
			EditPredmetWindow.getInstance().getTxtProfesor().setText(pred.getProfesor().getBrLK());
			
			EditPredmetWindow.getInstance().show();
			
			
			
		}else{
			int roW = MainWindow.getInstance().getWorkSpace().getTableProfesori().getSelectedRow();
			Profesor prof = MainWindow.getInstance().getModel().getProfesori().get(roW);
			EditProfesorWindow.getInstance().getTxtIme().setText(prof.getIme());
			EditProfesorWindow.getInstance().getTxtPrezime().setText(prof.getPrezime());
			String txt=String.valueOf(prof.getDatumR().getYear())+"-"+String.valueOf(prof.getDatumR().getMonthValue())+"-"+String.valueOf(prof.getDatumR().getDayOfMonth());
			EditProfesorWindow.getInstance().getTxtDatumRodjenja().setText(txt);
			EditProfesorWindow.getInstance().getTxtAdresaStanovanja().setText(prof.getAdresaStanovanja());
			EditProfesorWindow.getInstance().getTxtBrojTelefona().setText(prof.getTelefon());
			EditProfesorWindow.getInstance().getTxtEmail().setText(prof.getEmail());
			EditProfesorWindow.getInstance().getTxtAdresaKancelarije().setText(prof.getAdresaKancelarije());
			EditProfesorWindow.getInstance().getTxtBrojLicneKarte().setText(prof.getBrLK());
			
			if(prof.getTitula()==Titula.BCs) 
			{
				EditProfesorWindow.getInstance().getCmbTitula().setSelectedIndex(0);
				
			}
			else if(prof.getTitula()==Titula.MSc) 
			{
				EditProfesorWindow.getInstance().getCmbTitula().setSelectedIndex(1);

			}
			else if(prof.getTitula()==Titula.mr) 
			{
				EditProfesorWindow.getInstance().getCmbTitula().setSelectedIndex(2);

			}
			else if(prof.getTitula()==Titula.dr) 
			{
				EditProfesorWindow.getInstance().getCmbTitula().setSelectedIndex(3);

			}
			else 
			{
				EditProfesorWindow.getInstance().getCmbTitula().setSelectedIndex(4);

			}
			if(prof.getZvanje()==Zvanje.saradnik_u_nastavi) 
			{
				EditProfesorWindow.getInstance().getCmbZvanje().setSelectedIndex(0);
			}
			else if(prof.getZvanje()==Zvanje.asistent) 
			{
				
				EditProfesorWindow.getInstance().getCmbZvanje().setSelectedIndex(1);

			}
			else if(prof.getZvanje()==Zvanje.asistent_sa_doktoratom) 
			{
				
				EditProfesorWindow.getInstance().getCmbZvanje().setSelectedIndex(2);

			}
			else if(prof.getZvanje()==Zvanje.docent) 
			{
				
				EditProfesorWindow.getInstance().getCmbZvanje().setSelectedIndex(3);

			}
			else if(prof.getZvanje()==Zvanje.vanredni_profesor) 
			{
				
				EditProfesorWindow.getInstance().getCmbZvanje().setSelectedIndex(4);

			}
			else if(prof.getZvanje()==Zvanje.vanredni_profesor) 
			{
				
				EditProfesorWindow.getInstance().getCmbZvanje().setSelectedIndex(5);

			}
			else 
			{
				EditProfesorWindow.getInstance().getCmbZvanje().setSelectedIndex(6);

				
			}
			EditProfesorWindow.fillPredmeteProfesoru();
			EditProfesorWindow.getInstance().show();
		}
	
		
	}

}
