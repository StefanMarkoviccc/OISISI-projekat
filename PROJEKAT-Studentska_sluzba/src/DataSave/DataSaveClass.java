package DataSave;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import Model.Model;
import View.MainWindow;

public class DataSaveClass 
{
	public static void Deserijalizacija(String path) 
	{
			Model model;
			
			try {
				FileInputStream f = new FileInputStream(path);
				ObjectInputStream o = new ObjectInputStream(f);
				model = (Model)o.readObject();
				MainWindow.getInstance().setModel(model);
				System.out.println(model.getStudenti().size());
				f.close();
				o.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
	}
	
	

}
