package Controllers;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import Enums.Semestar;
import Enums.TrenutnaGodina;
import Model.Predmet;
import Model.Profesor;
import View.EditPredmetWindow;
import View.EditProfesorWindow;
import View.MainWindow;
import View.NewPredmetWindow;
import View.WorkSpace;

public class PotvrdiIzmenuPredmeta extends AbstractAction 
{

	public  PotvrdiIzmenuPredmeta()
	{
		super("Edit");
	}
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		int row = MainWindow.getInstance().getWorkSpace().getTablePredmeti().getSelectedRow();
		Predmet pred= MainWindow.getInstance().getModel().getPredmeti().get(row);
		
		String sifraPred=EditPredmetWindow.getInstance().getTxtSifraPred().getText();
		String nazivPred=EditPredmetWindow.getInstance().getTxtSifraPred().getText();
		String  brLik=EditPredmetWindow.getInstance().getTxtProfesor().getText(); 	
		int ESPB=Integer.parseInt(EditPredmetWindow.getInstance().getTxtESPB().getText());
		
		String  godStud=(String) EditPredmetWindow.getInstance().getCmbTrGodStud().getSelectedItem();
		TrenutnaGodina trGod;
		if(godStud.equals("I(prva)")) 
		{
			trGod =TrenutnaGodina.prva;
		}else if(godStud.equals("II(druga)")){
			trGod = TrenutnaGodina.druga;
			
		}else if(godStud.equals("III(treca)")){
			
			trGod = TrenutnaGodina.treca;
			
		}else {
		
			trGod = TrenutnaGodina.cetvrta;
			
		}
		
		String semestar = (String) EditPredmetWindow.getInstance().getCmbSemestar().getSelectedItem();
		Semestar sem;
		
		if(semestar.equals("Letnji")) {
			sem = Semestar.letnji;
		}else {
			sem = Semestar.zimski;
		}
		System.out.println("ddddddd");
		pred.setEspb(ESPB);
		pred.setGodStudija(trGod);
		pred.setSemestar(sem);
		pred.setSifraPr(sifraPred);
		pred.setNazivPr(nazivPred);
		pred.setProfesor(MainWindow.getInstance().getModel().findProfesor(brLik));
		EditPredmetWindow.getInstance().dispose();
	    MainWindow.getInstance().getWorkSpace().getTmPredmeti().setRowCount(0);
	    WorkSpace.insertTablePredmet();
	    
	}

}
