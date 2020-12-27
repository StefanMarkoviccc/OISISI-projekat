import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainWindow extends JFrame{

	public WorkSpace workSpace;
	public ToolBar toolBar;
	public static MainWindow instance;
	
	public MainWindow() 
	{
		setPreferredSize(new Dimension(500,500));;
		pack();
		toolBar = new ToolBar();
		workSpace = new WorkSpace();
		add(toolBar,BorderLayout.NORTH);
		add(workSpace,BorderLayout.CENTER);
		
		
	}
	
	
	
	public static MainWindow getInstance() 
	{
		if(instance==null) 
		{
			instance=new MainWindow();
		}
		return instance;
	}
}
