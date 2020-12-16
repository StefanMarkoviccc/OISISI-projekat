package View;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class MainWindow extends JFrame {
	
	private StatusBar status;
	private static MainWindow instance;
	private WorkSpace workSpace;
	private ToolBar tool;


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
		tool = new ToolBar();
		add(tool,BorderLayout.NORTH);
		add(status,BorderLayout.SOUTH);
		workSpace = new WorkSpace();
		add(workSpace,BorderLayout.CENTER);
		
	}

	public WorkSpace getWorkSpace() {
		return workSpace;
	}

	public void setWorkSpace(WorkSpace workSpace) {
		this.workSpace = workSpace;
	}

	public ToolBar getTool() {
		return tool;
	}

	public void setTool(ToolBar tool) {
		this.tool = tool;
	}
	
	
	
}
