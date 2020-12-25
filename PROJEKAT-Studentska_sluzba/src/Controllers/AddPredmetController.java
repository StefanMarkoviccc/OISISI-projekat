package Controllers;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import Enums.Semestar;
import Enums.TrenutnaGodina;
import Model.Predmet;
import Model.Profesor;
import View.MainWindow;
import View.NewPredmetWindow;

public class AddPredmetController extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent arg0) {
			
		String sifraPred=NewPredmetWindow.getInstance().getTxtSifraPred().getText();
		String nazivPred=NewPredmetWindow.getInstance().getTxtSifraPred().getText();
		Profesor predmetniProf=NewPredmetWindow.getInstance().getTxtSifraPred().getText(); 	
		int ESPB=Integer.parseInt(NewPredmetWindow.getInstance().getTxtESPB().getText());
		
		String  godStud=(String) NewPredmetWindow.getInstance().getCmbTrGodStud().getSelectedItem();
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
		
		String semestar = (String) NewPredmetWindow.getInstance().getCmbSemestar().getSelectedItem();
		Semestar sem;
		
		if(semestar.equals("Letnji")) {
			sem = Semestar.letnji;
		}else {
			sem = Semestar.zimski;
		}
		
		Predmet p = new Predmet(sifraPred,nazivPred,sem,trGod,predmetniProf,ESPB);
		MainWindow.getInstance().getModel().addPredmet(p);
		
		Object[] data = {p.getSifraPr(),p.getNazivPr(),p.getEspb(),p.getGodStudija(),p.getSemestar()};
		MainWindow.getInstance().getWorkSpace().getTmPredmeti().addRow(data);
		
		NewPredmetWindow.getInstance().dispose();
		
	}
	
	public AddPredmetController() 
	{
		super("Potvrdi");
	}
}
