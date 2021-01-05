package Controllers;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

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
			EditStudentWindow.getInstance().getTxtDatumR().setText(stud.getDatumR().toString());
			EditStudentWindow.getInstance().getTxtMail().setText(stud.getEmailAdresa());
			EditStudentWindow.getInstance().getTxtPrezime().setText(stud.getPrezime());
			EditStudentWindow.getInstance().getTxtGodUpisa().setText(String.valueOf(stud.getGodUpisa()));
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
			int row = MainWindow.getInstance().getWorkSpace().getTableProfesori().getSelectedRow();
			Profesor prof = MainWindow.getInstance().getModel().getProfesori().get(row);
			EditProfesorWindow.getInstance().getTxtIme().setText(prof.getIme());
			EditProfesorWindow.getInstance().getTxtPrezime().setText(prof.getPrezime());
			EditProfesorWindow.getInstance().getTxtDatumRodjenja().setText(prof.getDatumR().toString());
			EditProfesorWindow.getInstance().getTxtAdresaStanovanja().setText(prof.getAdresaStanovanja());
			EditProfesorWindow.getInstance().getTxtBrojTelefona().setText(prof.getTelefon());
			EditProfesorWindow.getInstance().getTxtEmail().setText(prof.getEmail());
			EditProfesorWindow.getInstance().getTxtAdresaKancelarije().setText(prof.getAdresaKancelarije());
			EditProfesorWindow.getInstance().getTxtBrojLicneKarte().setText(prof.getBrLK());
			EditProfesorWindow.getInstance().getTxtTitula().setText(prof.getTitula());
			EditProfesorWindow.getInstance().getTxtZvanje().setText(prof.getZvanje());
			EditProfesorWindow.getInstance().show();
		}
	
		
	}

}
