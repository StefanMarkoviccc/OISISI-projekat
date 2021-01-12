package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UklanjanjePredmetaSaProfesoraWindow extends JFrame 
{
	private JLabel labelaPor;
	private JButton btnDa;
	private JButton btnNe;
	
	private static UklanjanjePredmetaSaProfesoraWindow instance;
	
	public static UklanjanjePredmetaSaProfesoraWindow getInstance() 
	{
		if(instance==null) 
		{
			instance = new UklanjanjePredmetaSaProfesoraWindow();
		}
		return instance;
	}
}
