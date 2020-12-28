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
		//DataSaveClass.Deserijalizacija( ".\\DataSave\\data.ss");
		WorkSpace.insertTableStudent();
		WorkSpace.insertTablePredmet();
	}
	
	public void windowClosing(WindowEvent e) 
	{
		DataSaveClass.Serilizacija(".\\DataSave\\data.ss");
	}

}
