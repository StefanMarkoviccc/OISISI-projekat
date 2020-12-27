import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainWindow extends JFrame{

	private WorkSpace workSpace;
	private ToolBar toolBar;
	private static MainWindow instance;
	private Model model;
	
	public MainWindow() 
	{
		model= new Model();
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



	public Model getModel() {
		return model;
	}



	public void setModel(Model model) {
		this.model = model;
	}
	
}
