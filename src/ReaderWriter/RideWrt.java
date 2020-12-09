package ReaderWriter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import ModelP.Model;
import View.MainWindow;

public class RideWrt {
	
	
	public static void readFile(String path) 
	{
		Model model;
		
		try {
			FileInputStream f = new FileInputStream(path);
			ObjectInputStream o = new ObjectInputStream(f);
			model = (Model)o.readObject();
			MainWindow.getInstance().setModel(model);
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
	
	public static void writeFile(String path) 
	{
		
		
		try {
			FileOutputStream f = new FileOutputStream(path);
			ObjectOutputStream o = new ObjectOutputStream(f);
			o.writeObject(MainWindow.getInstance().getModel());
			f.close();
			o.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
