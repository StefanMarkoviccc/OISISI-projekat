package Controllers;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import DataSave.DataSaveClass;
import View.WorkSpace;

public class WindowListener extends WindowAdapter 
{
	
	public void windowOpened(WindowEvent e) 
	{
		DataSaveClass.Deserijalizacija("src"+File.separator+"DataSave"+File.separator+"data.ss");		
	}

}
