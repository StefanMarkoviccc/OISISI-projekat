package Controllers;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

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
		String[] parts = s.split(" ");
		System.out.println(parts.length);

		ArrayList<Student> studentiPretraga = new ArrayList<Student> ();
		
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
					if(ss.getPrezime().contains(partPrezime)) 
					{
						studentiPretraga.add(ss);
					}
				}
				
				insertTableStudent(studentiPretraga);
			}
		};
		
		
		
	}
	
	public void insertTableStudent(ArrayList<Student> studneti) 
	{
		MainWindow.getInstance().getWorkSpace().getTmStudenti().setRowCount(0);
		for(int i=0;i<MainWindow.getInstance().getModel().getStudenti().size();i++) 
		{
			Student s = MainWindow.getInstance().getModel().getStudenti().get(i);
			Object [] o = {s.getBrIndexa(),s.getIme(),s.getPrezime(),s.getGodina(),s.getStatus(),s.getProsecnaOcena()};
			MainWindow.getInstance().getWorkSpace().getTmStudenti().addRow(o);
		}
		
	}

}
