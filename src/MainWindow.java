import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class MainWindow extends JFrame {
	
	private StatusBar status;
	private static MainWindow instance;

	public static MainWindow getInstance() 
	{
		if(instance==null) 
		{
			instance=new MainWindow();
		}
		return instance;
	}
	
	public MainWindow()
	{
		setPreferredSize(new Dimension(500, 500));
		pack();
		setJMenuBar(new MenuBar());
		setLayout(new BorderLayout());
		status = new StatusBar();
		add(status,BorderLayout.SOUTH);
		
	}


	
	
	
}
