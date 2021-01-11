package Controllers;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

import Model.Profesor;
import Model.Student;
import View.MainWindow;
import View.WorkSpace;

public class ButtonSearchController extends AbstractAction {

	public ButtonSearchController() 
	{
		super("Search");
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		int index = MainWindow.getInstance().getWorkSpace().getTabs().getSelectedIndex();
		String s = MainWindow.getInstance().getTool().getTxtSearch().getText();
		String[] parts = s.split("\\ ");
		System.out.println(parts.length);

		ArrayList<Student> studentiPretraga = new ArrayList<Student> ();
		ArrayList<Profesor> profesorPretraga = new ArrayList<Profesor> ();
		
		if(s.equals(" ")) 
		{
			JOptionPane.showMessageDialog(null,"Popunite tekstualno polje pretrage!");
			return;
			
		}
		if(index == 0) 
		{
			if(parts.length==1) 
			{
				String partPrezime = parts[0];
				for(int i=0; i<MainWindow.getInstance().getModel().getStudenti().size();i++) 
				{
					Student ss = MainWindow.getInstance().getModel().getStudenti().get(i);
					if(ss.getPrezime().toLowerCase().contains(partPrezime.toLowerCase())) 
					{
						studentiPretraga.add(ss);
					}
				}
				
			}
			else if(parts.length==2) 
			{
				String partPrezime = parts[0];
				String partIme= parts[1];
				
				for(int i=0; i<MainWindow.getInstance().getModel().getStudenti().size();i++) 
				{
					Student ss = MainWindow.getInstance().getModel().getStudenti().get(i);
					if(ss.getPrezime().toLowerCase().contains(partPrezime.toLowerCase()) && ss.getIme().toLowerCase().contains(partIme.toLowerCase())) 
					{
						studentiPretraga.add(ss);
					}
				}
				
			}
			else if(parts.length==3) 
			{
				String partPrezime = parts[0];
				String partIme= parts[1];
				String partIndex=parts[2];
				
				for(int i=0; i<MainWindow.getInstance().getModel().getStudenti().size();i++) 
				{
					Student ss = MainWindow.getInstance().getModel().getStudenti().get(i);
					if(ss.getPrezime().toLowerCase().contains(partPrezime.toLowerCase()) && ss.getIme().toLowerCase().contains(partIme.toLowerCase()) && ss.getBrIndexa().toLowerCase().contains(partIndex.toLowerCase())) 
					{
						studentiPretraga.add(ss);
					}
				}
				
				
				
			}
		}else if(index == 1) 
		{
			if(parts.length==1) 
			{
				int i=0;
				String partPrezime=parts[0];
				for(i=0;i<MainWindow.getInstance().getModel().getProfesori().size();i++) 
				{
					Profesor prof = MainWindow.getInstance().getModel().getProfesori().get(i);
					if(prof.getPrezime().toLowerCase().contains(partPrezime.toLowerCase()))
					{
						profesorPretraga.add(prof);
					}
				}
			}
			
		}
		
		insertTableStudent(studentiPretraga);
		insertTableProfesor(profesorPretraga);

		
		
		
	}
	
	public void insertTableStudent(ArrayList<Student> studneti) 
	{
		MainWindow.getInstance().getWorkSpace().getTmStudenti().setRowCount(0);
		for(int i=0;i<studneti.size();i++) 
		{
			Student s =studneti.get(i);
			Object [] o = {s.getBrIndexa(),s.getIme(),s.getPrezime(),s.getGodina(),s.getStatus(),s.getProsecnaOcena()};
			MainWindow.getInstance().getWorkSpace().getTmStudenti().addRow(o);
		}
		
	}
	
	public void insertTableProfesor(ArrayList<Profesor> profesori) 
	{
		MainWindow.getInstance().getWorkSpace().getTmProfesori().setRowCount(0);
		int i = 0;
		for(i=0;i<profesori.size();i++)
		{
			Profesor prof = profesori.get(i);
			Object[] o = {prof.getPrezime(),prof.getIme(),prof.getTitula(),prof.getZvanje()};
			MainWindow.getInstance().getWorkSpace().getTmProfesori().addRow(o);
		}
	
	}

}
