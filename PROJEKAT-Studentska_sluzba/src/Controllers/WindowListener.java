package Controllers;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import DataSave.DataSaveClass;
import View.MainWindow;
import View.WorkSpace;

public class WindowListener extends WindowAdapter 
{
	
	public void windowOpened(WindowEvent e) 
	{
<<<<<<< Updated upstream
		DataSaveClass.Deserijalizacija( ".\\DataSave\\data.ss");
		WorkSpace.insertTableStudent();
		WorkSpace.insertTablePredmet();
		WorkSpace.insertTableProfesor();
=======
		//DataSaveClass.Deserijalizacija( ".\\DataSave\\data.ss");		
>>>>>>> Stashed changes
	}
	
	public void windowClosing(WindowEvent e) 
	{
		DataSaveClass.Serilizacija(".\\DataSave\\data.ss");
	}

}
